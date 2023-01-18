package Metodos;

import java.util.Scanner;

public class MenuPantalones {

    private int modelo, cantidad;
    private float precio;
    private String nombreModelo;
    private int agregarOpcion;
    private boolean salida;
    private int compra;

    public MenuPantalones() {
    }

    public MenuPantalones(int modelo, int cantidad, float precio, String nombreModelo, int agregarOpcion, boolean salida, int compra) {
        this.modelo = modelo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombreModelo = nombreModelo;
        this.agregarOpcion = agregarOpcion;
        this.salida = salida;
        this.compra = compra;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public int getAgregarOpcion() {
        return agregarOpcion;
    }

    public void setAgregarOpcion(int agregarOpcion) {
        this.agregarOpcion = agregarOpcion;
    }

    public boolean isSalida() {
        return salida;
    }

    public void setSalida(boolean salida) {
        this.salida = salida;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public void menuPantalones(double compraTotal, String compraProductos) {
        this.setAgregarOpcion(agregarOpcion);
        this.setCantidad(cantidad);
        this.setCompra(compra);
        this.setModelo(modelo);
        this.setNombreModelo(nombreModelo);
        this.setPrecio(precio);
        this.setSalida(salida);

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

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese opcion de modelo: ");
        modelo = entrada.nextInt();

        switch (modelo) {
            case 1 -> {
                nombreModelo = "Jogging Tanger";
                precio = 12750;
            }
            case 2 -> {
                nombreModelo = "Jogging Munich";
                precio = 12950;
            }
            case 3 -> {
                nombreModelo = "Jogging Sidney";
                precio = 11580;
            }
            case 4 -> {
                nombreModelo = "Jogging Praga";
                precio = 13000;
            }
            case 5 -> {
                nombreModelo = "Jogging Din";
                precio = 13300;
            }
            case 6 -> {
                nombreModelo = "Jogging Tamesis";
                precio = 12400;
            }
            case 7 -> {
                salida = true;
                Productos llamada = new Productos();
                llamada.productos();
            }
        }

        if (salida == false) {
            Scanner opcion = new Scanner(System.in);
            System.out.print("¿Desea añadir al carrito? [1. Si / 2. No]: ");
            agregarOpcion = opcion.nextInt();
        }

        switch (agregarOpcion) {
            case 1 -> {
                Scanner cant = new Scanner(System.in);
                System.out.println("Cantidad de curvas: ");
                cantidad = cant.nextInt();
                compraProductos += nombreModelo;
                System.out.println(".........................................................................................................");
                System.out.println("::                                          AÑADIDO AL CARRITO                                        ::");
                System.out.println(".........................................................................................................\n");
                System.out.println("Producto: " + nombreModelo);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio $: " + precio);
                compra = (int) (precio * cantidad);
                compraTotal += compra;
                System.out.println("Precio total $: " + compra);
            }
            case 2 -> {
                System.out.println("Volviendo a la seccion productos\n");
                // Esperar 1/2 segundo
                System.out.println("Aguarde unos segundos...");
            }
        }
    }
}
