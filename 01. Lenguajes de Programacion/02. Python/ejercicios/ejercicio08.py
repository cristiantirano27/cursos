x = float(input("Ingrese el valor de x: "))
y = float(input("Ingrese el valor de y: "))
z = (y ** 2) - 1
if z != 0:
    resultado = (x ** (1 / 2)) / z
    print(f"El numero  no es par")
else:
    print(f"El valor de 'Y' no puede ser {y}")