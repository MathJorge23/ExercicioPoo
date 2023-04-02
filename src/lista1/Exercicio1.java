
package lista1;


import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
   Pessoa  pessoa= new Pessoa();
Scanner ler = new Scanner (System.in);


    int opcao;   
    do {          
        System.out.println("Digite a opção desejada: \n"
                            + " 1- Criar Pessoa:\n"
                            + " 2- Mostrar Pessoa:\n"
                            + " 3- Sair:");   
        opcao= ler.nextInt();
      switch (opcao){
          case 1:
              System.out.println("Digite o nome da pessoa");
              //nome=ler.next();
              pessoa.setNome(ler.next());
              
              System.out.println("Qual a idade?");
              pessoa.setIdade(ler.nextInt());
              System.out.println("Qual o cpf?");
              pessoa.setCpf(ler.next());
              System.out.println("Qual o sexo?");
              pessoa.setSexo(ler.next().charAt(0));
              
           
          case 2:
              System.out.println(pessoa.getNome());
              System.out.println(pessoa.getCpf());
              System.out.println(pessoa.getIdade());
              System.out.println(pessoa.getSexo());
      }
        
    } while (opcao!=3);
    }
  
}
