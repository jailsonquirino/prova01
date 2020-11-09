public class Celular {
    // 1º atributos
    private String marca;
    private String modelo;
    private String cor;

    // 2º metodos constutores
    public Celular(String marca, String modelo, String cor ){
        this.marca = marca;
        this.modelo = modelo; 
        this.cor = cor;
    }
    // 3º metodo especificos da classe
    public void ligado(){
        System.out.println(" O Celular está Ligado");
    }
    public void desligado(){
        System.out.println(" O Celular está desligado");
    }
    public void naoFunciona(){
        System.out.println(" O Celular não Funciona");

    }
  
    // 4º metodo getters e setters
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }    
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void status(){
        System.out.println("+++Celular+++ ");
        System.out.println(" Marca: " + this.getMarca());
        System.out.println(" modelo: " + this.getModelo());
        System.out.println(" Cor: " + this.getCor());
    }
}
    

