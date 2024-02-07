package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM04_PayerForm;
import com.example.seisan.Repository.Entity.ET04_Payer;

import java.util.ArrayList;
import java.util.List;

/**
 * db04_payersのMapper
 */
public class MP04_PayerMapper {
    /**
     * ET04_PayerからFM04_PayerFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM04_PayerForm> setForm(List<ET04_Payer> entities) {
        List<FM04_PayerForm> forms = new ArrayList<>();
        for(ET04_Payer entity : entities) {
            FM04_PayerForm form = new FM04_PayerForm();
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
     * FM04_PaymentFormからET04_Payerにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET04_Payer setEntity(FM04_PayerForm form) {
        ET04_Payer entity = new ET04_Payer();
        // 支払者ID
        entity.setId(form.getId());
        // 支払
        entity.setPayment(form.getPayment());
        // メンバー
        entity.setMember(form.getMember());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());
        // 作成日時
        if(form.getCreatedDate() == null) {
            entity.setCreatedDate(form.getCreatedDate());
        }
        // 更新日時
        if(form.getUpdatedDate() == null) {
            entity.setUpdatedDate(form.getUpdatedDate());
        }
        return entity;
    }
}
