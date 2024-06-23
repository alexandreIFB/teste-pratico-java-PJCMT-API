package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "unidade")
public class Sector {
    @Id
    @Column(name ="unid_id")
    private Integer id;

    @Column(name = "unid_name", length = 100)
    private String name;

    @Column(name = "unid_sigla", length = 20)
    private String acronym;
}
