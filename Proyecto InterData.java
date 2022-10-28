
package proyectoPseint;

import javax.swing.JOptionPane;

public class tiendaInterdata {
    public static void main(String[] args) {
        /*System.out.println();
        System.out.println("::.....................................................................................................................::"); ;
	System.out.println("");
	System.out.println("::       °°°°°°°°°   °°°°°   °°°  °°°°°°°°°°°  °°°°°°°°°   °°°°°°°°°   °°°°°°°°          °°      °°°°°°°°°°°     °°        ::");
	System.out.println("::       °°°°°°°°°   °°°°°   °°°  °°°°°°°°°°°  °°°°°°°°°   °°°   °°°   °°°   °°°°       °°°°     °°°°°°°°°°°    °°°°       ::");
	System.out.println("::          °°°      °°° °°  °°°      °°°      °°°         °°°   °°°   °°°    °°°°     °°  °°        °°°       °°  °°      ::");
	System.out.println("::      	°°°      °°°  °° °°°      °°°      °°°°°°°°°   °°°   °°°   °°°    °°°°    °°    °°       °°°      °°    °°     ::");
	System.out.println("::      	°°°      °°°   °°°°°      °°°      °°°°°°°°°   °°°°°°°     °°°    °°°°   °°°°°°°°°°      °°°     °°°°°°°°°°    ::");
	System.out.println("::      	°°°      °°°    °°°°      °°°      °°°         °°°°°°      °°°    °°°   °°°°°°°°°°°°     °°°    °°°°°°°°°°°°   ::");
	System.out.println("::       °°°°°°°°°   °°°     °°°      °°°      °°°°°°°°°   °°°  °°°    °°°   °°°   °°         °°°    °°°   °°         °°°  ::");
	System.out.println("::       °°°°°°°°°   °°°     °°°      °°°      °°°°°°°°°   °°°°   °°°  °°°°°°°    °°°          °°°   °°°  °°°          °°° ::");          
	System.out.println("");
	System.out.println("::.....................................................................................................................::") ;*/
    }
	
        
    public static void inicioTienda(){
        int eleccionInicio = 0;
        String usuario, usuario1, clave, clave1 = null;
        
        do{
            System.out.println("......................................................................................................................");
            System.out.println("::                                                        INTERDATA                                                 ::");
            System.out.println("::                                             TIENDA MAYORISTA DE ROPA PARA HOMBRE                                 ::");
            System.out.println("::..................................................................................................................::");
            System.out.println(" ");
            System.out.println(" Somos una tienda mayorista vendemos por curva de 5 unidades, talles y colores sin elección");
            System.out.println(" "); // MenÚ principal con opciones 
            System.out.println(" 1. Iniciar sesión con su cuenta"); 
            System.out.println(" 2. Registrar nuevo usuario");
            System.out.println(" 3. Salir de la página");
            System.out.println(" ");
            eleccionInicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción: "));
            
            usuario = "usuario123";
            clave = "clave123";
            
            switch(eleccionInicio){
                case 1: //Según opción 1 la acción es pedir datos para acceder a mi cuenta
                    System.out.println(".........................................................................................................");
                    System.out.println("                                  :: MI CUENTA ::                               "); 
                    System.out.println(".........................................................................................................");
                    System.out.println("");
                    JOptionPane.showInputDialog("\nUsuario: ");
                    JOptionPane.showInputDialog("\nContraseña: ");
                    System.out.println("") ;
                    //ESPERAR 1/2 SEG
                    System.out.println("Redireccionando ....");
                    //ESPERAR 2 SEG
                    
                    if ((usuario != usuario) || (clave != clave1)){
                        System.out.println("Los datos ingresados son incorrectos, inténtelo nuevamente.");
                        // ESPERAR 1 SEG
                        // LIMPIAR PANTALLA
                        inicioTienda();// Si es incorrecto se vuelve al primer subproceso para menú inicial 
                    }
                    else {
                            // ESPERAR 1 SEG
                            //BORRAR PANTALLA
                            productos(); --------------------------------------------------------// De lo contrario lo lleva al usuario directamente al subproceso de menú de productos
                    }
                    break;
                case 2: // La opción 2 contiene la acción para crear una cuenta nueva 
                    System.out.println(".........................................................................................................");
                    System.out.println("                                  :: CREANDO USUARIO EN TIENDA INTERDATA ::                               ");
                    System.out.println(".........................................................................................................");
                    System.out.println("Ingrese los datos requeridos");
                    
                    usuario1 = JOptionPane.showInputDialog("Ingrese nuevo usuario: ");
                    clave1 = JOptionPane.showInputDialog("Ingrese nueva clave: ");
                    
                    System.out.println("");
                    System.out.println("¡Su cuenta fue creada con éxito!");
                    System.out.println("");
                    // ESPERAR 1 SEG
                    System.out.println("Redireccionando...");
                    // ESPERAR 2 SEG
                    // LIMPIAR PANTALLA
                    productos(); --------------------------------------------------// Una vez hecha la acción se lleva al subproceso de menú de productos 
                    break;
                default: // Si no se cumple la eleccion de una opcion entre 1-2, muestra el siguiente cartel y vuelve a subproceso de menu principal
                    System.out.println("");
                    System.out.println("La opción ingresada no es válida, por favor inténtelo nuevamente");
                    // ESPERAR 1 SEG
                    // LIMPIAR PANTALLA
            }
        }
        while (eleccionInicio == 3); // Opción 3 --> salir y finaliza la ejecución 
    }     
    
    public static void productos(){
        int matriz [][] = new int [3][3];
        int i, j, procederPago, opcion = 0;
        float compraTotal;
        String CompraProductosR, CompraProductosB, CompraProductosC, CompraProductosJ, CompraProductosP;
        String CompraProductosTra, CompraProductosCa;
        boolean salir = false;
        
        do {
            System.out.println(".......................................................................................................................");
            System.out.println("::                                                         CATEGORIAS                                                ::");
            System.out.println("::                                             COLECCIÓN OTOÑO- INVIERNO 2022                                        ::");
            System.out.println("::...................................................................................................................::\n");
            
            for (i = 0; i <= 2; i++){
                
            }
        }
        while (opcion == 9); //Repito subproceso hasta opción 6 --> Ver carrito de compras o elija el menú según producto
    }
}
