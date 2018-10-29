package com.enstage.ormlite.entity;

import java.sql.Timestamp;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ICC_INFO")
public class IccInfo implements Cloneable {

	@DatabaseField(id = true, columnName = "ICC_ID")
	private long iccId;
	@DatabaseField(columnName = "ICC_NUMBER")
	private String iccNumber;
	@DatabaseField(columnName = "ICC_LIMIT")
	private long iccLimit;
	@DatabaseField(columnName = "ORIG_PURCHASE_LIMIT")
	private long originalPurchaseLimit;
	@DatabaseField(columnName = "ICC_EXP_DATE")
	private String iccExpiryDate;
	@DatabaseField(columnName = "ICC_STATUS")
	private long iccStatus;

	@DatabaseField(columnName = "ICC_AVAIL_TO_SETTLE_AMT")
	private long iccAvailableToSettleAmount;
	@DatabaseField(columnName = "ICC_AUTHORIZED_AMT")
	private long iccAuthorizedAmount;
	@DatabaseField(columnName = "ICC_SETTLED_AMT")
	private long iccSettledAmount;
	@DatabaseField(columnName = "AVAILABLE_TO_AUTHORIZE")
	private long iccAvailableToAuthorize;

	@DatabaseField(columnName = "ADDRESS_LINE_1")
	private String addressLine1;
	@DatabaseField(columnName = "ADDRESS_LINE_2")
	private String addressLine2;
	@DatabaseField(columnName = "ADDRESS_CITY")
	private String addressCity;
	@DatabaseField(columnName = "ADDRESS_STATE")
	private String addressState;
	@DatabaseField(columnName = "ADDRESS_ZIP")
	private String addressZip;
	@DatabaseField(columnName = "ADDRESS_COUNTRY")
	private String addressCountry;

	@DatabaseField(columnName = "CREATION_DATE")
	private Timestamp creationDate;
	@DatabaseField(columnName = "AUTH_DATE")
	private Timestamp authDate;
	@DatabaseField(columnName = "CARD_DEF_ID")
	private long cardDefinitionId;
	@DatabaseField(columnName = "CARD_CATEGORY_ID")
	private long cardCategoryId;
	@DatabaseField(columnName = "USAGE_START_DATE")
	private String usageStartDate;
	@DatabaseField(columnName = "USAGE_END_DATE")
	private String usageEndDate;
	@DatabaseField(columnName = "MULTIPLE_AUTH_FLAG")
	private long multipleAuthFlag;

	@DatabaseField(columnName = "HOST_SETTLED")
	private long iccHostSettled;
	@DatabaseField(columnName = "REASON_CODE")
	private String reasonCode;
	@DatabaseField(columnName = "HOLDING_AMOUNT")
	private long holdingAmount;
	@DatabaseField(columnName = "ACCOUNT_NUMBER")
	private String accountNumber;

	public long getHoldingAmount() {
		return holdingAmount;
	}

	public void setHoldingAmount(long holdingAmount) {
		this.holdingAmount = holdingAmount;
	}

	public long getIccId() {
		return iccId;
	}

	public void setIccId(long iccId) {
		this.iccId = iccId;
	}

	public String getIccNumber() {
		return iccNumber;
	}

	public void setIccNumber(String iccNumber) {
		this.iccNumber = iccNumber;
	}

	public long getIccLimit() {
		return iccLimit;
	}

	public void setIccLimit(long iccLimit) {
		this.iccLimit = iccLimit;
	}

	public long getOriginalPurchaseLimit() {
		return originalPurchaseLimit;
	}

	public void setOriginalPurchaseLimit(long originalPurchaseLimit) {
		this.originalPurchaseLimit = originalPurchaseLimit;
	}

	public String getIccExpiryDate() {
		return iccExpiryDate;
	}

	public void setIccExpiryDate(String iccExpiryDate) {
		this.iccExpiryDate = iccExpiryDate;
	}

