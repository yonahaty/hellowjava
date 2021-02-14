package com.example.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTコントローラ用のサンプル。
 */
@RestController
public class MyRestController {

    private static final Logger logger = LoggerFactory
            .getLogger(MyRestController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/rest1", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        // ※最初クラス名を「RestControlelr」にしようとしたら、アノテーションのクラス名と被ってimportできなかった。

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "welcome/home";
    }

}
