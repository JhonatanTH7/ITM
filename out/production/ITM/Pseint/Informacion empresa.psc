Algoritmo Empleados_empresa
	//ingresar nombre,salario basico,deducciones.
	//Calcular e imprimir salario neto de cada empleado.
	//hallar el promedio de salarios basicos.
	//hallar el porcentaje de empleados que ganan mas de 4 smmlv.
	//hallar el nombre del empleado que gana mayor salario basico.
	//hallar el nombre del empleado que gana menor salario neto.
	//imprimir el nombre de cada empleado.
	//Variables: n,nom,nomMaySalBas,nomMenSalNet,salMin,salBas,salNet,dedu,porc,maySalBas,menSalNet.
	Definir n Como Entero
	Definir nom,nomMaySalBas,nomMenSalNet Como Caracter
	Definir salMin,salBas,salNet,dedu,porc,prom,maySalBas,menSalNet Como Real
	suma=0
	maySalBas=0
	salMin=1000000
	CuaSalMin=salMin*4
	cont71=0
	menSalNet=10000000000000000000000
	Imprimir "Ingrese el número de empleados"
	Leer n
	Para i=1 Hasta n Con Paso 1 
	Imprimir "Ingrese el nombre del empleado"
	Leer nom
	Imprimir "Ingrese el salario básico del empleado"
	Leer salBas
	suma=suma+salBas
	si salBas>maySalBas Entonces
		maySalBas=salBas
		nomMaySalBas=nom
	FinSi
	Imprimir "Ingrese el valor de las deducciones"
	Leer dedu
	salNet=salBas-dedu
	si salNet>CuaSalMin Entonces
		cont71=cont71+1
	FinSi
	Imprimir "El salario neto es de " salNet
	si salNet<menSalNet  Entonces
		menSalNet=salNet
		nomMenSalNet=nom
	FinSi
	imprimir ""
	FinPara
	porc=(cont71*100)/n
	prom=suma/n
	Imprimir "Promedio de salarios basicos: " prom
	Imprimir "El porcentaje de empleados que ganan mas de cuatro salarios minimos es de" porc "%"
	Imprimir "El empleado con mayor salario básico es " nomMaySalBas
	Imprimir "El empleado con menor salario neto es " nomMenSalNet
FinAlgoritmo
