print("Ingrese los datos a solicitar: ")
a = int(input("Valor de a: "))
b = int(input("Valor de b: "))
aux = a
a = b
b = a
b = aux
print("Aqui estan los valores")
print(f"Valor a: {a}")
print(f"Valor b: {b}")