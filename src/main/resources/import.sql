INSERT INTO public.departamento(descricao, nome) VALUES ('Dpto. Contabilidade', 'Departamento de Contabilidde');
INSERT INTO public.departamento(descricao, nome) VALUES ('Dpto. TI', 'Departamento de Tecnologia da Informação');
INSERT INTO public.departamento(descricao, nome) VALUES ('Dpto. Faturamento', 'Departamento de Faturamento');

INSERT INTO pessoa(celular, email, nome, telefone)VALUES ('5334534534', 'joao@gmail.com', 'João', '53998585858');
INSERT INTO pessoa(celular, email, nome, telefone)VALUES ('5323455534', 'alfredo@gmail.com', 'Alfredo', '2342342');

INSERT INTO public.funcionario(data_hora_cadastro, data_hora_contrato, estado, salario, id_departamento, id_pessoa) VALUES (current_date, current_date, 'A', '10000.00', 1, 1);
INSERT INTO public.funcionario(data_hora_cadastro, data_hora_contrato, estado, salario, id_departamento, id_pessoa) VALUES (current_date, current_date, 'A', '20000.00', 2, 2);