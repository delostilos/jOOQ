/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = 1492405088;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK);
	}
}
