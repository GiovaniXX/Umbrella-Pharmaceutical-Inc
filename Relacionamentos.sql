-- RELACIONAMENTOS ENTRE TABELAS

-- CLIENTES → VENDAS
ALTER TABLE vendas
ADD COLUMN idCliente INT,
ADD CONSTRAINT fk_vendas_clientes
FOREIGN KEY (idCliente) REFERENCES clientes(id);

-- VENDAS → DETALHE_VENDA
ALTER TABLE detalhe_venda
ADD COLUMN idVenda INT,
ADD CONSTRAINT fk_detalhe_venda_vendas
FOREIGN KEY (idVenda) REFERENCES vendas(id);

-- DETALHE_VENDA → ITEMVENDA
ALTER TABLE itemvenda
ADD COLUMN idDetalheVenda INT,
ADD CONSTRAINT fk_itemvenda_detalhe
FOREIGN KEY (idDetalheVenda) REFERENCES detalhe_venda(id);

-- ITEMVENDA → PRODUTOS
ALTER TABLE itemvenda
ADD COLUMN idProduto INT,
ADD CONSTRAINT fk_itemvenda_produtos
FOREIGN KEY (idProduto) REFERENCES produtos(id);

-- USUARIOS → PERFIL
ALTER TABLE usuarios
ADD COLUMN idPerfil INT,
ADD CONSTRAINT fk_usuarios_perfil
FOREIGN KEY (idPerfil) REFERENCES perfil(id);

-- RELATORIO → VENDAS (exemplo de vínculo)
ALTER TABLE relatorio
ADD COLUMN idVenda INT,
ADD CONSTRAINT fk_relatorio_vendas
FOREIGN KEY (idVenda) REFERENCES vendas(id);

-- Solução: Não adicione a coluna novamente. Apenas crie a chave estrangeira:
ALTER TABLE vendas
ADD CONSTRAINT fk_vendas_clientes
FOREIGN KEY (idCliente) REFERENCES clientes(id);

-- Se quiser conectar usuarios às vendas (por exemplo, para saber quem realizou a venda), você pode adicionar:
ALTER TABLE vendas
ADD CONSTRAINT fk_vendas_usuarios
FOREIGN KEY (idUsuario) REFERENCES usuarios(idUsuario);

