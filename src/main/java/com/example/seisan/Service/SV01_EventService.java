package com.example.seisan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.seisan.Controller.Form.FM10_EventForm;
import com.example.seisan.Repository.DB10_EventRepository;
import com.example.seisan.Service.Mapper.MP10_EventMapper;

@Service
public class SV01_EventService {

    @Autowired
    DB10_EventRepository eventRepository;

    @Autowired
    MP10_EventMapper eventMapper;

    /**
     * db10_EventのfindAll
     * @return List<FM10_EventForm>
     */
    public List<FM10_EventForm> findAll() {
        List<FM10_EventForm> forms = eventMapper.setForm(eventRepository.findAll());
        return forms;
    }
}
