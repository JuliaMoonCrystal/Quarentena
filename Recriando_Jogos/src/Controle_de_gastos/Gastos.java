package Controle_de_gastos;

import java.sql.Date;

public class Gastos {
 private double conta_luz;
 private double conta_agua;
 private double conta_gas;
 private double outros_gastos;
 private Date dia;
 
 public Gastos(double conta_luz,double conta_agua,double conta_gas,double outros_gastos,Date dia) {
	 this.conta_luz=conta_luz;
	 this.conta_agua=conta_agua;
	 this.conta_gas=conta_gas;
	 this.outros_gastos=outros_gastos;
	 this.dia=dia;
 }

public double getConta_luz() {
	return conta_luz;
}
public void setConta_luz(double conta_luz) {
	this.conta_luz = conta_luz;
}
public double getConta_agua() {
	return conta_agua;
}
public void setConta_agua(double conta_agua) {
	this.conta_agua = conta_agua;
}
public double getConta_gas() {
	return conta_gas;
}
public void setConta_gas(double conta_gas) {
	this.conta_gas = conta_gas;
}
public double getOutros_gastos() {
	return outros_gastos;
}
public void setOutros_gastos(double outros_gastos) {
	this.outros_gastos = outros_gastos;
}
public Date getDia() {
	return dia;
}
public void setDia(Date dia) {
	this.dia = dia;
}
 
}
