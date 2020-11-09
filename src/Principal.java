public class Principal {
    public static void main(String[] args){
        System.out.println("+++ Prova 1 +++ ");

        Ventilador ventilador1 = new Ventilador("Philco","vermelho", 110 );
        ventilador1.status();
        System.out.println();
        
        Celular celular1 = new Celular(" Sansung","Galaxy","prateado");
        celular1.status();
        celular1.ligado();
        System.out.println();
        
        
        Moto moto1 = new Moto(" Suzuki", "R 1100",2020);
        moto1.status();
        moto1.nova();
        





    }
}
    
