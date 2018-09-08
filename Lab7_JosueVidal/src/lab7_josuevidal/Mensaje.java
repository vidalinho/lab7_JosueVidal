/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josuevidal;

import java.io.Serializable;

/**
 *
 * @author josue
 */
public class Mensaje implements Serializable {

    private Usuario emisor;
    private String mensaje;
    private Usuario receptor;
    private static final long SerialVersionUID = 555L;

    public Mensaje() {
    }

    public Mensaje(Usuario emisor, String mensaje, Usuario receptor) {
        this.emisor = emisor;
        this.mensaje = mensaje;
        this.receptor = receptor;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "emisor=" + emisor + ", mensaje=" + mensaje + ", receptor=" + receptor + '}';
    }

}
