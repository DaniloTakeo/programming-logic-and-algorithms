# ✨ Lógica de Programação ✨

Este repositório contém soluções de desafios de lógica de programação:
1. **LCS (Longest Common Subsequence) 📝** - Determina a maior subsequência comum entre duas strings.
2. **Sudoku Solver 🎲** - Resolve um tabuleiro de Sudoku incompleto utilizando backtracking.
3. **Jogo dos Cavalos no Xadrez ♞** - Determina o menor número de movimentos para um cavalo ir de um ponto a outro no tabuleiro.

---

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
Dado um tabuleiro de tamanho `N x N`, um cavalo inicia na posição `(x1, y1)` e precisa chegar até `(x2, y2)`. O objetivo é determinar o menor número de movimentos necessários para alcançar a posição final.

### 🔄 Entrada:
- Um inteiro `N` representando o tamanho do tabuleiro.
- Coordenadas `(x1, y1)` do ponto inicial.
- Coordenadas `(x2, y2)` do ponto de destino.

### 🔠 Saída:
- O número mínimo de movimentos necessários para que o cavalo chegue ao destino.

### 📝 Exemplo:
```bash
Entrada:
N = 8
(x1, y1) = (0, 0)
(x2, y2) = (7, 7)

Saída:
Mínimo de movimentos necessários: 6
```

### ⚙️ Como Executar:
Para compilar e executar a solução em Java:
```bash
javac KnightMoves.java
java KnightMoves
```
Caso queira testar diferentes tamanhos de tabuleiro e posições, edite o arquivo `KnightMoves.java` e modifique os valores de entrada.

---

## ✨ Tecnologias Utilizadas
- **Java** para implementação dos algoritmos.
- **Algoritmo de Programação Dinâmica** para LCS.
- **Backtracking** para resolução do Sudoku.
- **Busca em Largura (BFS)** para calcular o menor caminho do cavalo no xadrez.

## 👨‍💻 Autor
Danilo Takeo Kanizawa

