/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Fecha {
    private int dia;
    private int mes;
    private int agno;

    public Fecha(int dia, int mes, int agno) {
        this.dia = dia;
        this.mes = mes;
        this.agno = agno;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    @Override
    public String toString() {
        return "\n \t Fecha de salida: " + 
        "( Dia: " + dia + 
        " / Mes: " + mes +"/ Agno: " + agno+" )";
    }
    
    
}
