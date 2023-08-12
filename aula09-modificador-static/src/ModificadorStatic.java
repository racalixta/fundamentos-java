public class ModificadorStatic {
  public static void main(String[] args) {
    // Static é usado em: 
    // 1. quando não precisamos de objetos!
    // 2. Contants
    Conta contaJoao = new Conta();
    Conta contaMaria = new Conta();

    contaJoao.depositarContaConjunta(100.0);
    contaMaria.depositarConta(300.0);

    contaJoao.depositarConta(10.555555); // exemplo da class math

    // exemplo para sem static na class
    // System.out.println(contaJoao.saldoContaConjunta);
    // System.out.println(contaMaria.saldoContaConjunta);

    System.out.println("Conta conjunta: " + Conta.saldoContaConjunta);
    System.out.println("Taxa de servicos: " + Conta.TAXA_SERVICOS);

    System.out.println("------------------------------------------");
    System.out.println("Conta Maria: " + contaMaria.saldo);
    System.out.println("Conta Joao: " + contaJoao.saldo);
    System.out.println("Conta Joao Arredondado mais proximo: " + Math.round(contaJoao.saldo)); 
    System.out.println("Conta Joao Arredondado pra cima: " + Math.ceil(contaJoao.saldo)); 
    System.out.println("Conta Joao Arredondado pra baixo: " + Math.floor(contaJoao.saldo)); 

  }
}
