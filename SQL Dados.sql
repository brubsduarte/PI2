BEGIN; 

INSERT INTO produto (Titulo, Autor, Genero, Editora, Valor, Tipo, Quantidade, Descricao)
VALUES ('As Aventuras na Netoland Com Luccas Neto', 'Neto,Luccas', 'Infanto-Juvenil','Saraiva', 
14.90, 'Capa Alternativa', 10, 'Com mais de 13 milhões de inscritos em seu canal' );

INSERT INTO produto (Titulo, Autor, Genero, Editora, Valor, Tipo, Quantidade, Descricao)
VALUES ('Pai Rico, Pai Pobre', 'Kiyosaki,Robert T.', 'Autobiografia','Abril', 
50.90, 'Edição de Aniversário', 5 , 'Celebrando 20 anos como o livro n° 1 em finanças pessoais.' );

INSERT INTO produto (Titulo, Autor, Genero, Editora, Valor, Tipo, Quantidade, Descricao)
VALUES ('Agora e Para Sempre, Lara Jean', 'Han,Jenny ', 'Romance','Globo', 
24.90, 'Edição de Luxo', 30 , 'Na aguardada conclusão da série Para todos os garotos que já amei,
 Lara Jean vai ter que tomar as decisões mais difíceis de sua vida.' );
 
INSERT INTO cliente (CPF, Nome, RG, Sexo, OrgaoEmissor, UF, DataNascimento, EstadoCivil, Email, 
TelefoneResidencial, TelefoneCelular, Rua, Numero, CEP, Complemento, Bairro, Cidade, Estado)
VALUES ('41975938801', 'Maria do Carmo', '476519640','Feminino', 'SSP', 'SP', '1993-08-30', 'Casado', 'maria@gmail.com',  
'1156233296', '11962019029', 'Mauro Paes de Almeida' , '57', '047640170', 'apto 90', 'Socorro', 'São Paulo', 'SP' );

SELECT @IDCLIENTE := id FROM cliente LIMIT 1;

SELECT @IDPRODUTO := id, @VALORPRODUTO := valor FROM produto LIMIT 1;

INSERT INTO venda (Data, ValorTotal,idCliente)
VALUES (NOW(), @VALORPRODUTO, @IDCLIENTE);

SELECT @IDVENDA := id FROM venda LIMIT 1;


INSERT INTO vendaproduto (idProduto, QuantidadeVenda,idVenda)
VALUES (@IDPRODUTO, 1, @IDVENDA);

-- COMMIT;