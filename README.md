# Sistema de Notas de Alunos

Este é um exercício de fixação simples de um sistema de cálculo de notas de alunos em Java, parte de um exercício do curso de Java Orientado a Objetos. Ele permite calcular a média final de um aluno com base em quatro notas e determinar se o aluno foi aprovado ou reprovado.

## Como Usar

Para executar o programa, você precisa ter o JDK (Java Development Kit) instalado em seu sistema. Você pode seguir estes passos:

1. Clone este repositório em seu computador:

    ```
    git clone https://github.com/seu-usuario/aluno-notas.git
    ```

2. Navegue até o diretório do projeto:

    ```
    cd aluno-notas
    ```

3. Compile o código-fonte:

    ```
    javac Main.java
    ```

4. Execute o programa:

    ```
    java Main
    ```

5. Siga as instruções no console para inserir o nome do aluno, as quatro notas e veja o resultado da aprovação.

## Exemplo de Uso

Ao executar o programa, você será solicitado a inserir o nome do aluno e suas quatro notas. Aqui está um exemplo de entrada e saída:

```
Digite o nome e nota do aluno (a):
-----------------------------------
Nome: João
Primeira nota: 7.5
Segunda nota: 8.0
Terceira nota: 6.5
Quarta nota: 5.0

Nota Final: 6.50
ALUNO(A) APROVADO
```

```
Digite o nome e nota do aluno (a):
-----------------------------------
Nome: Maria
Primeira nota: 5.0
Segunda nota: 4.5
Terceira nota: 3.0
Quarta nota: 2.5

Nota Final: 3.50
ALUNO(A) REPROVOU
FALTOU 2.50 PONTOS
```

## Estrutura do Projeto

O projeto consiste em dois arquivos:

- `Main.java`: Contém a classe principal que interage com o usuário, solicitando as notas e imprimindo o resultado.
- `Aluno.java`: Contém a classe `Aluno`, que possui atributos para o nome e as quatro notas do aluno, além de métodos para calcular a nota total, nota final e pontos faltando para a aprovação.

---
