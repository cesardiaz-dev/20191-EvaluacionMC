/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.evaluacion.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author utp
 */
@Entity
public class PreguntaSeleccionMultipleUnicaRespuesta extends Pregunta implements Serializable {
    
    private List<Opcion> opciones;
    private Opcion respuestaCorrecta;

    public PreguntaSeleccionMultipleUnicaRespuesta() {
    }

    public PreguntaSeleccionMultipleUnicaRespuesta(String descripcion, Double peso) {
        super(descripcion, peso);
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }

    public Opcion getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(Opcion respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

}
