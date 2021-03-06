/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class T_725LobTestDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord, org.jooq.test.h2.generatedclasses.tables.pojos.T_725LobTest, java.lang.Integer> {

	/**
	 * Create a new T_725LobTestDao without any configuration
	 */
	public T_725LobTestDao() {
		super(org.jooq.test.h2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.h2.generatedclasses.tables.pojos.T_725LobTest.class);
	}

	/**
	 * Create a new T_725LobTestDao with an attached configuration
	 */
	public T_725LobTestDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.h2.generatedclasses.tables.pojos.T_725LobTest.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.T_725LobTest object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_725LobTest> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_725LobTest.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.T_725LobTest fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.T_725LobTest.ID, value);
	}

	/**
	 * Fetch records that have <code>LOB IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_725LobTest> fetchByLob(byte[]... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_725LobTest.LOB, values);
	}
}
