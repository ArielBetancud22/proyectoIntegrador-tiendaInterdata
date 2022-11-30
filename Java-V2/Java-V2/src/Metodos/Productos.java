package Metodos;

import java.util.Scanner;

public class Productos {

    private int opcion;
    private float compraTotal;
    private String compraProductosR, compraProductosB, compraProductosC, compraProductosJ, compraProductosP;
    private String compraProductosTra, compraProductosCa;
    private boolean salir;

    public Productos() {

    }

    public Productos(int opcion, float compraTotal, String compraProductosR, String compraProductosB, String compraProductosC, String compraProductosJ, String compraProductosP, String compraProductosTra, String compraProductosCa, boolean salir) {
        this.opcion = opcion;
        this.compraTotal = compraTotal;
        this.compraProductosR = compraProductosR;
        this.compraProductosB = compraProductosB;
        this.compraProductosC = compraProductosC;
        this.compraProductosJ = compraProductosJ;
        this.compraProductosP = compraProductosP;
        this.compraProductosTra = compraProductosTra;
        this.compraProductosCa = compraProductosCa;
        this.salir = salir;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public float getCompraTotal() {
        return compraTotal;
    }

    public void setCompraTotal(float compraTotal) {
        this.compraTotal = compraTotal;
    }

    public String getCompraProductosR() {
        return compraProductosR;
    }

    public void setCompraProductosR(String compraProductosR) {
        this.compraProductosR = compraProductosR;
    }

    public String getCompraProductosB() {
        return compraProductosB;
    }

    public void setCompraProductosB(String compraProductosB) {
        this.compraProductosB = compraProductosB;
    }

    public String getCompraProductosC() {
        return compraProductosC;
    }

    public void setCompraProductosC(String compraProductosC) {
        this.compraProductosC = compraProductosC;
    }

    public String getCompraProductosJ() {
        return compraProductosJ;
    }

    public void setCompraProductosJ(String compraProductosJ) {
        this.compraProductosJ = compraProductosJ;
    }

    public String getCompraProductosP() {
        return compraProductosP;
    }

    public void setCompraProductosP(String compraProductosP) {
        this.compraProductosP = compraProductosP;
    }

    public String getCompraProductosTra() {
        return compraProductosTra;
    }

    public void setCompraProductosTra(String compraProductosTra) {
        this.compraProductosTra = compraProductosTra;
    }

    public String getCompraProductosCa() {
        return compraProductosCa;
    }

    public void setCompraProductosCa(String compraProductosCa) {
        this.compraProductosCa = compraProductosCa;
    }

    public boolean isSalir() {
        return salir;
    }

    public void setSalir(boolean salir) {
        this.salir = salir;
    }

    public void productos() {
        this.setOpcion(opcion);
        this.setCompraProductosB(compraProductosB);
        this.setCompraProductosC(compraProductosC);
        this.setCompraProductosCa(compraProductosCa);
        this.setCompraProductosJ(compraProductosJ);
        this.setCompraProductosP(compraProductosP);
        this.setCompraProductosR(compraProductosR);
        this.setCompraProductosTra(compraProductosTra);
        this.setCompraTotal(compraTotal);
        this.setSalir(salir);

        //getCompraProductosB(); para imprimir
        do {
            System.out.println(".......................................................................................................................");
            System.out.println("::                                                         CATEGORIAS                                                ::");
            System.out.println("::                                             COLECCION OTONIO- INVIERNO 2022                                        ::");
            System.out.println("::...................................................................................................................::\n");
            
            System.out.println("1.Remeras");
            System.out.println("2.Buzos");
            System.out.println("3.Camperas");
            System.out.println("4.Jeans");
            System.out.println("5.Pantalones Joggin");
            System.out.println("6.Camisas");
            System.out.println("7.Trajes");
            System.out.println("8.Ver carrito de compras");
            System.out.println("9.Salir de la cuenta\n");
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingresa la categoria ingresada: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    MenuRemeras remeras = new MenuRemeras();
                    remeras.menuRemeras(compraTotal, compraProductosR);
                    break;
                case 2:
                    MenuBuzos buzos = new MenuBuzos();
                    buzos.menuBuzos(compraTotal, compraProductosB);
                    break;
                case 3:
                    MenuCamperas camperas = new MenuCamperas();
                    camperas.menuCamperas(compraTotal, compraProductosC);
                    break;
                case 4:
                    MenuJeans jeans = new MenuJeans();
                    jeans.menuJeans(compraTotal, compraProductosJ);
                    break;
                case 5:
                    MenuPantalones pantalones = new MenuPantalones();
                    pantalones.menuPantalones(compraTotal, compraProductosP);
                case 6:
                    MenuCamisas camisas = new MenuCamisas();
                    camisas.menuCamisas(compraTotal, compraProductosCa);
                    break;
                case 7:
                    MenuTrajes trajes = new MenuTrajes();
                    trajes.menuTrajes(compraTotal, compraProductosTra);
                    break;
                case 8:
                    MetodoPago pago = new MetodoPago();
                    pago.metodoPago(compraTotal);
                    System.out.println("::....................................................................................................................................................::");
                    System.out.println("::                                                          :: CARRITO DE COMPRAS ::                                                                   ::");
                    System.out.println("::....................................................................................................................................................::\n");
                    System.out.println("Los productos agregados al carrito son: " + compraProductosR + ", " + compraProductosB + ", " + compraProductosC + ", " + compraProductosJ + ", " + compraProductosCa + ", " + compraProductosTra);
                    System.out.println("El monto total es: " + compraTotal);

                  
                    break;
                case 9:
                    salir = true;
                    break;
            }
        } while (opcion != 9);
    }
}
