package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM24_PayerForm;
import com.example.seisan.Repository.Entity.ET24_Payer;

import java.util.ArrayList;
import java.util.List;

/**
 * db24_payersのMapper
 */
public class MP24_PayerMapper {
    /**
     * ET24_PayerからFM24_PayerFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM24_PayerForm> setForm(List<ET24_Payer> entities) {
        List<FM24_PayerForm> forms = new ArrayList<>();
        for(ET24_Payer entity : entities) {
            FM24_PayerForm form = new FM24_PayerForm();

            // 支払者ID
            form.setId(entity.getId());
            // 支払
            form.setPayment(entity.getPayment());
            // メンバー
            form.setMember(entity.getMember());
            // 削除フラグ
            form.setIsDeleted(entity.getIsDeleted());
            // 作成日時
            form.setCreatedDate(entity.getCreatedDate());
            // 更新日時
            form.setUpdatedDate(entity.getUpdatedDate());

            forms.add(form);
        }
        return forms;
    }

    /**
     * FM24_PayerFormからET24_Payerにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET24_Payer setEntity(FM24_PayerForm form) {
        ET24_Payer entity = new ET24_Payer();

        // 支払者ID
        entity.setId(form.getId());
        // 支払
        entity.setPayment(form.getPayment());
        // メンバー
        entity.setMember(form.getMember());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
