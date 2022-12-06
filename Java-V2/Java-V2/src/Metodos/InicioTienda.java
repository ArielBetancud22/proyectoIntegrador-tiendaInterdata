package Metodos;

import java.util.Scanner;

public class InicioTienda {

    private int eleccionInicio;
    private String usuario, usuario1, clave, clave1,clave2;
    private int opcion;
    private boolean salir;

    public InicioTienda() {
    }

    public InicioTienda(int eleccionInicio, String usuario, String usuario1, String clave, String clave1, int opcion) {
        this.eleccionInicio = eleccionInicio;
        this.usuario = usuario;
        this.usuario1 = usuario1;
        this.clave = clave;
        this.clave1 = clave1;
        this.clave2 = clave2;
        this.opcion = opcion;
        this.salir = salir;
    }

    public boolean isSalir() {
        return salir;
    }

    public void setSalir(boolean salir) {
        this.salir = salir;
    }

    public int getEleccionInicio() {
        return eleccionInicio;
    }

    public void setEleccionInicio(int eleccionInicio) {
        this.eleccionInicio = eleccionInicio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getClave1() {
        return clave1;
    }

    public void setClave1(String clave1) {
        this.clave1 = clave1;
    } 
    public String getClave2() {
        return clave1;
    }

    public void setClave2(String clave1) {
        this.clave1 = clave1;
    }
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public void inicioTienda() {
        this.setClave(clave);
        this.setClave1(clave1);
        this.setEleccionInicio(eleccionInicio);
        this.setOpcion(opcion);
        this.setUsuario(usuario);
        this.setUsuario1(usuario1);
        salir = true;
        this.setSalir(salir);
        
        Productos llamada = new Productos();
        OUTER:
        
        while(opcion != 3){
            System.out.println("..................................................................................................................");
            System.out.println("::                                                   INTERDATA                                                  ::");
            System.out.println("::                                        TIENDA MAYORISTA DE ROPA PARA HOMBRE                                  ::");
            System.out.println("::..............................................................................................................::");
            System.out.println(" ");
            System.out.println(" Somos una tienda mayorista vendemos por curva de 5 unidades, talles y colores sin eleccion");
            System.out.println(" ");
            System.out.println(" 1. Iniciar sesión con su cuenta");
            System.out.println(" 2. Registrar nuevo usuario");
            System.out.println(" 3. Salir de la página");
            System.out.println(" ");
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextInt();

            usuario = "usuario123";
            clave = "1234";
            switch(opcion){
                case 1 -> {
                    
                    //Según opción 1 la acción es pedir datos para acceder a mi cuenta
                    System.out.println(".........................................................................................................");
                    System.out.println("::                                            MI CUENTA                                                ::");
                    System.out.println("::.....................................................................................................::");
                    Scanner user = new Scanner(System.in);
                    System.out.print("\nUSUARIO: ");
                    usuario1 = user.nextLine();

                    Scanner password = new Scanner(System.in);
                    System.out.print("CONTRASEÑA: ");
                    clave1 = password.nextLine();
                    
                    if ((usuario.equals(usuario1)) && (clave.equals(clave1))){
                        System.out.println("Redireccionando ....");
                        llamada.productos();
                    }

                    else {
                        System.out.println("Los datos ingresados son incorrectos");
                        System.out.println("\nPor favor inténtelo nuevamente");
                        inicioTienda();
                    }
                }
                case 2 -> {
                    System.out.println(".........................................................................................................");
                    System.out.println("::                                 CREANDO USUARIO EN TIENDA INTERDATA                                 ::");
                    System.out.println("::.....................................................................................................::");
                    System.out.println("\nIngrese los datos requeridos");

                    Scanner user1 = new Scanner(System.in);
                    System.out.print("\nNombre de usuario: ");
                    usuario1 = user1.nextLine();

                    Scanner password1 = new Scanner(System.in);
                    System.out.print("Contraseña: ");
                    clave1 = password1.nextLine();

                    Scanner password2 = new Scanner(System.in);
                    System.out.print("Repita la contraseña: ");
                    clave2 = password2.nextLine();
                    
                    if ((clave1.equals(clave2))){
                        System.out.println("");
                        System.out.println("¡Su cuenta fue creada con éxito!");
                        System.out.println("");
                        System.out.println("Redireccionando...");
                        // Una vez hecha la acción se lleva al subproceso de menú de productos 
                        llamada.productos();              
                    }
                    else{
                        System.out.println("\nLas contraseñas ingresadas no coinciden");
                        System.out.println("Por favor inténtelo nuevamente");
                        inicioTienda();
                    }
                }          
                                        
                case 3 -> {
                    System.out.println("Saliendo de la página...");
                    System.out.println("¡Gracias por visitarnos!");
                    break;
                }
                default -> {
                    System.out.println("La opción ingresada es incorrecta");
                    System.out.println("\nPor favor inténtelo nuevamente..");
                }
            }       
        }
    }
}
