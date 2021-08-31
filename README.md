# Microservice para envios de e-mail

## Como utilizar (Futuramente com AWS)

### Gerar senha de APP conforme documentação: https://support.google.com/accounts/answer/185833

### Substuir a sua senha de app e e-mail no application properties da aplicação onde tem ************

### Instalar e configurar MySQL com banco de dados com nome = ms_email, e senha do usuário root = password (OU alterar no properties da aplicação)

### Fazer requisição no Postman via método POST 

Segue exemplo: 

{
    "ownerRef": "Qualquer coisa aqui",
    "emailFrom": "seuemailaqui",
    "emailTo": "emaildestinoaqui",
    "subject": "Titulo aqui",
    "text": "Texto aqui"
}
