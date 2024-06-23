package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "pessoa")
public class Person {
    @Id
    @Column(name ="pes_id")
    private Integer id;

    @Column(name = "fp_nome", length = 200)
    private String name;

    @Column(name = "pes_data_nascimento")
    private Date birthDate;

    @Column(name = "pes_sexo", length = 9)
    private String gender;

    @Column(name = "pes_mae", length = 200)
    private String monthName;

    @Column(name = "pes_pai", length = 200)
    private String fatherName;

}