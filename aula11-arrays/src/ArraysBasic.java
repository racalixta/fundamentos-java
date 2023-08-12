import java.util.ArrayList;
import java.util.Arrays;

public class ArraysBasic {
  public static void main(String[] args) {
    // <tipo> identificador [] = {valores aqui dentro};

    String tarefas[] = {"Serpro", "Dataprev", "Vagas Privadas"};
    System.out.println(tarefas[0]);
    System.out.println(tarefas.length);
    System.out.println(Arrays.toString(tarefas));

    System.out.println("---------------------");
    
    String[] tarefas2 = new String[4];
    tarefas2[0] = "tarefa2.0";
    System.out.println(tarefas2[0]);
    System.out.println(tarefas2.length);
    System.out.println(Arrays.toString(tarefas2));

    System.out.println("---------------------");

    ArrayList<String> provas = new ArrayList<>();
    provas.add("BRB");
    provas.add("Caixa");
    provas.add("Dataprev");
    provas.add("ATI");
    provas.add("E as q sairem");
    System.out.println(provas.get(0));
    System.out.println(provas.size());
    System.out.println(provas);
  }
}