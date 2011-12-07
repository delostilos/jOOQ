/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -1390542430;

	/**
	 * The singleton instance of v_book
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.ase.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord> __RECORD_TYPE = org.jooq.test.ase.generatedclasses.tables.records.VBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.LONGVARCHAR, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.BINARY, V_BOOK);

	/**
	 * No further instances allowed
	 */
	private VBook() {
		super("v_book", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}
}
