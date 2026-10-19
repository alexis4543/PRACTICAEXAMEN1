public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasena;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isBlank()){
            System.out.println("El nombre no puede estar vacio ni ser null");
        }else{
            this.nombreUsuario = nombreUsuario;
        }
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.isBlank()){
            System.out.println("El correo no puede estar vacio ni ser null");
        }else{
            this.correo = correo;
        }
    }

    public void setContrasena(String contrasena) {
        if (contrasena == null || contrasena.isBlank()){
            System.out.println("La contraseña no puede estar vacia ni ser null");
        }else if (contrasena.length()<8){
            System.out.println("ADVERTENCIA LA CONTRASEÑA TIENE MENOS DE 8 CARACTERES");
        }else{
            this.contrasena=contrasena;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void mostrarDatos(){
        System.out.println("El nombre del usuario es: "+nombreUsuario);
        System.out.println("El correo del usuario es: "+correo);
    }
}
