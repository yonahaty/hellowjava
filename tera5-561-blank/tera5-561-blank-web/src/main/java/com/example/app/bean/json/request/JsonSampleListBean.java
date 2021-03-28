package com.example.app.bean.json.request;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * JSONマッピング用のオブジェクト。
 *
 * @author start
 */
public class JsonSampleListBean {

	/** ID */
	@Getter
	@Setter
	private List<JsonSampleBean> sampleList;

}
