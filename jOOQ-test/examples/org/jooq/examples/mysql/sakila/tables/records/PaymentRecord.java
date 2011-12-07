/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class PaymentRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> {

	private static final long serialVersionUID = 815222398;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setPaymentId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.PAYMENT_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getPaymentId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.PAYMENT_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.customer_id]
	 * REFERENCES customer [sakila.customer.customer_id]
	 * </pre></code>
	 */
	public void setCustomerId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.CUSTOMER_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.customer_id]
	 * REFERENCES customer [sakila.customer.customer_id]
	 * </pre></code>
	 */
	public java.lang.Short getCustomerId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.CUSTOMER_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.customer_id]
	 * REFERENCES customer [sakila.customer.customer_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.CustomerRecord fetchCustomer() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER)
			.where(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.CUSTOMER_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.staff_id]
	 * REFERENCES staff [sakila.staff.staff_id]
	 * </pre></code>
	 */
	public void setStaffId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.STAFF_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.staff_id]
	 * REFERENCES staff [sakila.staff.staff_id]
	 * </pre></code>
	 */
	public java.lang.Byte getStaffId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.STAFF_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.staff_id]
	 * REFERENCES staff [sakila.staff.staff_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.StaffRecord fetchStaff() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Staff.STAFF)
			.where(org.jooq.examples.mysql.sakila.tables.Staff.STAFF.STAFF_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.STAFF_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.rental_id]
	 * REFERENCES rental [sakila.rental.rental_id]
	 * </pre></code>
	 */
	public void setRentalId(java.lang.Integer value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.RENTAL_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.rental_id]
	 * REFERENCES rental [sakila.rental.rental_id]
	 * </pre></code>
	 */
	public java.lang.Integer getRentalId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.RENTAL_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.payment.rental_id]
	 * REFERENCES rental [sakila.rental.rental_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.RentalRecord fetchRental() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL)
			.where(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL.RENTAL_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.RENTAL_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setAmount(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.AMOUNT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigDecimal getAmount() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.AMOUNT);
	}

	/**
	 * An uncommented item
	 */
	public void setPaymentDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.PAYMENT_DATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getPaymentDate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.PAYMENT_DATE);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.LAST_UPDATE);
	}

	/**
	 * Create a detached PaymentRecord
	 */
	public PaymentRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT);
	}
}
