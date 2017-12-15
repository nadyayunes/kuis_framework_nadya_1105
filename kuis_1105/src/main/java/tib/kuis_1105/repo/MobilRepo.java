/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1105.repo;

import tib.kuis_1105.entity.Mobil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Mahasiswa 30
 */
public interface MobilRepo extends CrudRepository<Mobil, Long> {
    @Query("select p from Mobil p")
    public List<Mobil> findAllProduct();
    
   
}
