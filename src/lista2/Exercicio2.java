package lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
     Apolice apolice= new Apolice();
     
     Scanner ler = new Scanner (System.in);
     
     int opcao;
     
        do {            
        System.out.println("Digite a opção desejada: \n"
                            + " 1- Criar Apólice:\n"
                            + " 2- Ver Dados Apólice:\n"
                            + " 3- Sair:");   
        opcao= ler.nextInt();
        
            switch (opcao) {
                
                case 1:
                    System.out.println("Digite o numero da apólice:");
                    apolice.setNumero(ler.nextInt());
                    
                    System.out.println("Digite o nome:");
                    apolice.setNome(ler.next());
                    
                    System.out.println("Qual a idade?");
                    apolice.setIdade(ler.nextInt());
                    
                    System.out.println("Qual o sexo?");
                    apolice.setSexo(ler.next().charAt(0));
                    
                    System.out.println("Valor do automovel:");
                    apolice.setValorAutomovel(ler.nextDouble());
                    
                    break;
                case 2:
                    System.out.println(apolice.imprimir());
                    break;
                default:
                    System.out.println("Opção invalida");
            }
    }while (opcao!=3);
}
}
