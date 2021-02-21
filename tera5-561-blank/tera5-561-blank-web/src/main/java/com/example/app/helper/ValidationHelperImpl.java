/**
 *
 */
package com.example.app.helper;

import java.lang.reflect.Field;

import org.apache.commons.lang3.StringUtils;

/**
 * 単項目チェックヘルパー。
 *
 * @author start
 */
public class ValidationHelperImpl implements ValidationHelper {

	@Override
	public boolean check(Class clazz) {

		Field[] fields = clazz.getFields();
		for(Field field : fields) {
			// TODO
		}

		return true;
	}

	/**
	 * 必須チェック
	 *
	 * @param item 項目
	 * @return チェック結果（true:OK/false:NG）
	 */
	protected boolean isRequired(String item) {
		if(StringUtils.isEmpty(item)) {
			return true;
		}
		return false;
	}
}
