t = 1000
print("¡¡¡Bienvenido a su banco!!!\n\
Seleccione una de las siguientes opciones\n\
1. Ingresar.\n\
2. Sacar.\n\
3. Salir.\n")
opc = int(input())
if opc == 1:
    i = float(input("¿Cuanto dinero desea ingresar?: "))
    t += i
    print(f"Saldo total: {t}")
elif opc == 2:
    r = float(input("¿Cuanto dinero desea sacar?: "))
    if t - r < 0:
        print("No tiene suficiente saldo, solo cuenta con un saldo de $1000")
    else:
        t -= r
        print(f"Saldo total: {t}")
elif opc == 3:
    print("Gracias por utilizar nueestros servicios")
    quit()
