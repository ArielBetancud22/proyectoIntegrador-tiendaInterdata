package Metodos;

import java.util.Scanner;

public class InicioTienda {

    private int eleccionInicio;
    private String usuario, usuario1, clave, clave1;
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

        while (opcion != 3) {
            System.out.println("......................................................................................................................");
            System.out.println("::                                                        INTERDATA                                                 ::");
            System.out.println("::                                             TIENDA MAYORISTA DE ROPA PARA HOMBRE                                 ::");
            System.out.println("::..................................................................................................................::");
            System.out.println(" ");
            System.out.println(" Somos una tienda mayorista vendemos por curva de 5 unidades, talles y colores sin eleccion");
            System.out.println(" ");
            System.out.println(" 1. Iniciar sesion con su cuenta");
            System.out.println(" 2. Registrar nuevo usuario");
            System.out.println(" 3. Salir de la pagina");
            System.out.println(" ");
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            usuario = "usuario123";
            clave = "1234";
            switch (opcion) {
                case 1 -> {

                    //Según opción 1 la acción es pedir datos para acceder a mi cuenta
                    System.out.println(".........................................................................................................");
                    System.out.println("                                  :: MI CUENTA ::                               ");
                    System.out.println(".........................................................................................................");
                    System.out.println("");
                    Scanner user = new Scanner(System.in);
                    System.out.print("Usuario: ");
                    usuario1 = user.nextLine();
                    Scanner password = new Scanner(System.in);
                    System.out.print("Clave: ");
                    clave1 = password.nextLine();
                    System.out.println("");

                    if ((!usuario.equals(usuario1)) || (!clave.equals(clave1))) {
                        System.out.println("Los datos ingresados son incorrectos");
                        inicioTienda();
                    } else {
                        System.out.println("Redireccionando ....");
                        llamada.productos();
                    }
                }
                case 2 -> {
                    System.out.println(".........................................................................................................");
                    System.out.println("                                  :: CREANDO USUARIO EN TIENDA INTERDATA ::                               ");
                    System.out.println(".........................................................................................................");
                    System.out.println("Ingrese los datos requeridos");

                    Scanner user1 = new Scanner(System.in);
                    System.out.print("Ingrese su usuario: ");
                    usuario1 = user1.nextLine();

                    Scanner password1 = new Scanner(System.in);
                    System.out.print("Ingrese contrasenia: ");
                    clave1 = password1.nextLine();

                    System.out.println("");
                    System.out.println("Su cuenta fue creada con exito!");
                    System.out.println("");
                    // ESPERAR 1 SEG
                    System.out.println("Redireccionando...");
                    // ESPERAR 2 SEG
                    // LIMPIAR PANTALLA
                    // Una vez hecha la acción se lleva al subproceso de menú de productos 
                    llamada.productos();
                }
                case 3 -> {
                    System.out.println("saliendo de la tienda...");
                    break;
                }
                default -> {
                    System.out.println("OPCIÓN INCORRECTA\n");
                }
            }
        }
    }
}
