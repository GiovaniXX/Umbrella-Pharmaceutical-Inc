-- Cria o banco de dados umbrella
CREATE DATABASE umbrella;
GO

-- Seleciona o banco de dados umbrella
USE umbrella;
GO

-- Cria a tabela usuarios
CREATE TABLE usuarios (
    idusuario INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    chave VARCHAR(100) NOT NULL,
    idperfil INT
);
GO

-- Cria a tabela produtos
CREATE TABLE produtos (
    idproduto INT IDENTITY(1,1) PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    idimposto INT,
    anotacao TEXT
);
GO

-- Cria a tabela clientes
CREATE TABLE clientes (
    idcliente INT IDENTITY(1,1) PRIMARY KEY,
    idtipo INT,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    endereco VARCHAR(255),
    telefone VARCHAR(20),
    idcidade INT,
    dataNascimento DATE,
    dataCadastro DATETIME DEFAULT GETDATE()
);
GO

-- Cria a tabela vendas
CREATE TABLE vendas (
    idvenda INT IDENTITY(1,1) PRIMARY KEY,
    idcliente INT NOT NULL,
    data DATE NOT NULL,
    FOREIGN KEY (idcliente) REFERENCES clientes(idcliente)
);
GO

-- Cria a tabela detalheVendas
CREATE TABLE detalheVendas (
    idlinha INT IDENTITY(1,1) PRIMARY KEY,
    idvenda INT NOT NULL,
    idproduto INT NOT NULL,
    descricao VARCHAR(255),
    preco DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    FOREIGN KEY (idvenda) REFERENCES vendas(idvenda),
    FOREIGN KEY (idproduto) REFERENCES produtos(idproduto)
);
GO

-- Insere dados na tabela clientes
INSERT INTO clientes (idtipo, nome, sobrenome, endereco, telefone, idcidade, dataNascimento, dataCadastro)
VALUES 
(1, 'Giovani', 'Chaves', 'Marechal Rondon 387', '999367954', 1, '10-12-1971', '20-02-2023');
GO

-- Insere dados na tabela usuarios
INSERT INTO usuarios (nome, sobrenome, senha, chave, idperfil)
VALUES 
('Giovani', 'Chaves', '123', 'remake', 1),
('Adriane', 'Fernandes', '1234', 'teste', 2);
GO

-- Adiciona uma nova coluna na tabela usuarios
ALTER TABLE usuarios
ADD usuario VARCHAR(50) NOT NULL DEFAULT 'gvc';
GO

-- Cria uma nova tabela usuarios com a ordem das colunas desejada
CREATE TABLE usuarios_nova (
    idusuario INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(50) NOT NULL,
    usuario VARCHAR(50) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    chave VARCHAR(100) NOT NULL,
    idperfil INT
);
GO

-- Copia os dados da tabela usuarios para usuarios_nova
INSERT INTO usuarios_nova (idusuario, nome, sobrenome, usuario, senha, chave, idperfil)
SELECT idusuario, nome, sobrenome, usuario, senha, chave, idperfil
FROM usuarios;
GO

-- Remove a tabela original usuarios
DROP TABLE usuarios;
GO

-- Renomeia a tabela usuarios_nova para usuarios
EXEC sp_rename 'usuarios_nova', 'usuarios';
GO

-- Altera o nome da coluna idperfil para perfil na tabela usuarios
EXEC sp_rename 'usuarios.idperfil', 'perfil', 'COLUMN';
GO

-- Altera o nome das colunas nas tabelas clientes, detalheVendas e produtos
EXEC sp_rename 'clientes.idtipo', 'tipo', 'COLUMN';
EXEC sp_rename 'clientes.idcidade', 'cidade', 'COLUMN';
EXEC sp_rename 'detalheVendas.idlinha', 'linha', 'COLUMN';
EXEC sp_rename 'detalheVendas.idproduto', 'produto', 'COLUMN';
EXEC sp_rename 'produtos.idimposto', 'imposto', 'COLUMN';
EXEC sp_rename 'vendas.idcliente', 'cliente', 'COLUMN';
GO

-- Insere dados na tabela produtos
INSERT INTO produtos (descricao, preco, idimposto, anotacao)
VALUES 
('Produto A', 10.50, 1, 'Anotação do Produto A'),
('Produto B', 15.75, 1, 'Anotação do Produto B'),
('Produto C', 22.00, 1, 'Anotação do Produto C');
GO

-- Insere dados na tabela clientes
INSERT INTO clientes (idtipo, nome, sobrenome, endereco, telefone, idcidade, dataNascimento, dataCadastro)
VALUES 
(1, 'Cliente A', 'Sobrenome A', 'Endereço A', 'Telefone A', 1, '1990-01-15', GETDATE()),
(2, 'Cliente B', 'Sobrenome B', 'Endereço B', 'Telefone B', 1, '1985-05-20', GETDATE()),
(1, 'Cliente C', 'Sobrenome C', 'Endereço C', 'Telefone C', 1, '1995-11-10', GETDATE());
GO

-- Modifica o tipo de dados da coluna dataCadastro na tabela clientes
ALTER TABLE clientes
ALTER COLUMN dataCadastro DATE;
GO

-- Converte os valores da coluna dataCadastro de datetime para date
UPDATE clientes
SET dataCadastro = CAST(dataCadastro AS DATE);
GO

-- Adiciona colunas na tabela detalheVendas
ALTER TABLE detalheVendas
ADD cedente VARCHAR(255),
    dataVencimento DATE,
    valorPagamento FLOAT,
    situacao VARCHAR(50),
    formaPagamento VARCHAR(50);
GO

-- Remove colunas da tabela detalheVendas
ALTER TABLE detalheVendas
DROP COLUMN cedente,
DROP COLUMN dataVencimento,
DROP COLUMN valorPagamento,
DROP COLUMN situacao,
DROP COLUMN formaPagamento;
GO

-- Altera o nome da coluna dataVencimento para dataVenda na tabela detalheVendas
EXEC sp_rename 'detalheVendas.dataVencimento', 'dataVenda', 'COLUMN';
GO
