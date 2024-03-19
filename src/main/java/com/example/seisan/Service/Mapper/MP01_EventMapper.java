package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM10_EventForm;
import com.example.seisan.Repository.Entity.ET10_Event;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * db01_eventsのMapper
 */
public class MP01_EventMapper {
    /**
     * ET01_EventからFM01_EventFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM10_EventForm> setForm(List<ET10_Event> entities) {
        List<FM10_EventForm> forms = new ArrayList<>();
        for(ET10_Event entity : entities) {
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

            forms.add(form);
        }
        return forms;
    }

    /**
     * FM01_EventFormからET01_Eventにマッピングするメソッド
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
        // 作成日時
        if(form.getCreatedDate() == null) {
            entity.setCreatedDate(LocalDateTime.now());
        }
        // 更新日時
        if(form.getUpdatedDate() == null) {
            entity.setUpdatedDate(LocalDateTime.now());
        }
        return entity;
    }

}
