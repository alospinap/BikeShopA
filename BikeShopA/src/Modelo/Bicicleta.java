/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author josem
 */
public class Bicicleta implements Comparable<BicicletaElectrica> {
    private int id;
    private String marca;
    private String tipoDeLlantas;
    private String color;
    private float valor;
    private String tamaño;
    private String tipoManzanaD;
    private String tipoManzanaF;
    private float largoBiela;
    private float anchoManubrio;
    private float largoPAsiento;
    private String tipoPedales;
    private String tipoMarco;
    private String tipoSuspensionT;
    private String tipoSuspensionD;
    private String tipoDesviadores;
    private String marcaCadena;
    private float largoCadena;
    private float tamañoRelacionD;
    private float tamañoCaseteT;
    private String fechaModelo;

    public Bicicleta(int id, String marca, String tipoDeLlantas, String color, float valor, String tamaño, String tipoManzanaD, String tipoManzanaF, float largoBiela, float anchoManubrio, float largoPAsiento, String tipoPedales, String tipoMarco, String tipoSuspensionT, String tipoSuspensionD, String tipoDesviadores, String marcaCadena, float largoCadena, float tamañoRelacionD, float tamañoCaseteT, String fechaModelo) {
        this.id = id;
        this.marca = marca;
        this.tipoDeLlantas = tipoDeLlantas;
        this.color = color;
        this.valor = valor;
        this.tamaño = tamaño;
        this.tipoManzanaD = tipoManzanaD;
        this.tipoManzanaF = tipoManzanaF;
        this.largoBiela = largoBiela;
        this.anchoManubrio = anchoManubrio;
        this.largoPAsiento = largoPAsiento;
        this.tipoPedales = tipoPedales;
        this.tipoMarco = tipoMarco;
        this.tipoSuspensionT = tipoSuspensionT;
        this.tipoSuspensionD = tipoSuspensionD;
        this.tipoDesviadores = tipoDesviadores;
        this.marcaCadena = marcaCadena;
        this.largoCadena = largoCadena;
        this.tamañoRelacionD = tamañoRelacionD;
        this.tamañoCaseteT = tamañoCaseteT;
        this.fechaModelo = fechaModelo;
    }

    public Bicicleta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeLlantas() {
        return tipoDeLlantas;
    }

    public void setTipoDeLlantas(String tipoDeLlantas) {
        this.tipoDeLlantas = tipoDeLlantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipoManzanaD() {
        return tipoManzanaD;
    }

    public void setTipoManzanaD(String tipoManzanaD) {
        this.tipoManzanaD = tipoManzanaD;
    }

    public String getTipoManzanaF() {
        return tipoManzanaF;
    }

    public void setTipoManzanaF(String tipoManzanaF) {
        this.tipoManzanaF = tipoManzanaF;
    }

    public float getLargoBiela() {
        return largoBiela;
    }

    public void setLargoBiela(float largoBiela) {
        this.largoBiela = largoBiela;
    }

    public float getAnchoManubrio() {
        return anchoManubrio;
    }

    public void setAnchoManubrio(float anchoManubrio) {
        this.anchoManubrio = anchoManubrio;
    }

    public float getLargoPAsiento() {
        return largoPAsiento;
    }

    public void setLargoPAsiento(float largoPAsiento) {
        this.largoPAsiento = largoPAsiento;
    }

    public String getTipoPedales() {
        return tipoPedales;
    }

    public void setTipoPedales(String tipoPedales) {
        this.tipoPedales = tipoPedales;
    }

    public String getTipoMarco() {
        return tipoMarco;
    }

    public void setTipoMarco(String tipoMarco) {
        this.tipoMarco = tipoMarco;
    }

    public String getTipoSuspensionT() {
        return tipoSuspensionT;
    }

    public void setTipoSuspensionT(String tipoSuspensionT) {
        this.tipoSuspensionT = tipoSuspensionT;
    }

    public String getTipoSuspensionD() {
        return tipoSuspensionD;
    }

    public void setTipoSuspensionD(String tipoSuspensionD) {
        this.tipoSuspensionD = tipoSuspensionD;
    }

    public String getTipoDesviadores() {
        return tipoDesviadores;
    }

    public void setTipoDesviadores(String tipoDesviadores) {
        this.tipoDesviadores = tipoDesviadores;
    }

    public String getMarcaCadena() {
        return marcaCadena;
    }

    public void setMarcaCadena(String marcaCadena) {
        this.marcaCadena = marcaCadena;
    }

    public float getLargoCadena() {
        return largoCadena;
    }

    public void setLargoCadena(float largoCadena) {
        this.largoCadena = largoCadena;
    }

    public float getTamañoRelacionD() {
        return tamañoRelacionD;
    }

    public void setTamañoRelacionD(float tamañoRelacionD) {
        this.tamañoRelacionD = tamañoRelacionD;
    }

    public float getTamañoCaseteT() {
        return tamañoCaseteT;
    }

    public void setTamañoCaseteT(float tamañoCaseteT) {
        this.tamañoCaseteT = tamañoCaseteT;
    }

    public String getFechaModelo() {
        return fechaModelo;
    }

    public void setFechaModelo(String fechaModelo) {
        this.fechaModelo = fechaModelo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "id=" + id + ", marca=" + marca + ", tipoDeLlantas=" + tipoDeLlantas + ", color=" + color + ", valor=" + valor + ", tama\u00f1o=" + tamaño + ", tipoManzanaD=" + tipoManzanaD + ", tipoManzanaF=" + tipoManzanaF + ", largoBiela=" + largoBiela + ", anchoManubrio=" + anchoManubrio + ", largoPAsiento=" + largoPAsiento + ", tipoPedales=" + tipoPedales + ", tipoMarco=" + tipoMarco + ", tipoSuspensionT=" + tipoSuspensionT + ", tipoSuspensionD=" + tipoSuspensionD + ", tipoDesviadores=" + tipoDesviadores + ", marcaCadena=" + marcaCadena + ", largoCadena=" + largoCadena + ", tama\u00f1oRelacionD=" + tamañoRelacionD + ", tama\u00f1oCaseteT=" + tamañoCaseteT + ", fechaModelo=" + fechaModelo + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bicicleta other = (Bicicleta) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(BicicletaElectrica o) {
 if(o.getId()==this.id)
            return 0;
        else if(o.getId()<this.id)
            return -1;
        else
            return 1;    
    }

   
}
