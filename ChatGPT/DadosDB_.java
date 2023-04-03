public String adicionarCliente(Cliente mCliente) {
    try {
        String sql = "INSERT INTO tbclientes (idCliente, idTipo, nome, sobrenome, endereco, telefone, idCidade, dataNascimento, dataCadastro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement st = (PreparedStatement) cnn.prepareStatement(sql);
        st.setInt(1, Integer.parseInt(mCliente.getIdCliente()));
        st.setInt(2, Integer.parseInt(mCliente.getIdTipo()));
        st.setString(3, mCliente.getNome());
        st.setString(4, mCliente.getSNome());
        st.setString(5, mCliente.getEndereco());
        st.setString(6, mCliente.getTelefone());
        st.setInt(7, Integer.parseInt(mCliente.getIdCidade()));
        st.setDate(8, new java.sql.Date(mCliente.getDNascimento().getTime()));
        st.setDate(9, new java.sql.Date(mCliente.getData().getTime()));

        int rowsInserted = st.executeUpdate();
        if (rowsInserted > 0) {
            return "Cliente cadastrado com sucesso!";
        } else {
            return "Cliente não pode ser cadastrado!";
        }
    } catch (SQLException ex) {
        Logger.getLogger(DadosDB.class.getName()).log(Level.SEVERE, null, ex);
        return "Cliente não pode ser cadastrado!";
    }
}
