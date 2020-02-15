package com.talent.service;

import com.talent.entity.experience;
import com.talent.mapper.experienceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class foregroService {
    @Autowired
    private experienceMapper experiencemapper;
    public List<experience> listalbum()
    {
        return experiencemapper.listalbum();
    }
}
