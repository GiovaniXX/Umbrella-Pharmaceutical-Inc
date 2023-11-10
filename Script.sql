
CREATE DATABASE umbrella;

use umbrella;

CREATE TABLE usuarios (
    idusuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    chave VARCHAR(100) NOT NULL,
    idperfil INT
);

CREATE TABLE produtos (
    idproduto INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    preco DOUBLE NOT NULL,
    idimposto INT,
    anotacao TEXT
);

CREATE TABLE clientes (
    idcliente INT AUTO_INCREMENT PRIMARY KEY,
    idtipo INT,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    endereco VARCHAR(255),
    telefone VARCHAR(20),
    idcidade INT,
    dataNascimento DATE,
    dataCadastro TIMESTAMP
);

CREATE TABLE vendas (
    idvenda INT AUTO_INCREMENT PRIMARY KEY,
    idcliente INT NOT NULL,
    data DATE NOT NULL
);

CREATE TABLE detalheVendas (
    idvenda INT AUTO_INCREMENT PRIMARY KEY,
    idlinha INT AUTO_INCREMENT PRIMARY KEY,
    idproduto INT NOT NULL,
    descricao VARCHAR(255),
    preco DOUBLE NOT NULL,
    quantidade INT NOT NULL
);

ALTER TABLE detalheVendas
DROP PRIMARY KEY, MODIFY COLUMN idlinha INT NOT NULL;

ALTER TABLE detalheVendas
MODIFY COLUMN idvenda INT AUTO_INCREMENT PRIMARY KEY;

ALTER TABLE vendas
ADD FOREIGN KEY (idcliente) REFERENCES clientes(idcliente);

ALTER TABLE detalheVendas
ADD FOREIGN KEY (idvenda) REFERENCES vendas(idvenda);

ALTER TABLE detalheVendas
ADD FOREIGN KEY (idproduto) REFERENCES produtos(idproduto);

insert into clientes(idcliente,idTipo,nome,sobrenome,endereco,telefone,idcidade,dataNascimento,dataCadastro)
values(1,1,'Giovani','Chaves','Marechal Rondon 387','999367954',1,'1971-12-10','20203-02-20');

INSERT INTO usuarios (nome, sobrenome, senha, chave, idperfil)
VALUES ('Giovani', 'Chaves', '123', 'remake', 1);

INSERT INTO usuarios (nome, sobrenome, senha, chave, perfil) 
VALUES ('Adriane', 'Fernandes', '1234', 'teste', 2);


ALTER TABLE usuarios
ADD COLUMN usuario VARCHAR(50) NOT NULL DEFAULT 'gvc';

-- Crie uma nova tabela com a ordem desejada das colunas
CREATE TABLE usuarios_nova (
    idusuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    usuario VARCHAR(50) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    chave VARCHAR(100) NOT NULL,
    idperfil INT
);

-- Crie uma nova tabela com a ordem desejada das colunas
CREATE TABLE usuarios_nova (
    idusuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    usuario VARCHAR(50) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    chave VARCHAR(100) NOT NULL,
    idperfil INT
);

-- Copie os dados da tabela original para a nova tabela
INSERT INTO usuarios_nova (idusuario, nome, sobrenome, usuario, senha, chave, idperfil)
SELECT idusuario, nome, sobrenome, usuario, senha, chave, idperfil
FROM usuarios;

-- Descarte a tabela original
DROP TABLE usuarios;

-- Altere o nome da nova tabela para o nome da tabela original
RENAME TABLE usuarios_nova TO usuarios;

ALTER TABLE usuarios
DROP COLUMN usuario;

ALTER TABLE usuarios
CHANGE COLUMN idperfil perfil INT;

ALTER TABLE clientes
CHANGE COLUMN idtipo tipo INT;

ALTER TABLE clientes
CHANGE COLUMN idcidade cidade INT;

ALTER TABLE detalhevendas
CHANGE COLUMN idlinha linha INT;

ALTER TABLE detalhevendas
CHANGE COLUMN idproduto produto INT;

ALTER TABLE produtos
CHANGE COLUMN idimposto imposto INT;

ALTER TABLE vendas
CHANGE COLUMN idcliente cliente INT;

INSERT INTO produtos (descricao, preco, imposto, anotacao)
VALUES
    ('Produto A', 10.50, 1, 'Anotação do Produto A'),
    ('Produto B', 15.75, 1, 'Anotação do Produto B'),
    ('Produto C', 22.00, 1, 'Anotação do Produto C');

INSERT INTO clientes (tipo, nome, sobrenome, endereco, telefone, cidade, dataNascimento, dataCadastro)
VALUES
    (1, 'Cliente A', 'Sobrenome A', 'Endereço A', 'Telefone A', '1', '1990-01-15', CURRENT_TIMESTAMP),
    (2, 'Cliente B', 'Sobrenome B', 'Endereço B', 'Telefone B', '1', '1985-05-20', CURRENT_TIMESTAMP),
    (1, 'Cliente C', 'Sobrenome C', 'Endereço C', 'Telefone C', '1', '1995-11-10', CURRENT_TIMESTAMP);

-- Alterar o tipo de dados do campo dataCadastro de timestamp para date
ALTER TABLE clientes
MODIFY COLUMN dataCadastro DATE;

-- Converter os valores de timestamp para date
UPDATE clientes
SET dataCadastro = DATE(dataCadastro);

ALTER TABLE detalhevendas
ADD COLUMN cedente VARCHAR(255),
ADD COLUMN dataVencimento DATE,
ADD COLUMN valorPagamento FLOAT,
ADD COLUMN situacao VARCHAR(50),
ADD COLUMN formaPagamento VARCHAR(50);

-- Apaga colunas das tabelas
ALTER TABLE detalhevendas
DROP COLUMN cedente,
DROP COLUMN dataVenda,
DROP COLUMN valorPagamento,
DROP COLUMN situacao,
DROP COLUMN formaPagamento;

ALTER TABLE detalhevendas
CHANGE COLUMN dataVencimento dataVenda DATE;
