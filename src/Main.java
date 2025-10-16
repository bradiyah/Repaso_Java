import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double[] salarios = {1200, 1500, 1700, 1800, 2000};
    double[] salarios2= {1200, 1500, 1700, 1800, 2000};

    System.out.println(salarioMaximo(salarios));
    System.out.println(salarioMaximo(salarios2) );

    System.out.println("------------------");
    tiempoEnSegundos();
    System.out.println("------------------");
    desgloseImporte();




    }

    public static double salarioMaximo(double[] sueldos ) {
      double salarioMaximo = 0;
      for (int i = 0; i < sueldos.length; i++) {
        if (sueldos[i] > salarioMaximo) {
          salarioMaximo = sueldos[i];
        }

      }

      return salarioMaximo;

    }

      /**Boletin 2: 11.-Realiza un programa con una variable t la cual contiene un tiempo en segundos.
       * El programa debe calcular y mostrar el tiempo en horas, minutos y segundos.
       * Ejemplo: si t=3671 el programa debe mostrar 1 hora, 1 minuto y 11 segundos.
       */
      public static void tiempoEnSegundos(){

        System.out.println("Introduce un tiempo en segundos: ");

        Scanner teclado = new Scanner (System.in);
        int t = teclado.nextInt();

        int horas = t / 3600;
        int resto = t % 3600;
        int minutos = resto  / 60;
        int segundos = resto % 60;

        System.out.println(" Horas: " + horas +  " Minutos: " + minutos + " Segundos: " + segundos);


      }


      /**Boletin 2: 12.- Realiza un programa que dado un importe en euros nos indique el número mínimo de billetes y monedas
       * (de 500, 200, 100, 50, 20, 10, 5, 2 y 1 euros) en los que se puede desglosar dicho importe.
       * Ejemplo: si el importe es 576 euros el programa debe mostrar que son 1 billete de 500,
       * 1 billete de 50, 1 billete de 20, 1 billete de 5 y 1 moneda de 1 euro.
       */
        public static void desgloseImporte(){
          Scanner teclado = new Scanner(System.in);
          System.out.println("Introduce un importe en euros: ");
          int importe = teclado.nextInt();
          int[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
          int[]cantidadBilletes= new int[billetes.length];
          for (int i = 0; i < billetes.length; i++) {
            if(importe>=billetes[i]){
              cantidadBilletes [i] = importe / billetes[i];
              importe = importe % billetes[i];
            }
            if(cantidadBilletes[i] > 0){
              System.out.println("Billetes de :  " + billetes[i] + " euros: " + cantidadBilletes[i]);
            }

          }
        }

        /** Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia
         la derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente.
         El último pasa a ser el primero
         */
        public static void DesplazarArray(){
          int [] numeros = new int [10];
          Scanner teclado = new Scanner(System.in);
          System.out.println("Introduce 10 números enteros: ");
          for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
          }

          int ultimo = numeros[numeros.length-1];
          for (int i = numeros.length -1; i > 0; i--) {
            numeros[i] = numeros[i-1];
          }



    }





