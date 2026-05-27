-- BANCO DE DADOS
CREATE DATABASE umbrella;
USE umbrella;

-- TABELA CLIENTES
CREATE TABLE clientes (
    idCliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    sobrenome VARCHAR(100),   
    email VARCHAR(100),
    endereco VARCHAR(250),
    telefone VARCHAR(20),
    cidade VARCHAR(200),
    dataCadastro DATE
);

-- TABELA VENDAS
CREATE TABLE vendas (
    idVenda INT PRIMARY KEY AUTO_INCREMENT,
    dataVenda DATETIME,
    idCliente INT,
    idUsuario INT,
    FOREIGN KEY (idCliente) REFERENCES clientes(idCliente)
);

-- TABELA DETALHE_VENDA
CREATE TABLE detalhe_venda (
    idDetalheVenda INT AUTO_INCREMENT PRIMARY KEY,
    idVenda INT,
    FOREIGN KEY (idVenda) REFERENCES vendas(idVenda)
);

-- TABELA PRODUTOS
CREATE TABLE produtos (
    idProduto INT AUTO_INCREMENT PRIMARY KEY,
    produto VARCHAR(100),
    preco DECIMAL(10,2),
    descricao VARCHAR(255),
    observacao VARCHAR(100)
);

-- TABELA ITEMVENDA
CREATE TABLE itemvenda (
    idItemVenda INT AUTO_INCREMENT PRIMARY KEY,
    idDetalheVenda INT,
    idProduto INT,
    quantidade INT,
    precoUnitario DECIMAL(10,2),
    FOREIGN KEY (idDetalheVenda) REFERENCES detalhe_venda(idDetalheVenda),
    FOREIGN KEY (idProduto) REFERENCES produtos(idProduto)
);

-- TABELA PERFIL
CREATE TABLE perfil (
    idPerfil INT AUTO_INCREMENT PRIMARY KEY,
    nomePerfil VARCHAR(50)
);

-- TABELA USUARIOS
CREATE TABLE usuarios (
    idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    nomeUsuario VARCHAR(100),
    senha VARCHAR(100),
    idPerfil INT,
    FOREIGN KEY (idPerfil) REFERENCES perfil(idPerfil)
);

-- TABELA RELATORIO
CREATE TABLE relatorio (
    idRelatorio INT AUTO_INCREMENT PRIMARY KEY,
    descricao TEXT,
    dataGeracao DATETIME,
    idVenda INT,
    FOREIGN KEY (idVenda) REFERENCES vendas(idVenda)
);
