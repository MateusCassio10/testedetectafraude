# TesteDetectaFraude

Este é um projeto de teste, com intuito de aprender sobre API Java com Spring Boot.

Este projeto é uma simples demonstração de como detectar fraude em transações. As transações tem um grau de risco de 0 (sem indicios de fraude) e 100 (máximo risco de fraude).
A pontuação é calculada da seguinte maneira:
- +10 pontos caso o cliente seja menor de idade.
- +30 pontos se o nome do dono do cartão utilizado na compra, seja diferente do cliente.
- 100 pontos se o valor da compra for menor ou igual a zero.
- 100 pontos se a transação não tiver um "id".
- 100 pontos se o cliente não tiver um "id".

## Requirements
- JDK 1.8 or later.

## Build
	mvn clean install

## Run
	mvn spring-boot:run

## API 
Request:

	$ curl -X POST http://localhost:8080/score

Body:
```json
[
    {
        "id": "5f20325488b6d415454025af",
        "value": 768.29,
        "paid_at": "2019-03-25 07:23:20",
        "ip_location": "SC/BR",
        "card_hold_name": "Ashlee Swanson",
        "customer": {
        "id": "5f203254077bb9e7bae8056f",
        "name": "Ashlee Swanson",
        "birth_date": "2005-04-18",
        "state": "SC/BR",
        "phone": "48 98466-8473"
        }
    },
    {
        "id": "5f203254b9d016f51b5bdd5c",
        "value": 78.22,
        "paid_at": "2015-05-13 09:30:25",
        "ip_location": "SP/BR",
        "card_hold_name": "Eddie Wilcox",
        "customer": {
        "id": "5f203254e2c72787030d61aa",
        "name": "Eddie Wilcox",
        "birth_date": "1998-09-21",
        "state": "SP/BR",
        "phone": "11 98398-511"
        }
    }
]
```


Response: 
```json
[
    {
        "id": "5f20325488b6d415454025af",
        "score": 40
    },
    {
        "id": "5f203254b9d016f51b5bdd5c",
        "score": 30
    }
]
```