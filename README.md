# Decorator Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Decorator** em Java, aplicado a um sistema de cálculo de preços com diferentes ajustes (desconto, frete e imposto).

## 📌 Estrutura

- **Interface**
  - `Preco` → define o contrato para cálculo de preço.

- **Classe base**
  - `PrecoBase` → representa o valor inicial sem ajustes.

- **Classe abstrata**
  - `PrecoDecorator` → fornece a estrutura para adicionar responsabilidades dinamicamente.

- **Decoradores concretos**
  - `Desconto` → aplica um desconto fixo.
  - `Frete` → adiciona custo de frete.
  - `Imposto` → aplica imposto percentual sobre o valor.

- **Factory**
  - `PrecoDecoratorFactory` → cria instâncias dos decoradores a partir de uma string identificadora.

- **Classe de execução**
  - `Main` → instancia o preço base e aplica os decoradores em sequência.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/decorator`.
3. Execute a classe `Main`.

Preço base: 100.0
Preço com desconto: 90.0
Preço com frete: 105.0
Preço final com imposto: 115.5


## 🎯 Objetivo

O padrão **Decorator** permite adicionar responsabilidades a objetos de forma dinâmica, sem alterar sua estrutura.  
Neste exemplo, o preço base recebe incrementos ou decrementos conforme os decoradores aplicados, simulando descontos, frete e impostos.

## 💻 Saída esperada

