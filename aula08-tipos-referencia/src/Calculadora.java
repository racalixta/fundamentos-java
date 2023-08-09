public class Calculadora {
  // Wrappers - envelopadoras
  Double numero1;
  Double numero2;

  public Calculadora(Double numero1, Double numero2) {
    this.numero1 = numero1;
    this.numero2 = numero2;
  }

  double soma() {
    return numero1 + numero2;
  }
  // double soma(double numero1, double numero2) {
  //   return numero1 + numero2;
  // }
}
