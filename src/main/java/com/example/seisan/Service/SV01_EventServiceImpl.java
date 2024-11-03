package com.example.seisan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.seisan.Const.Const;
import com.example.seisan.Controller.Form.FM10_EventForm;
import com.example.seisan.Controller.Form.FM11_EventTagForm;
import com.example.seisan.Controller.Form.FM12_EventRelationForm;
import com.example.seisan.Repository.DB10_EventRepository;
import com.example.seisan.Repository.DB11_EventTagRepository;
import com.example.seisan.Repository.DB12_EventRelationRepository;
import com.example.seisan.Repository.DB23_MemberRepository;
import com.example.seisan.Repository.Entity.ET10_Event;
import com.example.seisan.Repository.Entity.ET11_EventTag;
import com.example.seisan.Repository.Entity.ET12_EventRelation;
import com.example.seisan.Service.Mapper.MP10_EventMapper;
import com.example.seisan.Service.Mapper.MP11_EventTagMapper;
import com.example.seisan.Service.Mapper.MP12_EventRelationMapper;

@Service
public class SV01_EventServiceImpl implements SV01_EventService {

    @Autowired DB10_EventRepository db10_EventRepository;
    @Autowired DB11_EventTagRepository db11_EventTagRepository;
    @Autowired DB12_EventRelationRepository db12_EventRelationRepository;
    @Autowired DB23_MemberRepository db23_MemberRepository;
    @Autowired MP10_EventMapper mp10_EventMapper;
    @Autowired MP11_EventTagMapper mp11_EventTagMapper;
    @Autowired MP12_EventRelationMapper mp12_EventRelationMapper;

    /**
     * FM10_EventFormのinsert
     * @param form
     * @return resultEventForm
     */
    @Override
    public FM10_EventForm insert_FM10_EventForm(FM10_EventForm form) {
        ET10_Event entity = mp10_EventMapper.setEntity(form);
        FM10_EventForm resultEventForm = mp10_EventMapper.setForm(db10_EventRepository.save(entity));
        return resultEventForm;
    }

    /**
     * FM10_EventFormのupdate
     * @param form
     * @return resultEventForm
     */
    @Override
    public FM10_EventForm update_FM10_EventForm(FM10_EventForm form) {
        ET10_Event entity = mp10_EventMapper.setEntity(form);
        FM10_EventForm resultEventForm = mp10_EventMapper.setForm(db10_EventRepository.save(entity));
        return resultEventForm;
    }

    /**
     * FM10_EventFormのdelete
     * @param form
     * @return resultEventForm
     */
    @Override
    public FM10_EventForm delete_FM10_EventForm(FM10_EventForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET10_Event entity = mp10_EventMapper.setEntity(form);
        FM10_EventForm resultEventForm = mp10_EventMapper.setForm(db10_EventRepository.save(entity));
        return resultEventForm;
    }

    /**
     * FM11_EventTagFormのinsert
     * @param form
     * @return resultEventTagForm
     */
    @Override
    public FM11_EventTagForm insert_FM11_EventTagForm(FM11_EventTagForm form) {
        ET11_EventTag entity = mp11_EventTagMapper.setEntity(form);
        FM11_EventTagForm resultEventTagForm = mp11_EventTagMapper.setForm(db11_EventTagRepository.save(entity));
        return resultEventTagForm;
    };

    /**
     * FM11_EventTagFormのupdate
     * @param form
     * @return resultEventTagForm
     */
    @Override
    public FM11_EventTagForm update_FM11_EventTagForm(FM11_EventTagForm form) {
        ET11_EventTag entity = mp11_EventTagMapper.setEntity(form);
        FM11_EventTagForm resultEventTagForm = mp11_EventTagMapper.setForm(db11_EventTagRepository.save(entity));
        return resultEventTagForm;
    };

    /**
     * FM11_EventTagFormのdelete
     * @param form
     * @return resultEventTagForm
     */
    @Override
    public FM11_EventTagForm delete_FM11_EventTagForm(FM11_EventTagForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET11_EventTag entity = mp11_EventTagMapper.setEntity(form);
        FM11_EventTagForm resultEventTagForm = mp11_EventTagMapper.setForm(db11_EventTagRepository.save(entity));
        return resultEventTagForm;
    };

    /**
     * FM12_EventRelationFormのinsert
     * @param form
     * @return resultEventRelationForm
     */
    @Override
    public FM12_EventRelationForm insert_FM12_EventRelationForm(FM12_EventRelationForm form) {
        ET12_EventRelation entity = mp12_EventRelationMapper.setEntity(form);
        FM12_EventRelationForm resultEventRelationForm = mp12_EventRelationMapper.setForm(db12_EventRelationRepository.save(entity));
        return resultEventRelationForm;
    };

    /**
     * FM12_EventRelationFormのupdate
     * @param form
     * @return resultEventRelationForm
     */
    @Override
    public FM12_EventRelationForm update_FM12_EventRelationForm(FM12_EventRelationForm form){
        ET12_EventRelation entity = mp12_EventRelationMapper.setEntity(form);
        FM12_EventRelationForm resultEventRelationForm = mp12_EventRelationMapper.setForm(db12_EventRelationRepository.save(entity));
        return resultEventRelationForm;
    };

    /**
     * FM12_EventRelationFormのdelete
     * @param form
     * @return resultEventRelationForm
     */
    @Override
    public FM12_EventRelationForm delete_FM12_EventRelationForm(FM12_EventRelationForm form) {
        form.setIsDeleted(Const.IS_DELETED);
        ET12_EventRelation entity = mp12_EventRelationMapper.setEntity(form);
        FM12_EventRelationForm resultEventRelationForm = mp12_EventRelationMapper.setForm(db12_EventRelationRepository.save(entity));
        return resultEventRelationForm;
    };

    /**
     * db10_EventのfindAllWithMemberCount
     * @return List<FM10_EventForm>
     */
    @Override
    public List<FM10_EventForm> findAllWithMemberCount() {
        List<ET10_Event> events = db10_EventRepository.findAll();
        for(ET10_Event event : events) {
            event.setMemberCount(db23_MemberRepository.countByEventId(event.getId()));
        }
        return mp10_EventMapper.setForm(events);
    }
}
