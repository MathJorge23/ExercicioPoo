package lista1;

public class Aluno {
    
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float af;
    private float ag;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }
    
    public float calculaMedia(){
        return (ac1*0.15f)+(ac2*0.3f)+(af*0.45f)+(ag*0.1f);
    }
    
    public String verfAprovacao(){
        if (calculaMedia()>=5) {  
            return "aprovado";}
        else{
            return "reprovado";
        }
        
    }
    
}
