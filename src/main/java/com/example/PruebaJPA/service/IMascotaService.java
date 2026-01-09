package com.example.PruebaJPA.service;

import com.example.PruebaJPA.model.Mascota;
import com.example.PruebaJPA.model.Persona;


import java.util.List;

public interface IMascotaService {

    //lectura
    public List<Mascota> getMascota();

    //alta
    public void saveMascota(Mascota masco);

    //baja
    public void deleteMascota(Long id_mascota);

    //lectura de un solo objeto

    public Mascota findMascota(Long id_mascota);

    //modificacion/edicion
    public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor);

}
