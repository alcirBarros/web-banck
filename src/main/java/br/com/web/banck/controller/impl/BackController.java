package br.com.web.banck.controller.impl;

import br.com.web.banck.controller.IBackController;
import br.com.web.banck.entity.Banck;
import br.com.web.banck.service.IBanckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/banck")
public class BackController implements IBackController {

    @Autowired
    private IBanckService iBanckService;

    @Override
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Banck> list() {
        Iterable<Banck> banckList = iBanckService.listAllBanck();
        return banckList;
    }

    @Override
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")   
    public Banck getById(Integer id) {
        return iBanckService.getBanckById(id);
    }

    @Override
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Banck> add(Banck banck_) {
        Banck banck = iBanckService.saveBanck(banck_);
        return new ResponseEntity("banck create successfully", HttpStatus.OK);
    }

    @Override
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Banck> update(Integer id, Banck banck_) {
        this.iBanckService.saveBanck(banck_);
        return new ResponseEntity("Client updated successfully", HttpStatus.OK);
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Banck> delete(Integer id) {
        iBanckService.deleteBanck(id);
        return new ResponseEntity("Client deleted successfully", HttpStatus.OK);
    }

}
