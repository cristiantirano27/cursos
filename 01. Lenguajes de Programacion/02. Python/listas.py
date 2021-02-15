'''
Primer elemento
Ultimo elemento
Un elemento que no esta en la lista
Rango del primero al ultimo
Rango del tercero al ultimo
'''
lista = [
    "hola",
    "usuario",
    "como",
    "estas",
    1,
    2,
    3,
    [
        4, 5, 6 
    ]
]
# print(lista): Imprimir lista normal
print("Primer elemento: ",lista[0])
print("Ultimo elemento: ",lista[-1])
# print("Un elemento que no esta en la lista: ",lista[9]): Error, no existe elemento en la 
# lista
print("Rango del primero al tercero: ",lista[:3])
print("Rango del tercero al ultimo: ",lista[3:])
