/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;


import java.util.Date;
import java.util.Scanner;
import javax.persistence.EntityManager ;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Principal {
 
 public static void main(String[] args) {

 EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebApplication1PU");
 EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    Asociado a1 = new Asociado();
    Scanner m= new Scanner(System.in);
    System.out.println("Ingrese el nombre del asociado");
    a1.setNombre(m.nextLine());
    em.persist(a1);

    Registradora r2 = new Registradora();
    //Scanner = new Scanner(System.in);  
    System.out.println("Ingrese el ID");
    r2.setId(Integer.parseInt(m.nextLine()));
    r2.setIdAsociado(a1);
    r2.setFecha(new Date());
    em.persist(r2);
em.getTransaction().commit();

em.close();
emf.close();
}
}

     
    



    
