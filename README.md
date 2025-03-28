# BrowserCLI e WaitingList

## Introdução

**BrowserCLI** é uma ferramenta de simulação de navegador de linha de comando desenvolvida como um exercício prático para o curso de Estrutura de Dados. O projeto tem como objetivo demonstrar a implementação de pilhas para gerenciar a navegação entre páginas, imitando o funcionamento de um navegador convencional, como o Mozilla Firefox.

Além disso, o projeto inclui a implementação de um **Waiting List** usando uma estrutura de fila (FIFO). Esse sistema gerencia a fila de espera de pacientes que aguardam para serem chamados para o atendimento, com a funcionalidade de chamar o próximo paciente e gerar senhas, enquanto mantém um histórico das chamadas feitas.

## Funcionalidades

### BrowserCLI

- **Navegação para páginas**: Acesso de URLs e navegação através de comandos de "voltar" e "avançar".
- **Histórico de navegação**: Uso de duas pilhas para armazenar as páginas visitadas anteriormente e posteriormente, permitindo que o usuário navegue para trás e para frente, respectivamente.
- **Comandos disponíveis**:
  - `back`: Volta para a página anterior.
  - `forward`: Avança para a próxima página.
  - `exit`: Finaliza o programa.

### WaitingList

- **Fila de Espera**: Utiliza uma estrutura de fila (FIFO) para gerenciar a ordem dos pacientes a serem chamados.
- **Chamar próximo**: Chama o próximo paciente da fila para o atendimento, removendo o primeiro paciente da fila.
- **Gerar Senha**: Gera uma senha para os pacientes, mantendo um histórico das chamadas.
- **Comandos disponíveis**:
  - `add [nome]`: Adiciona um paciente à fila com um nome.
  - `call_next`: Chama o próximo paciente da fila e o remove.
  - `exit`: Finaliza o programa.

## Estrutura do Projeto

O projeto é composto por cinco principais componentes:
1. **Node.java**: Representa um nó que contém um valor e uma referência para o próximo nó.
2. **Stack.java**: Implementa a estrutura de dados pilha (LIFO), com operações como `push()`, `pop()`, `peek()`, e `isEmpty()`.
3. **Queue.java**: Implementa a estrutura de dados fila (FIFO), com operações como `enqueue()`, `dequeue()`, `peek()`, e `isEmpty()`.
4. **BrowserCLI.java**: Contém a lógica principal do programa, gerenciando as pilhas de navegação e controlando a interação com o usuário via linha de comando.
5. **WaitingList.java**: Gerencia a fila de espera de pacientes, com funcionalidades para adicionar, chamar e visualizar o próximo paciente da fila.


## Como Executar

1. Clone este repositório:
    ```bash
    git clone https://github.com/seu-usuario/BrowserCLI.git
    ```

2. Compile os arquivos Java:
    ```bash
    javac *.java
    ```

3. Execute o programa:
    ```bash
    java BrowserCLI/WaitingList
    ```