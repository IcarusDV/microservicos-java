Microsserviços com Java, Spring Boot, Eureka e Containers
Este projeto é uma arquitetura baseada em microsserviços desenvolvida com Java, utilizando Spring Boot para construir serviços modulares e independentes, Eureka Service para descoberta de serviços e containers Docker para facilitar a implantação e o gerenciamento.

🛠️ Tecnologias Utilizadas
Java 21
Spring Boot
Spring Web
Spring Data JPA
Spring Cloud Netflix Eureka
Eureka Service (Discovery Server)
Docker (para containerização dos serviços)
H2 Database (para persistência de dados, em modo dev)
Postman (para testes de APIs)
📜 Funcionalidades
Arquitetura de Microsserviços
Serviços independentes para diferentes domínios (ex.: Usuários, Produtos, Pagamentos).
Servidor de Descoberta Eureka
Todos os microsserviços se registram no Eureka, permitindo comunicação dinâmica.
APIs RESTful
Exposição de endpoints para operações CRUD em cada microsserviço.
Balanceamento de Carga
Gerenciado pelo Eureka com comunicação eficiente entre microsserviços.
Containerização
Cada serviço empacotado em um container Docker, facilitando a implantação e escalabilidade.
⚙️ Como Executar
Pré-requisitos
Java 17+
Maven
Docker e Docker Compose
Passos
Clone este repositório:

bash
Copiar código
git clone https://github.com/IcarusDV/microservicos-java.git  
cd microservicos-java  
Compile os projetos:

bash
Copiar código
mvn clean install  
Inicie os containers com Docker Compose:

bash
Copiar código
docker-compose up  
Acesse o Eureka Service no navegador:

arduino
Copiar código
http://localhost:8761  
Teste os endpoints dos serviços utilizando ferramentas como Postman ou curl.

📂 Estrutura do Projeto
eureka-service: Servidor Eureka para registro e descoberta de serviços.
user-service: Microsserviço para gerenciamento de usuários.
product-service: Microsserviço para gerenciamento de produtos.
docker-compose.yml: Configuração para subir todos os serviços em containers.
🚀 Melhorias Futuras
Adicionar autenticação com Spring Security e JWT.
Implementar API Gateway para roteamento centralizado.
Migrar o banco de dados para uma solução em produção como PostgreSQL.
Monitoramento com ferramentas como Prometheus e Grafana.
🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
