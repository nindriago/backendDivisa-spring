insert into divisa (codigo,status,creation_date) values('EUR',true, NOW());
insert into divisa (codigo,status,creation_date) values('USD',true, NOW());
insert into divisa (codigo,status,creation_date) values('COP',true, NOW());
insert into divisa (codigo,status,creation_date) values('CLP',true, NOW());

insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(1,'COP','*','3700',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(1,'USD','*','1.1',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(1,'CLP','*','829.11',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(2,'EUR','*','0.90',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(2,'COP','*','3310',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(2,'CLP','*','742',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(3,'USD','*','0.00030',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(3,'EUR','*','0.00027',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(3,'CLP','*','0.23',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(4,'USD','*','0.0013',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(4,'EUR','*','0.0012',NOW());
insert into tasahistorica (id_divisa,divisa_salida,tipo_operacion,tasa,creation_date) values(4,'COP','*','4.43',NOW());