import time as tm
import random as rd
 

def burbuja():
    inicio = tm.time() #Variable que guarda el tiempo inicial de ejecucion
    contador = 10000 # nummero de datos a ordenar
    arr = []

    # Iterador que asigna un numero aleatorio entre 1-10000 al arreglo
    while (contador != 0): 
        arr.append(rd.randint(1, 10000))
        contador -= 1

    #Iterador que ordena los numeros

    for i in range(1, len(arr)):
        for j in range(0, len(arr) - 1):
            if (arr[j + 1] < arr[j]):
                aux = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = aux
    print(arr)
    final = tm.time() #Variable que guarda el tiempo final de ejecucion
    print("El tiempo de ejecucion es:")
    return (print(final - inicio)) #Retorna el tiempo de ejecucion en seg

def dec_bin():
    decimal = int(input('Introduce el número a convertir a binario: '))
    inicio = tm.time() #Variable que guarda el tiempo inicial de ejecucion
    binario = ''
    #Iterador que hace la conversion del numero decimal a binario
    while decimal // 2 != 0:
        binario = str(decimal % 2) + binario
        decimal = decimal // 2
        
    print(str(decimal) + binario)
    final = tm.time() #Variable que guarda el tiempo final de ejecucion
    print("El tiempo de ejecucion es:")
    return (print(round((final - inicio),8)))#Retorna el tiempo de ejecucion en seg

dec_bin()
