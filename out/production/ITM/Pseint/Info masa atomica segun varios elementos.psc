Algoritmo tabla_periodica
	Definir nom, nomMay, nomMen Como Caracter
	Definir masa,masaMay,masaMen, prom, porc, suma Como Real
	Definir cont71, n Como Entero
	suma=0
	cont71=0
	nomMay=""
	masaMay=0
	nomMen=""
	masaMen=1000000
	Imprimir "Ingrese el numero de elementos"
	Leer n
	
Para i=1 Hasta n Con Paso 1
	Imprimir "Ingrese el nombre del elemento #" i
	Leer nom
	Imprimir "Ingrese masa atomica del elemento #" i
	Leer masa
	suma=suma+masa   //suma es un acumulador
	si masa > masaMay Entonces
		masaMay=masa
		nomMay=nom
	FinSi
	si masa < masaMen Entonces
		masaMen=masa
		nomMen=nom
	FinSi
	si masa >= 70 y masa <= 100 Entonces
		cont71=cont71+1 //cont71 es un contador
	FinSi
FinPara
prom=suma/n
porc=(cont71*100)/n
Imprimir "Promedio de masas atomicas = " prom
Imprimir "Nombre del elemento con mayor masa atomica = " nomMay
Imprimir "Nombre del elemento con menor masa atomica = " nomMen
Imprimir "Porcentaje de elementos con masa atomica entre 70 y 100 = " porc "%"

FinAlgoritmo
