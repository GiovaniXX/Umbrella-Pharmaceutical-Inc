-- RELACIONAMENTOS ENTRE TABELAS

-- CLIENTES → VENDAS
ALTER TABLE vendas
-- ADD COLUMN idCliente INT,
ADD CONSTRAINT fk_vendas_clientes
FOREIGN KEY (idCliente) REFERENCES clientes(idCliente);

DESCRIBE vendas;
DESCRIBE clientes;
DESCRIBE itemVenda;
DESCRIBE perfil;
DESCRIBE produtos;
DESCRIBE relatorio;
DESCRIBE usuarios;

-- VENDAS → DETALHE_VENDA
ALTER TABLE detalhe_venda
-- ADD COLUMN idVenda INT,
ADD CONSTRAINT fk_detalhe_venda_vendas
FOREIGN KEY (idVenda) REFERENCES vendas(idVenda);

-- DETALHE_VENDA → ITEMVENDA
ALTER TABLE itemvenda
-- ADD COLUMN idDetalheVenda INT,
ADD CONSTRAINT fk_itemvenda_detalhe
FOREIGN KEY (idDetalheVenda) REFERENCES detalhe_venda(idDetalheVenda);

-- ITEMVENDA → PRODUTOS
ALTER TABLE itemvenda
-- ADD COLUMN idProduto INT,
ADD CONSTRAINT fk_itemvenda_produtos
FOREIGN KEY (idProduto) REFERENCES produtos(idProduto);

-- USUARIOS → PERFIL
ALTER TABLE usuarios
-- ADD COLUMN idPerfil INT,
ADD CONSTRAINT fk_usuarios_perfil
FOREIGN KEY (idPerfil) REFERENCES perfil(idPerfil);

-- RELATORIO → VENDAS (exemplo de vínculo)
ALTER TABLE relatorio
-- ADD COLUMN idVenda INT,
ADD CONSTRAINT fk_relatorio_vendas
FOREIGN KEY (idVenda) REFERENCES vendas(idVenda);

-- Solução: Não adicione a coluna novamente. Apenas crie a chave estrangeira:
ALTER TABLE vendas
ADD CONSTRAINT fk_vendas_clientes
FOREIGN KEY (idCliente) REFERENCES clientes(idCliente);

-- Se quiser conectar usuarios às vendas (por exemplo, para saber quem realizou a venda), você pode adicionar:
ALTER TABLE vendas
ADD CONSTRAINT fk_vendas_usuarios
FOREIGN KEY (idUsuario) REFERENCES usuarios(idUsuario);

-- E se quiser criar um relacionamento com uma tabela cidades, pode fazer:
ALTER TABLE clientes
ADD CONSTRAINT fk_clientes_cidades
FOREIGN KEY (idcidade) REFERENCES cidades(id);

-- 1. Aumentar o tamanho da coluna no banco
-- Se você quer permitir telefones com DDD, espaços ou traços, aumente o tamanho:
ALTER TABLE clientes MODIFY telefone VARCHAR(20);
