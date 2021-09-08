package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    //This is the painpoint where we have to manually create a object of repo class and we have hardcoded the reference of HibernateSpeakerRepositoryImpl object , if we make any changes we need to rebuild the entire application .
    // We should reduce Configuration code from our application
    // cause configuration code is brittle (hard to move to diff env)
    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll(){
         return speakerRepository.findAll();
    }
}
