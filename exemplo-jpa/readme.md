# Exemplo JPA

Exemplo de utilização de banco de dados com Java através de JPA.

## Executando

Para executar esse projeto é necessário executar o banco de dados Derby, em seguida executar o Tomcat e então acessar o endereço `http://localhost:9090/jpa/professores`.

### Para iniciar o Derby

`mvn exec:java@derby-start`

### Para parar o Derby

`mvn exec:java@derby-stop`

### Para executar o Tomcat

`mvn tomcat7:run`

## Banco de Dados

### JDBC

Abaixo estão os dados para conexão com o banco de dados Derby.

URL: `jdbc:derby://localhost:1527/professoresdb`

Usuário: `app`

Senha: `app`