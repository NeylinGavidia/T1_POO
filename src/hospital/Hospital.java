/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author UCC20417
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Controladorpaciente ctrl = new Controladorpaciente();
        
            int op;

            do
            {
                System.out.println();
                System.out.println("1. Registrar");
                System.out.println("2. Mostrar lista");              
                System.out.println("0. Salir");
                System.out.print("Ingrese una opcion: ");
                op = scan.nextInt();
                scan.nextLine();

                switch (op)
                {
                    case 0:
                        System.out.println("Goodbye ¬^^¬");
                        break;
                    case 1:
                        Paciente p = new Paciente();

                        System.out.print("Ingrese sus apellidos: ");
                        p.setApellidos(scan.nextLine());
                        while(true){
                             try {
                               System.out.print("Ingrese su nombre: ");
                               p.setNombre(scan.nextLine());
                               break;
                            }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                        }
                        }
                        System.out.print("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
                        p.setFechaNaci(scan.nextLine());
                        while(true){
                            try{
                            System.out.print("Ingrese su tipo de documento (CE o DNI): ");
                            p.setTipodedoc(scan.nextLine());
                            break;
                                    
                            }
                            catch(IllegalArgumentException e){
                                System.out.println(e.getMessage());
                            }}
                        while(true){
                            try{
                                System.out.print("Ingrese su numero de documento: ");
                                p.setDocID(scan.nextLine());
                                break;
                            }catch(IllegalArgumentException e){
                                System.out.println(e.getMessage());
                                }
                            }
                        System.out.print("Ingrese su numero de celular: ");
                        p.setCelular(scan.nextLine());
                        System.out.print("Ingrese su correo: ");
                        p.setCorreo(scan.nextLine());
                        System.out.print("¿Tiene algun tipo de alergia? (1. Si, 2. No): ");
                        int rpta = scan.nextInt();
                        scan.nextLine();
                        if (rpta == 1){
                        p.setAlergia(true);
                        System.out.print("¿Que tipo de alergia? (Medicamentos|Alimentos|Ambos): ");
                        p.setTipoAler(scan.nextLine());
                        System.out.print("Escriba el alimento y/o medicamento: ");
                        p.setDetAlerg(scan.nextLine());
                        }
                        else{
                            p.setAlergia(false);
                        }
                        System.out.print("Ingrese su tipo de sangre (Ejemplo: A+): ");
                        p.setTipoSangre(scan.nextLine());
                        ctrl.agregarpaciente(p);
                        System.out.println();
                        System.out.println("Registrado correctamente ^^");
                        break;
                    case 2:
                        ctrl.mostrarpaciente();
                        break;
                    case 3:
                        
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } while (op != 0); 
       }
}
    }
    
}
