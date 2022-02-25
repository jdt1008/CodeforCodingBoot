
package project.controller;


import java.io.FileInputStream;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import project.service.UserService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@RestController
public class InvoiceController {

	@GetMapping("/pdf")
	public String generatePdf() throws Exception, JRException {
		
		JRBeanCollectionDataSource beanCollectionDataSource=new JRBeanCollectionDataSource(
				UserService.generateUserList());
		JasperReport compileReport = JasperCompileManager
				.compileReport(new FileInputStream("src/main/resources/invoice.jrxml"));
		
		HashMap<String, Object> map=new HashMap<>();
		JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
		JasperExportManager.exportReportToPdfFile(report, "invoice.pdf");
		
		return "generated";
		
	}
}
