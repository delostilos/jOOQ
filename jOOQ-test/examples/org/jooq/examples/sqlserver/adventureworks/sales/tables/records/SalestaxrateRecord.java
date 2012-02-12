/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesTaxRate", schema = "Sales")
public class SalestaxrateRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalestaxrateRecord> {

	private static final long serialVersionUID = 983865188;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setSalestaxrateid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.SALESTAXRATEID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "SalesTaxRateID", unique = true)
	public java.lang.Integer getSalestaxrateid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.SALESTAXRATEID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTaxRate.StateProvinceID]
	 * REFERENCES StateProvince [Person.StateProvince.StateProvinceID]
	 * </pre></code>
	 */
	public void setStateprovinceid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.STATEPROVINCEID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTaxRate.StateProvinceID]
	 * REFERENCES StateProvince [Person.StateProvince.StateProvinceID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "StateProvinceID")
	public java.lang.Integer getStateprovinceid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.STATEPROVINCEID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTaxRate.StateProvinceID]
	 * REFERENCES StateProvince [Person.StateProvince.StateProvinceID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateprovinceRecord fetchStateprovince() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE)
			.where(org.jooq.examples.sqlserver.adventureworks.person.tables.Stateprovince.STATEPROVINCE.STATEPROVINCEID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.STATEPROVINCEID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setTaxtype(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.TAXTYPE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TaxType")
	public java.lang.Byte getTaxtype() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.TAXTYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setTaxrate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.TAXRATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TaxRate")
	public java.math.BigDecimal getTaxrate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.TAXRATE);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE.MODIFIEDDATE);
	}

	/**
	 * Create a detached SalestaxrateRecord
	 */
	public SalestaxrateRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salestaxrate.SALESTAXRATE);
	}
}