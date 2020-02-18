package com.talent.service;

import com.talent.entity.business;
import com.talent.entity.experience;
import com.talent.entity.staff;
import com.talent.mapper.experienceMapper;
import com.talent.mapper.staffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class foregroService {
    @Autowired
    private experienceMapper experiencemapper;
    @Autowired
    private staffMapper staffmapper;

    public List<experience> listalbum()
    {
        return experiencemapper.listalbum();
    }
    public List<experience> listallpublic() { return experiencemapper.listallpublic(); }
    public staff stafflogin (String username, String password){ return staffmapper.stafflogin(username, password); }

}
