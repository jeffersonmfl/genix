# GENIX
API Rest do projeto Genix - Sistema escolar

## Requisitos

- [ ] CRUD de Alunos

## Documentação

### Endpoints

- [Listar Alunos](#listar-alunos)
- [Apagar Aluno](#apagar-aluno)
- [Detalhar Aluno](#detalhar-aluno)
- [Cadastrar Aluno](#cadastrar-aluno)
- [Atualizar Aluno](#atualizar-aluno)

### Listar alunos

`GET` /aluno
Retorna um array com todos os alunos.

#### Exemplo de Resposta

``` js
[
    {
        "id": 1,
        "nome": "Silas Henrique da Silva Oliveira",
        "rm": 00001,
        "cpf": "11122233344",
        "telefone": 11912345678,
        "email": "Silas@hotmail.com"
        "responsavel": "Jefferson"
    }
]

```

#### Códigos de Resposta

| Código | Descrição |
|--------|-----------|
|200|Aluno retornado com sucesso
|401|Não autorizado. Realize a autenticação em /login

---

#### Cadastrar aluno
`POST` /aluno

Cadastra um aluno com os dados enviados no corpo da requisição

#### Corpo da requisição

|campo|tipo|obrigatório|descrição
|-----|----|:---------:|--------
|nome|string|✅|Nome completo do aluno
|rm|int|✅|numero de registro do aluno sendo ele único
|cpf|string|✅|numero de cadastro de pessoa física
|telefone|long|✅|numero de telefone para contato
|email|string|✅|email para contato
|responsavel|string|✅|nome da pessoa responsável pelo aluno

``` js
{
    "nome": "Silas Henrique da Silva Oliveira",
    "rm": 00001,
    "cpf": "11122233344",
    "telefone": 11912345678,
    "email": "Silas@hotmail.com"
    "responsavel": "Jefferson"
}
```
#### Exemplo de Resposta


``` js
{
    "id": 1,
    "nome": "Silas Henrique da Silva Oliveira",
    "rm": 00001,
    "cpf": "11122233344",
    "telefone": 11912345678,
    "email": "Silas@hotmail.com"
    "responsavel": "Jefferson"
}
```
#### Códigos de Resposta

| Código | Descrição |
|--------|-----------|
|200|Aluno cadastrado com sucesso
|400|Validação falhou. Verifique os dados enviados no corpo da requisição
|401|Não autorizado. Realize a autenticação em /login

---

### Apagar aluno
`DELETE` /aluno/`{id}`

apaga o aluno da lista com `id` informado no parâmetro de path.

#### Códigos de Resposta

| Código | Descrição |
|--------|-----------|
|204|Aluno excluido com sucesso
|401|Não autorizado. Realize a autenticação em /login

---

### Detalhar aluno

`GET` /aluno/`{id}`

Retorna os dados do aluno com o `id` informado no parâmetro do path.

#### Exemplo de resposta
```js
{
    "id": 1,
    "nome": "Silas Henrique da Silva Oliveira",
    "rm": 00001,
    "cpf": "11122233344",
    "telefone": 11912345678,
    "email": "Silas@hotmail.com"
    "responsavel": "Jefferson"
}
```

#### Código de Resposta
| Código | Descrição |
|--------|-----------|
|200|Aluno retornado com sucesso
|401|Não autorizado. Realize a autenticação em /login
|404|Não existe aluno com `id` informado 

---

### Atualizar aluno
`PUT` /aluno`{id}`

Atualiza os dados do aluno com o `id` informado no path

#### Corpo da requisição

|campo|tipo|obrigatório|descrição
|-----|----|:---------:|--------
|nome|string|✅|Nome completo do aluno
|rm|int|✅|numero de registro do aluno sendo ele único
|cpf|string|✅|numero de cadastro de pessoa física
|telefone|long|✅|numero de telefone para contato
|email|string|✅|email para contato
|responsavel|string|✅|nome da pessoa responsável pelo aluno

``` js
{
    "nome": "Silas Henrique da Silva Oliveira",
    "rm": 00001,
    "cpf": "11122233344",
    "telefone": 11912345678,
    "email": "Silas@hotmail.com"
    "responsavel": "Jefferson"
}
```
#### Exemplo de Resposta


``` js
{
    "id": 1,
    "nome": "Silas Henrique da Silva Oliveira",
    "rm": 00001,
    "cpf": "11122233344",
    "telefone": 11912345678,
    "email": "Silas@hotmail.com"
    "responsavel": "Jefferson"
}
```

#### Códigos de Resposta

| Código | Descrição |
|--------|-----------|
|200|Aluno cadastrado com sucesso
|400|Validação falhou. Verifique os dados enviados no corpo da requisição
|401|Não autorizado. Realize a autenticação em /login
|404|Não existe aluno com `id` informado