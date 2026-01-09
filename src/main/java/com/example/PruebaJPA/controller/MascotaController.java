package com.example.PruebaJPA.controller;

import com.example.PruebaJPA.model.Mascota;
import com.example.PruebaJPA.model.Persona;
import com.example.PruebaJPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;

    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascota(){
        return mascoServ.getMascota();
    }

    @PostMapping("/mascotas/crear")
    public String saveMascota (@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
        return "La mascota fue creada correctamente";
    }

    @DeleteMapping("/mascotas/borrar/{id_mascota}")
    public String deleteMascota (@PathVariable Long id_mascota){
        mascoServ.deleteMascota(id_mascota);
        return "La mascota fue eliminada correctamente";
    }

    @PutMapping("/mascota/editar/{id_original}")
    public Mascota editMascota (@PathVariable Long id_original,
                                @RequestParam(required = false, name = "id") Long id_mascotaNueva,
                                @RequestParam(required = false, name = "nombre") String nuevoNombre,
                                @RequestParam(required = false, name = "especie") String nuevaEspecie,
                                @RequestParam(required = false, name = "raza") String nuevaRaza,
                                @RequestParam(required = false, name = "color") String nuevoColor){

        mascoServ.editMascota(id_original, id_mascotaNueva, nuevoNombre, nuevaEspecie, nuevaRaza, nuevoColor );
        Mascota masco = mascoServ.findMascota(id_mascotaNueva);

        return masco;

    }




}
