package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM03_PaymentForm;
import com.example.seisan.Repository.Entity.ET30_Payment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * db03_paymentsのMapper
 */
public class MP03_PaymentMapper {
    /**
     * ET03_PaymentからFM03_PaymentFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public List<FM03_PaymentForm> setForm(List<ET30_Payment> entities) {
        List<FM03_PaymentForm> forms = new ArrayList<>();
        for(ET30_Payment entity : entities) {
            FM03_PaymentForm form = new FM03_PaymentForm();
            // 支払ID
            form.setId(entity.getId());
            // 支払タイトル
            form.setTitle(entity.getTitle());
            // 支払金額
            form.setAmount(entity.getAmount());
            // 支払日
            form.setDate(entity.getDate());
            // イベント
            form.setEvent(entity.getEvent());
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
     * FM03_PaymentFormからET03_Paymentにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET30_Payment setEntity(FM03_PaymentForm form) {
        ET30_Payment entity = new ET30_Payment();
        // 支払ID
        entity.setId(form.getId());
        // 支払タイトル
        entity.setTitle(form.getTitle());
        // 支払金額
        entity.setAmount(form.getAmount());
        // 支払日
        entity.setDate(form.getDate());
        // イベント
        entity.setEvent(form.getEvent());
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());
        // 作成日時
        if (form.getCreatedDate() == null) {
            entity.setCreatedDate(LocalDateTime.now());
        }
        // 更新日時
        if (form.getUpdatedDate() == null) {
            entity.setUpdatedDate(LocalDateTime.now());
        }
        return entity;
    }
}
