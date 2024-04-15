package com.shopme.admin.user.export;

import java.util.List;

import org.supercsv.prefs.CsvPreference;

import com.shopme.admin.AdminAbstractExporter;
import com.shopme.common.entity.User;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;


import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserCsvExporter extends AdminAbstractExporter {

	public void export(List<User> listUsers,HttpServletResponse response) throws IOException {
	super.setResponseHeader(response,"text/csv",".csv","users_");
		ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),CsvPreference.STANDARD_PREFERENCE);
		

		String[] csvHeader = {"User ID", "E-mail", "First Name", "Last Name", "Roles", "Enabled"};
		String[] fieldMapping = {"id", "email", "firstName", "lastName", "roles", "enabled"};
		
		csvWriter.writeHeader(csvHeader);
		
		for (User user : listUsers) {
			csvWriter.write(user, fieldMapping);
		}
		
		csvWriter.close();
	}
}
