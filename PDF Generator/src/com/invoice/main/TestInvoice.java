package com.invoice.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.invoice.model.Invoice;
import com.invoice.model.TaxDescription;
import com.invoice.model.Transaction;
import com.itextpdf.text.DocumentException;

public class TestInvoice {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		
		List<Transaction> tList=new ArrayList<Transaction>();
		Transaction transaction=new Transaction("125.S.S Big Jewellery Box.", "7326", 18.00F, 30, 350.00F, "pc", 10500.00F);
		tList.add(transaction);
		List<TaxDescription> taxList=new ArrayList<TaxDescription>();
		TaxDescription taxDescription =new TaxDescription("7326", 10500.0F, 18.00F, 1890.00F);
		taxList.add(taxDescription);
		
		Invoice invoice =new Invoice("KDHA/0108/17-18", "1-Aug-2017", "1- Cartoon", "", "KDHA/0108/17-18", " ", " ", "1-Aug-2017", "VRL Transport", "Kundapur", "Komal Trading Corporation", "komal@vsnl.com", "27AABPB6207H1Z6", "AABPB6207H", "HDFC BANK", "01452560000971", "Borivali West & HDFC0000145", "Nakshatra Jewellers", "Jk Tower Shastri Circle,", "Kundapur", "Karnataka", "Karnataka", "29ABQPH2220Q1Z7", 1890.00F, 30, 12390.00F, 10500.00F, 1890.00F, tList, taxList);
		GeneratePdf.genearatePDF(invoice);

	}

}
