/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema;

/**
 * This class is generated by jOOQ.
 */
public class MultiSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1472774415;

	/**
	 * The singleton instance of MULTI_SCHEMA
	 */
	public static final MultiSchema MULTI_SCHEMA = new MultiSchema();

	/**
	 * No further instances allowed
	 */
	private MultiSchema() {
		super("MULTI_SCHEMA");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR,
			org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK,
			org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE);
	}
}