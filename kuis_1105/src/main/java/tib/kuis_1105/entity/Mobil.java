/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1105.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa 30
 */
@Entity
@Table(name = "tbl_mobil")
public class Mobil {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_mobil;
    @Column(length = 255, nullable = true)
    private String deskripsi_mobil;
    @Column(length = 255, nullable = true)
    private String harga_mobil;
    @ManyToOne
    private Aksesoris aksesoris;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNamaMobil() {
        return nama_mobil;
    }

    /**
     * @param name the name to set
     */
    public void setNamaMobil(String name) {
        this.nama_mobil = name;
    }

    /**
     * @return the description
     */
    public String getDeskripsiMobil() {
        return deskripsi_mobil;
    }

    /**
     * @param description the description to set
     */
    public void setDeskripsiMobil(String description) {
        this.deskripsi_mobil = description;
    }
    
    public String getHargaMobil() {
        return harga_mobil;
    }

    /**
     * @param description the description to set
     */
    public void setHargaMobil(String harga) {
        this.harga_mobil = harga;
    }


    /**
     * @return the name
     */
    
}
