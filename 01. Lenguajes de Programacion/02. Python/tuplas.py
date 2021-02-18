tupla = (1, 2, 3, "Hola", "Usuario")
# tupla.append(5): La tupla no admite metodo append
print(tupla)
print("tupla[1] = ", tupla[1])
print("tupla[0:3] = ", tupla[0:3])
print("3 in tupla = ", 3 in tupla)
print("tupla.index(1) = ", tupla.index(1))
print("tupla.count(1) = ", tupla.count(1))
print("len(tupla) = ", len(tupla))

lista = list(tupla)
print(lista)
tupla2 = tuple(lista)
print(tupla2)