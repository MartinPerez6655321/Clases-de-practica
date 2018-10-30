import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

//Código para el cálculo de asistencia

public class Asistente {
    public static void main (String [ ] args) {
	Asistensia();

        System.out.println('\n' + "¿Desea volver a ejecutar el programa?");
	
	String entradaTeclado4 = "";
	
        Scanner entradaEscaner4 = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado4 = entradaEscaner4.nextLine (); //Invocamos un método sobre un objeto Scanner

	while(entradaTeclado4.equals("Si") || entradaTeclado4.equals("si")){
		Asistensia();
		entradaTeclado4="";
	System.out.println('\n' + "¿Desea volver a ejecutar el programa?");
	entradaEscaner4 = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado4 = entradaEscaner4.nextLine ();
	}	
    } //Cierre del main
	public static void Asistensia (){
	System.out.println ('\n' + "¿Hola Preceptor/a esta listo/a para trabajar?");

	//Carga de días del mes
        System.out.println ('\n' + "Por favor introduzca la cantidad de días del mes:");

        String entradaTeclado = "";

        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner

	//Carga de asistencias
	System.out.println ('\n' + "Por favor introduzca la cantidad de asistencias totales:");

        String entradaTeclado2 = "";

        Scanner entradaEscaner2 = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado2 = entradaEscaner2.nextLine (); //Invocamos un método sobre un objeto Scanner

	//Carga de inasistencias
	System.out.println ('\n' + "Por favor introduzca la cantidad de inasistencias totales:");

        String entradaTeclado3 = "";

        Scanner entradaEscaner3 = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado3 = entradaEscaner3.nextLine (); //Invocamos un método sobre un objeto Scanner
	int mes = Integer.parseInt(entradaTeclado);
        int asis = Integer.parseInt(entradaTeclado2);
	int inas = Integer.parseInt(entradaTeclado3);
	
	if (mes <= 0)
	{
		System.out.println ('\n' + "No puede calcularse, ingrese una cantidad de días válida.");
		}
		else
		{
		if (inas == 0){
			System.out.println('\n' + "La media de asistencia es: " + '\n' + "100");
			System.out.println ('\n' + "Y el porcentaje de asistencia es: " + '\n' + (asis*100)/(asis+inas) + "%");
		}
		else
		{
		System.out.println ('\n' + "La media de asistencia es: " + '\n' + asis/mes);

		System.out.println ('\n' + "Y el porcentaje de asistencia es: " + '\n' + (asis*100)/(asis+inas) + "%");
		}	
	}	
	}
} //Cierre de la clase
