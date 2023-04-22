/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaed04;

/**
 * @author ED05
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constuctor sin parametros
     */
    public CCuenta ()
    {
    }
    
    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     * @param nom Nombre del titular de la cuenta
     * @param cue Numero de cuenta
     * @param sal Saldo actual de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método para asignar el nombre del titular de la cuenta
     * @param nom Nombre del titular de la cuenta
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    
    /**
     * Método que me devuelve el nombre del titular
     * @return Nombre del titular de la cuenta
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Método que me devuelve el saldo disponible en cada momento
     * @return Saldo actual de la cuenta
     */
     public double getEstado ()
    {
        return getSaldo();
    }


    /**
     * Metodo que permite ingresar saldo en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa no realiza la transacción
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }


    /**
     * Método para retirar cantidades en la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Salta la excepción en caso de que el saldo sea negativo o igual a 0
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que me devuelve el número de cuenta
     * @return Devuelve el numero de cuenta
     */
    public String getCuenta ()
    {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
