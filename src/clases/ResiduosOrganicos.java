/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Clara Isabel Initola
 */
public class ResiduosOrganicos extends Residuo {
    private boolean compostable;

    public ResiduosOrganicos(double peso, boolean compostable) {
        super("Orgánico", peso);
        this.compostable = compostable;
    }

    public boolean isCompostable() {
        return compostable;
    }

    public void setCompostable(boolean compostable) {
        this.compostable = compostable;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Es compostable?: " + (compostable ? "Sí" : "No"));
    }
}
