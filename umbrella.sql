
CREATE DATABASE umbrella;

USE umbrella;

CREATE TABLE Cliente (
    idCliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(20)
);

CREATE TABLE Produto (
    idProduto INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    preco DECIMAL(10, 2),
    estoque INT
);

CREATE TABLE Usuario (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    usuario VARCHAR(100),
    senha VARCHAR(50),
    chave VARCHAR(100)
);

CREATE TABLE Venda (
    idVenda INT PRIMARY KEY AUTO_INCREMENT,
    dataVenda DATETIME,
    idCliente INT,
    idUsuario INT,
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
    FOREIGN KEY (idUsuario) REFERENCES Usuario(idUsuario)
);

CREATE TABLE Relatorio (
    idRelatorio INT PRIMARY KEY AUTO_INCREMENT,
    descricao TEXT,
    dataGeracao DATETIME,
    idVenda INT,
    FOREIGN KEY (idVenda) REFERENCES Venda(idVenda)
);

CREATE TABLE ItemVenda (
    idItemVenda INT PRIMARY KEY AUTO_INCREMENT,
    idVenda INT,
    idProduto INT,
    quantidade INT,
    precoUnitario DECIMAL(10,2),
    FOREIGN KEY (idVenda) REFERENCES Venda(idVenda),
    FOREIGN KEY (idProduto) REFERENCES Produto(idProduto)
);

ALTER TABLE Usuarios ADD COLUMN nome VARCHAR(100) AFTER idUsuario;
ALTER TABLE Usuarios ADD COLUMN sobrenome VARCHAR(100) AFTER nome;
ALTER TABLE Usuarios ADD COLUMN perfil INT AFTER chave;

CREATE TABLE Perfil (
    idPerfil INT PRIMARY KEY,
    descricao VARCHAR(50)
);

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

INSERT INTO Perfil (idPerfil, descricao)
VALUES (1, 'Administrador');

INSERT INTO Usuarios (perfil, nome, sobrenome, usuario, senha, chave)
VALUES (1, 'Giovani', 'Chaves', 'gvc', 'admin', 'matrix');

-- Mudar para mysql_native_password
ALTER USER ''@'localhost' IDENTIFIED WITH mysql_native_password BY '';
FLUSH PRIVILEGES;

RENAME TABLE usuario TO usuarios;

ALTER TABLE usuarios DROP FOREIGN KEY fk_perfil;
DROP TABLE perfil;

DROP TABLE IF EXISTS itemvenda;

-- volta o usuário root a usar o plugin de autenticação padrão do MySQL (que é o caching_sha2_password nas versões mais recentes)
ALTER USER ''@'localhost' IDENTIFIED WITH caching_sha2_password BY '';

ALTER TABLE usuarios DROP COLUMN usuario;