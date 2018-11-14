# Exemplo JDBC

Exemplo de utilização de banco de dados com Java através de JDBC.

## Executando

Para executar esse projeto é necessário executar o banco de dados Derby, em seguida executar o Tomcat e então acessar o endereço `http://localhost:9090/venda-jdbc/venda`.

### Para iniciar o Derby

`mvn exec:java@derby-start`

### Para parar o Derby

`mvn exec:java@derby-stop`

### Para executar o Tomcat

`mvn tomcat7:run`

## Banco de Dados

### JDBC

Abaixo estão os dados para conexão com o banco de dados Derby.

URL: `jdbc:derby://localhost:1527/vendadb`

Usuário: `app`

Senha: `app`

### Tabelas

Para a aplicação funcionar, as tabelas precisam ser criadas.

```sql
create table venda (
  codigo varchar(100),
  produto varchar(100),
  quantidade integer
)
```

```sql
create table conta (
  numero int,
  saldo decimal
)
```