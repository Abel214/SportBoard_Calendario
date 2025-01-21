# Etapa de construcción
FROM node:18 AS build

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar package.json y package-lock.json de la raíz (estos deben estar en la raíz del proyecto)
COPY package*.json ./

# Instalar dependencias de la aplicación (todas las dependencias necesarias)
RUN npm install

# Copiar solo el código del módulo calendario
COPY frontend/frontend/src/app/calendario ./src/app/calendario

# Construir la aplicación Angular en modo producción
RUN npm run build --prod

# Etapa para servir la aplicación usando Nginx
FROM nginx:alpine

# Copiar los archivos construidos en el contenedor de Nginx
COPY --from=build /app/dist/calendario /usr/share/nginx/html

# Exponer el puerto 80
EXPOSE 80

# Comando para ejecutar Nginx
CMD ["nginx", "-g", "daemon off;"]
