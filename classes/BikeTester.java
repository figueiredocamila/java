package classes;
public class BikeTester {
  public static void main(String[] args) {
    Bike bike1 = new Bike(); 

    bike1.marca = "Caloi";
    bike1.qtdMarchas = 3;
    bike1.cor = "pink";

    bike1.andar();
    bike1.frear();
  }
}