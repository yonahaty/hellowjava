package com.example.app.bean.json.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * JSONマッピング用のオブジェクト。
 *
 * @author start
 */
public class JsonSampleBean {

	/** ID */
	@Getter
	@Setter
	@JsonProperty("ID")
	private String id;

	/** 名称 */
	@Getter
	@Setter
	@JsonProperty("name_kana")
	private String name;

}
