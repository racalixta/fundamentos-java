public class Metodos {
  public static void main(String[] args) throws Exception {
    // ativarSoneca();
    String mensagemDoAlarme = agendarAlarme(8, 33);
    System.out.println(mensagemDoAlarme);
  }

  /*
  * Sintaxe de declaração de métodos no Java:
  * 
  * <tipo do retorno do metodo> identificador(<tipo> parâmetros) {
  *  <bloco de comandos>
  * }
  */

  static void ativarSoneca() {
      System.out.println("Soneca ativada, mais 5 minutos!");
  } 

  static String agendarAlarme(int hora, int min) {
    return "Seu alarme foi configurado às " + hora + ":" + min;
  }
}
