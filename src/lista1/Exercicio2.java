
package lista1;

import lista1.Aluno;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
    
  Aluno aluno = new Aluno();
  
  Scanner ler= new Scanner (System.in);
  
    System.out.println("Qual a nota da ac1?");
    aluno.setAc1(ler.nextFloat());
    
    System.out.println("Qual a nota da ac2?");
    aluno.setAc2(ler.nextFloat());
    
    System.out.println("Qual a nota da af?");
    aluno.setAf(ler.nextFloat());
    
    System.out.println("Qual a nota da ag?");
    aluno.setAg(ler.nextFloat());
    
        System.out.println(aluno.calculaMedia());
    
        System.out.println(aluno.verfAprovacao());
}
}
