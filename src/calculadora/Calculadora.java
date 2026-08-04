/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author ylpjk
 */
public class Calculadora {
 
    private double valor;
    private double resultado;
    private String operador;

    public Calculadora() {
        resultado = 0;
    }

    public void sumar() {
        resultado += valor;
    }

    public void restar() {
        resultado -= valor;
    }

    public void multiplicar() {
        resultado *= valor;
    }

    public void dividir() throws DivisionPorCero, OperacionInvalidad {
        if (valor == 0) {
            throw new DivisionPorCero("No se puede dividir entre cero");
        }
        resultado /= valor;
        if (Double.isNaN(resultado) || Double.isInfinite(resultado)) {
            throw new OperacionInvalidad("El resultado no es válido");
        }
    }

    public void reiniciar() {
        resultado = 0;
        valor = 0;
        operador = null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
}




