# Listas de exercicios em Java

Este projeto possui tres listas de exercicios:

- lista 1: Java basico, com 12 exercicios;
- lista 2: decisoes, com 15 exercicios;
- lista 3: repeticao, com 10 exercicios.

Cada exercicio possui sua propria classe e usa `Scanner` para ler os dados.

## Requisito

JDK 8 ou mais recente.

## Como compilar

No terminal, dentro da pasta do projeto:

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 -d out (Get-ChildItem -Path src -Recurse -Filter *.java).FullName
```

## Como executar

Exemplos:

```powershell
java -cp out br.com.lucasfaria.lista01.Exercicio01
java -cp out br.com.lucasfaria.lista02.Exercicio15
java -cp out br.com.lucasfaria.lista03.Exercicio10
```

Troque o numero da lista e do exercicio quando necessario. Para numeros decimais, use ponto.
