package com.shopme.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopme.common.entity.setting.Setting;
import com.shopme.common.entity.setting.SettingCategory;

public interface AdminSettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
