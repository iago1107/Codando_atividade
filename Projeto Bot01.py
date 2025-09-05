"""
Atividade Avaliativa 01 - App Mimo
Objetivo:
    Interagir com o usuário utilizando apenas o comando input(),
    sem a necessidade de usar print().
"""

while True: #inicio looping
  #entrada de dados de Input
   
    bot_age = 3
    nome_input = input("Ola,qual o seu nome? ")
    nome = str(nome_input)
    print(f"Prazer em te conhecer {nome}") 
    age_input = input(f"Quantos anos voce tem1?")
    age = int(age_input)
    color = input(f"Qual sua cor favorita {nome}?")
    print(f"Oh, {color} é uma cor linda!")
    print(f"Eu tenho {bot_age} anos, sou bem novinho!")
    print("Vamos descobrir a diferença de idade entre a gente!")
    print("Calculando...")
    #calculo de diferença de idade
    age_difference = age - bot_age
    ageAbs = abs(age_difference)
    
    # Saida de dados, diferença de idade
    print(f"Nossa diferença de idade {ageAbs} anos.")
  
  #condição de verdade ou falso de diferença de idade
    if ageAbs > 3:
      print(f"voce e {ageAbs} mais velho que eu" )
    elif ageAbs < 3:
      print("eu sou mais velho que voce")
    elif ageAbs == 3:
      print("nos temos a mesma idade")
    elif ageAbs < 0:
      print("dados invalidos")
    else:
      print("dados inválidos")
    
  #Pergunta se quer repetir
    again = input("Quer rodar de novo? (s/n): ")  
    if again.lower() != "s":
        break
#fim looping
print("Obrigado por participar! Ate a proxima!")
