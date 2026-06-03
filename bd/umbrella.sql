-- CRIAÇÃO DO BANCO
CREATE DATABASE umbrella;

-- SELECIONAR O BANCO
USE umbrella;

-- CRIAÇÃO DAS TABELAS
CREATE TABLE Clientes (
    idCliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    sobrenome VARCHAR(100),   
    email VARCHAR(100),
    endereco VARCHAR(250),
    telefone VARCHAR(20),
    cidade VARCHAR(200),
    dataCadastro DATE         
);

CREATE TABLE Produtos (
    idProduto INT AUTO_INCREMENT PRIMARY KEY,
    produto VARCHAR(100),
    preco DECIMAL(10,2),
    descricao VARCHAR(255),
    observacao VARCHAR(100)
);

CREATE TABLE Usuarios (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    usuario VARCHAR(100),
    senha VARCHAR(50),
    chave VARCHAR(100)
);

CREATE TABLE Vendas (
    idVenda INT PRIMARY KEY AUTO_INCREMENT,
    dataVenda DATETIME,
    idCliente INT,
    idUsuario INT,
    FOREIGN KEY (idCliente) REFERENCES Clientes(idCliente),
    FOREIGN KEY (idUsuario) REFERENCES Usuarios(idUsuario)
);

CREATE TABLE detalhe_venda (
  idDetalheVenda INT AUTO_INCREMENT PRIMARY KEY,
  idVenda INT,
  idProduto INT,
  quantidade INT,
  preco DECIMAL(10,2),
  FOREIGN KEY (idVenda) REFERENCES vendas(idVenda),
  FOREIGN KEY (idProduto) REFERENCES produtos(idProduto)
);

CREATE TABLE Relatorio (
    idRelatorio INT PRIMARY KEY AUTO_INCREMENT,
    descricao TEXT,
    dataGeracao DATETIME,
    idVenda INT,
    FOREIGN KEY (idVenda) REFERENCES Vendas(idVenda)
);

CREATE TABLE ItemVenda (
    idItemVenda INT PRIMARY KEY AUTO_INCREMENT,
    idVenda INT,
    idProduto INT,
    quantidade INT,
    precoUnitario DECIMAL(10,2),
    FOREIGN KEY (idVenda) REFERENCES Vendas(idVenda),
    FOREIGN KEY (idProduto) REFERENCES Produtos(idProduto)
);

CREATE TABLE Perfil (
    idPerfil INT PRIMARY KEY,
    descricao VARCHAR(50)
);

CREATE TABLE cidades (
  idcidade INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100),
  estado VARCHAR(2)
);

-- OUTROS COMANDOS
ALTER TABLE Usuarios ADD COLUMN nome VARCHAR(100) AFTER idUsuario;
ALTER TABLE Usuarios ADD COLUMN sobrenome VARCHAR(100) AFTER nome;
ALTER TABLE Usuarios ADD COLUMN idPerfil INT AFTER chave;

ALTER TABLE Usuario
ADD CONSTRAINT fk_perfil
FOREIGN KEY (perfil) REFERENCES Perfil(idPerfil);

ALTER TABLE Usuario 
MODIFY COLUMN perfil INT AFTER idUsuario;

ALTER TABLE Clientes ADD COLUMN sobrenome VARCHAR(100) AFTER nome;
ALTER TABLE Clientes ADD COLUMN endereco VARCHAR(100) AFTER email;
ALTER TABLE Clientes ADD COLUMN cidade VARCHAR(100) AFTER telefone;
ALTER TABLE Clientes ADD COLUMN dataCadastro DATE AFTER cidade;

ALTER TABLE Produtos CHANGE nome produto VARCHAR(100);
ALTER TABLE Produtos CHANGE estoque descricao INT;

INSERT INTO produtos (produto, preco, descricao, observacao) VALUES
('Dipirona 500mg', 8.90, 'Analgésico e antitérmico', 'Uso adulto e pediátrico'),
('Paracetamol 750mg', 12.50, 'Reduz febre e dor', 'Evitar uso prolongado'),
('Vitamina C 1g', 15.00, 'Suplemento vitamínico', 'Tomar após refeições'),
('Ibuprofeno 400mg', 22.75, 'Anti-inflamatório e analgésico', 'Não usar em jejum');

ALTER TABLE vendas ADD COLUMN numerovenda INT;

ALTER TABLE vendas 
ADD COLUMN valorTotal DECIMAL(10,2);

ALTER TABLE vendas 
ADD COLUMN quantidadeTotal INT;

ALTER TABLE vendas 
ADD COLUMN produto VARCHAR(100);

ALTER TABLE vendas 
ADD COLUMN descricao VARCHAR(250);

ALTER TABLE vendas 
ADD COLUMN preco DECIMAL(10,2);

ALTER TABLE vendas 
ADD COLUMN idProduto INT,
ADD CONSTRAINT fk_vendas_produtos
FOREIGN KEY (idProduto) REFERENCES produtos(idProduto);

INSERT INTO Perfil (idPerfil, descricao)
VALUES (1, 'Administrador');

INSERT INTO Usuarios (perfil, nome, sobrenome, usuario, senha, chave)
VALUES (1, 'Giovani', 'Chaves', 'gvc', 'admin', 'matrix');

RENAME TABLE usuario TO usuarios;
RENAME TABLE produto TO produtos

ALTER TABLE produtos 
MODIFY COLUMN descricao VARCHAR(255);

ALTER TABLE produtos
ADD COLUMN observacao VARCHAR(100);

ALTER TABLE usuarios DROP FOREIGN KEY fk_perfil;
DROP TABLE perfil;

DROP TABLE IF EXISTS itemvenda;

ALTER TABLE usuarios DROP COLUMN usuario;
-- ----------------------------------------------------
SHOW CREATE TABLE vendas;
ALTER TABLE vendas DROP FOREIGN KEY fk_vendas_produtos;
ALTER TABLE vendas
DROP COLUMN produto,
DROP COLUMN descricao,
DROP COLUMN preco,
DROP COLUMN idProduto;

DESCRIBE vendas;
DESCRIBE clientes;
DESCRIBE itemVenda;
DESCRIBE perfil;
DESCRIBE produtos;
DESCRIBE relatorio;
DESCRIBE usuarios;

-- Migrar os dados de detalhe_venda para itemvenda:
INSERT INTO itemvenda (idVenda, idProduto, quantidade, precoUnitario)
SELECT idVenda, idProduto, quantidade, preco
FROM detalhe_venda;

-- Removendo a tabela antiga
DROP TABLE detalhe_venda;

ALTER TABLE vendas 
MODIFY COLUMN dataVenda TIMESTAMP;
