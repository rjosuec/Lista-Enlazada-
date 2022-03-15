/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author User
 */
public class Persona {
    
    private String carne;//Identificador del estudiante
	private String name;//Nombre
	private String apellido;//apellido
	private String email;//email
	public Persona(String carne, String name,String apellido, String email) {
		super();
		this.carne = carne;
		this.name = name;
                this.apellido = apellido;
                this.email = email;
		
	}
	public Persona() {
		super();
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
        
	
	@Override
	public String toString() {
		return "Universidad [carne=" + carne + ", nombre=" + name + ", apellido=" + apellido + ", email=" + email + "]";
	}
	
    
}
