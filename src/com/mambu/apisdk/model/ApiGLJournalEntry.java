package com.mambu.apisdk.model;

import com.mambu.accounting.shared.model.EntryType;

/**
 * A wrapper class to support Posting GLJournalEntries API. This API requires specifying an entry with the GL code and
 * transaction amount for each debit and credit entry. See MBU-1737.
 * 
 * @author mdanilkis
 * 
 */
public class ApiGLJournalEntry {
	private String glCode; // account's GL code
	private EntryType entryType; // transaction entry type
	private String amount; // transaction amount

	public ApiGLJournalEntry(String glCode, EntryType entryType, String amount) {
		this.glCode = glCode;
		this.entryType = entryType;
		this.amount = amount;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public void setEntryType(EntryType entryType) {
		this.entryType = entryType;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getGlCode() {
		return glCode;
	}

	public EntryType getEntryType() {
		return entryType;
	}

	public String getAmount() {
		return amount;
	}
}
