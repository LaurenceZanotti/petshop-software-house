# Laurence Zanotti da Silva - Petshop Software House

## Instalação

Baixar: 

    git clone https://github.com/LaurenceZanotti/petshop-software-house.git

### Configure o MySQL

    mysql> create database petshopdb;
    mysql> create user 'springuser'@'%' identified by 'ThePassword';
    mysql> grant all on db_example.* to 'springuser'@'%';


### Execute o aplicativo

    ./mvnw spring-boot:run

ou

    ./mvnw clean package
    java -jar target/petshop_agendamento-0.0.1-SNAPSHOT.jar

## Testando as endpoints

Abra o terminal (de preferência o Git Bash) e execute os comandos `curl` abaixo

### Obter todos os clientes (GET)

    curl localhost:8080/clientes

### Cadastrar um cliente (POST)

    curl -X POST localhost:8080/clientes -H 'Content-type:application/json' -d '{"nome": "Samwise Gamgee", "telefone": "1141384471", "email": "exemplo@exemplo.com", "idade": 24}'

### Obter todos os serviços (GET)

    curl localhost:8080/servicos

### Cadastrar um serviço (POST)

    curl -X POST localhost:8080/servicos -H 'Content-type:application/json' -d '{"nome": "Banho", "descricao": "Banho completo em seu pet", "tempo": "1h00", "custo": 24.5}'


### Obter todos os animais (GET)*

    curl localhost:8080/animais

*WIP

### Cadastrar um animal (POST)*

    curl -X POST localhost:8080/animais -H 'Content-type:application/json' -d '{"nome": "Spike", "raca": "Basset", "especie": "C", "aparencia": "Marrom com manchas bejes", "cliente": 1}'

*WIP

## Etapa de segurança - Reverter permissões para ambiente de produção

OBS: Reverter permissões do `springuser` em produção se for o caso.

* Resete as permissões:

        mysql> revoke all on db_example.* from 'springuser'@'%';
        mysql> grant select, insert, delete, update on db_example.* to 'springuser'@'%';

* Mude o `spring.jpa.hibernate.ddl-auto` para `udpate`

* Reinicie o app
