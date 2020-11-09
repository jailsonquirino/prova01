public class Moto {
    // Atributos ou caracteristica
    private String marca;
    private String modelo;
    private int ano;
    
    // 2 Metodos construtor
    public Moto(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    // 3 metodo especificos da classe
    public void nova(){
        System.out.println("A Moto e Nova");
    }
    public void cilindrada(){
        System.out.println(" A Moto tem Muitas Cilindradas");
    } 
    public void cor(){
        System.out.println(" A Moto é de cor clara");
    }
    
    // 4 metodos da get set
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public void setMarca(String ma){
        this.marca = ma;
    }
    public void setModelo(String mo){
        this.modelo = mo;
    }
    public void setAno(int a){
        this.ano = a;
    }
    public void status(){

        System.out.println("+++Veiculo+++ ");
        System.out.println(" Marca: " + this.getMarca());
        System.out.println(" Modelo: " + this.getModelo());
        System.out.println(" Ano: " + this.getAno());
    }



}

