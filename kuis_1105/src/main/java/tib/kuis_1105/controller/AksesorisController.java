/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tib.kuis_1105.controller;
import tib.kuis_1105.entity.Aksesoris;
import tib.kuis_1105.service.AksesorisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/aksesoris")
public class AksesorisController {
    @Autowired
    private AksesorisService aksesorisService;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris insert(@RequestBody Aksesoris aksesoris) {
        return aksesorisService.insert(aksesoris);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesoris update(@RequestBody Aksesoris aksesoris) {
        return aksesorisService.update(aksesoris);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return aksesorisService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Aksesoris getById(@PathVariable("id") Long id){
        return aksesorisService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris> getAll(){
        return aksesorisService.getAll();
    }
}
