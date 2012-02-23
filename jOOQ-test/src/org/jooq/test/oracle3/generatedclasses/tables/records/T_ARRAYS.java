/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_ARRAYS", schema = "TEST")
public class T_ARRAYS extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS> {

	private static final long serialVersionUID = 938052514;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true)
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setSTRING_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.STRING_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "STRING_ARRAY")
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY getSTRING_ARRAY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.STRING_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNUMBER_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "NUMBER_ARRAY")
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY getNUMBER_ARRAY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setNUMBER_LONG_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_LONG_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "NUMBER_LONG_ARRAY")
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY getNUMBER_LONG_ARRAY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_LONG_ARRAY);
	}

	/**
	 * An uncommented item
	 */
	public void setDATE_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.DATE_ARRAY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DATE_ARRAY")
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY getDATE_ARRAY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.DATE_ARRAY);
	}

	/**
	 * Create a detached T_ARRAYS
	 */
	public T_ARRAYS() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS);
	}
}