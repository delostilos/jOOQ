/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Attributes extends org.jooq.impl.TableImpl<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord> {

	private static final long serialVersionUID = 1910354737;

	/**
	 * The singleton instance of attributes
	 */
	public static final org.jooq.util.postgres.information_schema.tables.Attributes ATTRIBUTES = new org.jooq.util.postgres.information_schema.tables.Attributes();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord> __RECORD_TYPE = org.jooq.util.postgres.information_schema.tables.records.AttributesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> ATTRIBUTE_NAME = createField("attribute_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.Integer> ORDINAL_POSITION = createField("ordinal_position", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> ATTRIBUTE_DEFAULT = createField("attribute_default", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> IS_NULLABLE = createField("is_nullable", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> ATTRIBUTE_UDT_CATALOG = createField("attribute_udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> ATTRIBUTE_UDT_SCHEMA = createField("attribute_udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> ATTRIBUTE_UDT_NAME = createField("attribute_udt_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.AttributesRecord, java.lang.String> IS_DERIVED_REFERENCE_ATTRIBUTE = createField("is_derived_reference_attribute", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private Attributes() {
		super("attributes", org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * No further instances allowed
	 */
	private Attributes(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.postgres.information_schema.tables.Attributes.ATTRIBUTES);
	}

	@Override
	public org.jooq.util.postgres.information_schema.tables.Attributes as(java.lang.String alias) {
		return new org.jooq.util.postgres.information_schema.tables.Attributes(alias);
	}
}
