package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "foto_pessoa")
public class PersonPhoto {
    @Id
    @Column(name ="fp_id")
    private Integer id;

    @Column(name = "fp_data")
    private Date date;

    @Column(name = "fp_bucket", length = 50)
    private String bucket;

    @Column(name = "fp_hash", length = 50)
    private String hash;
}
