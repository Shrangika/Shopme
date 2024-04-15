package com.shopme.admin.setting.country;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shopme.common.entity.Country;

public interface AdminCountryRepository extends CrudRepository<Country, Integer> {
	public List<Country> findAllByOrderByNameAsc();
}