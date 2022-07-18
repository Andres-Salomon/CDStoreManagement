package com.salomonandres.CDStoreManagement.cd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CDService {

    private final CDRepository cdRepository;

    @Autowired
    public CDService(CDRepository cdRepository) {
        this.cdRepository = cdRepository;
    }

    public List<CD> getCDs(){
        return cdRepository.findAll();
    }

    public void addCD(CD cd) {
        Optional<CD> cdByTitle = cdRepository.findCDByTitle(cd.getTitle());
        if(cdByTitle.isPresent()){
            throw new IllegalStateException("CD with that title already exists");
        }
        cdRepository.save(cd);
    }

    @Transactional
    public void updateCD(BigInteger cdId, String title, Double duration,Integer price,String artist,LocalDate date) {
        CD cd = cdRepository.findById(cdId).orElseThrow(()->
                new IllegalStateException("CD with id"+ cdId+" not found"));

        if(duration!=null && duration>0 && !Objects.equals(cd.getDuration(),duration)){
            cd.setDuration(duration);
        }

        if(price!=null && price>0 && !Objects.equals(cd.getPrice(),price)){
            cd.setPrice(price);
        }

        if(date!=null && date.getDayOfYear()>1982 && !Objects.equals(cd.getReleaseDate(),date)){
            cd.setReleaseDate(date);
        }

        if(title!=null && title.length()>0 && !Objects.equals(cd.getTitle(),title)){
            cd.setTitle(title);
        }
    }

    public void deleteCD(BigInteger cdId) {
        boolean exists = cdRepository.existsById(cdId);
        if(!exists){
            throw new IllegalStateException("CD with that Id does not exist");
        }
        cdRepository.deleteById(cdId);
    }
}
