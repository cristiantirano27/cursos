'''
Entre 0 y 1 año, es junior
Entre 1 y 3 años, es semisenior
Entre 3 y 5 años, es senior
Mas de 5, es un Pro
'''
a =  int(input("¿Cuantos años de experiencia tiene?: "))
if 0 <= a < 1:
    print("La persona es candidato para ser junior")
elif 1 <= a < 3:
    print("La persona es candidato para ser semisenior")
elif 3 <= a < 5:
    print("La persona es candidato para ser senior")
elif a >= 5:
    print("La persona es candidato para ser pro")

