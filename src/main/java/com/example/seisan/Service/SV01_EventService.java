package com.example.seisan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.seisan.Controller.Form.FM10_EventForm;
import com.example.seisan.Repository.DB10_EventRepository;
import com.example.seisan.Repository.DB23_MemberRepository;
import com.example.seisan.Repository.Entity.ET10_Event;
import com.example.seisan.Service.Mapper.MP10_EventMapper;

@Service
public class SV01_EventService {

    @Autowired
    DB10_EventRepository eventRepository;

    @Autowired
    DB23_MemberRepository memberRepository;

    @Autowired
    MP10_EventMapper eventMapper;

    public FM10_EventForm insert_FM10_EventForm(FM10_EventForm form) {
        ET10_Event entity = eventMapper.setEntity(form);
        FM10_EventForm resultForm = eventMapper.setForm(eventRepository.save(entity));
        return resultForm;
    }

    public FM10_EventForm update_FM10_EventForm(FM10_EventForm form) {
        ET10_Event entity = eventMapper.setEntity(form);
        FM10_EventForm resultForm = eventMapper.setForm(eventRepository.save(entity));
        return resultForm;
    }

    public FM10_EventForm delete_FM10_EventForm(FM10_EventForm form) {
        form.setIsDeleted(1);
        ET10_Event entity = eventMapper.setEntity(form);
        FM10_EventForm resultForm = eventMapper.setForm(eventRepository.save(entity));
        return resultForm;
    }

    /**
     * db10_EventのfindAllWithMemberCount
     * 
     * @return List<FM10_EventForm>
     */
    public List<FM10_EventForm> findAllWithMemberCount() {
        List<ET10_Event> events = eventRepository.findAll();
        for(ET10_Event event : events) {
            event.setMemberCount(memberRepository.countByEventId(event.getId()));
        }
        return eventMapper.setForm(events);
    }
}
