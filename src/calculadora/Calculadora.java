/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;


/**
 *
 * @author usuario
 */
public class Calculadora {

    //La visibilidad puede ser public, private, protected o no tener nada declarado.
    
    //Atributos
    
    private String marca;
    private String modelo;
    private String numeroSerie;

   //Método Constructor/es

    public Calculadora(String marca, String modelo, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public Calculadora() {
    }    
    
       public Calculadora(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    // Métodos
    public void suma(double n1, double n2) {
        System.out.println("La suma de " + n1 + " más " + n2 + " es " + (n1 + n2));
    }

     public void suma(int n1, int n2) {
        System.out.println("Suma de enteros: La suma de " + n1 + " más " + n2 + " es " + (n1 + n2));
    }
    
    public void resta(double n1, double n2) {
        System.out.println("La resta de " + n1 + " menos " + n2 + " es " + (n1 - n2));
    }

    public void multiplica(double n1, double n2) {
        System.out.println("La multiplicación de " + n1 + " por " + n2 + "es " + (n1 * n2));
    }

    public void divide(double n1, double n2) {
        System.out.println("La división de " + n1 + " entre " + n2 + " es " + (n1 / n2));
    }

    
    // Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString(){
        return "La marca es "+ this.marca;
    }
    
}
