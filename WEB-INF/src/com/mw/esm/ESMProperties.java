package com.mw.esm;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ESMProperties {
	private static final String BUNDLE_NAME = "resources.esm"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private ESMProperties() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
	
	public static String getTrimmedString(String key) {
		return getString(key).trim();
	}
}
