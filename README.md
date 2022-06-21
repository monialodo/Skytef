
![Badge](https://img.shields.io/badge/Teste%20Java-SkyTef-blue?style=for-the-badge&logo=appveyor)

<h1 align="center">Teste Técnico - Java </h1> 


<p> Esse repositório contém as respectivas questões do teste técnico respondidas</p>


### Questão 01
- A questão pedia validação de triplicatas em um número inserido via JOptionPane;
- Desenvolvi um projeto Java, com uma classe para receber o input, tratar o mesmo e converter em um List Long;
- Validações solicitadas e cumpridas:
    [X] Ser implementado em uma classe main simples pronta para execução.
    [X] Coletar o número inteiro através de um JOptionPane
    [X] Consistir se a entrada é de fato numérica e inteira, dando mensagens adequadas caso contrário.
    [X] Dar a resposta também através de um JOptionPane.
    [X] Exibir os textos de respostas exatamente com a estrutura do quadro abaixo
    ```
    Há uma sequência de algarismos 1 repetidos três vezes consecutivas com início na posição 5.
    Há uma sequência de algarismos 6 repetidos três vezes consecutivas com início na posição 10.
    ```

### Questão 02

- A questão pedia a criação de uma classe main executável que atendesse a alguns requisitos;
- Criei um projeto Java com uma classe Veículo e duas classes filhas - Moto e Carro que recebiam atributos e métodos da classe mãe;
- Na classe Main criei algumas chamadas utilizando o JOptionPane e tratando as respostas recebidas de modo que alguns métodos das classes são chamados;
- Validações solicitadas e cumpridas:
[X] A classe seja executável.
[X] Apareça pelo menos uma vez o uso de polimorfismo.
[X] Apareça pelo menos uma vez um tratamento de exceção com try / catch.
[X] Apareça pelo menos uma vez um método void.
[X] Apareça pelo menos uma vez um método que retorne um valor (não void).


### Questão 03
- A questão pedia a criação de um player de video mp4 utilizando uma API externa;
- Optei pela api VLCJ, que pode ser encontrada aqui: <https://github.com/caprica/vlcj> 
- Apesar da opção de instalar os arquivos em *.jar essa API também é encontrada no Maven Repository e por isso optei por utilizar um projeto Maven;
- Validações solicitadas e cumpridas:
[X] Ler um arquivo mp4 em uma pasta, cujo caminho pode ser fixo no código.
[X] Tratar exceção FileNotFoundException de maneira simples.
[X] Rodar o vídeo em tela cheia.
[X] Exibir um botão no canto inferior direito da tela para encerrar a execução do objeto.
