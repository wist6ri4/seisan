package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM12_EventRelationForm;
import com.example.seisan.Repository.Entity.ET12_EventRelation;

import java.util.ArrayList;
import java.util.List;

public class MP12_EventRelationMapper {
    public List<FM12_EventRelationForm> setForm(List<ET12_EventRelation> entities) {
        List<FM12_EventRelationForm> forms = new ArrayList<>();
        for(ET12_EventRelation entity : entities) {
            FM12_EventRelationForm form = new FM12_EventRelationForm();

            // イベント連関ID
            entity.setId(form.getId());
            // イベントID
            entity.setEventId(form.getEventId());
            // イベントタグ
            entity.setEventTag(form.getEventTag());
            // 削除フラグ
            entity.setIsDeleted(form.getIsDeleted());
            // 作成日時
            entity.setCreatedDate(form.getCreatedDate());
            // 更新日時
            entity.setUpdatedDate(form.getUpdatedDate());

            forms.add(form);
        }
        return forms;
    }
}
