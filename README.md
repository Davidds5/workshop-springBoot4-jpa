# Web Services com Spring Boot e JPA / Hibernate

## 📌 Descrição
Projeto de API REST desenvolvido com **Spring Boot**, baseado no curso *Java Completo* do professor **Nélio Alves**, com o objetivo de consolidar conceitos de desenvolvimento backend, persistência de dados e arquitetura em camadas.

A aplicação simula um sistema de pedidos, usuários e produtos, com regras de negócio, relacionamentos complexos e tratamento de exceções.

---

## 🧱 Arquitetura
O projeto segue o padrão de **arquitetura em camadas**:

- **Resource (Controller)** – Camada de entrada da API
- **Service** – Regras de negócio
- **Repository** – Acesso a dados com Spring Data JPA
- **Entities** – Modelo de domínio

---

## 🛠️ Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (ambiente de teste)
- PostgreSQL (ambiente de desenvolvimento/produção)
- Maven
- Git / GitHub

---

## 📊 Modelo de Domínio
Principais entidades:
- User
- Order
- Product
- Category
- OrderItem (entidade associativa com chave composta)

Relacionamentos implementados:
- One-to-Many
- Many-to-Many
- Many-to-Many com atributos adicionais

---

## ⚙️ Funcionalidades
- CRUD completo de usuários, pedidos, produtos e categorias
- Persistência de dados com JPA/Hibernate
- Tratamento de exceções personalizado
- Configuração de múltiplos perfis de ambiente (test, dev, prod)
- Banco em memória H2 para testes

---

## 🚀 Como Executar o Projeto
1. Clonar o repositório:
```bash
git clone https://github.com/Davidds5/workshop-springBoot4-jpa.git
