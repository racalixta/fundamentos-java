package br.com.racalix.relogio;

public class Despertador {
  int hora;
  int minutos;
  int soneca;

  void ativarSoneca() {
    System.out.println("Só mais" + soneca + "minutinhos");
  }

  String agendarAlarme(int hora, int minutos)  {
    return "Seu alarme foi configurado às" + hora + ":" + minutos;
  }
}
