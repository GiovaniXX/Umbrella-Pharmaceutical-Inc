    public Produto getProduto(String idProduto) {
        try {
            Produto mProduto = null;
            String sql = "SELECT * FROM tbprodutos WHERE idProduto = ?";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, idProduto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mProduto = new Produto(
                        rs.getString("idProduto"),
                        rs.getString("descricao"),
                        rs.getInt("preco"),
                        rs.getInt("idImposto"),
                        rs.getString("notas"));
            }

            rs.close();
            ps.close();

            return mProduto;
        } catch (SQLException ex) {
            Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }