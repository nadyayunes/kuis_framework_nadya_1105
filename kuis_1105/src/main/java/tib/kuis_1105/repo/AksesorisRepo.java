/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1105.repo;

import tib.kuis_1105.entity.Aksesoris;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AksesorisRepo extends CrudRepository<Aksesoris, Long> {
    @Query("select a from Aksesoris a")
    public List<Aksesoris> findAllCategory();
}
