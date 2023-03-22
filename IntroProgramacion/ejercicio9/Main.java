package com.co.bootcamp.ejercicio9;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(34);
        cliente.setNombre("Daniela Prado");
        cliente.setTelefono(new Long("3507130458"));
        cliente.setCredito("1.000.000");

        System.out.println("Informacion cliente: \n Nombre-> " + cliente.getNombre());
        System.out.println("Edad -> " + cliente.getEdad());
        System.out.println("Telefono -> " + cliente.getTelefono());
        System.out.println("Valor credito -> $" + cliente.getCredito());
        System.out.println("----------------------------------------------------------------");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Maui Andres Prado");
        trabajador.setEdad(40);
        trabajador.setTelefono(new Long("3214569874"));
        trabajador.setSalario("6.500.000");

        System.out.println("Informacion Trabajador: \n Nombre-> " + trabajador.getNombre());
        System.out.println("Edad -> " + trabajador.getEdad());
        System.out.println("Telefono -> " + trabajador.getTelefono());
        System.out.println("Valor salario -> $" + trabajador.getSalario());
    }
}
