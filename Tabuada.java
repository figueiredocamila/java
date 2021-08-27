//  Matricula: 0050017280 - Camila Dias Figueiredo
public class Tabuada {
  public static void main(String[] args) {

    for(int i = 0; i < 10; i++) {
      String result = String.format("%s x 10 = %s.", i+1, (i+1)*10); 
      System.out.println(result);
    }
    
  }
}
