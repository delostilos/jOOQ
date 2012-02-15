/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Objects accessible to the user
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class AllObjects extends org.jooq.impl.TableImpl<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord> {

	private static final long serialVersionUID = -1578550097;

	/**
	 * The singleton instance of ALL_OBJECTS
	 */
	public static final org.jooq.util.oracle.sys.tables.AllObjects ALL_OBJECTS = new org.jooq.util.oracle.sys.tables.AllObjects();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord> __RECORD_TYPE = org.jooq.util.oracle.sys.tables.records.AllObjectsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * Username of the owner of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the sub-object (for example, partititon)
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> SUBOBJECT_NAME = createField("SUBOBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Object number of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.math.BigDecimal> OBJECT_ID = createField("OBJECT_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Object number of the segment which contains the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.math.BigDecimal> DATA_OBJECT_ID = createField("DATA_OBJECT_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Type of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Timestamp for the creation of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.sql.Date> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * Timestamp for the last DDL change (including GRANT and REVOKE) to the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.sql.Date> LAST_DDL_TIME = createField("LAST_DDL_TIME", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * Timestamp for the specification of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> TIMESTAMP = createField("TIMESTAMP", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Status of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Can the current session only see data that it placed in this object itself?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> TEMPORARY = createField("TEMPORARY", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Was the name of this object system generated?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> GENERATED = createField("GENERATED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Is this a secondary object created as part of icreate for domain indexes?
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> SECONDARY = createField("SECONDARY", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Namespace for the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.math.BigDecimal> NAMESPACE = createField("NAMESPACE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Name of the edition in which the object is actual
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllObjectsRecord, java.lang.String> EDITION_NAME = createField("EDITION_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private AllObjects() {
		super("ALL_OBJECTS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	/**
	 * No further instances allowed
	 */
	private AllObjects(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllObjects.ALL_OBJECTS);
	}

	@Override
	public org.jooq.util.oracle.sys.tables.AllObjects as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllObjects(alias);
	}
}
