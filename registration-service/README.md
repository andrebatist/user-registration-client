POST http://localhost:8080/register

key application/json

Content-Type application/json

raw JSON:

{ "id": "1", "name": "Admin", "email": "admin@mail.com", "experience": "1", "domain": "domain1" }

GET http://localhost:8080/findUser/admin@mail.com

DELETE http://localhost:8080/cancel/1
