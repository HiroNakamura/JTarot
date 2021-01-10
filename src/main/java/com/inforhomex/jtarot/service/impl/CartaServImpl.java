package com.inforhomex.jtarot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inforhomex.jtarot.repository.CartaRepository;
import com.inforhomex.jtarot.service.ICarta;
import com.inforhomex.jtarot.model.Carta;
import java.util.List;


@Service("cartaService")
public class CartaServImpl implements ICarta{
    @Autowired
    private CartaRepository cartaRepository;

    @Override
    public List<Carta> getAllCartas(){
        return this.cartaRepository.getAllCartas();
    }

}