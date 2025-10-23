import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    //double[] salarios = {1200, 1500, 1700, 1800, 2000};
    //double[] salarios2= {1200, 1500, 1700, 1800, 2000};

    //System.out.println(salarioMaximo(salarios));
    //System.out.println(salarioMaximo(salarios2) );

    //System.out.println("------------------");
    //tiempoEnSegundos();
   //System.out.println("------------------");
    //desgloseImporte();
    int [] numbers ={1,2,5,8};
    System.out.println(countEvenNumbers(numbers));
    System.out.println("----------");
    int [] nums ={2,3,4,5,-1,0,7,10};
    System.out.println(sumPositivos(nums));
    System.out.println("----------");

    String frase=  "hola que tal, estamos testeando java";
    char letra= 'o';
    System.out.println(countLetter(frase, letra));

    System.out.println("------");

    analyzeArray(nums);

  }

  /**public static double salarioMaximo(double[] sueldos) {
    double salarioMaximo = 0;
    for (int i = 0; i < sueldos.length; i++) {
      if (sueldos[i] > salarioMaximo) {
        salarioMaximo = sueldos[i];
      }

    }

    return salarioMaximo;

  }

  /**
   * Boletin 2: 11.-Realiza un programa con una variable t la cual contiene un tiempo en segundos.
   * El programa debe calcular y mostrar el tiempo en horas, minutos y segundos.
   * Ejemplo: si t=3671 el programa debe mostrar 1 hora, 1 minuto y 11 segundos.
   */
 /** public static void tiempoEnSegundos() {

    System.out.println("Introduce un tiempo en segundos: ");

    Scanner teclado = new Scanner(System.in);
    int t = teclado.nextInt();

    int horas = t / 3600;
    int resto = t % 3600;
    int minutos = resto / 60;
    int segundos = resto % 60;

    System.out.println(" Horas: " + horas + " Minutos: " + minutos + " Segundos: " + segundos);


  };


  /**
   * Boletin 2: 12.- Realiza un programa que dado un importe en euros nos indique el número mínimo de billetes y monedas
   * (de 500, 200, 100, 50, 20, 10, 5, 2 y 1 euros) en los que se puede desglosar dicho importe.
   * Ejemplo: si el importe es 576 euros el programa debe mostrar que son 1 billete de 500,
   * 1 billete de 50, 1 billete de 20, 1 billete de 5 y 1 moneda de 1 euro.
   */
 /**public static void desgloseImporte() {
    /**Scanner teclado = new Scanner(System.in);
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
     */
    /**public static void getBilletes() {
     System.out.println("Billetes = " + euros);
     int resto = euros;
     for (int i = 0; i < billetes.lenght; i++) {
     if (resto >= billetes[i]) {
     int cantidad = resto / billetes[i];
     resto = resto % billetes[i];
     System.out.println("Billetes de " + billetes[i] + " euros: " + cantidad);

     }

     }







     /** Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia
     la derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente.
     El último pasa a ser el primero
     */
    /**public static void DesplazarArray() {
      int[] numeros = new int[10];
      Scanner teclado = new Scanner(System.in);
      System.out.println("Introduce 10 números enteros: ");
      for (int i = 0; i < numeros.length; i++) {
        numeros[i] = teclado.nextInt();
      }

      int ultimo = numeros[numeros.length - 1];
      for (int i = numeros.length - 1; i > 0; i--) {
        numeros[i] = numeros[i - 1];
      }
      numeros[0] = ultimo; // colocar el último al principio

      System.out.println("Array desplazado una posición a la derecha:");
      for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
      }

      System.out.println(); // salto de línea final
    };**/


  public static int countEvenNumbers(int[]numbers){

    int contador=0;
    for(int n: numbers){
      if(n%2==0){
        contador++;
      }
    }
    return contador;
  }

  public static int sumPositivos(int[]nums){
    int suma=0;
    for(int num:nums){
      if(num > 0){
        suma+=num;
      }
    }
    return suma;
  }


  public static int countLetter(String text, char letter){
    char [] chars= text.toCharArray();
    int contador=0;
    for( char c:chars){
      if(c ==letter){
        contador++;
      }
    }

    return contador;
  }

  public static void analyzeArray(int[]nums){
    int pares= countEvenNumbers(nums);
    int sumaPos= sumPositivos(nums);
  }

  public static int numerosEnteros(){
    int [] numeros = {1,5,2,3,6,8,7,9,4,10};
    for (int i = 0; i < numeros.length/2; i++) {
      System.out.println(numeros[i] +" ");
      System.out.println(numeros[numeros.length-1-i]);
      System.out.println("------");

    }

  }
};























