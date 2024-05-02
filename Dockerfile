# Dockerfile
FROM maven:3.8.4-openjdk-17-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /adm-teamstatsfoxs

# Copia el JAR de la aplicación en el contenedor
COPY target/admteamstatsfox-1.0.0.war .

# Comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "admteamstatsfox-1.0.0.war"]