package com.springframework.msscbrewery.service;

import com.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID beerId,BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
