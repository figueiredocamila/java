package vetores;

import java.util.Scanner;
import java.util.Arrays;

public class LerVetor {

  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    int[] num = new int[5];

    // ler numeros pelo teclado
    for(int i = 0; i < num.length; i++)
    {
        // System.out.println("Entre com o numero " + (i+1) + ":");
        System.out.printf("\n Entre com o número %d :" , (i + 1));
        num[i] = sc.nextInt();
    }

    // exibir o vetor
    for (int n : num) {
        System.out.println(n);
    }

    // ordernar o vetor - complexidade de algoritmo
    Arrays.sort(num);

    //  re-imprimir o vetor ordenado
    System.out.printf("\n Vetor ordenado");
    for(int i : num) {
      System.out.println(i);
    }

    sc.close();
  }
}
