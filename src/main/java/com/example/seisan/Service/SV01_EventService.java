package com.example.seisan.Service;

import java.util.List;

import com.example.seisan.Controller.Form.FM10_EventForm;
import com.example.seisan.Controller.Form.FM11_EventTagForm;
import com.example.seisan.Controller.Form.FM12_EventRelationForm;

public interface SV01_EventService {

    /**
     * FM10_EventFormのinsert
     * @param form
     * @return resultEventForm
     */
    public FM10_EventForm insert_FM10_EventForm(FM10_EventForm form);

    /**
     * FM10_EventFormのupdate
     * @param form
     * @return resultEventForm
     */
    public FM10_EventForm update_FM10_EventForm(FM10_EventForm form);

    /**
     * FM10_EventFormのdelete
     * @param form
     * @return resultEventForm
     */
    public FM10_EventForm delete_FM10_EventForm(FM10_EventForm form);

    /**
     * FM11_EventTagFormのinsert
     * @param form
     * @return resultEventTagForm
     */
    public FM11_EventTagForm insert_FM11_EventTagForm(FM11_EventTagForm form);

    /**
     * FM11_EventTagFormのupdate
     * @param form
     * @return resultEventTagForm
     */
    public FM11_EventTagForm update_FM11_EventTagForm(FM11_EventTagForm form);

    /**
     * FM11_EventTagFormのdelete
     * @param form
     * @return resultEventTagForm
     */
    public FM11_EventTagForm delete_FM11_EventTagForm(FM11_EventTagForm form);

    /**
     * FM12_EventRelationFormのinsert
     * @param form
     * @return resultEventRelationForm
     */
    public FM12_EventRelationForm insert_FM12_EventRelationForm(FM12_EventRelationForm form);

    /**
     * FM12_EventRelationFormのupdate
     * @param form
     * @return resultEventRelationForm
     */
    public FM12_EventRelationForm update_FM12_EventRelationForm(FM12_EventRelationForm form);

    /**
     * FM12_EventRelationFormのdelete
     * @param form
     * @return resultEventRelationForm
     */
    public FM12_EventRelationForm delete_FM12_EventRelationForm(FM12_EventRelationForm form);

    /**
     * db10_EventのfindAllWithMemberCount
     * @return List<FM10_EventForm>
     */
    public List<FM10_EventForm> findAllWithMemberCount();
}
