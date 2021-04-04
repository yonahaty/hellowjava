/**
 *
 */
package com.example.app.helper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.app.bean.json.request.JsonSampleBean;
import com.example.app.bean.json.request.JsonSampleListBean;
import com.example.app.bean.json.request.JsonSampleMapBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JSONヘルパー。
 *
 * @author start
 */
@Component
public class JsonHelperImpl implements JsonHelper {

	/**
	 * JSONをオブジェクト型にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return オブジェクト型
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

	/**
	 * JSONをオブジェクト型（リスト含む）にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return オブジェクト型（リスト含む）
	 */
	@Override
	public JsonSampleListBean mappingListPropertyObject(String json) {

		ObjectMapper mapper = new ObjectMapper();
		JsonSampleListBean bean = null;

		try {
			bean = mapper.readValue(json, JsonSampleListBean.class);
		} catch (JsonMappingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return bean;
	}

	/**
	 * JSONをオブジェクト型（マップ含む）にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return オブジェクト型（マップ含む）
	 */
	@Override
	public JsonSampleMapBean mappingMapPropertyObject(String json) {

		ObjectMapper mapper = new ObjectMapper();
		JsonSampleMapBean bean = null;

		try {
			bean = mapper.readValue(json, JsonSampleMapBean.class);
		} catch (JsonMappingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return bean;
	}

	/**
	 * JSONをリスト<オブジェクト>型にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return リスト<オブジェクト>型
	 */
	@Override
	public List<JsonSampleBean> mappingObjectList(String json) {

		ObjectMapper mapper = new ObjectMapper();
		List<JsonSampleBean> beanList = null;

		try {
			beanList = mapper.readValue(json, new TypeReference<List<JsonSampleBean>>() {
			});
		} catch (JsonMappingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return beanList;
	}

	/**
	 * JSONをマップ<String, オブジェクト>型にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return マップ<String, オブジェクト>型
	 */
	@Override
	public Map<String, JsonSampleBean> mappingObjecMap(String json) {

		ObjectMapper mapper = new ObjectMapper();
		Map<String, JsonSampleBean> map = null;

		try {
			map = mapper.readValue(json, new TypeReference<LinkedHashMap<String, JsonSampleBean>>() {
			});

		} catch (JsonMappingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return map;
	}
}
