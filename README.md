# Target Sistemas - Entrevista Técnica

Este repositório contém soluções para cinco questões técnicas apresentadas pela **Target Sistemas** como parte de um processo seletivo. As questões abrangem tópicos como manipulação de laços, cálculo de sequências, operações em vetores e strings, além de análise de faturamento.

## Questões

### 1. Cálculo de Soma com Laço
**Descrição:** 
Dado o código que soma os números de 1 a `INDICE`, foi solicitado calcular o valor final da variável `SOMA`.

**Lógica:**
O laço `while` itera até que o valor de `K` seja igual a `INDICE`, somando os números sucessivamente.

**Execução:**
- Ao final do processo, o valor da variável `SOMA` será 91.

**Localização:** `src/Soma.java`

---

### 2. Verificação de Pertencimento à Sequência de Fibonacci
**Descrição:** 
Escreva um programa que, dado um número informado, calcule a sequência de Fibonacci e retorne se o número pertence ou não à sequência.

**Lógica:**
O programa gera a sequência de Fibonacci iterativamente até encontrar o número informado ou ultrapassá-lo, verificando se ele pertence à sequência.

**Exemplo de Execução:**
- Entrada: 13
- Saída: "13 pertence à sequência de Fibonacci."

**Localização:** `src/Fibonacci.java`

---

### 3. Análise de Faturamento Diário de uma Distribuidora
**Descrição:** 
O programa deve calcular o menor e o maior valor de faturamento diário, além de contar o número de dias em que o faturamento foi superior à média mensal, ignorando dias sem faturamento.

**Lógica:**
- Percorre-se o vetor de faturamento para calcular a soma total, identificar o maior e menor faturamento e, em seguida, calcular a média e verificar quantos dias superaram essa média.

**Exemplo de Execução:**
- Menor faturamento: 10.0
- Maior faturamento: 50.5
- Dias com faturamento acima da média: 4

**Localização:** `src/FaturamentoDistribuidora.java`

---

### 4. Cálculo de Percentual de Faturamento por Estado
**Descrição:** 
Dado o faturamento mensal de uma distribuidora por estado, o programa deve calcular o percentual de representação de cada estado em relação ao faturamento total.

**Lógica:**
Os percentuais são calculados dividindo o faturamento de cada estado pelo faturamento total.

**Exemplo de Execução:**
- Percentual SP: 37.53%
- Percentual RJ: 20.29%
- Percentual MG: 16.17%
- Percentual ES: 15.03%
- Percentual Outros: 10.98%

**Localização:** `src/PercentualFaturamento.java`

---

### 5. Inversão de String
**Descrição:** 
O programa deve inverter os caracteres de uma string fornecida, sem utilizar funções prontas de bibliotecas, como `reverse()`.

**Lógica:**
O programa percorre a string de trás para frente, concatenando cada caractere à nova string invertida.

**Exemplo de Execução:**
- Entrada: "hello"
- Saída: "olleh"

**Localização:** `src/InverterString.java`

---

## Como Executar

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/target-sistemas-entrevista.git
   ```
2. **Compilar e executar os programas individualmente usando o compilador Java:**
   ```bash
   javac src/Soma.java
   java src.Soma
   ```

   Repita o processo para os demais arquivos `.java`.

## Requisitos

- **Java 8+** instalado.
- IDE recomendada: **Eclipse**, **IntelliJ IDEA** ou **VS Code** com extensão Java.
  
## Contato

Se tiver dúvidas ou sugestões sobre as soluções, sinta-se à vontade para entrar em contato.

---

**Nota:** Todas as soluções foram implementadas e testadas em ambiente local com as versões indicadas do JDK. Certifique-se de que você tenha o ambiente configurado corretamente para rodar o código.
