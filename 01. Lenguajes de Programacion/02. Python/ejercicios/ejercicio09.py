print("Se deben ingresar 2 numeros")
n1 = int(input("Numero 1: "))
n2 = int(input("Numero 2: "))
if n1 == n2:
    print("Los dos numeros son iguales")
elif n1 > n2:
    print(f"El numero {n1} es mayor que {n2}")
elif n2 > n1:
    print(f"El numero {n2} es mayor que {n1}")