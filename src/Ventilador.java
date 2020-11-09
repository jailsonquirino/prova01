public class Ventilador{
    // 1º atributos
    private String marca;
    private String cor;
    private int voltagem;

    // 2º metodos constutores
    public Ventilador(String marca, String cor, int voltagem ){
        this.marca = marca; 
        this.cor = cor;
        this.voltagem = voltagem;
    }
    // 3º metodo especificos da classe
    public void ligar(){
        System.out.println(" O Ventilador está Ligado");
    }
    public void soprando(){
        System.out.println(" O ventilador está Soprando");
    }
    public void queimou(){
        System.out.println(" O ventilador Queimou");

    }
  
    // 4º metodo getters e setters
    public String getMarca(){
        //return this.marca;
        return marca;
    }
    public String getCor(){
        //return this.cor;
        return cor;
    }
    public int getVoltagem(){
       // return this.voltagem;
       return voltagem;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }
    public void status(){
        System.out.println("+++ Produto+++ ");
        System.out.println(" Marca: " + this.getMarca());
        System.out.println(" Cor: " + this.getCor());
        System.out.println(" Voltagem: " + this.getVoltagem());
    }
}

   

