/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author josem
 */
public class BicicletaAsistida extends Bicicleta {
    private String marcaBateria;
    private int potenciamotor;
    private String marcaMotor;
    private float kilometrosPromedio;
    private String tipoControl;
    private String tipoConectividad;
    private String tipoCarga;  

    public BicicletaAsistida(String marcaBateria, int potenciamotor, String marcaMotor, float kilometrosPromedio, String tipoControl, String tipoConectividad, String tipoCarga, int id, String marca, String tipoDeLlantas, String color, float valor, String tamaño, String tipoManzanaD, String tipoManzanaF, float largoBiela, float anchoManubrio, float largoPAsiento, String tipoPedales, String tipoMarco, String tipoSuspensionT, String tipoSuspensionD, String tipoDesviadores, String marcaCadena, float largoCadena, float tamañoRelacionD, float tamañoCaseteT, String fechaModelo) {
        super(id, marca, tipoDeLlantas, color, valor, tamaño, tipoManzanaD, tipoManzanaF, largoBiela, anchoManubrio, largoPAsiento, tipoPedales, tipoMarco, tipoSuspensionT, tipoSuspensionD, tipoDesviadores, marcaCadena, largoCadena, tamañoRelacionD, tamañoCaseteT, fechaModelo);
        this.marcaBateria = marcaBateria;
        this.potenciamotor = potenciamotor;
        this.marcaMotor = marcaMotor;
        this.kilometrosPromedio = kilometrosPromedio;
        this.tipoControl = tipoControl;
        this.tipoConectividad = tipoConectividad;
        this.tipoCarga = tipoCarga;
    }

    public BicicletaAsistida() {
    }

    public String getMarcaBateria() {
        return marcaBateria;
    }

    public void setMarcaBateria(String marcaBateria) {
        this.marcaBateria = marcaBateria;
    }

    public int getPotenciamotor() {
        return potenciamotor;
    }

    public void setPotenciamotor(int potenciamotor) {
        this.potenciamotor = potenciamotor;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }

    public float getKilometrosPromedio() {
        return kilometrosPromedio;
    }

    public void setKilometrosPromedio(float kilometrosPromedio) {
        this.kilometrosPromedio = kilometrosPromedio;
    }

    public String getTipoControl() {
        return tipoControl;
    }

    public void setTipoControl(String tipoControl) {
        this.tipoControl = tipoControl;
    }

    public String getTipoConectividad() {
        return tipoConectividad;
    }

    public void setTipoConectividad(String tipoConectividad) {
        this.tipoConectividad = tipoConectividad;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return "BicicletaAsistida{" + "marcaBateria=" + marcaBateria + ", potenciamotor=" + potenciamotor + ", marcaMotor=" + marcaMotor + ", kilometrosPromedio=" + kilometrosPromedio + ", tipoControl=" + tipoControl + ", tipoConectividad=" + tipoConectividad + ", tipoCarga=" + tipoCarga + '}';
    }
    
    
}
