package lab.aikibo.controller;

import lab.aikibo.entity.Bio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * Created by tamami on 13/04/17.
 */
@RestController
public class AppController {

    @RequestMapping(value="/test", method= RequestMethod.POST)
    public ResponseEntity<Bio> getTest(@RequestBody String data) {
        Bio bio = new Bio(data);
        return new ResponseEntity<Bio>(bio, HttpStatus.OK);
    }

    @RequestMapping(value="/test2", method=RequestMethod.POST)
    public Bio getTest(@RequestBody Bio bio) {
        String nama = bio.getNama();
        bio.setNama("Halo " + nama);
        return bio;
    }

}
