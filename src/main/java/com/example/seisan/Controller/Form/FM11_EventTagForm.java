package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

/**
 * db11_events_tagsのForm
 */
@Getter
@Setter
public class FM11_EventTagForm extends  FM00_CommonForm {
    // イベントタグ名
    private String tagName;
    
    // 色
    private String color;
}
