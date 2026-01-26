<h1 align="center">🚀 Workshop Spring Boot + JPA</h1>

<p align="center">
  Projeto backend desenvolvido em <b>Java com Spring Boot</b>, focado em consolidar fundamentos de
  <b>APIs REST</b>, <b>JPA/Hibernate</b> e organização em camadas.
</p>

<hr/>

<h2>📌 Sobre o projeto</h2>

<p>
Este projeto faz parte do meu processo de aprendizado contínuo em backend Java.
O objetivo principal é aplicar conceitos fundamentais de desenvolvimento de APIs REST,
persistência de dados e boas práticas básicas de organização de código.
</p>

<p>
Ao longo do tempo, o projeto será evoluído com refatorações e novas funcionalidades.
</p>

<hr/>

<h2>🛠️ Tecnologias utilizadas</h2>

<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Hibernate</li>
  <li>Banco de dados H2</li>
  <li>Maven</li>
  <li>Postman</li>
</ul>

<hr/>

<h2>📁 Estrutura do projeto</h2>

<pre>
src/main/java/com/educandoWeb/course
├── config        → Configurações e database seeding
├── entities      → Entidades JPA
├── repositories  → Camada de acesso a dados
├── services      → Regras de negócio
├── resources     → Controllers REST
</pre>

<hr/>

<h2>🧱 Modelo de domínio</h2>

<p>O sistema é composto pelas seguintes entidades:</p>

<ul>
  <li><b>User</b></li>
  <li><b>Order</b></li>
  <li><b>Product</b></li>
  <li><b>Category</b></li>
</ul>

<p>
Entre elas, são utilizados relacionamentos como:
</p>

<ul>
  <li>OneToMany</li>
  <li>ManyToMany</li>
</ul>

<hr/>

<h2>🔁 Funcionalidades</h2>

<ul>
  <li>API REST para consulta de produtos, categorias, usuários e pedidos</li>
  <li>Persistência de dados com JPA/Hibernate</li>
  <li>Relacionamentos entre entidades</li>
  <li>Database seeding para ambiente de testes</li>
  <li>Testes de endpoints utilizando Postman</li>
  <li>Banco de dados H2 com console web</li>
</ul>

<hr/>

<h2>▶️ Como executar o projeto</h2>

<h3>Pré-requisitos</h3>

<ul>
  <li>Java 17 ou superior</li>
  <li>Maven</li>
</ul>

<h3>Passos</h3>

<pre>
git clone https://github.com/Davidds5/workshop-springBoot4-jpa
cd workshop-springBoot4-jpa
mvn spring-boot:run
</pre>

<p>A aplicação estará disponível em:</p>

<pre>http://localhost:8080</pre>

<hr/>

<h2>🧪 Testes de API</h2>

<p>
Os endpoints podem ser testados utilizando o <b>Postman</b>.
</p>

<pre>
GET /products
GET /categories
GET /users
GET /orders
</pre>

<hr/>

<h2>🗄️ Banco de dados H2</h2>

<p>Console disponível em:</p>

<pre>http://localhost:8080/h2-console</pre>

<p><b>Configuração padrão:</b></p>

<ul>
  <li>JDBC URL: jdbc:h2:mem:testdb</li>
  <li>User: sa</li>
  <li>Password: (vazio)</li>
</ul>

<hr/>

<h2>🚧 Próximas melhorias planejadas</h2>

<ul>
  <li>Implementação de DTOs</li>
  <li>Validação de dados com Bean Validation</li>
  <li>Tratamento global de exceções</li>
  <li>Paginação e ordenação</li>
  <li>Melhoria na documentação da API</li>
</ul>

<hr/>

<h2>👨‍💻 Autor</h2>

<p>
<b>David Silva</b><br/>
Estudante de backend Java em constante evolução com Spring Boot.
</p>
