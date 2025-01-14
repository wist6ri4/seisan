package com.example.seisan.Service.Mapper;

import com.example.seisan.Controller.Form.FM30_PaymentForm;
import com.example.seisan.Repository.Entity.ET30_Payment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * db30_paymentsのMapper
 */
@Component
public class MP30_PaymentMapper {

    @Autowired
    MP10_EventMapper eventMapper;

    /**
     * ET30_PaymentからFM30_PaymentFormにマッピングするメソッド
     * @param entities DBから取得したEntity
     * @return マッピングしたForm
     */
    public FM30_PaymentForm setForm(ET30_Payment entity) {
        FM30_PaymentForm form = new FM30_PaymentForm();

        // 支払ID
        form.setId(entity.getPaymentId());
        // 支払タイトル
        form.setTitle(entity.getTitle());
        // 支払金額
        form.setAmount(entity.getAmount());
        // 支払日
        form.setDate(entity.getDate());
        // イベント
        form.setEventForm(eventMapper.setForm(entity.getEvent()));
        // 削除フラグ
        form.setIsDeleted(entity.getIsDeleted());
        // 作成日時
        form.setCreatedDate(entity.getCreatedDate());
        // 更新日時
        form.setUpdatedDate(entity.getUpdatedDate());

        return form;
    }

    /**
     * List<ET30_Payment>からList<FM30_PaymentForm>にマッピングするメソッド
     * @param entities DBから取得したEntityのリスト
     * @return マッピングしたFormのリスト
     */
    public List<FM30_PaymentForm> setForm(List<ET30_Payment> entities) {
        List<FM30_PaymentForm> forms = new ArrayList<>();
        for(ET30_Payment entity : entities) {
            forms.add(setForm(entity));
        }
        return forms;
    }

    /**
     * FM30_PaymentFormからET30_Paymentにマッピングするメソッド
     * @param form Serviceから取得したForm
     * @return マッピングしたEntity
     */
    public ET30_Payment setEntity(FM30_PaymentForm form) {
        ET30_Payment entity = new ET30_Payment();

        // 支払ID
        entity.setPaymentId(form.getId());
        // 支払タイトル
        entity.setTitle(form.getTitle());
        // 支払金額
        entity.setAmount(form.getAmount());
        // 支払日
        entity.setDate(form.getDate());
        // イベント
        entity.setEvent(eventMapper.setEntity(form.getEventForm()));
        // 削除フラグ
        entity.setIsDeleted(form.getIsDeleted());

        return entity;
    }
}
