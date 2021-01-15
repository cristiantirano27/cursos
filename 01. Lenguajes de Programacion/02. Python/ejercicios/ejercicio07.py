n1 = int(input("Ingrese un numero par: "))
n2 = int(input("Ingrese otro numero par: "))
nPar1 = n1 % 2
nPar2 = n2 % 2
if nPar1 == 0 and nPar2 == 0:
    print("Ambos numeros ingresados son pares")
else:
    print("Error, el/los numero/s a ingresar deben se pares")
    if nPar1 != 0:
        print(f"El numero {n1} no es par")
    if nPar2 != 0:
        print(f"El numero {n2} no es par")