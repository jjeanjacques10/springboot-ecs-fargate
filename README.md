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

Use file [template.yml](template.yml) to create that resources:

- Cluster
- TaskDefinition
- Service
- Security Group
- Load Balancer

## CodeBuild Notes

- Add ECR permissions to codeBuild.
- Error - "You have reached your pull rate limit"
  - Use: [ECR Public Repository](https://gallery.ecr.aws/socar/adoptopenjdk/openjdk11)

---
Developed by [Jean Jacques Barros](https://github.com/jjeanjacques10)