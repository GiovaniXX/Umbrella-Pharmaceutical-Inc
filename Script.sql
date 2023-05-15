
create database EssenceRoyaleApp;
use essenceroyaleapp;

create table usuarios(
iduser int primary key,
nname varchar(50) not null,
surname varchar(50) not null,
accessCode varchar(15) not null,
securityKey varchar(15) not null,
pprofile varchar(15)
);

describe usuarios

insert into usuarios(iduser,nname,surname,accessCode,securityKey,pprofile)
values(1,'Giovani','chaves','Asheley','Kennedy','admin');

select * from usuarios;
