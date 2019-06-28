/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.evaluacion.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author utp
 */
@Entity
@Table(name = "abierta")
public class PreguntaAbierta extends Pregunta implements Serializable {
    
    public PreguntaAbierta(){
    }
    
    public PreguntaAbierta(String descripcion, Double peso) {
        super(descripcion, peso);
    }
    
}
