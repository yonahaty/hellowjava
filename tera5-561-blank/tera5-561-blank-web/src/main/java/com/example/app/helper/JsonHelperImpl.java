/**
 *
 */
package com.example.app.helper;

import com.example.app.bean.json.request.JsonSampleBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JSONヘルパー。
 *
 * @author start
 */
public class JsonHelperImpl implements JsonHelper {

    /**
     * チェックを実行する。
     */
    @Override
    public JsonSampleBean mappingObject(String json) {

        ObjectMapper mapper = new ObjectMapper();
        JsonSampleBean bean = null;

        try {
        	bean = mapper.readValue(json, JsonSampleBean.class);
        } catch (JsonMappingException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

        return bean;
    }

}
