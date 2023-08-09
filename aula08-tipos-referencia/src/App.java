public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(1.5, 3.5);
        Calculadora calculadora2 = new Calculadora(1.8, 5.5);
        Calculadora calculadora3 = new Calculadora(1.5, 9.9);
        // System.out.println(calculadora.soma(3.4, 1.3));
        System.out.println(calculadora.soma());
        System.out.println(calculadora2.soma());
        System.out.println(calculadora3.soma());

        System.out.println("Comparando objetos: " + calculadora.numero1.equals(calculadora3.numero1));
    }
}
