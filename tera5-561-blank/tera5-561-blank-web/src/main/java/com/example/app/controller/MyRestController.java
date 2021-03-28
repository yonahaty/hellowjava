package com.example.app.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.bean.json.request.JsonSampleBean;
import com.example.app.bean.json.request.JsonSampleListBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * RESTコントローラ用のサンプル。
 */
@RestController
public class MyRestController {

    private static final Logger logger = LoggerFactory
            .getLogger(MyRestController.class);

    /**
     * RESTコントローラその１。
     *
     * @param locale ローカル情報
     * @param model リクエストのフォームとか
     * @return
     */
    @RequestMapping(value = "/rest1", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        // ※最初クラス名を「RestControlelr」にしようとしたら、アノテーションのクラス名と被ってimportできなかった。

        ObjectMapper mapper = new ObjectMapper();
        String mapString = null;
        String listString = null;
        Map<String, JsonSampleBean> map2 = null;
        JsonSampleListBean list1 = null;
        try {
            Map<String, JsonSampleBean> map = new HashMap<String, JsonSampleBean>();
            JsonSampleBean value1 = new JsonSampleBean();
            value1.setId("001");
            value1.setName("taro");
            JsonSampleBean value2 = new JsonSampleBean();
            value2.setId("002");
            value2.setName("jiro");
            map.put("key1", value1);
            map.put("key2", value2);
            mapString = mapper.writeValueAsString(map);

            List<JsonSampleBean> list2 = new ArrayList<JsonSampleBean>();
            list2.add(value1);
            list2.add(value2);
            listString = mapper.writeValueAsString(list2);

            String mapJson = "{\"key1\":{\"id\":\"001\",\"name\":\"taro\"},\"key2\":{\"id\":\"002\",\"name\":\"jiro\"}}";
            map2 = mapper.readValue(mapJson, new TypeReference<LinkedHashMap<String,JsonSampleBean>>(){});
            String listJson = "{\"sampleList\": [{\"id\": \"001\",\"name\": \"taro\"},{\"id\": \"002\",\"name\": \"jiro\"}]}";
            list1 = mapper.readValue(listJson, JsonSampleListBean.class);
            } catch (JsonProcessingException e) {
               // TODO 自動生成された catch ブロック
            	e.printStackTrace();
            }
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "welcome/home";
    }

}
