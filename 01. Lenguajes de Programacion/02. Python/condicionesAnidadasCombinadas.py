edad = int(input("Ingrese su edad: "))
#if edad >= 0 and edad < 100:
if 0 <= edad < 100:
    if edad >= 18:
        print("Mayor de edad")
    else:
        print("Menor de edad")
else:
    print("Edad no valida")
