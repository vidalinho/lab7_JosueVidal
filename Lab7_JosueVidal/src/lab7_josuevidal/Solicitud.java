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
public class Solicitud implements Serializable {

    private Usuario emisor;
    private Usuario receptor;
    private static final long SerialVersionUID = 555L;

    public Solicitud(Usuario emisor, Usuario receptor) {
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return emisor.getNombre();
    }

}
