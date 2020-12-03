FROM node:10.19.0-alpine as build-stage
WORKDIR /app
COPY package*.json ./
RUN node -v
RUN npm -v
#RUN npm config set registry https://registry.npm.taobao.org
#RUN apk update && apk add yarn python g++ make && rm -rf /var/cache/apk/*
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories
RUN apk add g++ make python
RUN npm install --registry=https://registry.npm.taobao.org
COPY . .
RUN npm run build:prod

FROM nginx:stable-alpine 
COPY --from=build-stage /app/dist /usr/share/nginx/html
#COPY ./dist /usr/share/nginx/html
COPY ./config/nginx/nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]

