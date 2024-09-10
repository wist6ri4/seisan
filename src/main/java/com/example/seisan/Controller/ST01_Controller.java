package com.example.seisan.Controller;

import com.example.seisan.Const.ViewName;
import com.example.seisan.Controller.Form.FM10_EventForm;
import com.example.seisan.Service.SV01_EventService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ST01トップ画面のコントローラークラス
 */
@Controller
@RequestMapping("/ST01")
public class ST01_Controller {

    @Autowired
    SV01_EventService eventService;

    /**
     * 画面初期表示
     * @return 画面ModelAndView
     */
    @GetMapping
    public ModelAndView loadView() {
        ModelAndView mav = new ModelAndView();

        List<FM10_EventForm> events = eventService.findAll();

        mav.setViewName(ViewName.ST01V.getViewName());
        mav.addObject("events", events);
        return mav;
    }

    /**
     * SM01V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM01V")
    private ModelAndView loadSM01V() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ViewName.SM01V.getViewName());
        return mav;
    }

    /**
     * SM02V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM02V")
    private ModelAndView loadSM02V() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ViewName.SM02V.getViewName());
        return mav;
    }
}
