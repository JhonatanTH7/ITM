Algoritmo CUADRATICA
	Definir a,b,c,x1,x2 Como Real
	// Asignacion
	Escribir 'Ingrese el valor de a'
	Leer a
	Escribir 'Ingrese el valor de b'
	Leer b
	Escribir 'Ingrese el valor de c'
	Leer c
	Si a<>0 Entonces
		Si b*b-4*a*c=0 Entonces
			x <- -b/(2*a)
			Escribir x
		SiNo
			Si b*b-4*a*c>0 Entonces
				x1 <- (-b+(b*b-4*a*c)^(0.5))/(2*a)
				x2 <- (-b-(b*b-4*a*c)^(0.5))/(2*a)
				Escribir x1
				Escribir x2
			SiNo
				Escribir 'La solucion no esta dentro del conjunto de los numeros reales'
			FinSi
		FinSi
	SiNo
		Escribir 'Error division por cero, el valor de a NO puede ser cero'
	FinSi
FinAlgoritmo
