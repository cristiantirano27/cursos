'''
S o s: Suma
R o r: Resta
M o m: Multiplicacion
D o d: Division
'''
print("Ingrese dos numeros solicitados")
n1 = int(input("Numero 1: "))
n2 = int(input("Numero 2: "))
opcion = input("Ahora, seleccione lo que sesa hacer con esos 2 numeros: \n\
S o s = Suma\n\
R o r = Resta\n\
M o m = Multiplicacion\n\
D o d = Division: \n")
opcion = opcion.lower()
resultado = 0
if opcion == "s":
    resultado = n1 + n2
elif opcion == "r":
    resultado = n1 - n2
elif opcion == "m":
    resultado = n1 * n2
elif opcion == "d":
    if n2 != 0: 
        resultado = n1 / n2
else:
    print("No se selecciono ninguna opcion valida")
    quit()
print(f"Resultado: {resultado}")