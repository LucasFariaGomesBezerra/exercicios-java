# Listas de exercícios em Java

Resoluções das três listas: Java básico (12 exercícios), decisões (15 exercícios) e repetição (10 exercícios).
Cada exercício está em sua própria classe, com entrada pelo teclado usando `Scanner`.

## Requisito

JDK 17 ou mais recente. As listas 2 e 3 usam `switch` com `case ->`, conforme pedido no enunciado. Neste computador, o JDK 26 está em `C:\Users\luqui\.jdks\openjdk-26`.

## Como compilar

No terminal, dentro da pasta do projeto:

```powershell
$jdk = "$env:USERPROFILE\.jdks\openjdk-26\bin"
New-Item -ItemType Directory -Force out | Out-Null
& "$jdk\javac.exe" -encoding UTF-8 -d out (Get-ChildItem -Path src -Recurse -Filter *.java).FullName
```

## Como executar

Exemplos:

```powershell
& "$jdk\java.exe" -cp out br.com.seunome.lista01.Exercicio01
& "$jdk\java.exe" -cp out br.com.seunome.lista02.Exercicio15
& "$jdk\java.exe" -cp out br.com.seunome.lista03.Exercicio10
```

Substitua o número da lista e do exercício conforme necessário. Digite os valores pedidos pelo programa. Para números decimais, use ponto como separador.
