import time
print("- - - Constante de Kaprekar - - -")
print("Elige un número de cuatro dígitos que tenga al menos dos diferentes (es válido colocar el dígito 0 al principio, por lo que el número 0009 es válido):")
emaitza = input()
vueltas = 0
while emaitza != 6174:
      
      n1, n2, n3, n4 = [int(n) for n in str(emaitza)]
      if n1==n2 and n1==n3 and n1==n4:
            vueltas = 8
            break
      if n1>n2 or n1>n3 or n1>n4 or n2>n3 or n2>n4 or n3>n4:
            if n1<n2: 
                  o = n2
                  n2 = n1
                  n1 = o
            if n1<n3: 
                  o = n3
                  n3 = n1
                  n1 = o
            if n1<n4: 
                  o = n4
                  n4 = n1
                  n1 = o
            if n2<n3: 
                  o = n3
                  n3 = n2
                  n2 = o
            if n2<n4:
                  o = n4
                  n4 = n2
                  n2 = o

            if n3<n4:
                  o = n4
                  n4 = n3
                  n3 = o

      Ascendente = [n1,n2,n3,n4]
      numero1 = int("".join(map(str,Ascendente)))

      
      if n1>n2 or n1>n3 or n1>n4 or n2>n3 or n2>n4 or n3>n4:
            if n1>n2: 
                  o = n2
                  n2 = n1
                  n1 = o
            if n1>n3: 
                  o = n3
                  n3 = n1
                  n1 = o
            if n1>n4: 
                  o = n4
                  n4 = n1
                  n1 = o
            if n2>n3: 
                  o = n3
                  n3 = n2
                  n2 = o
            if n2>n4:
                  o = n4
                  n4 = n2
                  n2 = o
            
            if n3>n4:
                  o = n4
                  n4 = n3
                  n3 = o

      Descendente = [n1,n2,n3,n4]
      numero2 = int("".join(map(str,Descendente)))
      
      emaitza = numero1-numero2
                        
      print (numero1, " - ", numero2, " = ", emaitza )
      time.sleep(2)
      
      cantidad_digitos = len(str(abs(emaitza)))
      if cantidad_digitos < 4:
            emaitza =  str(emaitza).zfill(4)
      
      vueltas = vueltas+1

print("has necesitado", vueltas, "operaciones para llegar al numero de kaprekar")

