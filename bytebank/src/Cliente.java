public class Cliente implements Autentificable{

    private String nombre;
    private String documento;
    private String telefono;

    private AutenticacionUtil util;

    //private String clave;

    public Cliente(){
        this.util = new AutenticacionUtil();
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /*@Override
    public double getBonificacion() {
        // TODO Auto-generated method stub
        return 0;
    }*/
    @Override
    public boolean inciarSesion(String clave) {
        // TODO Auto-generated method stub
        /*if(this.clave == clave){
            return true;
        }
        return false;*/
        return this.util.inciarSesion(clave);
    }
    @Override
    public void setClave(String clave) {
        // TODO Auto-generated method stub
        //this.clave = clave;
        this.setClave(clave);
    }

}
