package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM11_EventTagForm;
import com.example.seisan.Repository.Entity.ET11_EventTag;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * db11_events_tagsのMapper
 */
@Component
public class MP11_EventTagMapper {
    /**
     * ET11_EventTagからFM11_EventTagFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public FM11_EventTagForm setForm(ET11_EventTag entity) {
        FM11_EventTagForm form = new FM11_EventTagForm();

        // イベントタグID
        form.setId(entity.getId());
        // イベントタグ名
        form.setTagName(entity.getTagName());
        // 色
        form.setColor(entity.getColor());
        // 削除フラグ
        form.setIsDeleted(entity.getIsDeleted());
        // 作成日時
        form.setCreatedDate(entity.getCreatedDate());
        // 更新日時
        form.setUpdatedDate(entity.getUpdatedDate());

        return form;
    }

    /**
     * List<ET11_EventTag>からList<FM11_EventTagForm>にマッピングするメソッド
     * @param entities DBから取得したEntityのリスト
     * @return マッピングしたFormのリスト
     */
    public List<FM11_EventTagForm> setForm(List<ET11_EventTag> entities) {
        List<FM11_EventTagForm> forms = new ArrayList<>();
        for(ET11_EventTag entity : entities) {
            forms.add(setForm(entity));
        }
        return forms;
    }

    /**
     * FM11_EventTagFormからET11_EventTagにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET11_EventTag setEntity(FM11_EventTagForm form) {
        ET11_EventTag entity = new ET11_EventTag();

        // イベントタグID
        entity.setId(form.getId());
        // イベントタグ名
        entity.setTagName(form.getTagName());
        // 色
        entity.setColor(form.getColor());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
