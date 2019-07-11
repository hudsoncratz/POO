CREATE DATABASE agendaFinal;
use agendaFinal;

CREATE TABLE salao(
	idSalao int(3)AUTO_INCREMENT,
    nomeSalao varchar(50) UNIQUE, #nome do salao
    numSalao int,
    ruaSalao varchar(100), 
    bairroSalao varchar(30),
	celSalao varchar(10),
    PRIMARY KEY(idSalao)
)ENGINE = InnoDB;

CREATE TABLE datas(
	idData int(3) AUTO_INCREMENT,
    dia int, #validado na classe Data
    mes int,
    FKSalao int, #chave estrangeira da data no salao
    foreign key (FKSalao)  references salao(idSalao), #referencia
	PRIMARY KEY(idData)
)ENGINE = InnoDB;

CREATE TABLE atendimentos(
	idAtendimento int(3) AUTO_INCREMENT, 
    horaInicio int, #validado na classe Horario
    tipoServico varchar(20), #tratado na main
	FKData int,
    foreign key (FKData) references datas(idData),
    PRIMARY KEY(idAtendimento)
)ENGINE = InnoDB;

#saloes estaticos
insert into salao (nomeSalao, numSalao, ruaSalao, bairroSalao, celSalao) values ('Salao Stein', 51, 'Rua da liberdade', 'Ideal', '2732485261');
insert into salao (nomeSalao, numSalao, ruaSalao, bairroSalao, celSalao) values ('Salao Cratz', 13, 'Rua Benedito', 'Guriri', '2736451295');

#datas estaticas
insert into datas(dia,mes,fksalao) values(15,07,1);
insert into datas(dia,mes,fksalao) values(16,02,1);
insert into datas(dia,mes,fksalao) values(30,08,1);

insert into datas(dia,mes,fksalao) values(30,07,2);
insert into datas(dia,mes,fksalao) values(21,08,2);

#atendimentos estaticos
insert into atendimentos(horainicio,tiposervico,fkdata) values(7,'Barba', 1);
insert into atendimentos(horainicio,tiposervico,fkdata) values(10,'Manicure', 2);
insert into atendimentos(horainicio,tiposervico,fkdata) values(14,'Pedicure', 2);

insert into atendimentos(horainicio,tiposervico,fkdata) values(9,'Tintura', 3);
insert into atendimentos(horainicio,tiposervico,fkdata) values(7,'Depilacao', 4);
insert into atendimentos(horainicio,tiposervico,fkdata) values(19,'Cabelo', 5);
