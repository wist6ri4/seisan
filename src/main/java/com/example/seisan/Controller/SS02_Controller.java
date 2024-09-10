package com.example.seisan.Controller;

import com.example.seisan.Const.ViewName;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SS02グローバルメンバー一覧画面のコントローラークラス
 */
@Controller
@RequestMapping("/SS02")
public class SS02_Controller {

    /**
     * 画面初期表示
     * @return 画面ModelAndView
     */
    @GetMapping
    public ModelAndView loadView() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SS02V.getViewName());
        return mav;
    }

    /**
     * SM07V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("/SM07V")
    private ModelAndView loadSM07V() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SM07V.getViewName());
        return mav;
    }

    /**
     * SM08V初期表示
     * @return 画面ModelAndView
     */
    @GetMapping("SM08V")
    private ModelAndView loadSM08V() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName(ViewName.SM08V.getViewName());
        return mav;
    }
}
