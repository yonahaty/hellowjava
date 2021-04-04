package com.example.app.bean.json.request;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * JSONマッピング用のオブジェクト。
 *
 * @author start
 */
public class JsonSampleMapBean {

	/** マップ */
	@Getter
	@Setter
	private Map<String, JsonSampleBean> sampleMap;

}
