
use umbrella;
RENAME TABLE cliente TO clientes;
RENAME TABLE produto TO produtos;
RENAME TABLE venda TO vendas;

ALTER TABLE usuarios CHANGE COLUMN perfil idperfil VARCHAR(255);
ALTER TABLE Usuarios RENAME COLUMN perfil TO idPerfil;

ALTER TABLE produtos MODIFY COLUMN descricao VARCHAR(255);

INSERT INTO produtos (produto, preco, descricao)
VALUES ('Paracetamol', 3.50, 'Usado no combate de dores em geral');

INSERT INTO produtos (produto, preco, descricao)
VALUES ('Xarope', 25.50, 'Despectorante');

INSERT INTO clientes (nome, sobrenome, email, endereco, telefone, cidade, dataCadastro)
VALUES ('Giovani', 'Chaves', 'giovani_chaves@hotmail.com', 'Marechal Rondon 387', '(49) 9 9936-7954', 'lages', CURRENT_DATE);

UPDATE clientes
SET cidade = 'Lages'
WHERE email = 'giovani_chaves@hotmail.com';

ALTER TABLE vendas
ADD COLUMN produto VARCHAR(255) AFTER idVenda,
ADD COLUMN descricao VARCHAR(255) AFTER produto,
ADD COLUMN preco DECIMAL(10,2) AFTER descricao,
ADD COLUMN quantidade INT AFTER preco,
ADD COLUMN idProduto INT AFTER dataVenda;

ALTER TABLE vendas
ADD CONSTRAINT fk_idProduto
FOREIGN KEY (idProduto)
REFERENCES produtos(idProduto);

ALTER TABLE vendas
CHANGE COLUMN venda data DATE;

CREATE TABLE detalhe_venda (
  idDetalheVenda INT AUTO_INCREMENT PRIMARY KEY,
  idVenda INT,
  idProduto INT,
  quantidade INT,
  preco DECIMAL(10,2),
  FOREIGN KEY (idVenda) REFERENCES vendas(idVenda),
  FOREIGN KEY (idProduto) REFERENCES produtos(idProduto)
);

UPDATE usuarios SET idUsuario = 1 WHERE idUsuario = 3;
UPDATE detalhe_venda SET idDetalheVenda = 1 WHERE idDetalheVenda = 3;

ALTER TABLE clientes ADD COLUMN idcidade INT;

CREATE TABLE cidades (
  idcidade INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100),
  estado VARCHAR(2)
);

INSERT INTO cidades (nome, estado) VALUES ('Florianópolis', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('Joinville', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('Blumenau', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('São José', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('Chapecó', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('Criciúma', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('Lages', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('Jaraguá do Sul', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('Itajaí', 'SC');
INSERT INTO cidades (nome, estado) VALUES ('Palhoça', 'SC');



