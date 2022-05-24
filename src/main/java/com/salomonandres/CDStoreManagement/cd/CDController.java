package com.salomonandres.CDStoreManagement.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/cd")
public class CDController {
    private final CDService cdService;

    @Autowired
    public CDController(CDService cdService) {
        this.cdService = cdService;
    }

    @GetMapping
    public List<CD> getCDs(){
        return cdService.getCDs();
    }

    @PostMapping
    public void addNewCD(@RequestBody CD cd){cdService.addCD(cd);
    }

    @PutMapping(path= "{cdId}")
    public void updateCD(
            @PathVariable("cdId") BigInteger cdId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) Double duration,
            @RequestParam(required = false) Integer price,
            @RequestParam(required = false) String artist,
            @RequestParam(required = false) LocalDate localDate
            ){
        cdService.updateCD(cdId,title,duration,price,artist,localDate);
    }

    @DeleteMapping(path="{cdId}")
    public void deleteCD(@PathVariable("cdId") BigInteger cdId){
        cdService.deleteCD(cdId);
    }
}
