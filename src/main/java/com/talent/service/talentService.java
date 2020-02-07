package com.talent.service;


import com.talent.mapper.talentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class talentService {

    @Autowired
    private talentMapper talentmapper;

}
