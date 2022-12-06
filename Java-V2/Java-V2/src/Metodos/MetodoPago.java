package Metodos;

import java.util.Scanner;

public class MetodoPago {

    private int opcionPago, respuesta;
    private int numeroTarjeta, cvv, fv;
    private String tt;
    private int procederPago;
    private boolean salida;

    public MetodoPago() {
    }

    public MetodoPago(int opcionPago, int respuesta, int numeroTarjeta, int cvv, int fv, String tt, int procederPago, boolean salida) {
        this.opcionPago = opcionPago;
        this.respuesta = respuesta;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fv = fv;
        this.tt = tt;
        this.procederPago = procederPago;
        this.salida = salida;
    }

    public int getOpcionPago() {
        return opcionPago;
    }

    public void setOpcionPago(int opcionPago) {
        this.opcionPago = opcionPago;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getFv() {
        return fv;
    }

    public void setFv(int fv) {
        this.fv = fv;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public int getProcederPago() {
        return procederPago;
    }

    public void setProcederPago(int procederPago) {
        this.procederPago = procederPago;
    }

    public boolean isSalida() {
        return salida;
    }

    public void setSalida(boolean salida) {
        this.salida = salida;
    }

    public void metodoPago(double compraTotal) {
        this.setCvv(cvv);
        this.setFv(fv);
        this.setNumeroTarjeta(numeroTarjeta);
        this.setOpcionPago(opcionPago);
        this.setProcederPago(procederPago);
        this.setRespuesta(respuesta);
        this.setSalida(salida);
        this.setTt(tt);

        Scanner pagar = new Scanner(System.in);
        System.out.print("Desea proceder al pago? [1. Si / 2. No]: ");
        procederPago = pagar.nextInt();

        if (procederPago != 1) {    // CHECKEAR
            Productos llamada = new Productos();
            llamada.productos();
        }

        System.out.println("::..............................................................................................::");
        System.out.println("::                                         METODOS DE PAGO                                      ::");
        System.out.println("::..............................................................................................::\n");

        System.out.println("1. Transferencia bancaria");
        System.out.println("2. Tarjeta de Debito");
        System.out.println("3. Tarjeta de Credito");
        System.out.println("4. Mercado Pago");
        System.out.println("5. Volver atras\n");

        Scanner opcion = new Scanner(System.in);
        System.out.print("Ingrese opcion de método de pago: ");
        opcionPago = opcion.nextInt();

        switch (opcionPago) {
            case 1 -> {
                System.out.println("\n     :: TRANSFERENCIA BANCARIA ::  ");
                System.out.println("En pagos por transferencia 10% de descuento");
                System.out.println("ALIAS: INTERDATA.TIENDA");
                System.out.println("CBU: 000004377328742785\n");
                System.out.println("Importe Bruto: " + compraTotal);
                System.out.println("\nAplicando el descuento del 10%");
                compraTotal -= compraTotal * 0.10;
                System.out.println("Importe Neto a pagar: " + compraTotal);
                Scanner transf = new Scanner(System.in);
                System.out.print("Desea realizar el pago? [1. Si / 2. No]: ");
                respuesta = transf.nextInt();

                if (respuesta == 1) {
                    System.out.println("Estamos comprobando su pago, espere unos segundos..");
                    System.out.println("Su pago fue realizado con exito\n");
                    System.out.println("GRACIAS POR SU COMPRA!");
                    System.out.println("\nLOS ESPERAMOS PRONTO\n");
                } else {
                    MetodoPago metodoP = new MetodoPago();
                    metodoP.metodoPago(compraTotal);
                }
            }
            case 2 -> {
                System.out.println("     :: TARJETA DE DEBITO ::    \n");
                System.out.println("Los pagos con debito no tienen descuento ni recargo");
                System.out.println("Importe a pagar: " + compraTotal);
                Scanner debito = new Scanner(System.in);
                System.out.print("Desea realizar el pago? 1.Si / 2.No: ");
                respuesta = debito.nextInt();

                if (respuesta == 1) {
                    System.out.println("Ingrese los datos de la tarjeta");
                    Scanner datosDeb = new Scanner(System.in);
                    System.out.print("Numero de tarjeta: ");
                    numeroTarjeta = datosDeb.nextInt();
                    Scanner titular = new Scanner(System.in);
                    System.out.print("Titular: ");
                    tt = titular.nextLine();
                    Scanner venc = new Scanner(System.in);
                    System.out.print("Anio de vencimiento: ");
                    fv = venc.nextInt();
                    Scanner numCvv = new Scanner(System.in);
                    System.out.println("CVV: ");
                    cvv = numCvv.nextInt();
                    System.out.println("\nLa compra fue realizada con exito, gracias por elegirnos\n");
                } else {
                    MetodoPago metodoP = new MetodoPago();
                    metodoP.metodoPago(compraTotal);
                }
            }
            case 3 -> {
                System.out.println("           :: TARJETA DE CREDITO ::    \n");
                System.out.println("Las tarjetas de credito poseen un recargo del 25%\n");
                System.out.println("Importe Bruto: " + compraTotal);
                System.out.println("Aplicando el recargo de 25 %");
                compraTotal -= compraTotal * 1.25;
                System.out.println("Importe Neto a pagar: " + compraTotal);
                Scanner credito = new Scanner(System.in);
                System.out.print("Desea realizar el pago? [1.Si / 2.No]: ");
                respuesta = credito.nextInt();

                if (respuesta == 1) {
                    System.out.println("Ingrese los datos de la tarjeta");
                    Scanner numCred = new Scanner(System.in);
                    System.out.print("Numero de tarjeta: ");
                    numeroTarjeta = numCred.nextInt();
                    Scanner titular = new Scanner(System.in);
                    System.out.print("Titular: ");
                    tt = titular.nextLine();
                    Scanner venc = new Scanner(System.in);
                    System.out.print("Anio de vencimiento: ");
                    fv = venc.nextInt();
                    Scanner numCvv = new Scanner(System.in);
                    System.out.print("CVV: ");
                    cvv = numCvv.nextInt();
                    System.out.println("\nLa compra fue realizada con exito, gracias por elegirnos\n");
                } else {
                    MetodoPago metodoP = new MetodoPago();
                    metodoP.metodoPago(compraTotal);
                }
            }
            case 4 -> {
                System.out.println("           :: MERCADO PAGO ::        \n");
                System.out.println("En pagos por Mercado pago 5% de descuento");
                System.out.println("ALIAS: INTERDATA.MP");
                System.out.println("CBU: 00000238298729357");
                System.out.println("Importe bruto: " + compraTotal);
                System.out.println("\nAplicando el descuento");
                compraTotal -= compraTotal * 0.05;
                System.out.println("Importe neto a pagar: " + compraTotal);
                Scanner mp = new Scanner(System.in);
                System.out.print("Desea realizar el pago? [1.Si / 2.No]: ");
                respuesta = mp.nextInt();

                if (respuesta == 1) {
                    System.out.println("Su pago fue realizado con exito");
                    System.out.println("Gracias por su compra!");
                } else {
                    MetodoPago metodoP = new MetodoPago();
                    metodoP.metodoPago(compraTotal);
                }
            }
            case 5 -> {
                System.out.println("Volviendo a la seccion productos");
                System.out.println("\n Aaguarde unos segundos...");
                Productos llamada = new Productos();
                llamada.productos();
            }
            default -> {
                System.out.println("La opcion ingresada no es valida");
                System.out.println("\nPor favor intentelo nuevamente");
            }
        }
    }
}
