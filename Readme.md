# README

## Easy Money Pagamento

### 1. Sobre o Projeto
Easy Money Pagamento é o mais simples dos projetos, dividido em uma arquitetura simples
parecida com MVC essa aplicação é usada apenas para confirmar o pagamento de um emprestimo

### 2. Tecnologias Utilizadas
- **Java 17**: Linguagem de programação que oferece um forte sistema de tipos e um excelente
 gerenciamento de memória.
- **Spring Boot**: Usado para simplificar o processo de configuração e desenvolvimento.
- **Maven**: Para gerenciamento de dependências.
- **H2 database**: Facil usabilidade e flexibilidade

Cada tecnologia foi escolhida com o objetivo de tornar a aplicação mais eficiente, 
fácil de testar e manter.

### 3. Arquitetura e Padrões
A aplicação segue a arquitetura Controller-Service uma arquitetura simples herdada do velho MVC
temos o o foco aqui a simplicidade por isso não colocamos nada alem que o nescessario ou seja
não tem swagger.



### 4. Instalação e Execução
Para instalar e executar este projeto, siga os seguintes passos:


##### Use o Maven para compilar e rodar
mvn clean install
mvn spring-boot:run
\```

### 5. Console H2
Colocar no seu browser o endereço http://localhost:8070/h2-console/
-url: jdbc:h2:file:./data/EasyMoneyPessoa 
-driverClassName: org.h2.Driver
-username: sa
-password: 

