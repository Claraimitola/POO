/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Clara Isabel Initola
 */
public class ResiduosPlastico extends Residuo {
    private int codigoReciclaje;

    public ResiduosPlastico(double peso, int codigoReciclaje) {
        super("Plástico", peso);
        this.codigoReciclaje = codigoReciclaje;
    }

    public int getCodigoReciclaje() {
        return codigoReciclaje;
    }

    public void setCodigoReciclaje(int codigoReciclaje) {
        this.codigoReciclaje = codigoReciclaje;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código de reciclaje: " + codigoReciclaje);
    }
}
