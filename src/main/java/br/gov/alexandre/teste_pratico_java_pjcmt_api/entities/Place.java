package br.gov.alexandre.teste_pratico_java_pjcmt_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "lotacao")
public class Place {
    @Id
    @Column(name ="lot_id")
    private Integer id;

    @Column(name ="pes_id")
    private Integer personId;

    @Column(name ="unid_id")
    private Integer sectorId;

    @Column(name ="lot_data_lotacao")
    private Date dateInit;

    @Column(name ="lot_data_remocao")
    private Date dateRemoved;

    @Column(name = "lot_portaria", length = 100)
    private String lobby;
}
