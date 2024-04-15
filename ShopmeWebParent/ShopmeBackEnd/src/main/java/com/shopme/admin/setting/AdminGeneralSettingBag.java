package com.shopme.admin.setting;

import java.util.List;

import com.shopme.common.entity.setting.Setting;
import com.shopme.common.entity.setting.SettingBag;

public class AdminGeneralSettingBag extends SettingBag {

	public AdminGeneralSettingBag(List<Setting> listSettings) {
		super(listSettings);
	}

	public void updateCurrencySymbol(String value) {
		super.update("CURRENCY_SYMBOL", value);
	}
	
	public void updateSiteLogo(String value) {
		super.update("SITE_LOGO", value);
	}
}
