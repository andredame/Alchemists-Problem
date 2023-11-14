# Alchemist problems

## Problem description

In the algorithms and data structure course, we encountered an intriguing problem called the "Alchemist's challenge." There is an annual alchemist's convention where prizes are awarded for the best recipe to transform chemical elements into gold. Each recipe always starts with hydrogen and involves different amounts of elements to reach the final element: **gold**.
The challenge is to develop an algorithm that determines the total amount of hydrongen needed to produce one unit of gold, based on the recipes provided by the Alchemists.
Segue um exemplo simplificado de uma receita:

```plaintext
1 Hydrogen  -> 1 erbio 
7 Hydrogen  -> 1 cromo
8 Hydrogen  -> 1 zinco
10 zinco -> 1 Proto
3 Erbio 2 Zinco -> 1 cesio 
4 cromo 6 cesio 7 Proto -> 1 Ouro
```
<p align="center">
  <img src="https://github.com/andredame/T2/assets/109314147/0ad8da24-a85a-4a9e-a926-ce566f9e05bf" alt="Elemento" width="50%">
</p>

###  
#### Solution

A ideia principal do algoritmo é percorrer os elementos de maneira sistemática, atualizando informações sobre os hidrogênios associados a cada elemento. Utilizamos uma estrutura de dados de grafos direcionais[^1], onde cada "Elemento" é equivalente a um ponto no grafo, representando um vértice, e cada "ligação" corresponde a uma linha no grafo, representando uma aresta.
The main idea of the algorithm is to systematically traverse the elements, updating information about the hydrogen associated with each element.
Cada **Elemento** contém a quantidade de elementos que estão conectados a ele (**E**), uma lista com todas as ligações com outros elementos que se originam a partir dele e uma variável para armazenar o número de hidrogênios para quando fizermos o caminhamento (**N**).

<p align="center">
  <img src="https://github.com/andredame/T2/assets/109314147/40896c21-604e-4d82-9237-3ca77b249a5e" alt="Elemento" width="50%">
</p>

**Edge** represents a connection between two elements. Ela guarda informações sobre o elemento de origem "**A**" (de onde parte a ligação) e o elemento de destino "**B**" (a quem a ligação chega) e o peso "**7**" (quantidade de elementos de origem formam o elemento de destino da ligação).

<p align="center">
  <img src="https://github.com/andredame/T2/assets/109314147/527ba317-c5e8-4e97-bcb3-23e78077fd3b" alt="Ligação" width="50%">
</p>
No processo de criação dos elementos e suas ligações, a abordagem consiste em analisar cada linha da receita química, dividindo-a em duas partes distintas: a parte esquerda e direita do sinal de maior. Nessa contextualização, para cada elemento presente na parte esquerda, criamos uma ligação com o elemento da esquerda como origem e utilizamos o número que o antecede como peso e o elemento correspondente na parte direita como o destino.

[^1]: [Algorithms - Graphs](https://example.com)

---
Follow the steps bellow to solve the problem:

1. **Initialize an empty Stack and a table to keeps track the visits of the elements.**
   
| Stack  | 
| ----- |
|  | 
|  | 
|  | 
|  | 

| Element  | Number of visits |
| -------------|------------- |
| Cromo  | 0  |
| Zinco  | 0  |
| erbio  | 0  |
| cesio  | 0  |
| proto  | 0  |


3. **In each edge on hydrogen**
   - Updates the value of hydrogen of the target element.
   - Push the target element in the stack.

4. **Follow steps 5 to 9 till there are no more elements in the stack**
   
5. **Pop an element of the stack**
   
6. **Visit The element and increments the number of his visits.**
      
7. **Verifica se o Elemento "V" possui ligações de saída, ou seja, é o fim do grafo.**
   - Caso Verdadeiro:
     - Continua percorrendo a lógica.
   - Caso Falso:
     - É o fim do grafo, retorne ao passo 4.

8. **Verifica se o contador de Visitas de "V" é igual ao número de entradas de "V".**
   - Caso Verdadeiro:
     - Visite os elementos destino da(s) ligação(ões) de saída do Elemento "V", ou seja, que possui(em) "V" como sua origem.
     - Adicione ao número de hidrogênios do Elemento Destino, o número de hidrogênios de "V", multiplicado pelo peso da ligação.
     - Verifica se o elemento destino não é ouro.
       - Caso Verdadeiro: Adiciona o elemento destino na pilha.
       - Caso Falso: Retorne ao passo 4.
   - Caso Falso:
     - Retorne ao passo 4.

Esse algoritmo visa explorar de maneira eficiente as conexões químicas, determinando a quantidade necessária de hidrogênios para alcançar o precioso ouro.

#Demonstração do funcionamento do algoritmo
Segue abaixo 




Césio: 0



