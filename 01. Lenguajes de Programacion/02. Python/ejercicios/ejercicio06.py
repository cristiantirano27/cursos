'''
Calcular las notas de un alumno, con las siguientes caracteristicas:
Practicas: 40%
Participacion: 20%
Examen: 40%
Obtener la nota final, sumando y obteniendo el promedio.
'''
print("Por favor, ingrese las notas del alumno")
practicas = float(input("Ingrese la nota de las practicas: "))
participacion = float(input("Ingrese la nota de la participacion: "))
examen = float(input("Ingrese la nota del examen: "))
practicas *= 0.6
participacion *= 0.1
examen *= 0.3
final = practicas + participacion + examen
print(f"Esta es la calificacion final: {final}")