WelcomeService utiliza la propiedad welcome.message

#Desde la pestaña arguments de la aplicacion añadir
--welcome.message="Welcome from program arguments"

#Ver en actuator en \env
# Renombrar application.yaml a application.yaml_old si no lo está

# Quitar program arguments y lanzar de nuevo, debe coger lo de application.properties

# Renombrar application.yaml_old a application.yaml (tomará este por defecto)