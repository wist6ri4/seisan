package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM12_EventRelationForm;
import com.example.seisan.Repository.Entity.ET12_EventRelation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * db12_events_relationsのMapper
 */
@Component
public class MP12_EventRelationMapper {

    @Autowired MP11_EventTagMapper eventTagMapper;

    /**
     * ET12_EventRelationからFM12_EventRelationFormにマッピングするメソッド
     * @param entity DBから取得したEntity
     * @return マッピングしたForm
     */
    public FM12_EventRelationForm setForm(ET12_EventRelation entity) {
        FM12_EventRelationForm form = new FM12_EventRelationForm();

        // イベント連関ID
        form.setId(entity.getId());
        // イベントID
        form.setEventId(entity.getEventId());
        // イベントタグ
        form.setEventTagForm(eventTagMapper.setForm(entity.getEventTag()));
        // 削除フラグ
        form.setIsDeleted(entity.getIsDeleted());
        // 作成日時
        form.setCreatedDate(entity.getCreatedDate());
        // 更新日時
        form.setUpdatedDate(entity.getUpdatedDate());

        return form;
    }

    /**
     * List<ET12_EventRelation>からList<FM12_EventRelationForm>にマッピングするメソッド
     * @param entity DBから取得したEntityのリスト
     * @return マッピングしたFormのリスト
     */
    public List<FM12_EventRelationForm> setForm(List<ET12_EventRelation> entities) {
        List<FM12_EventRelationForm> forms = new ArrayList<>();
        for(ET12_EventRelation entity : entities) {
            forms.add(setForm(entity));
        }
        return forms;
    }

    /**
     * FM12_EventRelationFormからET12_EventRelationにマッピングするメソッド
     * @param form Serviceから取得したform
     * @return マッピングしたentity
     */
    public ET12_EventRelation setEntity(FM12_EventRelationForm form) {
        ET12_EventRelation entity = new ET12_EventRelation();

        // イベント連関ID
        entity.setId(form.getId());
        // イベントID
        entity.setEventId(form.getEventId());
        // イベントタグ
        entity.setEventTag(eventTagMapper.setEntity(form.getEventTagForm()));
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
