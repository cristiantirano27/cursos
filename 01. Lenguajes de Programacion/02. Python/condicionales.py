numero = int(input("Ingrese un numero positivo: "))
if numero < 0:
    print(f"{numero} no es numero positivo, es un numero neutro")
elif numero == 0:
    print("0 no es un numero positivo")
else:
    print(f"{numero} es positivo")