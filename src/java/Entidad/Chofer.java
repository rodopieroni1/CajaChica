/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Propietario
 */
@Entity
@Table(name = "chofer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chofer.findAll", query = "SELECT c FROM Chofer c")
    , @NamedQuery(name = "Chofer.findByCodOperario", query = "SELECT c FROM Chofer c WHERE c.codOperario = :codOperario")
    , @NamedQuery(name = "Chofer.findByDni", query = "SELECT c FROM Chofer c WHERE c.dni = :dni")
    , @NamedQuery(name = "Chofer.findByTelefono", query = "SELECT c FROM Chofer c WHERE c.telefono = :telefono")})
public class Chofer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodOperario")
    private Integer codOperario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DNI")
    private int dni;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "ApeyNom")
    private String apeyNom;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Telefono")
    private String telefono;
    @OneToMany(mappedBy = "codOperario")
    private Collection<Caja> cajaCollection;

    public Chofer() {
    }

    public Chofer(Integer codOperario) {
        this.codOperario = codOperario;
    }

    public Chofer(Integer codOperario, int dni, String apeyNom, String direccion, String telefono) {
        this.codOperario = codOperario;
        this.dni = dni;
        this.apeyNom = apeyNom;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getCodOperario() {
        return codOperario;
    }

    public void setCodOperario(Integer codOperario) {
        this.codOperario = codOperario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApeyNom() {
        return apeyNom;
    }

    public void setApeyNom(String apeyNom) {
        this.apeyNom = apeyNom;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<Caja> getCajaCollection() {
        return cajaCollection;
    }

    public void setCajaCollection(Collection<Caja> cajaCollection) {
        this.cajaCollection = cajaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codOperario != null ? codOperario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chofer)) {
            return false;
        }
        Chofer other = (Chofer) object;
        if ((this.codOperario == null && other.codOperario != null) || (this.codOperario != null && !this.codOperario.equals(other.codOperario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Chofer[ codOperario=" + codOperario + " ]";
    }
    
}
