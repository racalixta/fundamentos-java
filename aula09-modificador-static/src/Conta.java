public class Conta {
  // ao utilizar o static faz com que a conta seja 'conjunta'
  static double saldoContaConjunta;
  // static é uma valor da class e todos os objetos da classe conseguem visualizar

  double saldo;
  final static double TAXA_SERVICOS = 10.5; // snake case para constants

  // os metodos também podem ser static!
  void depositarContaConjunta(double valor) {
    saldoContaConjunta += valor;
  }

  void depositarConta(double valor) {
    saldo += valor;
  }
}