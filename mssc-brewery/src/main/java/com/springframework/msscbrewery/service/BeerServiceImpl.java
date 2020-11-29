package com.springframework.msscbrewery.service;

import com.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Art")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId,BeerDto beerDto) {
        //update Beer for beerId
        log.debug("Beer updated for id: "+beerId);
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Beer deleted for id: "+beerId);
    }
}
