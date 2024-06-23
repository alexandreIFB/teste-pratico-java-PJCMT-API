package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "servidor_efetivo")
public class EffectivePerson {
    @Id
    @Column(name ="pes_id")
    private Integer personId;

    @Column(name = "se_matricula")
    private String registration;
}
