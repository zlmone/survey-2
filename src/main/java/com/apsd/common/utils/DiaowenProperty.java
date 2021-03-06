package com.apsd.common.utils;

import java.util.Properties;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * 
 * @author Perye
 *
 */
public class DiaowenProperty extends
		PropertyPlaceholderConfigurer {

	public static String DWSTORAGETYPE = null;
	public static String ACCESS_KEY_ID = null;
	public static String SECRET_ACCESS_KEY = null;
	public static String ENDPOINT = null;
	public static String STORAGE_URL_PREFIX = null;

	public static String WENJUANHTML_BACKET = null;
	public static String UPLOADFILE_BACKET = null;
	public static String UPLOADFILE_JM_BACKET = null;

//	private static Map<String, String> ctxPropertiesMap;

	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactoryToProcess,
			Properties props) throws BeansException {
		super.processProperties(beanFactoryToProcess, props);
		
		DWSTORAGETYPE = props.getProperty("dw.storage.type");
		ACCESS_KEY_ID = props.getProperty("dw.yunos.access_keyid");
		SECRET_ACCESS_KEY = props.getProperty("dw.yunos.access_keysecret");
		ENDPOINT = props.getProperty("dw.yunos.endpoint");
//		FILE_BACKET_DOMAIN = props.getProperty("dw.yunos.file_backet_domain");
		STORAGE_URL_PREFIX = props.getProperty("dw.storage.url_prefix");
		
		WENJUANHTML_BACKET = props.getProperty("dw.yunos.wenjuan_html_backet");
		UPLOADFILE_BACKET = props.getProperty("dw.yunos.upload_file_backet");
		UPLOADFILE_JM_BACKET = props.getProperty("dw.yunos.upload_file_jm_backet");
		/*
		ctxPropertiesMap = new HashMap<String, String>();
		for (Object key : props.keySet()) {
			String keyStr = key.toString();
			String value = props.getProperty(keyStr);
			ctxPropertiesMap.put(keyStr, value);
		}
		*/
	}
/*
	public static String getContextProperty(String name) {
	    return ctxPropertiesMap.get(name);
	}
*/
	public void diaowenInit(){
		System.out.println("系统初始化方法。。。");
		System.out.println(ServletActionContext.getContext());
	}

}
