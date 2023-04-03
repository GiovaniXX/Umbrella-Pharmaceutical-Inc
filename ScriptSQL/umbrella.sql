create database umbrella;

use umbrella;

alter table nome da tabela rename novo nome da tabela;

alter table tbvendas change idFatura idVenda int; -> muda o nome da coluna de uma tabela

create table tbusuarios(
idUsuario varchar(10) primary key,
nome varchar(30) not null,
snome varchar(30) not null,
senha varchar(15) not null,
idPerfil int
);

create table tbprodutos(
idProduto varchar(12) primary key,
descricao varchar(50) not null,
preco int not null,
idImposto int not null,
notas text
);

create table tbclientes(
idClientes varchar(10) primary key,
idTipo int not null,
nome varchar(30) not null,
snome varchar(30) not null,
endereco varchar(50) not null,
telefone varchar(20) not null,
idCidade int not null,
dataNascimento date not null,
dataCadastro date not null
);

create table tbfatura(
idFatura int primary key,
idCliente varchar(10) not null,
fdata date not null
);

create table tbdetalheFatura(
idFatura int primary key,
idLinha int not null,
idProduto varchar(12) not null,
descricao varchar(50) not null,
preco int not null,
quantidade int not null
);

insert into tbclientes(idClientes,idTipo,nome,snome,endereco,telefone,idCidade,dataNascimento,dataCadastro)
values(1,1,'Giovani','Chaves','Marechal Rondon 387','999367954',1,'1971-12-10','20203-02-20');