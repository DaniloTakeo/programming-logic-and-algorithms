# ✨ Lógica de Programação

Este repositório tem como objetivo conter soluções para diversos desafios de lógica de programação.

## 1. 🔢 Longest Common Subsequence (LCS)

### ✨ Problema:
Dadas duas strings `A` e `B`, encontrar a maior subsequência comum entre elas. Uma subsequência é uma sequência de caracteres que aparece na mesma ordem em ambas as strings, mas não necessariamente de forma contínua.

### 🔄 Entrada:
- Duas strings `A` e `B`.

### 🔠 Saída:
- O comprimento da maior subsequência comum.
- Opcionalmente, a própria subsequência.

### 📝 Exemplo:
```bash
Entrada:
A = "ABCBDAB"
B = "BDCAB"

Saída:
Comprimento da LCS: 4
LCS: "BCAB"
```

### ⚙️ Como Executar:
Para compilar e executar a solução em Java:
```bash
javac LCS.java
java LCS
```
Caso queira testar com diferentes entradas, edite o arquivo `LCS.java` e altere as strings `A` e `B`.

---

## 2. 🎲 Sudoku Solver

### ✨ Problema:
Resolver um tabuleiro de Sudoku incompleto, preenchendo os números de 1 a 9 sem repetir valores em linhas, colunas ou regiões `3x3`.

### 🔄 Entrada:
- Uma matriz `9x9` representando o tabuleiro de Sudoku, onde `0` indica espaços em branco a serem preenchidos.

### 🔠 Saída:
- A matriz resolvida, onde todos os `0s` foram substituídos pelos números corretos.

### 📝 Exemplo:
```bash
Entrada:
[
  [5,3,0,0,7,0,0,0,0],
  [6,0,0,1,9,5,0,0,0],
  [0,9,8,0,0,0,0,6,0],
  ...
]

Saída:
[
  [5,3,4,6,7,8,9,1,2],
  [6,7,2,1,9,5,3,4,8],
  [1,9,8,3,4,2,5,6,7],
  ...
]
```

### ⚙️ Como Executar:
Para compilar e executar a solução em Java:
```bash
javac SudokuSolver.java
java SudokuSolver
```
Para testar com diferentes tabuleiros, edite o arquivo `SudokuSolver.java` e modifique a matriz de entrada.

---

## 3. ♞ Jogo dos Cavalos no Xadrez

### ✨ Problema:
Dado um tabuleiro `N x N`, um cavalo inicia na posição `(x1, y1)` e precisa chegar à posição `(x2, y2)`. O objetivo é calcular o menor número de movimentos necessários para atingir o destino.

### 🔄 Entrada:
- Dimensões do tabuleiro `N`.
- Coordenadas iniciais `(x1, y1)`.
- Coordenadas alvo `(x2, y2)`.

### 🔠 Saída:
- Um número representando a quantidade mínima de movimentos necessários para que o cavalo atinja o destino.

### 📝 Exemplo:
```bash
Entrada:
N = 8
x1 = 0, y1 = 0
x2 = 7, y2 = 7

Saída:
6
```

### ⚙️ Como Executar:
Para compilar e executar a solução em Java:
```bash
javac KnightMoves.java
java KnightMoves
```
Altere os valores de entrada no arquivo `KnightMoves.java` para testar diferentes casos.

---

## 4. 🔢 Expressão Matemática Balanceada

### ✨ Problema:
Verificar se uma expressão matemática contém parênteses, colchetes e chaves corretamente balanceados.

### 🔄 Entrada:
- Uma string contendo uma expressão matemática com `()`, `{}` e `[]`.

### 🔠 Saída:
- `true` se a expressão estiver balanceada.
- `false` caso contrário.

### 📝 Exemplo:
```bash
Entrada:
"{[()]}"
Saída:
true

Entrada:
"{[(])}"
Saída:
false
```

### ⚙️ Como Executar:
Para compilar e executar a solução em Java:
```bash
javac BalancedExpression.java
java BalancedExpression
```
Edite o arquivo `BalancedExpression.java` para testar diferentes expressões.

---

## ✨ Tecnologias Utilizadas
- **Java** para implementação dos algoritmos.
- **Algoritmo de Programação Dinâmica** para LCS.
- **Backtracking** para resolução do Sudoku.
- **BFS (Busca em Largura)** para Jogo dos Cavalos no Xadrez.
- **Pilhas (Stack)** para Expressão Matemática Balanceada.


## 👨‍💻 Autor
Danilo Takeo Kanizawa

