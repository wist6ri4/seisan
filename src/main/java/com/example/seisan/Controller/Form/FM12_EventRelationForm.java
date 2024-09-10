package com.example.seisan.Controller.Form;

import lombok.Getter;
import lombok.Setter;

/**
 * db12_events_relationsのForm
 */
@Getter
@Setter
public class FM12_EventRelationForm extends FM00_CommonForm {
    // イベントID
    private Integer eventId;

    // イベントタグ
    private FM11_EventTagForm eventTagForm;
}
