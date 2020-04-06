package com.laowang.sptest.common.base.ext;

import com.laowang.sptest.common.base.BaseModel;

public interface BaseExtService<E extends BaseModel> {
	/**
	 * 验证对象
	 */
	void verification(E model);
}