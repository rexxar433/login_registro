package com.login.login_registro.dto;

import java.sql.Date;

public class UsuarioRegistroDTO {
    
    

    private Long id;
    private String usuarioS;
    private String Primernombre;
    private String Segundonombre;
    private String Primerapellido;
    private String Segundoapellido;
    private Date FechaDeNacimiento;
    private Integer Edad;
    private String email;
    private String password;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsuarioS() {
        return usuarioS;
    }
    public void setUsuarioS(String usuarioS) {
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
    public UsuarioRegistroDTO(Long id, String usuarioS, String primernombre, String segundonombre,
            String primerapellido, String segundoapellido, Date fechaDeNacimiento, Integer edad, String email,
            String password) {
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
    }
    public UsuarioRegistroDTO(String usuarioS, String primernombre, String segundonombre, String primerapellido,
            String segundoapellido, Date fechaDeNacimiento, Integer edad, String email, String password) {
        this.usuarioS = usuarioS;
        Primernombre = primernombre;
        Segundonombre = segundonombre;
        Primerapellido = primerapellido;
        Segundoapellido = segundoapellido;
        FechaDeNacimiento = fechaDeNacimiento;
        Edad = edad;
        this.email = email;
        this.password = password;
    }
    public UsuarioRegistroDTO(String email) {
        this.email = email;
    }
    public UsuarioRegistroDTO() {
    }
    
    
    
    
    
    

        
    
    

}
