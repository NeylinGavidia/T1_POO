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

    public void setApellidos(String apellidos) { //validacion apellido para que no sean iniciales
        if (validarApellidos(apellidos)) {
        this.apellidos = apellidos;
        } else {
        throw new IllegalArgumentException("No se permite ingresar iniciales");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //validacion nombre para que no sean iniciales
        if (validarNombre(nombre)) 
        {
          this.nombre = nombre;
        } else {
        throw new IllegalArgumentException("No se permite ingresar iniciales");
        }
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

    public void setTipodedoc(String tipodedoc) { //validacion tipo de doc

          if (validartipoDoc(tipodedoc)) 
          {
            this.tipodedoc = tipodedoc.toUpperCase();
          } else {
            throw new IllegalArgumentException("Solo DNI o CE");
          }
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) { //ahora ecien valida con bool
        if (validarDocID(docID)) {
        this.docID = docID;
        } else {
        throw new IllegalArgumentException("Documento inválido");
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) { //validando celular
        if (validarCelular(celular)) 
        {
            this.celular = celular;
        } else {
            throw new IllegalArgumentException("El celular debe tener 9 digitos");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) { //validando correo
        
        if (validarCorreo(correo)) 
        {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("Correo inválido");
        }
    }
    public boolean isAlergia() {
        return alergia;
    }

    public void setAlergia(boolean alergia) { //estado de la alergia
        if (alergia == true){
            System.out.println("Tiene alergia");
        }
        else {
            System.out.println("No tiene alergia");
        }
        this.alergia = alergia;
    }

    public String getTipoAler() {
        return tipoAler;
    }

    public void setTipoAler(String tipoAler) { //control de ecepciones y errores
        if (tipoAler.equalsIgnoreCase("Medicamentos") || tipoAler.equalsIgnoreCase("Alimentos")||
            tipoAler.equalsIgnoreCase("Ambos")){
            this.tipoAler = tipoAler;
        }
        else{
         
         throw new IllegalArgumentException("Ingrese una opcion valida");
        }
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
    public String toString() { //organizacion con \n es como c# xd
        return "Paciente\n" +
           "Nombre completo   : " + nombre + " " + apellidos + "\n" +
           "Fecha nacimiento  : " + fechaNaci + "\n" +
           "Tipo documento    : " + tipodedoc + "\n" +
           "N° documento      : " + docID + "\n" +
           "Celular           : " + celular + "\n" +
           "Correo            : " + correo + "\n" +
          //aqui no sabia como pasar de true a string asi que busque y vi en videos que era con ? y :
           "Alergia           : " + (alergia ? "Sí" : "No") + "\n" + 
           "Tipo alergia      : " + tipoAler + "\n" +
           "Detalle alergia   : " + detAlerg + "\n" +
           "Tipo de sangre    : " + tipoSangre + "\n";
    }
    
    public boolean validarApellidos(String apellidos) 
    {
        return apellidos.length() >= 2;
    }
    
    public boolean validarNombre(String nombre) 
    {
        return nombre.length() >= 2;
    }
    
    public boolean validartipoDoc(String tipodedoc) 
    {
    //equalsIgnoreCase sirve como un ToLowerCase y ToUpperCase al mismo tiempo, por eso se uso este
    //se practico en casa
    return (tipodedoc.equalsIgnoreCase("DNI") || tipodedoc.equalsIgnoreCase("CE"));
    }
    public boolean validarDocID(String docID) {
        if (tipodedoc.equalsIgnoreCase("DNI")) 
        {
            return docID.length() == 8;
        } else if (tipodedoc.equalsIgnoreCase("CE")) 
        {
            return docID.length() == 9;
        }
    return false;
    }
    public boolean validarCelular (String celular) 
    {
        return celular.length() == 9;
    }
    public boolean validarCorreo(String correo) 
    {
        //aqui se usa el ! delante paa indicar lo contrario de la condicion
        //contains sugerido por netbeans e invesitgado en inernet
        return correo.contains("@")&& correo.contains(".com");
    }
}
