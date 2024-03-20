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

* **City** Table Description

| Field             | Type         | Null | Key | Default | Extra |
|-------------------|--------------|------|-----|---------|-------|
| id                | bigint(20)   | NO   | PRI | NULL    |       |
| coordinate_length | bigint(20)   | NO   |     | NULL    |       |
| name              | varchar(255) | NO   |     | NULL    |       |
| parent            | varchar(255) | NO   |     | NULL    |       |
| polygon           | varchar(255) | NO   |     | NULL    |       |


* **School** Table Description

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

### ☁️ REST API

1. 행정 구역 조회
   
| URL     | /api/city    |
|---------|--------------|

| Method     | GET          |
|------------|--------------|

| Parameter  | Description                   |
|------------|-------------------------------|
| name       | 시/군/구 이름                    |
| parent     | 상위 행정 구역(도/특별시/광역시)     |

   시/군/구 이름 또는 상위 행정 구역 명으로 행정 구역을 조회할 수 있습니다.
   
   매개변수 중 하나를 택하여 요청할 수 있습니다.
   
   매개변수가 하나도 없다면 404 Not Found 가 반환됩니다.
   
   두 매개변수가 모두 기입되어 있다면 name 매개변수만 작동합니다.
   
   
   name 매개변수를 이용해 조회하는 경우 정확한 행정구역 명을 입력하여야 합니다.
   특별시, 광역시 소속의 구 행정 구역이라면 상위 행정 구역이 시 단위이므로 구만 작성해도 됩니다.
   다만, 도에 소속된 시, 구 행정 구역은 시와 구를 모두 작성해야 합니다. (EX| 중구 or 전주시 덕진구)
   해당 이름에 해당된 행정구역 객체 1개가 JSON 포맷으로 반환됩니다.

   parent 매개변수를 이용해 조회하는 경우 상위 행정구역의 일부 명칭만 입력하여도 조회가 가능합니다.
   해당 상위 행정구역에 소속된 모든 행정구역 객체가 리스트로 구성되어 JSON 포맷으로 반환됩니다.

---
   
2. 학교 정보 조회

| URL     | /api/school    |
|---------|----------------|

| Method     | GET          |
|------------|--------------|

| Parameter  | Description                   |
|------------|-------------------------------|
| name       | 학교명                          |
| city       | 소재지 행정 구역 명(시, 군, 구)     |

   학교 이름 또는 시/군/구 이름으로 학교 정보를 조회할 수 있습니다.

   매개변수 중 하나를 택하여 요청할 수 있습니다.

   매개변수가 하나도 없다면 404 Not Found 가 반환됩니다.

   두 매개변수가 모두 기입되어 있다면 name 매개변수만 작동합니다.

   name 매개변수를 이용해 조회하는 경우 학교명의 일부 명칭만 입력하여도 조회가 가능합니다.
   해당하는 학교 정보들은 리스트로 구성되어 JSON 포맷으로 반환됩니다.

   city 매개변수를 이용해 조회하는 경우 행정구역의 일부 명칭만 입력하여도 조회가 가능합니다.
   해당 행정구역에 소재지를 두고 있는 모든 학교 정보들은 리스트로 구성되어 JSON 포맷으로 반환됩니다.

---

### 📄 License

[Apache-2.0 License](https://github.com/facebook/react/blob/main/LICENSE)
