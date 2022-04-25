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
- CloudWatch

## Articles 

- https://jjeanjacques10.medium.com/utilizando-aws-fargate-spot-para-economizar-at%C3%A9-70-em-aplica%C3%A7%C3%B5es-ecs-565231aedf8a

## CodeBuild Notes

- Add ECR permissions to codeBuild.
- Error - "You have reached your pull rate limit"
  - Use: [ECR Public Repository](https://gallery.ecr.aws/socar/adoptopenjdk/openjdk11)

---
Developed by [Jean Jacques Barros](https://github.com/jjeanjacques10)
