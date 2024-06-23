package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "cidade")
public class City {
    @Id
    @Column(name ="cid_id")
    private Integer id;

    @Column(name ="cid_nome", length = 200)
    private String name;

    @Column(name ="cid_uf", length = 2)
    private String uf;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cid_id")
    private List<Address> addressList;
}
