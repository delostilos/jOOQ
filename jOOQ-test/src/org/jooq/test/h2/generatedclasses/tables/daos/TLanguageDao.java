/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TLanguageDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord, org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage, java.lang.Integer> {

	/**
	 * Create a new TLanguageDao without any configuration
	 */
	public TLanguageDao() {
		super(org.jooq.test.h2.generatedclasses.tables.TLanguage.T_LANGUAGE, org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage.class);
	}

	/**
	 * Create a new TLanguageDao with an attached configuration
	 */
	public TLanguageDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.TLanguage.T_LANGUAGE, org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>CD IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage> fetchByCd(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TLanguage.CD, values);
	}

	/**
	 * Fetch records that have <code>DESCRIPTION IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage> fetchByDescription(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TLanguage.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>DESCRIPTION_ENGLISH IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage> fetchByDescriptionEnglish(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH, values);
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TLanguage.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.TLanguage fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.TLanguage.ID, value);
	}
}
