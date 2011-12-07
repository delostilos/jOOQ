/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -457138171;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_PDF);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK);
	}
}
