/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class FOne extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -298731389;

	/**
	 * The parameter <code>dbo.f_one.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FOne() {
		super("f_one", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
	}
}
