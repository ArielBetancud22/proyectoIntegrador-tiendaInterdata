
package Metodos;

import javax.swing.JOptionPane;

public class metodos {
    public void InicioTienda(){
        int eleccionInicio = 0;
        String usuario, usuario1, clave, clave1 = null;
        boolean salida = false;
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
                case 1 -> {
                    //Según opción 1 la acción es pedir datos para acceder a mi cuenta
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
                        InicioTienda();// Si es incorrecto se vuelve al primer subproceso para menú inicial 
                    }
                    else {
                        // ESPERAR 1 SEG
                        //BORRAR PANTALLA
                        Productos(); // De lo contrario lo lleva al usuario directamente al subproceso de menú de productos
                    }
                }
                case 2 -> {
                    // La opción 2 contiene la acción para crear una cuenta nueva
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
                    Productos(); // Una vez hecha la acción se lleva al subproceso de menú de productos 
                }
                default -> {
                    // Si no se cumple la eleccion de una opcion entre 1-2, muestra el siguiente cartel y vuelve a subproceso de menu principal
                    System.out.println("");
                    System.out.println("La opción ingresada no es válida, por favor inténtelo nuevamente");
                    // ESPERAR 1 SEG
                    // LIMPIAR PANTALLA
                }
                    // ESPERAR 1 SEG
                    // LIMPIAR PANTALLA
            }
        }
        while (eleccionInicio != 3); // Opción 3 --> salir y finaliza la ejecución 
    }
    
    public void Productos(){
        int i, j, procederPago, opcion = 0;
        float compraTotal = 0;
        String CompraProductosR = null, CompraProductosB = null, CompraProductosC = null, CompraProductosJ = null, CompraProductosP = null;
        String CompraProductosTra = null, CompraProductosCa = null;
        boolean salir = false;
        
        do {
            System.out.println(".......................................................................................................................");
            System.out.println("::                                                         CATEGORIAS                                                ::");
            System.out.println("::                                             COLECCIÓN OTOÑO- INVIERNO 2022                                        ::");
            System.out.println("::...................................................................................................................::\n");
            // Recorre la matriz e ingresa el valor segun las posiciones
            
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
                    
                    MetodoPago(compraTotal); // El MetodoPago lo definiremos al final
                    // Limpiar Pantalla
                    break;
                case 9:
                    salir = true;
                    break;
            }
        }while (opcion != 9);
    }
    
    public void MenuRemeras(double compraTotal, String compraProductos){
        int modelo, cantidad, compra, agregarOpcion = 0;
        float precio = 0;
        String nombreModelo = null;
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
            case 1 -> {
                nombreModelo = "Remera Alzakaba";
                precio = 10740;
            }
            case 2 -> {
                nombreModelo = "Remera Adventure";
                precio = 10950;
            }
            case 3 -> {
                nombreModelo = "Remera Steeze";
                precio = 10580;
            }
            case 4 -> {
                nombreModelo = "Remera Camber";
                precio = 10000;
            }
            case 5 -> {
                nombreModelo = "Remera Pocket";
                precio = 9550;
            }
            case 6 -> {
                nombreModelo = "Remera Sketch";
                precio = 9200;
            }
            case 7 -> {
                salida = true;
                Productos();
            }     
        }
        if (salida == false){
            agregarOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Añadir al carrito? (1. Si / 2. No): "));
        }
        if (agregarOpcion == 1){
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de prendas: "));
            CompraProductos = CompraProductos.concat(nombreModelo);
            //Limpiar Pantalla
            System.out.println(".........................................................................................................");
            System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
            System.out.println(".........................................................................................................\n");
            System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
            System.out.println("cantidad: "+ cantidad);
            System.out.println("Precio por curva $: "+ precio);
            compra = (int) (precio * cantidad);
            CompraTotal += compra; // Checkear si está bien (Linea 241 - 242 Pseint)
            System.out.println("Precio total de lo añadido $: "+ compra);
            //Esperar 5 segundos
            // Limpiar pantalla
            }
        else{
            System.out.println("Volviendo a la sección productos\n");
            // Esperar 1/2 segundo
            System.out.println("Aguarde unos segundos...");
            // Esperar 2 segundos
            // Limpiar Pantalla
            } 
    }
    
    public void MenuBuzos(double compraTotal, String compraProductos){
        int modelo, cantidad;
        float precio = 0;
        String nombreModelo = null;
        int agregarOpcion = 0;
        boolean salida = false;
        int compra;
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA BUZOS                                      ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        
        System.out.println("1. Buzo Essential: $12740.");
        System.out.println("2. Buzo Hoodie: $11950.");
        System.out.println("3. Buzo Shadow: $12580.");
        System.out.println("4. Buzo Flock: $13000.");
        System.out.println("5. Buzo Saona: $13320.");
        System.out.println("6. Buzo Lorain: $12800.");
        System.out.println("7. Volver.");
        
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción de modelo: "));
        
        switch (modelo){
            case 1: 
                nombreModelo = "\nBuzo Essential";
                precio = 12740;
                break;
            case 2:
                nombreModelo = "Buzo Hoodie";
                precio = 11950;
                break;
            case 3:
                nombreModelo = "Buzo Shadow";
                precio = 12580;
                break;
            case 4:
                nombreModelo = "Buzo Flock";
                precio = 13000;
                break;
            case 5:
                nombreModelo = "Buzo Saona";
                precio = 13320;
                break;
            case 6:
                nombreModelo = "Buzo Lorain";
                precio = 12800;
                break;
            case 7:
                salida = true;
                // Limpiar Pantalla
                Productos();
                break;
        }
        
        if (salida == false){
            agregarOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Añadir al carrito? (1. Si / 2. No): "));
        }
        switch (agregarOpcion){
            case 1:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de prendas: "));
                compraProductos = compraProductos.concat(nombreModelo);
                System.out.println(".........................................................................................................");
                System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
                System.out.println(".........................................................................................................\n");
                System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
                System.out.println("cantidad: "+ cantidad);
                System.out.println("Precio por curva $: "+ precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total de lo añadido $: "+ compra);
                // Esperar 5 segundos
                // Limpiar pantalla
            case 2:
                System.out.println("Volviendo a la sección productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
                // Esperar 2 segundos
                // Limpiar Pantalla
        }
    }
    
    public void MenuCamperas(double compraTotal, String compraProductos){
        int modelo, cantidad;
        float precio = 0;
        String nombreModelo = null;
        int agregarOpcion = 0;
        boolean salida = false;
        int compra;
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                        CATEGORIA CAMPERAS                                    ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        
        System.out.println("1. Campera Moscú: $14000");
        System.out.println("2. Campera Morava: $15100");
        System.out.println("3. Campera Cesana: $16780");
        System.out.println("4. Campera Nuremberg: $15900");
        System.out.println("5. Campera Banff: $15320");
        System.out.println("6. Campera Rocker: $16800");
        System.out.println("7. Volver.");
        
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción de modelo: "));
        
        switch (modelo){
            case 1:
                nombreModelo = "Campera Moscú";
                precio = 14000;
                break;
            case 2:
                nombreModelo = "Campera Morava";
                precio = 15100;
                break;
            case 3:
                nombreModelo = "Campera Cesana";
                precio = 16780;
                break;
            case 4:
                nombreModelo = "Campera Nuremberg";
                precio = 15900;
                break;
            case 5:
                nombreModelo = "Campera Banff";
                precio = 15320;
                break;
            case 6:
                nombreModelo = "Campera Rocker";
                precio = 16800;
                break;
            case 7:
                salida = true;
                // Limpiar Pantalla
                Productos();
        }
        
        if (salida == false){
            agregarOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Añadir al carrito? (1. Si / 2. No): "));
        }
        switch (agregarOpcion){
            case 1:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de prendas: "));
                compraProductos = compraProductos.concat(nombreModelo);
                System.out.println(".........................................................................................................");
                System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
                System.out.println(".........................................................................................................\n");
                System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
                System.out.println("cantidad: "+ cantidad);
                System.out.println("Precio por curva $: "+ precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total de lo añadido $: "+ compra);
                // Esperar 5 segundos
                // Limpiar pantalla
            case 2:
                System.out.println("Volviendo a la sección productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
                // Esperar 2 segundos
                // Limpiar Pantalla
        }
    }
    
    public void MenuJeans(double compraTotal, String compraProductos){
        int modelo, cantidad;
        float precio = 0;
        String nombreModelo = null;
        int agregarOpcion = 0;
        boolean salida = false;
        int compra;
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA JEANS                                      ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        System.out.println("1. Jeans Slim: $14700");
        System.out.println("2. Jeans Relaxed: $15650");
        System.out.println("3. Jeans Skinny: $14900");
        System.out.println("4. Jeans Baggy: $14000");
        System.out.println("5. Jeans Active: $14300");
        System.out.println("6. Jeans Classic: $13800");
        System.out.println("7. Volver.");
        
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción de modelo: "));
        
        switch(modelo){
            case 1:
                nombreModelo = "Jeans Modelo Slim";
                precio = 14700;
                break;
            case 2:
                nombreModelo = "Jeans Relaxed";
                precio = 15650;
                break;
            case 3: 
                nombreModelo = "Jeans Skinny";
                precio = 14900;
                break;
            case 4:
                nombreModelo = "Jeans Baggy";
                precio = 14000;
                break;
            case 5:
                nombreModelo = "Jeans Active";
                precio = 14300;
                break;
            case 6:
                nombreModelo = "Jeans Classic";
                precio = 13800;
                break;
            case 7:
                salida = true;
                //Limpiar Pantalla
                Productos();
        }
        
        if(salida == false){
            agregarOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Añadir al carrito? (1. Si / 2. No): "));
        }
        switch (agregarOpcion){
            case 1:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de prendas: "));
                compraProductos = compraProductos.concat(nombreModelo);
                System.out.println(".........................................................................................................");
                System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
                System.out.println(".........................................................................................................\n");
                System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
                System.out.println("cantidad: "+ cantidad);
                System.out.println("Precio por curva $: "+ precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total de lo añadido $: "+ compra);
                // Esperar 5 segundos
                // Limpiar pantalla
            case 2:
                System.out.println("Volviendo a la sección productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
                // Esperar 2 segundos
                // Limpiar Pantalla
        }
    }
    
    public void MenuPantalones(double compraTotal, String compraProductos){
        int modelo, cantidad;
        float precio = 0;
        String nombreModelo = null;
        int agregarOpcion = 0;
        boolean salida = false;
        int compra;
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA JOGGING                                    ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        System.out.println("1. Jogging Tanger: $12750");
        System.out.println("2. Jogging Munich: $12950");
        System.out.println("3. Jogging Sidney: $11580");
        System.out.println("4. Jogging Praga: $13000");
        System.out.println("5. Jogging Din: $13300");
        System.out.println("6. Jogging Tamesis: $12400");
        System.out.println("7. Volver.");
        
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción de modelo: "));
        
        switch (modelo){
            case 1:
                nombreModelo = "Jogging Tanger";
                precio = 12750;
                break;
            case 2:
                nombreModelo = "Jogging Munich";
                precio = 12950;
                break;
            case 3:
                nombreModelo = "Jogging Sidney";
                precio = 11580;
                break;
            case 4:
                nombreModelo = "Jogging Praga";
                precio = 13000;
                break;
            case 5:
                nombreModelo = "Jogging Din";
                precio = 13300;
                break;
            case 6:
                nombreModelo = "Jogging Tamesis";
                precio = 12400;
                break;
            case 7:
                salida = true;
                // Limpiar pantalla
                Productos();
        }
        
        if (salida == false){
            agregarOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Añadir al carrito? (1. Si / 2. No): "));
        }
        switch (agregarOpcion){
            case 1:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de prendas: "));
                compraProductos = compraProductos.concat(nombreModelo);
                System.out.println(".........................................................................................................");
                System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
                System.out.println(".........................................................................................................\n");
                System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
                System.out.println("cantidad: "+ cantidad);
                System.out.println("Precio por curva $: "+ precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total de lo añadido $: "+ compra);
                // Esperar 5 segundos
                // Limpiar pantalla
            case 2:
                System.out.println("Volviendo a la sección productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
                // Esperar 2 segundos
                // Limpiar Pantalla
        }
    }
    
    public void MenuCamisas(double compraTotal, String compraProductos){
        int modelo, cantidad;
        float precio = 0;
        String nombreModelo = null;
        int agregarOpcion = 0;
        boolean salida = false;
        int compra;
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA CAMISAS                                    ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        System.out.println("1. Camisa Hefei: $30740");
        System.out.println("2. Camisa Pekin: $25950");
        System.out.println("3. Camisa Canton: $28580");
        System.out.println("4. Camisa Nankin: $29000");
        System.out.println("5. Camisa Hangzhou: $24050");
        System.out.println("6. Camisa Quanzhou: $28200");
        System.out.println("7. Volver.");
        
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción de modelo: "));
        
        switch (modelo){
            case 1:
                nombreModelo = "Camisa Hefei";
                precio = 30740;
                break;
            case 2:
                nombreModelo = "Camisa Pekin";
                precio = 25950;
                break;
            case 3:
                nombreModelo = "Camisa Canton";
                precio = 28580;
                break;
            case 4:
                nombreModelo = "Camisa Nankin";
                precio = 29000;
                break;
            case 5:
                nombreModelo = "Camisa Hangzhou";
                precio = 24050;
                break;
            case 6:
                nombreModelo = "Camisa Quanzhou";
                precio = 28200;
                break;
            case 7:
                salida =  true;
                // Limpiar Pantalla
                Productos();
        }
        
        if (salida == false){
            agregarOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Añadir al carrito? (1. Si / 2. No): "));
        } 
        switch (agregarOpcion){
            case 1:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de prendas: "));
                compraProductos = compraProductos.concat(nombreModelo);
                System.out.println(".........................................................................................................");
                System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
                System.out.println(".........................................................................................................\n");
                System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
                System.out.println("cantidad: "+ cantidad);
                System.out.println("Precio por curva $: "+ precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total de lo añadido $: "+ compra);
                // Esperar 5 segundos
                // Limpiar pantalla
            case 2:
                System.out.println("Volviendo a la sección productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
                // Esperar 2 segundos
                // Limpiar Pantalla
        }
    }
    
    public void MenuTrajes(double compraTotal, String compraProductos){
        int modelo, cantidad;
        float precio = 0;
        String nombreModelo = null;
        int agregarOpcion = 0;
        boolean salida = false;
        int compra;
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         CATEGORIA TRAJES                                     ::");
        System.out.println("::                                        MODELOS DISPONIBLES                                   ::");
        System.out.println("::..............................................................................................::\n");
        System.out.println("1. Traje Pudong: $46740");
        System.out.println("2. Traje Quito: $45950");
        System.out.println("3. Traje Shangai: $49580");
        System.out.println("4. Traje Boston: $51800");
        System.out.println("5. Volver.");
        
        modelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción de modelo: "));
        
        switch (modelo){
            case 1:
                nombreModelo = "Traje Pudong";
                precio = 46740;
                break;
            case 2:
                nombreModelo = "Traje Quito";
                precio = 45950;
                break;
            case 3:
                nombreModelo = "Traje Shangai";
                precio = 49580;
                break;
            case 4:
                nombreModelo = "Traje Boston";
                precio = 51800;
                break;
            case 5:
                salida = true;
                // Limpiar Pantalla
                Productos();
        }
        
        if (salida == false){
            agregarOpcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Añadir al carrito? (1. Si / 2. No): "));
        }
        switch (agregarOpcion){
            case 1:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de prendas: "));
                compraProductos = compraProductos.concat(nombreModelo);
                System.out.println(".........................................................................................................");
                System.out.println("                                   :: AÑADIDO AL CARRITO ::                           ");
                System.out.println(".........................................................................................................\n");
                System.out.println("Prodcuto añadido al carrito: "+ nombreModelo);
                System.out.println("cantidad: "+ cantidad);
                System.out.println("Precio por curva $: "+ precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total de lo añadido $: "+ compra);
                // Esperar 5 segundos
                // Limpiar pantalla
            case 2:
                System.out.println("Volviendo a la sección productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
                // Esperar 2 segundos
                // Limpiar Pantalla
        }
    }
    
    public void MetodoPago(double compraTotal){
        int opcionPago, respuesta;
        int numeroTarjeta, cvv, fv;
        String tt;
        int procederPago;
        boolean salida;
        
        procederPago = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea proceder al pago? 1. Si / 2. No: "));
        
        if (procederPago != 1) { // Checkear (linea 719 pseint)
            Productos();
        }
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         MÉTODOS DE PAGO                                      ::");
        System.out.println("::..............................................................................................::\n");
        System.out.println("1. Transferencia bancaria");
        System.out.println("2. Tarjeta de Débito");
        System.out.println("3. Tarjeta de Crédito");
        System.out.println("4. Mercado Pago");
        System.out.println("5. Volver atrás");
        
        opcionPago = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese opcion de método de pago: "));
        
        switch (opcionPago){
            case 1:
                System.out.println("\n       :: TRANSFERENCIA BANCARIA ::  ");
                System.out.println("En pagos por transferencia 10% de descuento");
                System.out.println("ALIAS: INTERDATA.TIENDA");
                System.out.println("CBU: 000004377328742785\n");
                System.out.println("Importe Bruto: "+ compraTotal);
                //Esperar 1 segundo
                System.out.println("Aplicando el descuento del 10%");
                // Esperar 1 segundo
                compraTotal -= compraTotal * 0.10;
                System.out.println("Importe Neto a pagar: "+ compraTotal); // Revistar si está bien (linea 751 pseint)
                respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea realizar el pago? 1. Si / 2. No: "));
                if (respuesta == 1){
                    // Limpiar Pantalla
                    System.out.println("Estamos comprobando su pago, espere unos segundos..");
                    // Esperar 2 segundos
                    System.out.println("Su pago fue realizado con éxito\n");
                    // Esperar 1/2 segundo
                    JOptionPane.showMessageDialog(null, "¡GRACIAS POR SU COMPRA!");
                    // Esperar 1/2 segundo
                    JOptionPane.showMessageDialog(null, "LOS ESPERAMOS PRONTO");
                }
                else{
                    MetodoPago(compraTotal);
                }
            case 2:
                System.out.println("     :: TARJETA DE DÉBITO ::    \n");
                System.out.println("Los pagos con débito no tienen descuento ni recargo");
                System.out.println("Importe a pagar: "+ compraTotal);
                respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea realizar el pago? 1.Si / 2.No: "));
                if (respuesta == 1){
                    System.out.println("Ingrese los datos de la tarjeta");
                    numeroTarjeta = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de tarjeta: "));
                    tt = JOptionPane.showInputDialog(null, "Titular: ");
                    fv = Integer.parseInt(JOptionPane.showInputDialog(null, "Fecha de vencimiento: "));
                    cvv = Integer.parseInt(JOptionPane.showInputDialog(null, "CVV: "));
                    // Esperar 1/2 segundo
                    JOptionPane.showMessageDialog(null, "La compra fue relaizada con éxito, gracias por elegirnos");
                    // Esperar 2 segundos
                    // Limpiar pantalla
                }
                else{
                    MetodoPago(compraTotal);
                }
            case 3:
                System.out.println("           :: TARJETA DE CRÉDITO ::    \n");
                System.out.println("Las tarjetas de crédito poseen un recargo del 25%\n");
                System.out.println("Importe Bruto: "+ compraTotal);
                // Esperar 1 segundo
                System.out.println("Aplicando el recargo de 25 %");
                // Esperar 1 segundo
                compraTotal -= compraTotal * 1.25;
                System.out.println("Importe Neto a pagar: "+ compraTotal);
                respuesta =Integer.parseInt(JOptionPane.showInputDialog(null, "\n ¿Desea realizar el pago? 1.Si / 2.No: "));
                if (respuesta == 1){
                    System.out.println("Ingrese los datos de la tarjeta");
                    numeroTarjeta = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de tarjeta: "));
                    tt = JOptionPane.showInputDialog(null, "Titular: ");
                    fv = Integer.parseInt(JOptionPane.showInputDialog(null, "Fecha de vencimiento: "));
                    cvv = Integer.parseInt(JOptionPane.showInputDialog(null, "CVV: "));
                    // Esperar 1/2 segundo
                    JOptionPane.showMessageDialog(null, "La compra fue relaizada con éxito, gracias por elegirnos");
                    // Esperar 2 segundos
                    // Limpiar pantalla
                }
                else{
                    MetodoPago(compraTotal);
                }
            case 4:
                System.out.println("           :: MERCADO PAGO ::        \n");
                System.out.println("En pagos por Mercado pago 5% de descuento");
                System.out.println("ALIAS: INTERDATA.MP");
                System.out.println("CBU: 00000238298729357");
                System.out.println("Importe bruto: "+ compraTotal);
                System.out.println("\nAplicando el descuento");
                compraTotal -= compraTotal * 0.05;
                System.out.println("Importe neto a pagar: "+ compraTotal);
                respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea realizar el pago? 1.Si / 2.No"));
                if (respuesta == 1){
                    JOptionPane.showMessageDialog(null, "Estamos comprobando su pago espere unos segundos");
                    // Esperar 3 segundos
                    JOptionPane.showMessageDialog(null, "Su pago fue realizado con éxito");
                    JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
                    System.out.println("Redireccionando al menú principal....");
                }
                else{
                    MetodoPago(compraTotal);
                }
            case 5:
                System.out.println("Volviendo a la sección productos");
                // Esperar 1/2 segundo
                System.out.println("\n Aaguarde unos segundos...");
                // Esperar 2 segundos
            default:
                System.out.println("La opción ingresada no es válida");
                System.out.println("Por favor inténtelo nuevamente");
        }   
    }
}
