package com.holaMundo.holaMundo.persistence.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="clientes")
public class Cliente {
    @Id
    @Column (name = "dni")
    private Integer dniCliente;

    @Column (name = "codigo_cliente")
    private Integer codigoCliente;

    private String nombre;

    private String apellido1;
    private String apellido2;
    private String direccion;

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable (name="tiene", joinColumns = {@JoinColumn(name="dni")}, inverseJoinColumns = {@JoinColumn(name="cod_cuenta")})
    private List<Cuenta> cuentas = new ArrayList<>();

    public Cliente(){
    }

    public Cliente(Integer dni, Integer cod, String nombre, String ape1, String ape2, String direccion){
        this.dniCliente=dni;
        this.codigoCliente=cod;
        this.nombre=nombre;
        this.apellido1=ape1;
        this.apellido2=ape2;
        this.direccion=direccion;
    }

    public Integer getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Integer dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
