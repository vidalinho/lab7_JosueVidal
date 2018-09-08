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
public class Cita implements Serializable {

    private String fecha;
    private Usuario usuario;
    private String lugar;
    private static final long SerialVersionUID = 555L;

    public Cita(String fecha, Usuario usuario, String lugar) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Cita{" + "fecha=" + fecha + ", usuario=" + usuario + ", lugar=" + lugar + '}';
    }

}
