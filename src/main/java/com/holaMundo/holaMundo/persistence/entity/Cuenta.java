package com.holaMundo.holaMundo.persistence.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "cuentas")
public class Cuenta {

    @Id
    @Column(name = "cod_cuenta")
    private Integer codCuenta;

    private String tipo;

    @Column (name = "fecha_creacion")
    private Date fechaCreacion;

    private Integer saldo;

    @ManyToMany (cascade = {CascadeType.ALL}, mappedBy = "cuentas")
    private List<Cliente> clientes = new ArrayList<>();

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cuenta")
    private List<Movimiento> movimientos = new ArrayList<>();

    public Cuenta(){
    }

    public Cuenta(Integer cod, String tipo, Date fecha, Integer saldo){
        this.codCuenta=cod;
        this.tipo=tipo;
        this.fechaCreacion=fecha;
        this.saldo=saldo;
    }

    public Integer getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(Integer codCuenta) {
        this.codCuenta = codCuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
