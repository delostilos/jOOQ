/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Sysschemas extends org.jooq.impl.TableImpl<org.jooq.util.derby.sys.tables.records.SysschemasRecord> {

	private static final long serialVersionUID = 272512130;

	/**
	 * The singleton instance of SYSSCHEMAS
	 */
	public static final org.jooq.util.derby.sys.tables.Sysschemas SYSSCHEMAS = new org.jooq.util.derby.sys.tables.Sysschemas();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.derby.sys.tables.records.SysschemasRecord> __RECORD_TYPE = org.jooq.util.derby.sys.tables.records.SysschemasRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.derby.sys.tables.records.SysschemasRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysschemasRecord, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSSCHEMAS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysschemasRecord, java.lang.String> SCHEMANAME = createField("SCHEMANAME", org.jooq.impl.SQLDataType.VARCHAR, SYSSCHEMAS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.derby.sys.tables.records.SysschemasRecord, java.lang.String> AUTHORIZATIONID = createField("AUTHORIZATIONID", org.jooq.impl.SQLDataType.VARCHAR, SYSSCHEMAS);

	/**
	 * No further instances allowed
	 */
	private Sysschemas() {
		super("SYSSCHEMAS", org.jooq.util.derby.sys.Sys.SYS);
	}
}
