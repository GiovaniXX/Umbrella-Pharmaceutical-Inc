# 🧪 Umbrella Pharmaceutical – Sistema de Vendas

Sistema desktop desenvolvido em Java para gerenciamento de vendas, clientes e produtos, com geração de relatórios em PDF.

---

## 📦 Funcionalidades

### 🛒 Vendas
- Cadastro de vendas com seleção de cliente e produto.
- Cálculo automático de valor total e quantidade total.
- Registro de detalhes da venda (produto, preço, quantidade).
- Armazenamento em banco de dados relacional.

### 👤 Clientes
- Listagem de clientes cadastrados.
- Seleção via `JComboBox` com preenchimento dinâmico.
- Busca de cliente por nome para vincular à venda.

### 📦 Produtos
- Listagem de produtos disponíveis.
- Seleção via `JComboBox` com preenchimento dinâmico.
- Busca de produto por nome para vincular à venda.

### 📊 Relatórios
- Visualização de todas as vendas em tabela.
- Geração de relatório em PDF com:
  - Cabeçalho institucional.
  - Dados do vendedor e data.
  - Tabela com cliente, produto, descrição, preço, quantidade e valor total.
  - Cálculo automático do total da venda.

### 🧠 Integração com Banco de Dados
- Uso de `DAO` para acesso aos dados.
- Conexão via classe `Conexao`.
- Consultas com `PreparedStatement` e `ResultSet`.

### 📄 Geração de PDF
- Utiliza a biblioteca [iText](https://itextpdf.com) para criação de relatórios.
- Layout profissional com tabelas e alinhamento.
- Exportação automática para arquivo `relatorio_vendas.pdf`.

---

## 🧱 Estrutura do Projeto
