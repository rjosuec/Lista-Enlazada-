/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PersonaManajer {
    
    Scanner sc=new Scanner(System.in);
	public void findAll(List list) {
		for(Object  tel:list)
			System.out.println(tel);
	}
	public void addpersona(List list) {
		System.out.println("------------- Agregar Estudiante ----------------");
		System.out.println("Por favor escriba el Carné");
		String carne=sc.next();
		System.out.println("Por favor ingrese el Nombre:");
		String name=sc.next();
		System.out.println("Por favor ingrese el Apellido:");
		String apellido=sc.next();
		System.out.println("Por favor, introduzca un Email:");
		String email=sc.next();
		// La información del usuario se guarda en el objeto
		Persona persona1=new Persona(carne,name,apellido,email); 
		list.add(persona1);
		System.out.println("¡Agregado exitosamente!");
		
	}
	public int update(List list) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el Carné de usuario a modificar");
		String carne=sc.next();
		Persona persona=new Persona();
		for(int i=0;i<list.size();i++) {
			persona=(Persona) list.get(i);
			if(persona.getCarne().equals(carne)) {
				System.out.println("Por favor ingrese el Nombre:");
				String name=sc.next();
				System.out.println("Ingrese el Apellido:");
				String apellido=sc.next();
				System.out.println("Por favor, introduzca un Email:");
				String email=sc.next();
				// La información del usuario se guarda en el objeto
				Persona persona1=new Persona(carne,name,apellido,email); 
				list.set(i, persona1);
				System.out.println("¡Modificado con éxito!");
				return 0;
			}
		}System.out.println("¡No puedo editar!");
		 return 0;
		
	}
	public int delete(List list) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el Carné del usuario a Eliminar");
		String carne=sc.next();
		Persona persona=new Persona();
		for(int i=0;i<list.size();i++) {
			persona=(Persona) list.get(i);
			if(persona.getCarne().equals(carne)) {
				list.remove(i);
				System.out.println("eliminado correctamente!");
				return 0;
			}
	}System.out.println("no se pudo borrar!");
	return 0;

}
	public int findByname(List list) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el Carné del usuario a consultar");
		String carne=sc.next();
		Persona persona=new Persona();
		for(int i=0;i<list.size();i++) {
			persona=(Persona) list.get(i);
			if(persona.getCarne().equals(carne)) {
				System.out.println(persona);
				return 0;
			}
	}System.out.println("¡Consulta fallida!");
	return 0;
	}
    
}
