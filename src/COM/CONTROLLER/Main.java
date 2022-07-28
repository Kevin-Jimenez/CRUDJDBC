
package COM.CONTROLLER;

import COM.MODEL.Camioneta;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection con = ConnectionBD.ConnecToDB();
       
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int id;
        String placa;
        int cilindraje;
        String pais;
        int concesionarioIdentificacion;
        
        System.out.println("\t.:MENU:.");
        System.out.println("1) Ingresar camioneta");
        System.out.println("2) Editar camioneta");
        System.out.println("3) Eliminar camioneta");
        System.out.println("4) Ver lista de camionetas");
        System.out.println("5) Salir...");
        System.out.println("Ingrese la Opcion: ");
        option = sc.nextInt();
        while(option != 5){
            switch(option){
                case 1:
                    boolean result;
                    System.out.println("\t.:Ingresar Camioneta:.");
                    System.out.print("Ingrese el id de la camioneta :");
                    id = sc.nextInt();
                    System.out.print("Ingrese la placa de la camioneta :");
                    placa = sc.next();
                    System.out.print("Ingrese el cilindraje de la camioneta :");
                    cilindraje = sc.nextInt();
                    System.out.print("Ingrese el pais de la camioneta :");
                    pais = sc.next();
                    System.out.print("Ingrese el concesionario de la camioneta :");
                    concesionarioIdentificacion = sc.nextInt();
                    Camioneta cam = new Camioneta(id,placa,cilindraje,pais,concesionarioIdentificacion);
                    result = CamionetaDAO.insertSuv(con, cam);
                    if(result = true){
                        System.out.println("Camioneta Insertada Correctamente");
                    }else{
                        System.out.println("NO SE CREO EL REGISTRO");
                    }
                    break;
                case 2:
                    boolean resultado;
                    System.out.println("\t.:Ingresar Camioneta:.");
                    System.out.print("Ingrese el id de la camioneta que se va actualizar :");
                    id = sc.nextInt();
                    System.out.print("Ingrese la nueva placa de la camioneta :");
                    placa = sc.next();
                    System.out.print("Ingrese el nuevo cilindraje de la camioneta :");
                    cilindraje = sc.nextInt();
                    System.out.print("Ingrese el nuevo pais de la camioneta :");
                    pais = sc.next();
                    System.out.print("Ingrese el nuevo concesionario de la camioneta :");
                    concesionarioIdentificacion = sc.nextInt();

                    cam = new Camioneta(id,placa,cilindraje,pais,concesionarioIdentificacion);          
                    resultado = CamionetaDAO.updateSuv(con, cam);
                    if(resultado = true){
                        System.out.println("Camioneta Actualizada Correctamente");
                    }else{
                        System.out.println("NO SE ACTUALIZÓ EL REGISTRO");
                    }
                    break;
                case 3:
                    boolean resultad;
                    System.out.println("\t.:Eliminar Registro:.");
                    System.out.print("Ingrese ID de la camioneta a Elimar :");
                    id = sc.nextInt();
                    resultad = CamionetaDAO.deleteSuv(con, id);
                    if(resultad = true){
                        System.out.println("Camioneta Eliminada Correctamente");
                    }else{
                        System.out.println("NO SE ELIMINO EL REGISTRO");
                    }
                    break;
                case 4:
                    System.out.println("\t.:Listar Camionetas:.");
                    ArrayList<Camioneta> list = CamionetaDAO.readCamioneta(con);
                    System.out.println(list);
                    break;
                case 5:
                    System.out.println("\t.:Salir:.");
                    System.exit(0);
                default:
                    System.out.println("ERROR DE MENU");
                    System.exit(0);
                    break;
            }
            System.out.println("\t.:MENU:.");
            System.out.println("1) Ingresar camioneta");
            System.out.println("2) Editar camioneta");
            System.out.println("3) Eliminar camioneta");
            System.out.println("4) Ver lista de camionetas");
            System.out.println("5) Salir...");
            System.out.println("Ingrese la Opcion: ");
            option = sc.nextInt();
        }
    }
    
    
}
