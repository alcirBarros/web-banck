package br.com.web.banck.service.impl;

import br.com.web.banck.entity.Banck;
import br.com.web.banck.repository.BanckRepository;
import br.com.web.banck.service.IBanckService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BanckService implements IBanckService {

    @Autowired
    private BanckRepository banckRepository;

    @Override
    public Iterable<Banck> listAllBanck() {
        return banckRepository.findAll();
    }

    @Override
    public Banck getBanckById(Integer id) {
        Optional<Banck> optionalBanck = banckRepository.findById(id);
        return (optionalBanck.isPresent() ? optionalBanck.get() : null);
    }

    @Override
    public Banck saveBanck(Banck banck) {
        return banckRepository.save(banck);
    }

    @Override
    public void deleteBanck(Integer id) {
        banckRepository.deleteById(id);
    }
}
