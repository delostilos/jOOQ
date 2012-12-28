/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * snapshot table for snapshot TEST.M_LIBRARY
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "M_LIBRARY", schema = "TEST")
public class MLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.MLibraryRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -971998862;

	/**
	 * Setter for <code>TEST.M_LIBRARY.AUTHOR</code>. 
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.AUTHOR, value);
	}

	/**
	 * Getter for <code>TEST.M_LIBRARY.AUTHOR</code>. 
	 */
	@javax.persistence.Column(name = "AUTHOR", length = 101)
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.AUTHOR);
	}

	/**
	 * Setter for <code>TEST.M_LIBRARY.TITLE</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.TITLE, value);
	}

	/**
	 * Getter for <code>TEST.M_LIBRARY.TITLE</code>. 
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.TITLE);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MLibraryRecord
	 */
	public MLibraryRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY);
	}
}