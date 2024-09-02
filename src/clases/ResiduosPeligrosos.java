/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Clara Isabel Initola
 */
public class ResiduosPeligrosos extends Residuo {
    private String nivelDePeligro;

    public ResiduosPeligrosos(double peso, String nivelDePeligro) {
        super("Peligroso", peso);
        this.nivelDePeligro = nivelDePeligro;
    }

    public String getNivelDePeligro() {
        return nivelDePeligro;
    }

    public void setNivelDePeligro(String nivelDePeligro) {
        this.nivelDePeligro = nivelDePeligro;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Nivel de peligro: " + nivelDePeligro);
    }
}