package lista1;

import java.util.Scanner;

public class exercicio3Main {
    public static void main(String[] args){
    
     Funcionario funcionario = new Funcionario();
     
     Scanner ler = new Scanner (System.in);
     
    int opcao;
    do{
        System.out.println("1- Criar Funcioário: \n "
                         + "2- Mostrar Folha de Pagamento: \n"
                         + "3- Alterar Remuneração: \n"
                         + "4- Sair:" );
        opcao= ler.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Qual o número do crácha?");
                funcionario.setCracha(ler.nextInt());
                
                System.out.println("Qual o nome?");
                funcionario.setNome(ler.next());
                
                System.out.println("Qual o tipo de vinculo?");
                funcionario.setTipoVinculo(ler.next().charAt(0));
                
                System.out.println("Quanto ele ganha por hora?");
                funcionario.setValorHora(ler.nextFloat());
                
                System.out.println("Quantas horas ele trabalha?");
                funcionario.setQtdeHora(ler.nextFloat());
                
                System.out.println("Qual o salario dele?");
                funcionario.setSalario(ler.nextFloat());
                
                System.out.println("Quanto é descontado dele?");
                funcionario.setValorDesconto(ler.nextFloat());
                break;
            case 2:
                System.out.println(funcionario.imprimir());
                break;
            case 3:
                System.out.println("Oque deseja alterar?\n "
                                  + "1- salario:\n"
                                  + "2- Valor hora: \n"
                                  + "3- Quantidade de hora:");
                opcao=ler.nextByte();
                
                switch (opcao) {
                    case 1:
                        System.out.println("Qual o novo salario?");
                        funcionario.setSalario(ler.nextFloat());
                        break;
                    case 2:
                        System.out.println("Qual o novo valor da hora?");
                        funcionario.setValorHora(ler.nextFloat());
                        break;
                    case 3:
                        System.out.println("Quantas horas ele trabalha?");
                        funcionario.setQtdeHora(ler.nextFloat());
                        break;
                    }
            }
    }while(opcao!=4);
     
     
       
    }
}
