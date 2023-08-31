package org.example;

public class Animal {

    String nombre;
    String genero;
    double peso;
    Animal pareja;

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Animal(String nombre, double peso, String genero, String pareja) {
        this.nombre = nombre;
        this.peso = peso;
        this.genero = genero;
        //this.pareja = pareja;
    }

    void encontrarPareja(Animal pareja){

        this.pareja = pareja;
    }



}
