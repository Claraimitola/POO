package clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Clara Isabel Initola
 */
public class EmpresaTransportadora extends Empresa {
    private String tipoDeTransporte;

    public EmpresaTransportadora(String nombre, String direccion, String tipoDeTransporte) {
        super(nombre, direccion);
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public void transportarMercancia(String mercancia, String destino) {
        System.out.println("Transportando " + mercancia + " hacia " + destino + " mediante " + tipoDeTransporte);
    }

    public void calcularCostoEnvio(double peso, double distancia) {
        double costo = peso * distancia * 0.5; // Ejemplo de cálculo de costo
        System.out.println("El costo de envío es: $" + costo);
    }

    
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Transporte: " + tipoDeTransporte);
    }
}
