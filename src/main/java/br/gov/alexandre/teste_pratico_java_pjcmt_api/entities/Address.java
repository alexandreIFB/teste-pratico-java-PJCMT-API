package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;


import jakarta.persistence.*;

@Entity(name = "endereco")
public class Address {
    @Id
    @Column(name ="end_id")
    private Integer id;

    @Column(name = "end_tipo_logradouro", length = 50)
    private String typeSpace;

    @Column(name = "end_logradouro", length = 200)
    private String space;

    @Column(name ="end_numero")
    private Integer number;

    @Column(name = "end_bairro", length = 100)
    private String neighborhood;

    @ManyToOne()
    @JoinColumn(name = "cid_id")
    private City city;
}
