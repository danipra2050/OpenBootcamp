package com.co.bootcamp.ejercicio8;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Daniela");
        persona.setEdad(34);
        persona.setTelefono(Long.parseLong("3507130458"));

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}
