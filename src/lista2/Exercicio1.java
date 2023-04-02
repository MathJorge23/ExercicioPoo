package lista2;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
      Scanner ler = new Scanner (System.in);
      
      Calculadora calculadora = new Calculadora();
      
      int opcao , num1=0, num2 = 0;
      double numB1 = 0, numB2;
      String numEntrada1, numEntrada2;
        System.out.println("");
 
do {
    System.out.println("Qual o número que deseja usar?");
    numEntrada1=ler.next();
    System.out.println("Qual o número que deseja usar?");
    numEntrada2=ler.next();
    System.out.println(
        "Digite a opção desejana: \n"
        + "1-Somar:\n"
        + "2-Subtrair:\n"
        + "3-Multiplicar:\n"
        + "4-Dividir:\n"
        + "5-Sair");
        opcao=ler.nextInt();        

    switch (opcao) {
//------------------------------------Soma--------------------------------------//
        case 1:
//Pegar primeiro numero e verificar se é double ou int atraves se ha ou nao virgula    
            if(numEntrada1.contains(".")){
              numB1=Double.valueOf(numEntrada1);
              numB2=Double.valueOf(numEntrada2);  
              System.out.println(calculadora.soma(numB1, numB2));
            }
            else{
              num1=Integer.parseInt(numEntrada1);
              num2=Integer.parseInt(numEntrada2);
              System.out.println(calculadora.soma(num1,num2));
            }
    
            break;
//----------------------------------Subtração------------------------------------//     
        case 2:
//Pegar primeiro numero e verificar se é double ou int atraves se ha ou nao virgula    
            if(numEntrada1.contains(".")){
              numB1=Double.valueOf(numEntrada1);
              numB2=Double.valueOf(numEntrada2);
              System.out.println(calculadora.subtracao(numB1, numB2));
            }
            else{
              num1=Integer.parseInt(numEntrada1);
              num2=Integer.parseInt(numEntrada2);
              System.out.println(calculadora.subtracao(num1,num2));
            }
            break;
        case 3:
//Pegar primeiro numero e verificar se é double ou int atraves se ha ou nao virgula    
            if(numEntrada1.contains(".")){
              numB1=Double.valueOf(numEntrada1);
              numB2=Double.valueOf(numEntrada2);
              System.out.println(calculadora.multiplicacao(numB1, numB2));
            }
            else{
              num1=Integer.parseInt(numEntrada1);
              num2=Integer.parseInt(numEntrada2);
              System.out.println(calculadora.multiplicacao(num1,num2));
            }
            break;
        case 4:
//Pegar primeiro numero e verificar se é double ou int atraves se ha ou nao virgula    
            if(numEntrada1.contains(".")){
              numB1=Double.valueOf(numEntrada1);
              numB2=Double.valueOf(numEntrada2);
              System.out.println(calculadora.divisao(numB1, numB2));
            }
            else{
              num1=Integer.parseInt(numEntrada1);
              num2=Integer.parseInt(numEntrada2);
              System.out.println(calculadora.divisao(num1,num2));
            }
            break;
        default:
              System.out.println("Opção invalida");
            break;
}
    } while (opcao!=5);
    }
}





