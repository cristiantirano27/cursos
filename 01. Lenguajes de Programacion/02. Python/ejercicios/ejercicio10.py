l = input("Ingrese una letra consonante: ")
l = l.lower() 
if l == "a" or l == "e" or l == "i" or l == "o" or l == "u":  
        print("Error!!. Pedi una letra tipo consonante")
if l == "á" or l == "é" or l == "í" or l == "ó" or l == "ú":
        print(f"La letra {l} lleva tilde, por lo tanto no es una consonante")
else:
    print("La letra ingresada es consonante")