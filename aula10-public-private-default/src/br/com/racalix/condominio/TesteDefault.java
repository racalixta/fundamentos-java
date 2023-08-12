package br.com.racalix.condominio;

public class TesteDefault {
  public static void main(String[] args) {
    Piscina piscina = new Piscina();
    Apartamento apartamento = new Apartamento();
    // System.out.println(piscina.boia);
    piscina.setBoia("Nova boia");
    System.out.println(piscina.getBoia()); // atributo privado, acessando atraves do get
  }

}
