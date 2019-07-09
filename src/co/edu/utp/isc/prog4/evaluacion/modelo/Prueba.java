/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.evaluacion.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author utp
 */
@Entity
@Table(name = "tests")
public class Prueba implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "class_name", nullable = false)
    private String materia;
    
    @Column(name = "name", nullable = false)
    private String nombre;
    
    @OneToMany
    private List<Pregunta> preguntas;
    
    @Column(name = "maxNote")
    private Double notaMaxima;

    public Prueba() {
    }

    public Prueba(String materia, String nombre, Double notaMaxima) {
        this.materia = materia;
        this.nombre = nombre;
        this.notaMaxima = notaMaxima;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public Double getNotaMaxima() {
        return notaMaxima;
    }

    public void setNotaMaxima(Double notaMaxima) {
        this.notaMaxima = notaMaxima;
    }

    @Override
    public String toString() {
        return "Prueba{" + "id=" + id 
                + ", materia=" + materia 
                + ", nombre=" + nombre 
                + ", preguntas=" + preguntas 
                + ", notaMaxima=" + notaMaxima + '}';
    }
    
    

}
