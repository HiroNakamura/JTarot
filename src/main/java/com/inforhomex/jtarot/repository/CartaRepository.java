package com.inforhomex.jtarot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.inforhomex.jtarot.model.Carta;
import java.util.List;

public interface CartaRepository extends CrudRepository<Carta, Integer>{
    @Query(value="SELECT id, numero, numero, descripcion FROM public.carta ",nativeQuery=true)
    public List<Carta> getAllCartas();
}