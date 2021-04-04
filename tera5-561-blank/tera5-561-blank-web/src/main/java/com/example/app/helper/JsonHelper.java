/**
 *
 */
package com.example.app.helper;

import java.util.List;
import java.util.Map;

import com.example.app.bean.json.request.JsonSampleBean;
import com.example.app.bean.json.request.JsonSampleListBean;
import com.example.app.bean.json.request.JsonSampleMapBean;

/**
 * JSONヘルパー。
 *
 * @author start
 */
public interface JsonHelper {

	/**
	 * JSONをオブジェクト型にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return オブジェクト型
	 */
	Object mappingObject(String json);

	/**
	 * JSONをオブジェクト型（リスト含む）にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return オブジェクト型（リスト含む）
	 */
	JsonSampleListBean mappingListPropertyObject(String json);

	/**
	 * JSONをオブジェクト型（マップ含む）にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return オブジェクト型（マップ含む）
	 */
	JsonSampleMapBean mappingMapPropertyObject(String json);

	/**
	 * JSONをリスト<オブジェクト>型にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return リスト<オブジェクト>型
	 */
	List<JsonSampleBean> mappingObjectList(String json);

	/**
	 * JSONをマップ<String, オブジェクト>型にマッピングする。
	 *
	 * @param json JSON文字列
	 * @return マップ<String, オブジェクト>型
	 */
	Map<String, JsonSampleBean> mappingObjecMap(String json);
}
