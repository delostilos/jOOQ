/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductModel", schema = "Production")
public class ProductmodelRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> {

	private static final long serialVersionUID = -541660021;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setProductmodelid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.PRODUCTMODELID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductModelID", unique = true)
	public java.lang.Integer getProductmodelid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.PRODUCTMODELID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> fetchProductList() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTMODELID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.PRODUCTMODELID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelillustrationRecord> fetchProductmodelillustrationList() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION.PRODUCTMODELID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.PRODUCTMODELID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelproductdescriptioncultureRecord> fetchProductmodelproductdescriptioncultureList() {
		return create()
			.selectFrom(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE)
			.where(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTMODELID.equal(getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.PRODUCTMODELID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setCatalogdescription(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.CATALOGDESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "CatalogDescription")
	public java.lang.Object getCatalogdescription() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.CATALOGDESCRIPTION);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setInstructions(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.INSTRUCTIONS, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "Instructions")
	public java.lang.Object getInstructions() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.INSTRUCTIONS);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.MODIFIEDDATE);
	}

	/**
	 * Create a detached ProductmodelRecord
	 */
	public ProductmodelRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL);
	}
}