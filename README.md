# Spring Boot + ECS + Fargate

Integration between Spring Boot and AWS Elastic Container Service (Fargate)

## Config Docker

Build Image

``` bash
docker build -t digimonapi:latest "."
```

Run Container using image created

``` bash
docker run -d -p 80:80 -t digimonapi:latest
```

## Cloudformation

Use file [template.yml](template.yml)

---
Developed by [Jean Jacques Barros](https://github.com/jjeanjacques10)