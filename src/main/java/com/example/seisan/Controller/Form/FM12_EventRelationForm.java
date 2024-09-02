package com.example.seisan.Controller.Form;

import com.example.seisan.Repository.Entity.ET11_EventTag;
import lombok.Getter;
import lombok.Setter;

/**
 * db12_EventRelationのForm
 */
@Getter
@Setter
public class FM12_EventRelationForm extends FM00_CommonForm {
    // イベントID
    private Integer eventId;
    // イベントタグ
    private ET11_EventTag eventTag;
}
