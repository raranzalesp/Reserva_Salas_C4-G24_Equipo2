package co.edu.unab.salas_computo.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("usuarios")
public class UsuarioModel {
    @Id
    private String id;
    private String clave;
    private String tipo;
    private String nombre;
    private String documento;
    private String telefono;
    private String email;

    public UsuarioModel() {
    }

    public UsuarioModel(String id, String clave, String tipo, String nombre, String documento, String telefono,
            String email) {
        this.id = id;
        this.clave = clave;
        this.tipo = tipo;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
