# APIFinanceira

Projeto desenvolvido em Java com Spring Boot, com foco em boas práticas de arquitetura de software, versionamento com Git e organização em camadas.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Maven
- Git e GitHub

## Organização do projeto

O projeto segue uma estrutura modular com separação clara de responsabilidades, alinhada ao padrão Domain-Driven Design (DDD).

Estrutura atual:

src
|
|-- main
|   |-- java
|   |   |-- domain
|   |   |   |-- transaction
|   |   |   |   |-- Transaction.java
|   |   |   |-- user
|   |   |   |   |-- User.java
|   |   |   |   |-- UserType

## Funcionalidades desenvolvidas até agora

- Criação do projeto com Spring Initializr
- Criação do domínio user com:
  - Classe User
  - Enum UserType
- Criação do domínio transaction com:
  - Classe Transaction
- Organização do projeto por domínios
- Criação do arquivo README.md
- Versionamento com Git (branch dev e branches feature)

## Branches utilizadas

- main - versão estável
- dev - desenvolvimento contínuo
- feat/readme - criação da documentação inicial
- feat/transaction - implementação da entidade Transaction
- doc/anotações - anotações feitas em TransactionRepository e UserType.

## Próximos passos

- Implementar camada de persistência (JPA Repository)
- Criar serviços (Service) para regras de negócio
- Expor endpoints REST via Controller
- Testes unitários básicos

## Autoria

Desenvolvido por Lucas Santos do Amaral, aluno de Gestão da Tecnologia da Informação (FATEC), com foco em desenvolvimento backend com Java e Spring Boot.