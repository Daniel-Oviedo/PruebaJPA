package com.example.PruebaJPA.service;


import com.example.PruebaJPA.model.Persona;

import java.util.List;

public interface IPersonaService {

    //lectura
    public List<Persona> getPersonas();

    //alta
    public void savePersona(Persona perso);

    //baja
    public void deletePersona(Long id);

    //lectura de un solo objeto

    public Persona findPersona(Long id);

    //modificacion/edicion
    public void editPerosona(Long idOriginal, Long idNuevo, String nuevoNombre, String nuevoApellido, int nuevaEdad);

}
