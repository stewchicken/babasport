package cn.itcast.web.formdatetype.converter;

import org.apache.commons.beanutils.Converter;

import cn.itcast.bean.product.Sex;

public class SexConverter implements Converter {

	@SuppressWarnings("unchecked")
	public Object convert(Class clazz, Object value) {
		if(value==null || "".equals((String)value)) return null;
		if(value instanceof Sex) return value;
		try{
			return Sex.valueOf((String) value);
		}catch (Exception e) {}
		return null;
	}

}
