hubbub - Grails in Action 2nd Edition

<h3>hubbub</h3>


### 01: 프로젝트 생성
1. 프로젝트로 사용할 부모 디렉토리로 이동 후


    grails create-app hubbub

    cd hubbub

    grails run-app


### 02: 모델 생성. spock integration test 작성


![alt text](https://github.com/yoyojyv/grails-hubbub/blob/02.ModelingTheDomain/web-app/images/modeling.png "Domain Model")



    Each User object has an optional Profile object.                                                                     ￼
    Each User can have zero to many Post objects.
    A User creates many Tags, so each Tag relates to one User (1:m)
    A Post has many Tags, and each Tag may relate to many Posts (m:n)
    User has many Posts and Tags.




