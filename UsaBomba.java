//Guilherme Augusto Deitos Alves 3° info
import java.util.concurrent.TimeUnit;

public class UsaBomba {

  public static void main(String[] args) {
      BombaDagua bomba1 = new BombaDagua();
      bomba1.ligar();
      bomba1.mostrar();
      bomba1.mostrarTempo(5);
      bomba1.desligar();
      bomba1.mostrar();
  }

  
}
