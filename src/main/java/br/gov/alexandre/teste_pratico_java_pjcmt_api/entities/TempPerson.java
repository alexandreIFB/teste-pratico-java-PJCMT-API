package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "servidor_temporario")
public class TempPerson {
    @Id
    @Column(name ="pes_id")
    private Integer personId;

    @Column(name = "st_data_admissao")
    private Date dateAdmission;
    @Column(name = "st_data_demissao")
    private Date dateResignation;
}
