/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class IidbCommentsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.ingres.ingres.tables.records.IidbCommentsRecord> {

	private static final long serialVersionUID = 2105868017;

	/**
	 * An uncommented item
	 */
	public void setObjectName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbComments.OBJECT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getObjectName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbComments.OBJECT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setObjectOwner(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbComments.OBJECT_OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getObjectOwner() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbComments.OBJECT_OWNER);
	}

	/**
	 * An uncommented item
	 */
	public void setObjectType(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbComments.OBJECT_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getObjectType() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbComments.OBJECT_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setShortRemark(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbComments.SHORT_REMARK, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getShortRemark() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbComments.SHORT_REMARK);
	}

	/**
	 * An uncommented item
	 */
	public void setTextSequence(java.lang.Long value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbComments.TEXT_SEQUENCE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getTextSequence() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbComments.TEXT_SEQUENCE);
	}

	/**
	 * An uncommented item
	 */
	public void setLongRemark(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IidbComments.LONG_REMARK, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLongRemark() {
		return getValue(org.jooq.util.ingres.ingres.tables.IidbComments.LONG_REMARK);
	}

	/**
	 * Create a detached IidbCommentsRecord
	 */
	public IidbCommentsRecord() {
		super(org.jooq.util.ingres.ingres.tables.IidbComments.IIDB_COMMENTS);
	}
}
