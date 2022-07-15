# Spring Boot + ECS + Fargate

<p align="center">
    <img src="https://miro.medium.com/max/1400/1*j1Yx6pVAu8rv_wFOD8sIAg.png" width="750"/>
    <br />
    <br />
    <a href="https://github.com/jjeanjacques10/springboot-ecs-fargate/issues">Report Bug</a>
    ·
    <a href="https://github.com/jjeanjacques10/springboot-ecs-fargate/issues">Request Feature</a>
</p>

<p align="center">
   <a href="https://www.linkedin.com/in/jjean-jacques10/">
      <img alt="Jean Jacques Barros" src="https://img.shields.io/badge/-JeanJacquesBarros-D66413?style=flat&logo=Linkedin&logoColor=white" />
   </a>
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jjeanjacques10/extract-mangajj-lambda?color=D66413">

  <a href="https://github.com/jjeanjacques10/springboot-ecs-fargate/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/jjeanjacques10/extract-mangajj-lambda?color=D66413">
  </a>
  <img alt="License" src="https://img.shields.io/badge/license-MIT-D66413">
  <img alt="GitHub Pull Requests" src="https://img.shields.io/github/issues-pr/jjeanjacques10/extract-mangajj-lambda?color=D66413" />
  <a href="https://github.com/jjeanjacques10/springboot-ecs-fargate/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/jjeanjacques10/extract-mangajj-lambda?color=D66413&logo=github">
  </a>
</p>

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

``` yml
Service:
  Type: "AWS::ECS::Service"
  Properties:
    ServiceName: !Sub service-${FeatureName}-${MicroServiceName}
    <...>
    CapacityProviderStrategy:
      - CapacityProvider: FARGATE_SPOT
        Weight: 5
      - CapacityProvider: FARGATE
        Weight: 1
    <...>
```

## Articles 

It's my article about ECS Fargate using Spot instance.

- [Utilizando AWS Fargate Spot para economizar até 70% em aplicações ECS](https://jjeanjacques10.medium.com/utilizando-aws-fargate-spot-para-economizar-at%C3%A9-70-em-aplica%C3%A7%C3%B5es-ecs-565231aedf8a)

## CodeBuild Notes

- Add ECR permissions to codeBuild.
- Error - "You have reached your pull rate limit"
  - Use: [ECR Public Repository](https://gallery.ecr.aws/socar/adoptopenjdk/openjdk11)

---
Developed by [Jean Jacques Barros](https://github.com/jjeanjacques10)
