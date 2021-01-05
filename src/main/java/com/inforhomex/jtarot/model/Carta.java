package com.inforhomex.jtarot.model;


public class Carta{
    private int numero;
    private String nombre;
    private String descripcion;

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Carta{");
        sb.append("numero: ");
        sb.append(this.numero);
        sb.append(", nombre:");
        sb.append(this.nombre);
        sb.append(", descripcion:");
        sb.append(this.descripcion);
        sb.append("}");
        return sb.toString();
    }

}