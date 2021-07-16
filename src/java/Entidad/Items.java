/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Propietario
 */
@Entity
@Table(name = "items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Items.findAll", query = "SELECT i FROM Items i")
    , @NamedQuery(name = "Items.findByIdItems", query = "SELECT i FROM Items i WHERE i.idItems = :idItems")
    , @NamedQuery(name = "Items.findByDetalle", query = "SELECT i FROM Items i WHERE i.detalle = :detalle")
    , @NamedQuery(name = "Items.findByFecha", query = "SELECT i FROM Items i WHERE i.fecha = :fecha")
    , @NamedQuery(name = "Items.findByCompNumero", query = "SELECT i FROM Items i WHERE i.compNumero = :compNumero")
    , @NamedQuery(name = "Items.findByCompTipo", query = "SELECT i FROM Items i WHERE i.compTipo = :compTipo")
    , @NamedQuery(name = "Items.findByConcepto", query = "SELECT i FROM Items i WHERE i.concepto = :concepto")
    , @NamedQuery(name = "Items.findByEgreso", query = "SELECT i FROM Items i WHERE i.egreso = :egreso")
    , @NamedQuery(name = "Items.findByIdCaja", query = "SELECT i FROM Items i WHERE i.idCaja = :idCaja")})
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idItems")
    private Integer idItems;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Detalle")
    private String detalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CompNumero")
    private String compNumero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CompTipo")
    private String compTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Concepto")
    private String concepto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Egreso")
    private double egreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCaja")
    private int idCaja;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "items")
    private Caja caja;

    public Items() {
    }

    public Items(Integer idItems) {
        this.idItems = idItems;
    }

    public Items(Integer idItems, String detalle, Date fecha, String compNumero, String compTipo, String concepto, double egreso, int idCaja) {
        this.idItems = idItems;
        this.detalle = detalle;
        this.fecha = fecha;
        this.compNumero = compNumero;
        this.compTipo = compTipo;
        this.concepto = concepto;
        this.egreso = egreso;
        this.idCaja = idCaja;
    }

    public Integer getIdItems() {
        return idItems;
    }

    public void setIdItems(Integer idItems) {
        this.idItems = idItems;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
    }

    public String getCompTipo() {
        return compTipo;
    }

    public void setCompTipo(String compTipo) {
        this.compTipo = compTipo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getEgreso() {
        return egreso;
    }

    public void setEgreso(double egreso) {
        this.egreso = egreso;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItems != null ? idItems.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.idItems == null && other.idItems != null) || (this.idItems != null && !this.idItems.equals(other.idItems))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Items[ idItems=" + idItems + " ]";
    }
    
}
