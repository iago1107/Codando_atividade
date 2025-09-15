Seguem as tarefas:

Exercício 1 – Mostrar números de 1 a 10
Exercício 2 – Somar 5 números
Exercício 3 – Ordenar 3 números
Exercício 4 – Verificar se número é primo

1. Mostrar números de 1 a 10

Declaraçao   
        int numero, soma;   

Dados 
        numero = 0

Processamento 
        enquanto(numero <= 10);   Faça                                                                                           >       
            escreva(numero);
            Soma = numero + 1;
        fimenquanto

2. Somar 5 números

Declaraçao   
        int numero1,numero2,numero3,numero4,numero5 soma;   
Dados 
        escreval("digite o primeiro numero:")
        leia(numero1)
        escreval("digite o segundo numero:")
        leia(numero2)
        escreval("digite o terceiro numero:")
        leia(numero3)
        escreval("digite o quarto numero:")
        leia(numero4)
        escreval("digite o quinto numero:") 
        leia(numero5)              
Processamento 
        soma = numero1 + numero2 + numero3 + numero4 + numero5
Saida
        escreval("a soma dos cinco numeros" + numero1 + "+" + numero2 + "+" + numero3 + "+" + numero4 + "+" + numero5 + "e: " + soma)


3. Ordenar 3 números


Declaraçao
   // Variáveis para os 3 números
        n1, n2, n3: Inteiro
   
   // Variável auxiliar para ajudar na troca de valores
        aux: Inteiro
   
   // Variável de controle para o laço PARA
        i: Inteiro

Dados
   // 1. Entrada de dados
        Escreval("Digite o primeiro número:")
        Leia(n1)
   
        Escreval("Digite o segundo número:")
        Leia(n2)
   
        Escreval("Digite o terceiro número:")
        Leia(n3)
   
   LimpaTela
   
        Escreval("Números originais: ", n1, ", ", n2, ", ", n3)
        Escreval("------------------------------------")
   
Processamento
        // O laço vai rodar 2 vezes para garantir que os números "borbulhem"
        // para a posição correta.
     para i de 1 ate 2 faca
   
        // Compara o primeiro com o segundo. Se o primeiro for maior, troca.
      se (n1 > n2) entao
         aux <- n1
         n1 <- n2
         n2 <- aux
      fimse
      
        // Compara o segundo com o terceiro. Se o segundo for maior, troca.
      se (n2 > n3) entao
         aux <- n2
         n2 <- n3
         n3 <- aux
      fimse
    fimpara

 Saida
        Escreval("Números em ordem crescente: ", n1, ", ", n2, ", ", n3)

Fimalgoritmo
