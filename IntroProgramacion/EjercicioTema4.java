class EjercicioTema4 {
    public static void main(String[] args) {
        // Punto uno
        int numeroIf = -10;
        
        if(numeroIf < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
        System.out.println("Punto dos-------------------------\n");
        
        //Punto dos
        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile: " + String.valueOf(numeroWhile) + "\n");
        }
        
        System.out.println("Punto tres-------------------------\n");
        // Punto tres
        do{
            numeroWhile++;
            System.out.println("numeroWhile: " + String.valueOf(numeroWhile) + "\n");
        } while(numeroWhile < 3);
        
        System.out.println("Punto cuatro-------------------------\n");
        // Punto cuatro
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numero For: " + String.valueOf(numeroFor) + "\n");
        }
        
        System.out.println("Punto cinco-------------------------\n");
        // Punto cinco
        String estacion = "Primavera";
        switch(estacion){
            case "Primavera":
                System.out.println("Estamos en la estacion: " + estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en la estacion: " + estacion);
                break;
            case "Otono":
                System.out.println("Estamos en la estacion: " + estacion);
                break;
            case "Verano":
                System.out.println("Estamos en la estacion: " + estacion);
                break;
            default:
                System.out.println(estacion + ", no es una estacion!");
                break;
        }
    }
}
