package com.invoice.model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
private String invoiceNo;
private String invoiceDate;
private String deliveryNote;
private String mode_TermsPayment;
private String supplierRef;
private String otherRef;
private String dispDocumentNo;
private String deliveryNoteDate;
private String dispatchedThrough;
private String destination;
private String companyName;
private String companyEmail;
private String companyGstinUin;
private String companyPanNo;
private String companyBankName;
private String companyAcno;
private String companyBranchIfscCode;
private String buyerName;
private String buyerStreetAddress;
private String buyerCity;
private String buyerDistrict;
private String buyerState;
private String buyerGstinUin;
private float iGstAmount;
private int totalQuantity;
private float totalChargableAmount;
private float totalTaxableValue;
private float totalTaxAmount;

private List<Transaction> transactionList=new ArrayList<Transaction>();
private List<TaxDescription> taxDescription=new ArrayList<TaxDescription>();

public Invoice(String invoiceNo, String invoiceDate, String deliveryNote, String mode_TermsPayment, String supplierRef,
		String otherRef, String dispDocumentNo, String deliveryNoteDate, String dispatchedThrough, String destination,
		String companyName, String companyEmail, String companyGstinUin, String companyPanNo, String companyBankName,
		String companyAcno, String companyBranchIfscCode, String buyerName, String buyerStreetAddress, String buyerCity,
		String buyerDistrict, String buyerState, String buyerGstinUin, float iGstAmount, int totalQuantity,
		float totalChargableAmount, float totalTaxableValue, float totalTaxAmount, List<Transaction> transactionList,
		List<TaxDescription> taxDescription) {
	super();
	this.invoiceNo = invoiceNo;
	this.invoiceDate = invoiceDate;
	this.deliveryNote = deliveryNote;
	this.mode_TermsPayment = mode_TermsPayment;
	this.supplierRef = supplierRef;
	this.otherRef = otherRef;
	this.dispDocumentNo = dispDocumentNo;
	this.deliveryNoteDate = deliveryNoteDate;
	this.dispatchedThrough = dispatchedThrough;
	this.destination = destination;
	this.companyName = companyName;
	this.companyEmail = companyEmail;
	this.companyGstinUin = companyGstinUin;
	this.companyPanNo = companyPanNo;
	this.companyBankName = companyBankName;
	this.companyAcno = companyAcno;
	this.companyBranchIfscCode = companyBranchIfscCode;
	this.buyerName = buyerName;
	this.buyerStreetAddress = buyerStreetAddress;
	this.buyerCity = buyerCity;
	this.buyerDistrict = buyerDistrict;
	this.buyerState = buyerState;
	this.buyerGstinUin = buyerGstinUin;
	this.iGstAmount = iGstAmount;
	this.totalQuantity = totalQuantity;
	this.totalChargableAmount = totalChargableAmount;
	this.totalTaxableValue = totalTaxableValue;
	this.totalTaxAmount = totalTaxAmount;
	this.transactionList = transactionList;
	this.taxDescription = taxDescription;
}
public String getInvoiceNo() {
	return invoiceNo;
}
public void setInvoiceNo(String invoiceNo) {
	this.invoiceNo = invoiceNo;
}
public String getInvoiceDate() {
	return invoiceDate;
}
public void setInvoiceDate(String invoiceDate) {
	this.invoiceDate = invoiceDate;
}
public String getDeliveryNote() {
	return deliveryNote;
}
public void setDeliveryNote(String deliveryNote) {
	this.deliveryNote = deliveryNote;
}
public String getMode_TermsPayment() {
	return mode_TermsPayment;
}
public void setMode_TermsPayment(String mode_TermsPayment) {
	this.mode_TermsPayment = mode_TermsPayment;
}
public String getSupplierRef() {
	return supplierRef;
}
public void setSupplierRef(String supplierRef) {
	this.supplierRef = supplierRef;
}
public String getOtherRef() {
	return otherRef;
}
public void setOtherRef(String otherRef) {
	this.otherRef = otherRef;
}
public String getDispDocumentNo() {
	return dispDocumentNo;
}
public void setDispDocumentNo(String dispDocumentNo) {
	this.dispDocumentNo = dispDocumentNo;
}
public String getDeliveryNoteDate() {
	return deliveryNoteDate;
}
public void setDeliveryNoteDate(String deliveryNoteDate) {
	this.deliveryNoteDate = deliveryNoteDate;
}
public String getDispatchedThrough() {
	return dispatchedThrough;
}
public void setDispatchedThrough(String dispatchedThrough) {
	this.dispatchedThrough = dispatchedThrough;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getCompanyEmail() {
	return companyEmail;
}
public void setCompanyEmail(String companyEmail) {
	this.companyEmail = companyEmail;
}
public String getCompanyGstinUin() {
	return companyGstinUin;
}
public void setCompanyGstinUin(String companyGstinUin) {
	this.companyGstinUin = companyGstinUin;
}
public String getCompanyPanNo() {
	return companyPanNo;
}
public void setCompanyPanNo(String companyPanNo) {
	this.companyPanNo = companyPanNo;
}
public String getCompanyBankName() {
	return companyBankName;
}
public void setCompanyBankName(String companyBankName) {
	this.companyBankName = companyBankName;
}
public String getCompanyAcno() {
	return companyAcno;
}
public void setCompanyAcno(String companyAcno) {
	this.companyAcno = companyAcno;
}
public String getCompanyBranchIfscCode() {
	return companyBranchIfscCode;
}
public void setCompanyBranchIfscCode(String companyBranchIfscCode) {
	this.companyBranchIfscCode = companyBranchIfscCode;
}
public String getBuyerName() {
	return buyerName;
}
public void setBuyerName(String buyerName) {
	this.buyerName = buyerName;
}
public String getBuyerStreetAddress() {
	return buyerStreetAddress;
}
public void setBuyerStreetAddress(String buyerStreetAddress) {
	this.buyerStreetAddress = buyerStreetAddress;
}
public String getBuyerCity() {
	return buyerCity;
}
public void setBuyerCity(String buyerCity) {
	this.buyerCity = buyerCity;
}
public String getBuyerDistrict() {
	return buyerDistrict;
}
public void setBuyerDistrict(String buyerDistrict) {
	this.buyerDistrict = buyerDistrict;
}
public String getBuyerState() {
	return buyerState;
}
public void setBuyerState(String buyerState) {
	this.buyerState = buyerState;
}
public String getBuyerGstinUin() {
	return buyerGstinUin;
}
public void setBuyerGstinUin(String buyerGstinUin) {
	this.buyerGstinUin = buyerGstinUin;
}
public float getiGstAmount() {
	return iGstAmount;
}
public void setiGstAmount(float iGstAmount) {
	this.iGstAmount = iGstAmount;
}
public int getTotalQuantity() {
	return totalQuantity;
}
public void setTotalQuantity(int totalQuantity) {
	this.totalQuantity = totalQuantity;
}
public float getTotalChargableAmount() {
	return totalChargableAmount;
}
public void setTotalChargableAmount(float totalChargableAmount) {
	this.totalChargableAmount = totalChargableAmount;
}
public float getTotalTaxableValue() {
	return totalTaxableValue;
}
public void setTotalTaxableValue(float totalTaxableValue) {
	this.totalTaxableValue = totalTaxableValue;
}
public float getTotalTaxAmount() {
	return totalTaxAmount;
}
public void setTotalTaxAmount(float totalTaxAmount) {
	this.totalTaxAmount = totalTaxAmount;
}
public List<Transaction> getTransactionList() {
	return transactionList;
}
public void setTransactionList(List<Transaction> transactionList) {
	this.transactionList = transactionList;
}
public List<TaxDescription> getTaxDescription() {
	return taxDescription;
}
public void setTaxDescription(List<TaxDescription> taxDescription) {
	this.taxDescription = taxDescription;
}




}
