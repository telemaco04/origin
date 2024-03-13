package com.holaMundo.holaMundo.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "movimientos")
public class Movimiento {

    @Id
    @Column (name = "id_movimiento")
    private Integer idMovimiento;

    private Date fecha;

    private Double cantidad;

    @ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn (name = "cod_cuenta")
    private Cuenta cuenta;

    public Movimiento(){
    }

    public Movimiento(Integer id, Date fecha, Double cantidad, Cuenta cuenta){
        this.idMovimiento=id;
        this.fecha=fecha;
        this.cantidad=cantidad;
        this.cuenta=cuenta;
    }

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
