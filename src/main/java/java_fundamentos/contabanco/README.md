# 💻 Desafio - ContaBanco

Repositório com a solução do desafio **"ContaBanco"** proposto na **Trilha Java Básico** da plataforma [DIO](https://www.dio.me/).

O objetivo é aplicar os conceitos fundamentais da linguagem Java, como declaração de variáveis, entrada de dados via terminal com `Scanner`, estrutura do método `main`, concatenação de strings e exibição de mensagens para o usuário.

---

## 🧾 Enunciado do Desafio

Desenvolva um programa que simule a abertura de uma conta bancária, solicitando os dados via terminal e exibindo uma mensagem final de confirmação.

### 🛠️ Requisitos

- Criar um projeto Java chamado `ContaBanco`
- Criar a classe `ContaTerminal.java`
- Utilizar a classe `Scanner` para capturar informações do usuário via terminal
- Declarar variáveis com os seguintes atributos:

| Atributo        | Tipo     | Exemplo       |
|-----------------|----------|---------------|
| número          | `int`    | 1021          |
| agência         | `String` | 067-8         |
| nome do cliente | `String` | MARIO ANDRADE |
| saldo           | `double` | 237.48        |

### 💬 Interação esperada com o usuário

O programa deve interagir via terminal com perguntas como:

```text
Número da Agência:
067-8
Número da Conta:
1021
Nome do cliente:
MARIO ANDRADE
Saldo da conta:
237.48
```

Após o preenchimento, o sistema deve exibir:

```
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco.
Sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

### 🚀 Como Executar

Clone este repositório:

    git clone https://github.com/alucod3/bootcamp-santander-2025

Compile o código:

    javac ContaTerminal.java

Execute o programa:

    java ContaTerminal

### 📚 Conceitos Aplicados

- main(String[] args) — ponto de entrada de programas Java

- Scanner — entrada de dados via terminal

- System.out.println — saída no console

- Concatenação de String

- Tipos primitivos (int, double) e String

### 👨‍🏫 Autores da Trilha

#### Gleyson Sampaio — Instrutor da DIO