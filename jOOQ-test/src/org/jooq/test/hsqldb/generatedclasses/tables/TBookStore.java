/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TBookStore extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -158379559;

	/**
	 * The singleton instance of <code>PUBLIC.T_BOOK_STORE</code>
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.hsqldb.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_BOOK_STORE.NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400), this);

	/**
	 * Create a <code>PUBLIC.T_BOOK_STORE</code> table reference
	 */
	public TBookStore() {
		super("T_BOOK_STORE", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_BOOK_STORE</code> table reference
	 */
	public TBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.hsqldb.generatedclasses.Keys.UK_T_BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.UK_T_BOOK_STORE_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.TBookStore as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.TBookStore(alias);
	}
}
