/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class InventoryHeldByCustomer extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -1019621596;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_INVENTORY_ID = createParameter("p_inventory_id", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public InventoryHeldByCustomer() {
		super(org.jooq.SQLDialect.MYSQL, "inventory_held_by_customer", org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_INVENTORY_ID);
	}

	/**
	 * Set the <code>p_inventory_id</code> parameter to the routine
	 */
	public void setPInventoryId(java.lang.Integer value) {
		setValue(P_INVENTORY_ID, value);
	}

	/**
	 * Set the <code>p_inventory_id</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setPInventoryId(org.jooq.Field<java.lang.Integer> field) {
		setField(P_INVENTORY_ID, field);
	}
}
