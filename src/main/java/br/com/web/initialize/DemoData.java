package br.com.web.initialize;

import br.com.web.banck.entity.Banck;
import br.com.web.banck.repository.BanckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DemoData implements CommandLineRunner {

    @Autowired
    private BanckRepository banckRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        {
            {
                Banck banck = new Banck();
                banck.setNome("Santander");
                banckRepository.save(banck);
            }
            {
                Banck banck = new Banck();
                banck.setNome("Bradesco");
                banckRepository.save(banck);
            }
            {
                Banck banck = new Banck();
                banck.setNome("Caixa");
                banckRepository.save(banck);
            }

        }
    }

}
