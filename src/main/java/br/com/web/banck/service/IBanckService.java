package br.com.web.banck.service;

import br.com.web.banck.entity.Banck;

public interface IBanckService {

    Iterable<Banck> listAllBanck();

    Banck getBanckById(Integer id);

    Banck saveBanck(Banck banck);

    void deleteBanck(Integer id);

}
