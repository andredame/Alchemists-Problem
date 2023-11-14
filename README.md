# Alchemist problems

## Problem description

In the algorithms and data structure course, we encountered an intriguing problem called the "Alchemist's challenge." There is an annual alchemist's convention where prizes are awarded for the best recipe to transform chemical elements into gold. Each recipe always starts with hydrogen and involves different amounts of elements to reach the final element: gold.
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
#### Descrição do Algoritmo

A ideia principal do algoritmo é percorrer os elementos de maneira sistemática, atualizando informações sobre os hidrogênios associados a cada elemento. Utilizamos uma estrutura de dados de grafos direcionais[^1], onde cada "Elemento" é equivalente a um ponto no grafo, representando um vértice, e cada "ligação" corresponde a uma linha no grafo, representando uma aresta.
The main idea of the algorithm is to systematically traverse the elements, updating information about the hydrogen associated with each element.
Cada **Elemento** contém a quantidade de elementos que estão conectados a ele (**E**), uma lista com todas as ligações com outros elementos que se originam a partir dele e uma variável para armazenar o número de hidrogênios para quando fizermos o caminhamento (**N**).

<p align="center">
  <img src="https://github.com/andredame/T2/assets/109314147/40896c21-604e-4d82-9237-3ca77b249a5e" alt="Elemento" width="50%">
</p>

**Ligação** representa uma conexão entre dois elementos químicos. Ela guarda informações sobre o elemento de origem "**A**" (de onde parte a ligação) e o elemento de destino "**B**" (a quem a ligação chega) e o peso "**7**" (quantidade de elementos de origem formam o elemento de destino da ligação).

<p align="center">
  <img src="https://github.com/andredame/T2/assets/109314147/527ba317-c5e8-4e97-bcb3-23e78077fd3b" alt="Ligação" width="50%">
</p>
No processo de criação dos elementos e suas ligações, a abordagem consiste em analisar cada linha da receita química, dividindo-a em duas partes distintas: a parte esquerda e direita do sinal de maior. Nessa contextualização, para cada elemento presente na parte esquerda, criamos uma ligação com o elemento da esquerda como origem e utilizamos o número que o antecede como peso e o elemento correspondente na parte direita como o destino.

[^1]: [Algorithms - Graphs](https://example.com)

---
Aqui está um passo a passo para descobrir a quantidade de hidrogênios necessários para transformar em ouro, utilizando um algoritmo baseado em pilha:

1. **Inicializamos uma pilha vazia.**

2. **Passe por todas ligações do hidrogênio.**
   - Adicione o Peso da ligação ao número de hidrogênios do Elemento Destino.
   - Adicione o Elemento destino na pilha.

3. **Siga os passos 4 a 7 enquanto a pilha não estiver vazia.**
   
4. **Desempilhe um Elemento "V" da pilha.**
   
5. **Visite o Elemento "V".**
   
6. **Incremente a contagem de visitas de "V".**
   
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

![image](https://github.com/andredame/T2/assets/109314147/0ad8da24-a85a-4a9e-a926-ce566f9e05bf)


Pilha
-----
Cromo
Zinco
Erbio

Visitas
--------
Cromo: 0
Zinco: 0
Erbio: 0
Proto: 0
Césio: 0



