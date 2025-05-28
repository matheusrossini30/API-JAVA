FROM ubuntu:latest AS build

# Definir diretório de trabalho
WORKDIR /app

# Atualiza e instala openjdk e maven
RUN apt-get update && \
    apt-get install -y openjdk-21-jdk maven && \
    apt-get clean

# Copia todo código para /app
COPY . /app

# Build da aplicação
RUN mvn clean install -DskipTests

# --------------------------------------------------

FROM openjdk:21-jdk-slim

WORKDIR /app

# Porta que a aplicação vai expor
EXPOSE 8080

# Copia o jar gerado na stage build para a stage final
COPY --from=build /app/target/todolist-1.0.0.jar /app/app.jar

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/app.jar"]