"""
Atividade Avaliativa 01 - App Mimo
Objetivo:
    Interagir com o usuário utilizando apenas o comando input(),
    sem a necessidade de usar print().
"""

while True: #inicio looping
  
name = input("Hello! What is your name?")
age_input = input("How old are you?")
age = int(age_input)
bot_age = 3
age_difference = age - bot_age
ageAbs = abs(age_difference)
color = input("What's your favorite color?")
print(f"Nice to meet you, {name}!") 
# entrada de dados de Input, diferença de idade
print(f"Você é {ageAbs} anos mais velho que eu. Eu tenho apenas {bot_age} anos!")
print(f"Oh, {color} é uma cor linda!")

#condição de verdade ou falso de diferença de idade
if ageAbs > 3:
  print(f"voce e {ageAbs} mais velho que eu" )
elif ageAbs < 3:
  print(f"eu sou mais velho que voce")
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