	public long getIccStatus() {
		return iccStatus;
	}

	public void setIccStatus(long iccStatus) {
		this.iccStatus = iccStatus;
	}

	public long getIccAvailableToSettleAmount() {
		return iccAvailableToSettleAmount;
	}

	public void setIccAvailableToSettleAmount(long iccAvailableToSettleAmount) {
		this.iccAvailableToSettleAmount = iccAvailableToSettleAmount;
	}

	public long getIccAuthorizedAmount() {
		return iccAuthorizedAmount;
	}

	public void setIccAuthorizedAmount(long iccAuthorizedAmount) {
		this.iccAuthorizedAmount = iccAuthorizedAmount;
	}

	public long getIccSettledAmount() {
		return iccSettledAmount;
	}

	public void setIccSettledAmount(long iccSettledAmount) {
		this.iccSettledAmount = iccSettledAmount;
	}

	public long getIccAvailableToAuthorize() {
		return iccAvailableToAuthorize;
	}

	public void setIccAvailableToAuthorize(long iccAvailableToAuthorize) {
		this.iccAvailableToAuthorize = iccAvailableToAuthorize;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressZip() {
		return addressZip;
	}

	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getAuthDate() {
		return authDate;
	}

	public void setAuthDate(Timestamp authDate) {
		this.authDate = authDate;
	}

	public long getCardDefinitionId() {
		return cardDefinitionId;
	}

	public void setCardDefinitionId(long cardDefinitionId) {
		this.cardDefinitionId = cardDefinitionId;
	}

	public long getCardCategoryId() {
		return cardCategoryId;
	}

	public void setCardCategoryId(long cardCategoryId) {
		this.cardCategoryId = cardCategoryId;
	}

	public String getUsageStartDate() {
		return usageStartDate;
	}

	public void setUsageStartDate(String usageStartDate) {
		this.usageStartDate = usageStartDate;
	}

	public String getUsageEndDate() {
		return usageEndDate;
	}

	public void setUsageEndDate(String usageEndDate) {
		this.usageEndDate = usageEndDate;
	}

	public long getMultipleAuthFlag() {
		return multipleAuthFlag;
	}

	public void setMultipleAuthFlag(long multipleAuthFlag) {
		this.multipleAuthFlag = multipleAuthFlag;
	}

	public long getIccHostSettled() {
		return iccHostSettled;
	}

	public void setIccHostSettled(long iccHostSettled) {
		this.iccHostSettled = iccHostSettled;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ICC Details:");
		sb.append("\n-------------------------------------------------------");
		sb.append("iccId: " + iccId).append("iccNumber: " + iccNumber).append("iccLimit: " + iccLimit)
				.append("originalPurchaseLimit: " + originalPurchaseLimit).append("iccExpiryDate: " + iccExpiryDate)
				.append("iccStatus: " + iccStatus).append("iccAvailableToSettleAmount: " + iccAvailableToSettleAmount)
				.append("iccAuthorizedAmount: " + iccAuthorizedAmount).append("iccSettledAmount: " + iccSettledAmount)
				.append("iccAvailableToAuthorize: " + iccAvailableToAuthorize).append("addressLine1: " + addressLine1)
				.append("addressLine2: " + addressLine2).append("addressCity: " + addressCity)
				.append("addressState: " + addressState).append("addressZip: " + addressZip)
				.append("addressCountry: " + addressCountry).append("creationDate: " + creationDate)
				.append("authDate: " + authDate).append("cardDefinitionId: " + cardDefinitionId)
				.append("cardCategoryId: " + cardCategoryId).append("usageStartDate: " + usageStartDate)
				.append("usageEndDate: " + usageEndDate).append("multipleAuthFlag: " + multipleAuthFlag)
				.append("iccHostSettled: " + iccHostSettled).append("reasonCode: " + reasonCode);

		return sb.toString();
	}

}