package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "cidade")
public class City {
    @Id
    @Column(name ="cid_id")
    private Integer id;

    @Column(name ="cid_nome", length = 200)
    private String name;

    @Column(name ="cid_uf", length = 2)
    private String uf;
}
