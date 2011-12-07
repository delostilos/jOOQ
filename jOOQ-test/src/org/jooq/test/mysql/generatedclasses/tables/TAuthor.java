/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 1487733990;

	/**
	 * The singleton instance of t_author
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.mysql.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord> __RECORD_TYPE = org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The author's first name
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * The author's last name
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * The author's date of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, T_AUTHOR);

	/**
	 * The author's year of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The author's address
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("t_author", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord> getMainKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_t_author_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_t_author_PRIMARY);
	}
}
