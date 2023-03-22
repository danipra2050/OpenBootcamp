class Ejercicio {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.actCantPuertas();
        miCoche.actCantPuertas();
        miCoche.actCantPuertas();
        
        System.out.println("Suma de tres numeros: " + String.valueOf(sumaTres(2, 2, 2)));
        System.out.println("Cantidad de puertas de mi coche: " + String.valueOf(miCoche.getCantPuertas()));
    }
    
    public static int sumaTres(int a, int b, int c){
        return a + b +c;
    }
}

class Coche{
    private int cantPuertas;
    
    public int actCantPuertas(){
        return cantPuertas++;
    }
    
    public int getCantPuertas(){
        return cantPuertas;
    }
}
