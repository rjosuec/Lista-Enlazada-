/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Universidad {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List list=new ArrayList();
		int s=0;
		PersonaManajer tel=new PersonaManajer();
	while(true) {	
		System.out.print("=================================================================");
		System.out.println();
		System.out.print("1. Agregar 2. Eliminar 3. Modificar 4. Listar 5. Buscar por Carné 0. Salir");
		System.out.println();
		System.out.print("=================================================================\n");
		System.out.print("Opción: ");
		int i=sc.nextInt();
		switch(i) {
		case 1:
			//Añadir
			tel.addpersona(list);
				
			break;
		case 2:
			//Eliminar
			s=tel.delete(list);	
			
			break;
		case 3:
			//modificar
			s=tel.update(list);
			break;
		case 4:
			// Consultar todo
			tel.findAll(list);
			break;
		case 5:
			// Consulta por nombre
			s=tel.findByname(list);
			break;
		case 0:
			
			System.exit(0);
			break;
		default:
			System.out.println("¡Error de comando de entrada!");

	}
	}
	}
}
