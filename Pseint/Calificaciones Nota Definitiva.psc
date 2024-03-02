Algoritmo notas_fundamentos
	//a.	Elaborar un algoritmo que permita calcular e imprimir la nota definitiva. 
	Definir pparcial,pseguim,pquiz,sparcial,efinal,labo,nota Como Real
	Imprimir "Ingresar la nota del primer parcial"
	Leer pparcial
	Imprimir "Ingresar la nota del primer seguimiento"
	Leer pseguim
	Imprimir "Ingresar la nota del primer quiz"
	Leer pquiz
	Imprimir "Ingresar la nota del segundo parcial"
	Leer sparcial
	Imprimir "Ingresar la nota del examen final" 
	Leer efinal
	Imprimir "Ingresar la nota de laboratorios"
	Leer labo
	nota=(pparcial*0.2)+(pseguim*0.1)+(pquiz*0.1)+(sparcial*0.2)+(efinal*0.3)+(labo*0.1)
	Imprimir ""
	Imprimir "La nota del primer parcial es " pparcial
	Imprimir "la nota del primer seguimiento es " pseguim
	Imprimir "La nota del primer quiz es " pquiz
	Imprimir "La nota del segundo parcial es " sparcial
	Imprimir "La nota del examen final es " efinal
	Imprimir "la nota de laboratorios es " labo
	Imprimir "La nota definitiva del estudiante es " nota
FinAlgoritmo
