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
        System.out.print("¿Desea proceder al pago? [1. Si / 2. No]: ");
        procederPago = pagar.nextInt();
        
        if (procederPago != 1) {    // CHECKEAR
            Productos llamada = new Productos();
            llamada.productos();
        }
        
        System.out.println("::..............................................................................................::");
        System.out.println("::                                         MÉTODOS DE PAGOS                                     ::");
        System.out.println("::..............................................................................................::\n");

        System.out.println("1. Transferencia bancaria");
        System.out.println("2. Tarjeta de Débito");
        System.out.println("3. Tarjeta de Crédito");
        System.out.println("4. Mercado Pago");
        System.out.println("5. Volver atrás\n");
        
        Scanner opcion = new Scanner(System.in);
        System.out.println("Ingrese la opción de método de pago: ");
        opcionPago = opcion.nextInt();
        
        switch (opcionPago) {
             //Método de pago N°1 "Transferencia bancaria. Tiene descuento de un 10%"
            case 1 -> {
                System.out.println("::..............................................................................................::");
                System.out.println("::                                         TRANSFERENCIA BANCARIA                               ::");
                System.out.println("::..............................................................................................::\n");
                System.out.println("En pagos por transferencia 10% de descuento");
                System.out.println("ALIAS: Interdata.tienda");
                System.out.println("CBU: 000004377328742785");
                System.out.println("\nImporte Bruto: " + compraTotal);
                System.out.println("Aplicando el descuento del 10%");
                compraTotal -= compraTotal * 0.10;
                System.out.println("\nImporte Neto a pagar: " + compraTotal);
                Scanner transf = new Scanner(System.in);
                System.out.print("¿Desea realizar el pago? [1. Si / 2. No]: ");
                respuesta = transf.nextInt();
                
                if (respuesta == 1) {
                    System.out.println("Estamos comprobando su pago, espere unos segundos..");
                    System.out.println("Su pago fue realizado con éxito\n");
                    System.out.println("¡Gracias por su compra!");
                    System.out.println("");
                } else {
                    MetodoPago metodoP = new MetodoPago();
                    metodoP.metodoPago(compraTotal);
                }
            }
            //Método de pago N°2 "Débito. No tiene recargo ni descuento."
            case 2 -> {
                System.out.println("::..............................................................................................::");
                System.out.println("::                                         TARJETA DE DÉBITO                                    ::");
                System.out.println("::..............................................................................................::\n");
                System.out.println("Los pagos con débito no tienen descuento ni recargo");
                System.out.println("Importe a pagar: " + compraTotal);
                Scanner debito = new Scanner(System.in);
                System.out.println("Desea realizar el pago? [1. Si / 2. No]: ");
                respuesta = debito.nextInt();
                
                if (respuesta == 1) {
                    System.out.println("Ingrese los datos de la tarjeta");
                    Scanner datosDeb = new Scanner(System.in);
                    System.out.println("Número de tarjeta: ");
                    numeroTarjeta = datosDeb.nextInt();
                    Scanner titular = new Scanner(System.in);
                    System.out.println("Titular: ");
                    tt = titular.nextLine();
                    Scanner venc = new Scanner(System.in);
                    System.out.println("Año de vencimiento: ");
                    fv = venc.nextInt();
                    Scanner numCvv = new Scanner(System.in);
                    System.out.println("CVV: ");
                    cvv = numCvv.nextInt();
                    System.out.println("Su pago fue realizado con éxito");
                    System.out.println("¡Gracias por su compra!");
                } else {
                    MetodoPago metodoP = new MetodoPago();
                    metodoP.metodoPago(compraTotal);
                }
            }
             //Método de pago N°3 "Crédito 1 Pago. Donde se recarga al pago un 25%"
            case 3 -> {
                System.out.println("::..............................................................................................::");
                System.out.println("::                                         TARJETA DE CRÉDITO                                   ::");
                System.out.println("::..............................................................................................::\n");
                System.out.println("Las tarjetas de crédito poseen un recargo del 25%\n");
                System.out.println("Importe Bruto: " + compraTotal);
                System.out.println("\nAplicando el recargo de 25 %");
                compraTotal += compraTotal * 0.25;
                System.out.println("Importe neto a pagar: " + compraTotal);
                Scanner credito = new Scanner(System.in);
                System.out.println("\n¿Desea realizar el pago? [1.Si / 2.No]: ");
                respuesta = credito.nextInt();
                
                if (respuesta == 1) {
                System.out.println("Ingrese los datos de la tarjeta");
                Scanner datosDeb = new Scanner(System.in);
                System.out.println("Número de tarjeta: ");
                numeroTarjeta = datosDeb.nextInt();
                Scanner titular = new Scanner(System.in);
                System.out.println("Titular: ");
                tt = titular.nextLine();
                Scanner venc = new Scanner(System.in);
                System.out.println("Año de vencimiento: ");
                fv = venc.nextInt();
                Scanner numCvv = new Scanner(System.in);
                System.out.println("CVV: ");
                cvv = numCvv.nextInt();
                System.out.println("Su pago fue realizado con éxito");
                System.out.println("¡Gracias por su compra!");
                } else {
                    MetodoPago metodoP = new MetodoPago();
                    metodoP.metodoPago(compraTotal);
                    }
                }
              
             //Método de pago N°4 "Mercado Pago. Descuento de un 5%"
            case 4 -> {
                System.out.println("::..............................................................................................::");
                System.out.println("::                                         MERCADO PAGO                                         ::");
                System.out.println("::..............................................................................................::\n");
                System.out.println("En pagos por Mercado Pago 5% de descuento");
                System.out.println("ALIAS: Interdata.mp");
                System.out.println("CBU: 00000238298729357");
                System.out.println("Importe bruto: " + compraTotal);
                System.out.println("\nAplicando el descuento");
                compraTotal -= compraTotal * 0.05;
                System.out.println("Importe neto a pagar: " + compraTotal);
                Scanner mp = new Scanner(System.in);
                System.out.println("¿Desea realizar el pago? [1.Si / 2.No]: ");
                respuesta = mp.nextInt();
                
                if (respuesta == 1) {
                    System.out.println("Su pago fue realizado con éxito");
                    System.out.println("¡Gracias por su compra!");
                } else {
                    MetodoPago metodoP = new MetodoPago();
                    metodoP.metodoPago(compraTotal);
                }
            }
            case 5 -> {
                System.out.println("Volviendo a la sección productos");
                System.out.println("\nAguarde unos segundos...");
                Productos llamada = new Productos();
                llamada.productos();
                
            }
            default -> {
                System.out.println("La opción ingresada no es válida");
                System.out.println("Por favor intentelo nuevamente");
            }
        }
    }

    public MetodoPago(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
