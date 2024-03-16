Algoritmo distancia_porteria
	//Elaborar un algoritmo que permita calcular y mostrar la distancia euclidiana (medida desde el punto p0(0,0)) a la que se encuentra  
	//cada vehiculo desde la porteria
	//Variables: X1,X2,X3,Y1,Y2,Y3,Distancia donde p1(X1,Y1) p2(X2,Y2) p3(X3,Y3)
	//Formula: rc((X)^2+(Y)^2)
	Definir X1,X2,X3,Y1,Y2,Y3,Distancia1,Distancia2,Distancia3 Como Real
	Imprimir "Ingrese la cordenada en X del auto #1"
	Leer X1
	Imprimir "Ingrese la cordenada en Y del auto #1"
	Leer Y1
	Distancia1=rc(X1^2+Y1^2)
	Imprimir "Ingrese la cordenada en X del auto #2"
	Leer X2
	Imprimir "Ingrese la cordenada en Y del auto #2"
	Leer Y2	
	Distancia2=rc(X2^2+Y2^2)
	Imprimir "Ingrese la cordenada en X del auto #3"
	Leer X3
	Imprimir "Ingrese la cordenada en Y del auto #3"
	Leer Y3
	Distancia3=rc(X3^2+Y3^2)
	
	Imprimir "La distancia desde la porteria hasta el auto #1 es de: " Distancia1
	Imprimir "La distancia desde la porteria hasta el auto #2 es de: " Distancia2
	Imprimir "La distancia desde la porteria hasta el auto #3 es de: " Distancia3
FinAlgoritmo
