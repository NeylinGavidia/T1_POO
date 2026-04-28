/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author UCC20417
 */
public class Paciente {
    private String apellidos;
    private String nombre;
    private String fechaNaci;
    private String tipodedoc;
    private String docID;
    private String celular;
    private String correo;
    private boolean alergia;
    private String tipoAler;
    private String detAlerg;
    private String tipoSangre;

    public Paciente() {}

    public Paciente(String apellidos, String nombre, String fechaNaci, String tipodedoc, String docID, String celular, String correo, boolean alergia, String tipoAler, String detAlerg, String tipoSangre) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.fechaNaci = fechaNaci;
        this.tipodedoc = tipodedoc;
        this.docID = docID;
        this.celular = celular;
        this.correo = correo;
        this.alergia = alergia;
        this.tipoAler = tipoAler;
        this.detAlerg = detAlerg;
        this.tipoSangre = tipoSangre;
    }
    

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() < 2){
            throw new IllegalArgumentException ("No se permite ingresar iniciales");
        }
        this.nombre = nombre;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getTipodedoc() {
        return tipodedoc;
    }

    public void setTipodedoc(String tipodedoc) {
        //equalsIgnoreCase sirve como un ToLowerCase y ToUpperCase al mismo tiempo, por eso se uso este
         if (tipodedoc.equalsIgnoreCase("DNI") || tipodedoc.equalsIgnoreCase("CE")) {

            this.tipodedoc = tipodedoc.toUpperCase();

        } else {
            throw new IllegalArgumentException("Solo DNI o CE");
         }
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        
        this.docID = docID;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
         if (celular.length() ==9) {
            this.celular = celular;
        } else {
             System.out.println("Número incorrecto");
            this.celular = "Error: Ingrese cantidad dígitos correctos";
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        //aqui se usa el ! delante paa indicar lo contrario de la condicion
        //contains sugerido por netbeans e invesitgado en inernet
        if (!correo.contains("@") || !correo.contains(".com")){
            throw new IllegalArgumentException("No se ha ingresado un correo");
        }
    }
    public boolean isAlergia() {
        return alergia;
    }

    public void setAlergia(boolean alergia) {
        if (alergia == true){
            System.out.println("Tiene alergia");
        }
        else {
            System.out.println("No tiene alegia");
        }
        this.alergia = alergia;
    }

    public String getTipoAler() {
        return tipoAler;
    }

    public void setTipoAler(String tipoAler) {
        this.tipoAler = tipoAler;
    }

    public String getDetAlerg() {
        return detAlerg;
    }

    public void setDetAlerg(String detAlerg) {
        this.detAlerg = detAlerg;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Paciente{" + "apellidos=" + apellidos + ", nombre=" + nombre + ", fechaNaci=" + fechaNaci + ", tipodedoc=" + tipodedoc + ", docID=" + docID + ", celular=" + celular + ", correo=" + correo + ", alergia=" + alergia + ", tipoAler=" + tipoAler + ", detAlerg=" + detAlerg + ", tipoSangre=" + tipoSangre + '}';
    }
    
}
