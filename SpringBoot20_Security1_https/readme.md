Ejecutar 
keytool -genkey -noprompt -alias tomcat-localhost -keyalg RSA -keystore localhost-rsa.jks -keypass 123456 -storepass 123456 -dname "CN=tomcat-cert, OU=Dev, O=CursoSpring, L=Madrid, ST=MAD, C=ES"

Para ejecutar: mvn tomcat7:run-war


Se puede acceder a '/quests/' via https. 'https://localhost:8443/quests/' 