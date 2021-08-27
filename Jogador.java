public class Jogador {

  // atributos
  public String nome;
  public String sobrenome;
  public Integer idade;
  public Time time;

  // construtor
  public Jogador() {
    time = new Time();
  }

  // metodos
  public void exibirNomeCompleto() {
    System.out.println( this.nome + " " + this.sobrenome );
  }
  
}
