## mariadb docker 설치
docker container run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 --name inflearn-security mariadb