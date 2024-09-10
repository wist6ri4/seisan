package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM10_EventForm;
import com.example.seisan.Repository.Entity.ET10_Event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * db10_eventsのMapper
 */
@Component
public class MP10_EventMapper {

    @Autowired
    MP12_EventRelationMapper eventRelationMapper;

    /**
     * ET10_EventからFM10_EventFormにマッピングするメソッド
     * @param entity DBから取得したEntity
     * @return マッピングしたForm
     */
    public FM10_EventForm setForm(ET10_Event entity) {
        FM10_EventForm form = new FM10_EventForm();

        // イベントID
        form.setId(entity.getId());
        // イベントタイトル
        form.setTitle(entity.getTitle());
        // イベント概要
        form.setDescription(entity.getDescription());
        // 日付
        form.setDate(entity.getDate());
        // Notionリンク
        form.setNotionLink(entity.getNotionLink());
        // 削除フラグ
        form.setIsDeleted(entity.getIsDeleted());
        // 作成日時
        form.setCreatedDate(entity.getCreatedDate());
        // 更新日時
        form.setCreatedDate(entity.getUpdatedDate());
        // イベントタグ
        form.setEventRelationForms(eventRelationMapper.setForm(entity.getEventRelations()));

        return form;
    }

    /**
     * List<ET10_Event>からList<FM10_EventForm>にマッピングするメソッド
     * @param entities DBから取得したEntityのリスト
     * @return マッピングしたFormのリスト
     */
    public List<FM10_EventForm> setForm(List<ET10_Event> entities) {
        List<FM10_EventForm> forms = new ArrayList<>();
        for(ET10_Event entity : entities) {
            forms.add(setForm(entity));
        }
        return forms;
    }

    /**
     * FM10_EventFormからET10_Eventにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET10_Event setEntity(FM10_EventForm form) {
        ET10_Event entity = new ET10_Event();

        // イベントID
        entity.setId(form.getId());
        // イベントタイトル
        entity.setTitle(form.getTitle());
        // イベント概要
        entity.setDescription(form.getDescription());
        // 日付
        entity.setDate(form.getDate());
        // Notionリンク
        entity.setNotionLink(form.getNotionLink());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }

}
