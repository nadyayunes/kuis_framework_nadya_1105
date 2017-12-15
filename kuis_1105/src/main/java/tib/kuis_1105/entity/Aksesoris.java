/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1105.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa 30
 */
@Entity
@Table(name = "tbl_aksesoris")
public class Aksesoris {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_aksesoris;
    @Column(length = 255, nullable = true)
    private String deskripsi_aksesoris;
    @Column(length = 100, nullable = true)
    private String harga_aksesoris;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */    
     public String getNamaAksesoris() {
        return nama_aksesoris;
    }

    /**
     * @param name the name to set
     */
    public void setNamaAksesoris(String name) {
        this.nama_aksesoris = name;
    }
    
    public String getDeskripsiAksesoris() {
        return deskripsi_aksesoris;
    }

    /**
     * @param name the name to set
     */
    public void setDeskripsiAksesoris(String deskripsi) {
        this.deskripsi_aksesoris = deskripsi;
    }

    /**
     * @return the description
     */
    public String getHargaAksesoris() {
        return harga_aksesoris;
    }

    /**
     * @param description the description to set
     */
    public void setHargaAksesoris(String harga_aksesoris) {
        this.harga_aksesoris = harga_aksesoris;
    }


    /**
     * @return the name
     */
    
}
