# Aplicação desktop usando JavaFX, banco de dados MySQL e JDBC

![tecnologias](https://user-images.githubusercontent.com/78989152/179290748-33eb0968-fdbe-4a7b-883b-2fe9d2664746.png)


# Aplicação rodando pela IDE:

https://user-images.githubusercontent.com/78989152/179292925-8e35115e-abd0-4ca2-a158-df605835d677.mp4

# Aplicação rodando com exportação da build para cliente final:

https://user-images.githubusercontent.com/78989152/179292898-1cfd3d13-2a3c-482f-992b-0c85d52aaa68.mp4

# Sobre o projeto

O projeto é um sistema CRUD com interface gráfica para cuidar de registros de departamentos e sellers. Esse é meu primeiro projeto usando a linguagem JAVA. Destaco entre os conceitos que aprendi ao longo das últimas semanas e foram mais úteis nesse projeto:

- Organização: o design de projeto foi o MVC (model view controller). As classes estão separadas de acordo com as funções que exercem (se são relacionadas a serviços, tratamento de erros, interface gráfica, formulário, comunicação com o banco de dados etc.)
-  JavaFX: foi usada uma biblioteca para cuidar da interface gráfica. A modelagem da interface foi feita no SceneBuilder que gerou arquivos FXMLs com as configurações das janelas.
-  Uso do driver do JDBC para conversar com o banco de dados MySQL.
-  Conversão da build do projeto para distribuição.

# Bibliotecas necessárias

- JavaFX
- MySQL connectors

# Divisão de pacotes MVC conforme os serviços e utilidades de classes:

![a](https://user-images.githubusercontent.com/78989152/179426762-c00eaa7d-f0ee-4719-82f0-2b3104a23881.png)

# Dificuldades

O maior dificuldade nesse projeto são o uso de expressões lambdas
