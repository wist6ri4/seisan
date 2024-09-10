package com.example.seisan.Controller;

import com.example.seisan.Const.ViewName;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SS03グローバルメンバータグ一覧画面のコントローラークラス
 */
@Controller
@RequestMapping("/SS03")
public class SS03_Controller {

    /**
     * 画面初期表示
     * @return 画面ModelAndView
     */
    @GetMapping
    public ModelAndView loadView() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SS03V.getViewName());
        return mav;
    }

    /**
     * SM09V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM09V")
    private ModelAndView loadSM09V() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SM09V.getViewName());
        return mav;
    }

    /**
     * SM10V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM10V")
    private ModelAndView loadSM10V() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SM10V.getViewName());
        return mav;
    }
}
