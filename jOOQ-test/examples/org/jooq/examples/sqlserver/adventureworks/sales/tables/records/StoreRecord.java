/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Store", schema = "Sales")
public class StoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreRecord> {

	private static final long serialVersionUID = 361633822;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.Store.CustomerID]
	 * REFERENCES Customer [Sales.Customer.CustomerID]
	 * </pre></code>
	 */
	public void setCustomerid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.CUSTOMERID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.Store.CustomerID]
	 * REFERENCES Customer [Sales.Customer.CustomerID]
	 * </pre></code>
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "CustomerID", unique = true)
	public java.lang.Integer getCustomerid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.CUSTOMERID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.Store.CustomerID]
	 * REFERENCES Customer [Sales.Customer.CustomerID]
	 * </pre></code>
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StorecontactRecord> fetchStorecontactList() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT)
			.where(org.jooq.examples.sqlserver.adventureworks.sales.tables.Storecontact.STORECONTACT.CUSTOMERID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.CUSTOMERID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.Store.CustomerID]
	 * REFERENCES Customer [Sales.Customer.CustomerID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerRecord fetchCustomer() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.CUSTOMER)
			.where(org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.CUSTOMER.CUSTOMERID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.CUSTOMERID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.NAME);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.Store.SalesPersonID]
	 * REFERENCES SalesPerson [Sales.SalesPerson.SalesPersonID]
	 * </pre></code>
	 */
	public void setSalespersonid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.SALESPERSONID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.Store.SalesPersonID]
	 * REFERENCES SalesPerson [Sales.SalesPerson.SalesPersonID]
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SalesPersonID")
	public java.lang.Integer getSalespersonid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.SALESPERSONID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.Store.SalesPersonID]
	 * REFERENCES SalesPerson [Sales.SalesPerson.SalesPersonID]
	 * </pre></code>
	 */
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalespersonRecord fetchSalesperson() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON)
			.where(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesperson.SALESPERSON.SALESPERSONID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.SALESPERSONID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setDemographics(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.DEMOGRAPHICS, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "Demographics")
	public java.lang.Object getDemographics() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.DEMOGRAPHICS);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE.MODIFIEDDATE);
	}

	/**
	 * Create a detached StoreRecord
	 */
	public StoreRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.STORE);
	}
}