# Alchemist problems

## Problem description

In the algorithms and data structure course, we encountered an intriguing problem called the "Alchemist's challenge." There is an annual alchemist's convention where prizes are awarded for the best recipe to transform chemical elements into gold. Each recipe always starts with hydrogen and involves different amounts of elements to reach the final element: **gold**.
The challenge is to develop an algorithm that determines the total amount of hydrongen needed to produce one unit of gold, based on the recipes provided by the Alchemists.
Follow a recipe below:

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

#### Solution
The main idea of the algorithm is to systematically traverse the elements, updating information about the hydrogen associated with each element.
Each **Element** contains the quantity of elements connected to it (E), a list with all the links to other elements originating from it, and a variable to store the number of hydrogens for when we perform traversal (N).

<p align="center">
  <img src="https://github.com/andredame/T2/assets/109314147/40896c21-604e-4d82-9237-3ca77b249a5e" alt="Elemento" width="50%">
</p>


An "edge" represents a connection between two elements, keeping track of the source element (A), the target element (B), and the weight of the edge (7), as shown below.
<p align="center">
  <img src="https://github.com/andredame/T2/assets/109314147/527ba317-c5e8-4e97-bcb3-23e78077fd3b" alt="Ligação" width="50%">
</p>

In the process of creating elements and their connections, the approach involves analyzing each line of the chemical recipe, dividing it into two distinct parts: the left and right sides of the greater-than sign. In this context, for each element present on the left side, we create a connection with the left-side element as the source, using the preceding number as the weight, and the corresponding element on the right side as the destination.

[^1]: [Algorithms - Graphs](https://example.com)

---
Follow the steps bellow to solve the problem:

#### Step 1: **Initialize an empty Stack and a table to keeps track the visits of the elements.**
   
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


#### Step 2: **In each edge on hydrogen**
   - Updates the value of hydrogen of the target element.
   - Push the target element in the stack.

#### Step 3:**Follow steps 5 to 8 till there are no more elements in the stack**
   
#### Step 4: **Pop an element of the stack**
   
#### Step 5: **Visit The element and increments the number of his visits.**
#### Step 6: Verify Outgoing Edges of Element "V"

- **True:**
   - Continue traversal.

- **False:**
   - It's the end of the graph, return to Step 5.

#### Step 7: Check Visit Counter of "V" against Number of Inputs

- **If True:**
    - Visit the destination elements of the outgoing edge(s) of Element "V," i.e., those with "V" as their source.
    - Add to the number of hydrogens of the Destination Element the number of hydrogens of "V" multiplied by the weight of the edge.
    - Check if the destination element is not gold.
        - **If True:**
            - Add the destination element to the stack.
        - **If False:**
            - Return to Step 4.

- **If False:**
    - Return to Step 4.


#Demonstração do funcionamento do algoritmo
Segue abaixo 




Césio: 0


