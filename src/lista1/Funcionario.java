package lista1;


public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float calcularValorSalario(){
        if (tipoVinculo == 'H' ){
            return (valorHora * qtdeHora)-valorDesconto;   
        }
        else {
            return salario-valorDesconto;
        }    
    }
    
    public String imprimir(){
        return "Crachá: "+ this.cracha+ "\n"+
               "Nome: "+this.nome+"\n"+
               "Tipo Vínculo: "+ this.tipoVinculo+"\n"+
               "Salário: "+ calcularValorSalario()+"\n"+
               "Desconto: "+this.valorDesconto+"\n"+
               "Valor a receber:";
    }
}
