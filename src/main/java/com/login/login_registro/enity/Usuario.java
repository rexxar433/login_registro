package com.login.login_registro.enity;



import java.sql.Date;
import java.util.Collection;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios",uniqueConstraints = @UniqueConstraint(columnNames = "email"))

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(name = "usuarioS")
    private String usuarioS;
    
    
    @Column(name= "Primernombre")
    private String Primernombre;

    @Column(name= "Segundonombre")
    private String Segundonombre;

    @Column(name= "Primerapellido")
    private String Primerapellido;

    @Column(name= "Segundoapellido")
    private String Segundoapellido;


    private Date FechaDeNacimiento;
    private Integer Edad;
    private String email;
    private String password;
    
    
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
        name = "usuarios_roles",
        joinColumns = @JoinColumn(
            name = "usuario_id",referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "id")
        )
    
    private Collection<Rol> roles;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUsuarioS() {
        return usuarioS;
    }


    public void setUsuario(String usuarioS) {
        this.usuarioS = usuarioS;
    }


    public String getPrimernombre() {
        return Primernombre;
    }


    public void setPrimernombre(String primernombre) {
        Primernombre = primernombre;
    }


    public String getSegundonombre() {
        return Segundonombre;
    }


    public void setSegundonombre(String segundonombre) {
        Segundonombre = segundonombre;
    }


    public String getPrimerapellido() {
        return Primerapellido;
    }


    public void setPrimerapellido(String primerapellido) {
        Primerapellido = primerapellido;
    }


    public String getSegundoapellido() {
        return Segundoapellido;
    }


    public void setSegundoapellido(String segundoapellido) {
        Segundoapellido = segundoapellido;
    }


    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }


    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }


    public Integer getEdad() {
        return Edad;
    }


    public void setEdad(Integer edad) {
        Edad = edad;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public Collection<Rol> getRoles() {
        return roles;
    }


    public void setRoles(Collection<Rol> roles) {
        this.roles = roles;
    }


    public Usuario(Long id, String usuarioS, String primernombre, String segundonombre, String primerapellido,
            String segundoapellido, Date fechaDeNacimiento, Integer edad, String email, String password,
            Collection<Rol> roles) {
        this.id = id;
        this.usuarioS = usuarioS;
        Primernombre = primernombre;
        Segundonombre = segundonombre;
        Primerapellido = primerapellido;
        Segundoapellido = segundoapellido;
        FechaDeNacimiento = fechaDeNacimiento;
        Edad = edad;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }


    public Usuario(String usuarioS, String primernombre, String segundonombre, String primerapellido,
            String segundoapellido, Date fechaDeNacimiento, Integer edad, String email, String password,
            Collection<Rol> roles) {
        this.usuarioS = usuarioS;
        Primernombre = primernombre;
        Segundonombre = segundonombre;
        Primerapellido = primerapellido;
        Segundoapellido = segundoapellido;
        FechaDeNacimiento = fechaDeNacimiento;
        Edad = edad;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }


    public Usuario() {
    }
    
    
    
}
