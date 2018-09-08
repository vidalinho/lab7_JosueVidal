/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josuevidal;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author josue
 */
public class Usuario implements Serializable {

    private String nombre;
    private int edad;
    private String sexo;
    private String usuario;
    private String contra;
    private ArrayList intereses = new ArrayList();
    private ArrayList amigos = new ArrayList();
    private String descripcion;
    private Icon imagen;
    private ArrayList mensajes = new ArrayList();
    private ArrayList <Solicitud>solicitudes = new ArrayList();
    private ArrayList <Usuario>bloqueados = new ArrayList();
    private ArrayList<Cita> calendario = new ArrayList();
    private String premium;
    private ArrayList <Usuario> interesados = new ArrayList();
    
    private static final long SerialVersionUID = 555L;

    public Usuario(String nombre, int edad, String sexo, String usuario, String contra, String descripcion, Icon imagen, String premium) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.usuario = usuario;
        this.contra = contra;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.premium = premium;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList intereses) {
        this.intereses = intereses;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public ArrayList getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList getBloqueados() {
        return bloqueados;
    }

    public void setBloqueados(ArrayList bloqueados) {
        this.bloqueados = bloqueados;
    }

    public ArrayList getCalendario() {
        return calendario;
    }

    public void setCalendario(ArrayList calendario) {
        this.calendario = calendario;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public ArrayList<Usuario> getInteresados() {
        return interesados;
    }

    public void setInteresados(ArrayList<Usuario> interesados) {
        this.interesados = interesados;
    }
    

    @Override
    public String toString() {
        return  nombre ;
    }

}
