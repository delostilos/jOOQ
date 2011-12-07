/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class P391 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 2025449079;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> I1 = createParameter("I1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> IO1 = createParameter("IO1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> O1 = createParameter("O1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> O2 = createParameter("O2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> IO2 = createParameter("IO2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> I2 = createParameter("I2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public P391() {
		super(org.jooq.SQLDialect.ORACLE, "P391", org.jooq.test.oracle.generatedclasses.Test.TEST);

		addInParameter(I1);
		addInOutParameter(IO1);
		addOutParameter(O1);
		addOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	/**
	 * Set the <code>I1</code> parameter to the routine
	 */
	public void setI1(java.lang.Number value) {
		setNumber(I1, value);
	}

	/**
	 * Set the <code>IO1</code> parameter to the routine
	 */
	public void setIo1(java.lang.Number value) {
		setNumber(IO1, value);
	}

	/**
	 * Set the <code>IO2</code> parameter to the routine
	 */
	public void setIo2(java.lang.Number value) {
		setNumber(IO2, value);
	}

	/**
	 * Set the <code>I2</code> parameter to the routine
	 */
	public void setI2(java.lang.Number value) {
		setNumber(I2, value);
	}

	public java.math.BigDecimal getIo1() {
		return getValue(IO1);
	}

	public java.math.BigDecimal getO1() {
		return getValue(O1);
	}

	public java.math.BigDecimal getO2() {
		return getValue(O2);
	}

	public java.math.BigDecimal getIo2() {
		return getValue(IO2);
	}
}
