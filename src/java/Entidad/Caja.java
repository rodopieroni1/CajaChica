/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Propietario
 */
@Entity
@Table(name = "caja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c")
    , @NamedQuery(name = "Caja.findByIdCaja", query = "SELECT c FROM Caja c WHERE c.idCaja = :idCaja")
    , @NamedQuery(name = "Caja.findByDescripcion", query = "SELECT c FROM Caja c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Caja.findByFecha", query = "SELECT c FROM Caja c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Caja.findByNumCaja", query = "SELECT c FROM Caja c WHERE c.numCaja = :numCaja")
    , @NamedQuery(name = "Caja.findByReposicion", query = "SELECT c FROM Caja c WHERE c.reposicion = :reposicion")
    , @NamedQuery(name = "Caja.findBySaldo", query = "SELECT c FROM Caja c WHERE c.saldo = :saldo")
    , @NamedQuery(name = "Caja.findByTotEgres", query = "SELECT c FROM Caja c WHERE c.totEgres = :totEgres")})
public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCaja")
    private Integer idCaja;
    @Size(max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 40)
    @Column(name = "NumCaja")
    private String numCaja;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Reposicion")
    private Double reposicion;
    @Column(name = "Saldo")
    private Double saldo;
    @Column(name = "TotEgres")
    private Double totEgres;
    @JoinColumn(name = "CodOperario", referencedColumnName = "CodOperario")
    @ManyToOne
    private Chofer codOperario;
    @JoinColumn(name = "idCaja", referencedColumnName = "idCaja", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Items items;

    public Caja() {
    }

    public Caja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(String numCaja) {
        this.numCaja = numCaja;
    }

    public Double getReposicion() {
        return reposicion;
    }

    public void setReposicion(Double reposicion) {
        this.reposicion = reposicion;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getTotEgres() {
        return totEgres;
    }

    public void setTotEgres(Double totEgres) {
        this.totEgres = totEgres;
    }

    public Chofer getCodOperario() {
        return codOperario;
    }

    public void setCodOperario(Chofer codOperario) {
        this.codOperario = codOperario;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaja != null ? idCaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.idCaja == null && other.idCaja != null) || (this.idCaja != null && !this.idCaja.equals(other.idCaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Caja[ idCaja=" + idCaja + " ]";
    }
    
}
