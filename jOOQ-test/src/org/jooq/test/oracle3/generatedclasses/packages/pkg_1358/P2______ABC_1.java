/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.pkg_1358;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class P2______ABC_1 extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1295152987;

	/**
	 * The parameter <code>PKG_1358.P2.I</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> I = createParameter("I", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public P2______ABC_1() {
		super("P2", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.packages.PKG_1358.PKG_1358);

		addInParameter(I);
		setOverloaded(true);
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	public void setI(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P2______ABC_1.I, value);
	}
}
