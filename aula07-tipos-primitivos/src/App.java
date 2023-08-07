public class App {
    public static void main(String[] args) {
        // Tipos númericos
        byte numeroByte = 10;
        short numeroShort = 1000;
        int numeroInt = 100000;
        long numeroLong = 10_000_000_000L;
        // para numeros grandes pode usar underline para separar a cada 3 casas;

        int numero1 = 1;
        int numero2 = 2;
        int somaI = numero1 + numero2;
        System.out.println("somaInt: " + somaI);

        // tipos decimais - float, double
        float numF1 = 1.5f;
        float numF2 = 1.8f;
        float somaF = numF1 + numF2;
        System.out.println("somaFloat: " + somaF);

        double numD1 = 7.3;
        double numD2 = 2.0;
        double somaD = numD1 + numD2;
        System.out.println("somaDouble: " + somaD);

        double resultado = soma(3.0, 7.4);
        System.out.println("resultado: " + resultado);

        // Char(aspas simples) e Boolean
        char simbolo = '\'';
        System.out.println("Char é utilizado com: " + simbolo + "simples" + simbolo);
        boolean eIgual = numD1 == numD2;
        boolean eMaior = numD1 > numD2;
        System.out.println("Teste de igualdade: " + eIgual);
        System.out.println("Teste se é maior: " + eMaior);

    }

    static double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }
}
