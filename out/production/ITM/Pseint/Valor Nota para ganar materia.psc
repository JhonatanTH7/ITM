Algoritmo Nota_Efinal
	
	Definir pparcial,pseguim,pquiz,sparcial,lab,notaEfinal Como Real
	Imprimir "Ingrese la nota del primer parcial"
	Leer pparcial
	Imprimir "Ingrese la nota del primer seguimiento"
	Leer pseguim
	Imprimir "Ingrese la nota del primer quiz"
	Leer pquiz
	Imprimir "Ingrese la nota del segundo parcial"
	Leer sparcial
	Imprimir "Ingrese la nota del laboratorio"
	leer lab
	
	notaEfinal=(3-(pparcial*0.2)-(pseguim*0.1)-(pquiz*0.1)-(sparcial*0.2)-(lab*0.1))/0.3
	Imprimir "La nota del examen final debe ser de " notaEfinal " para pasar la materia en 3"
	
FinAlgoritmo