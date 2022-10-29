
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
                            productos(); // De lo contrario lo lleva al usuario directamente al subproceso de menú de productos
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
                    productos(); // Una vez hecha la acción se lleva al subproceso de menú de productos 
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
		    for (j = 0; j < 2; j++){
                    	matriz[0][0] = " 1. Remeras";
                   	matriz[0][1] = " 2. Buzos";
                    	matriz[0][2] = " 3. Camperas";
                    	matriz[1][0] = " 4. Jeans";
                    	matriz[1][1] = " 5. Pantalones Joggin";
                    	matriz[1][2] = " 6. Camisas";
                    	matriz[2][0] = " 7. Trajes";
                    	matriz[2][1] = " 8. Ver carrito de compras";
                    	matriz[2][2] = " 9. Salir de la cuenta";
                }
            }
	    for (i = 0; i < 2; i++){  // Muestra el catalogo imprimiendo la matriz
                for (j = 0; j < 2; j++){
                    System.out.println(matriz[i][j]);
                }
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "\nIngrese la categoría deseada: "));
            // Limpiar Pantalla
            switch (opcion){   // Segun la opcion que elija el usuario, el switch lo va a redirigir a los distintos subprocesos
                case 1:
                    MenuRemeras(compraTotal, CompraProductosR);
                    break;
                case 2:
                    MenuBuzos(compraTotal, CompraProductosB);
                    break;
                case 3:
                    MenuCamperas(compraTotal, CompraProductosC);
                    break;
                case 4:
                    MenuJeans(compraTotal,CompraProductosJ);
                    break;
                case 5:
                    MenuPantalones(compraTotal, CompraProductosP);
                case 6:
                    MenuCamisas(compraTotal, CompraProductosCa);
                    break;
                case 7:
                    MenuTrajes(compraTotal, CompraProductosTra);
                    break;
                case 8:
                    System.out.println("::....................................................................................................................................................::");
                    System.out.println("::                                                          :: CARRITO DE COMPRAS ::                                                                   ::");
                    System.out.println("::....................................................................................................................................................::\n");
                    JOptionPane.showMessageDialog(null, "Los productos agregados al carrito son: "+ CompraProductosR +", "+ CompraProductosB +", "+ CompraProductosC+", "+ CompraProductosJ +", "+ CompraProductosCa +", "+ CompraProductosTra +"\n");
                    JOptionPane.showMessageDialog(null, "El monto total de los productos añadidos al carrito es: "+ compraTotal +"\n\n");
                    
                    MetodoPago(compraTotal); // El MetodoPago lo definiremos al final.
                    // Limpiar Pantalla
                    break;
                case 9:
                    salir = true;
                    break;
            }
        }
        while (opcion != 9); 
    }
	
    // Subproceso del menu remeras
    public static void menuRemeras(float CompraTotal, String CompraProductos) {   // No se como funciona un subproceso por parametros (VERIFICAR).
        int modelo, cantidad, compra, agregarOpcion;
        float precio;
        String nombreModelo;
        boolean salida = false;
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA REMERAS                                    ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        
        System.out.println("1. Remera Alzakaba: $10740");
        System.out.println("2. Remera Adventure: $10950");
        System.out.println("3. Remera Steeze: $10580");
        System.out.println("4. Remera Camber: $10000");
        System.out.println("5. Remera Pocket: $9550");
        System.out.println("6. Remera Sketch: $9200");
        System.out.println("7. Volver.\n");
        
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion de modelo: \n"));
        
        switch (modelo){
            case 1:
                nombreModelo = "Remera Alzakaba";
                precio = 10740;
                break;
            case 2:
                nombreModelo = "Remera Adventure";
                precio = 10950;
                break;
            case 3:
                nombreModelo = "Remera Steeze";
                precio = 10580;
                break;
            case 4:
                nombreModelo = "Remera Camber";
                precio = 10000;
                break;
            case 5:
                nombreModelo = "Remera Pocket";
                precio = 9550;
                break;
            case 6:
                nombreModelo = "Remera Sketch";
                precio = 9200;
                break;
            case 7:
                salida = true;
                productos();
                break;     
        }
        if (salida == false){
            System.out.println("¿Añadir al carrito?");
            System.out.println("1. Si");
            System.out.println("2. No");
            agregarOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Añadir al carrito?: "));
            
            if (agregarOpcion == 1){
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de prendas: "));
                CompraProductos = // ¿Como funcionan los parametros del subproceso?
            }
        }
    }
}
