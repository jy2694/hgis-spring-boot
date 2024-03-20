# HGIS - Spring boot
### Highschool Geographic Information System - Spring boot
![](https://img.shields.io/badge/OpenJDK-17-000000?style=flat-square&logo=openjdk&logoColor=white)
![](https://img.shields.io/badge/Spring_boot-2.7.9-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![](https://img.shields.io/badge/Lombok-1.18.30-red?style=flat-square)
![](https://img.shields.io/badge/MariaDB_Client-3.3.3-003545?style=flat-square&logo=mariadb&logoColor=white)

---

전국의 고등학교 정보를 행정 구역(시,군,구) 별로 구분하여 지도를 기반으로 표시하여 주는 웹페이지입니다.

본 리포지토리에서는 후술되는 소프트웨어 아키텍쳐 중 백엔드에 대한 소스코드를 담고 있습니다.

---

### ⭐️ Software Architecture

![](https://github.com/jy2694/hgis-spring-boot/blob/main/architecture.png?raw=true)

---

### 💿 Database

1. **City** Table Description

| Field             | Type         | Null | Key | Default | Extra |
|-------------------|--------------|------|-----|---------|-------|
| id                | bigint(20)   | NO   | PRI | NULL    |       |
| coordinate_length | bigint(20)   | NO   |     | NULL    |       |
| name              | varchar(255) | NO   |     | NULL    |       |
| parent            | varchar(255) | NO   |     | NULL    |       |
| polygon           | varchar(255) | NO   |     | NULL    |       |

2. **School** Table Description

| Field     | Type         | Null | Key | Default | Extra |
|-----------|--------------|------|-----|---------|-------|
| id        | bigint(20)   | NO   | PRI | NULL    |       |
| address   | varchar(255) | NO   |     | NULL    |       |
| city      | bigint(20)   | NO   |     | NULL    |       |
| name      | varchar(255) | NO   |     | NULL    |       |
| type      | varchar(255) | NO   |     | NULL    |       |
| latitude  | double       | NO   |     | NULL    |       |
| longitude | double       | NO   |     | NULL    |       |

---

### 📄 License

[Apache-2.0 License](https://github.com/facebook/react/blob/main/LICENSE)
