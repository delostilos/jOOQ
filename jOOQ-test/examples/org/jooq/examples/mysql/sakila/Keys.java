/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>sakila</code> 
 * schema
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord, java.lang.Short> IDENTITY_ACTOR = Identities0.IDENTITY_ACTOR;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord, java.lang.Short> IDENTITY_ADDRESS = Identities0.IDENTITY_ADDRESS;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCategoryRecord, java.lang.Byte> IDENTITY_CATEGORY = Identities0.IDENTITY_CATEGORY;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, java.lang.Short> IDENTITY_CITY = Identities0.IDENTITY_CITY;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCountryRecord, java.lang.Short> IDENTITY_COUNTRY = Identities0.IDENTITY_COUNTRY;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord, java.lang.Short> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord, java.lang.Short> IDENTITY_FILM = Identities0.IDENTITY_FILM;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord, java.lang.Integer> IDENTITY_INVENTORY = Identities0.IDENTITY_INVENTORY;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord, java.lang.Byte> IDENTITY_LANGUAGE = Identities0.IDENTITY_LANGUAGE;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord, java.lang.Short> IDENTITY_PAYMENT = Identities0.IDENTITY_PAYMENT;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord, java.lang.Integer> IDENTITY_RENTAL = Identities0.IDENTITY_RENTAL;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord, java.lang.Byte> IDENTITY_STAFF = Identities0.IDENTITY_STAFF;
	public static final org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, java.lang.Byte> IDENTITY_STORE = Identities0.IDENTITY_STORE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord> KEY_ACTOR_PRIMARY = UniqueKeys0.KEY_ACTOR_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord> KEY_ADDRESS_PRIMARY = UniqueKeys0.KEY_ADDRESS_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCategoryRecord> KEY_CATEGORY_PRIMARY = UniqueKeys0.KEY_CATEGORY_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord> KEY_CITY_PRIMARY = UniqueKeys0.KEY_CITY_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCountryRecord> KEY_COUNTRY_PRIMARY = UniqueKeys0.KEY_COUNTRY_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord> KEY_CUSTOMER_PRIMARY = UniqueKeys0.KEY_CUSTOMER_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord> KEY_FILM_PRIMARY = UniqueKeys0.KEY_FILM_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmActorRecord> KEY_FILM_ACTOR_PRIMARY = UniqueKeys0.KEY_FILM_ACTOR_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord> KEY_FILM_CATEGORY_PRIMARY = UniqueKeys0.KEY_FILM_CATEGORY_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmTextRecord> KEY_FILM_TEXT_PRIMARY = UniqueKeys0.KEY_FILM_TEXT_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord> KEY_INVENTORY_PRIMARY = UniqueKeys0.KEY_INVENTORY_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> KEY_LANGUAGE_PRIMARY = UniqueKeys0.KEY_LANGUAGE_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord> KEY_PAYMENT_PRIMARY = UniqueKeys0.KEY_PAYMENT_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord> KEY_RENTAL_PRIMARY = UniqueKeys0.KEY_RENTAL_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord> KEY_RENTAL_RENTAL_DATE = UniqueKeys0.KEY_RENTAL_RENTAL_DATE;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord> KEY_STAFF_PRIMARY = UniqueKeys0.KEY_STAFF_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> KEY_STORE_PRIMARY = UniqueKeys0.KEY_STORE_PRIMARY;
	public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> KEY_STORE_IDX_UNIQUE_MANAGER = UniqueKeys0.KEY_STORE_IDX_UNIQUE_MANAGER;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord> FK_ADDRESS_CITY = ForeignKeys0.FK_ADDRESS_CITY;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCountryRecord> FK_CITY_COUNTRY = ForeignKeys0.FK_CITY_COUNTRY;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> FK_CUSTOMER_STORE = ForeignKeys0.FK_CUSTOMER_STORE;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord> FK_CUSTOMER_ADDRESS = ForeignKeys0.FK_CUSTOMER_ADDRESS;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> FK_FILM_LANGUAGE = ForeignKeys0.FK_FILM_LANGUAGE;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> FK_FILM_LANGUAGE_ORIGINAL = ForeignKeys0.FK_FILM_LANGUAGE_ORIGINAL;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmActorRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord> FK_FILM_ACTOR_ACTOR = ForeignKeys0.FK_FILM_ACTOR_ACTOR;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmActorRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord> FK_FILM_ACTOR_FILM = ForeignKeys0.FK_FILM_ACTOR_FILM;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord> FK_FILM_CATEGORY_FILM = ForeignKeys0.FK_FILM_CATEGORY_FILM;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCategoryRecord> FK_FILM_CATEGORY_CATEGORY = ForeignKeys0.FK_FILM_CATEGORY_CATEGORY;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord> FK_INVENTORY_FILM = ForeignKeys0.FK_INVENTORY_FILM;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> FK_INVENTORY_STORE = ForeignKeys0.FK_INVENTORY_STORE;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord> FK_PAYMENT_CUSTOMER = ForeignKeys0.FK_PAYMENT_CUSTOMER;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord> FK_PAYMENT_STAFF = ForeignKeys0.FK_PAYMENT_STAFF;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord> FK_PAYMENT_RENTAL = ForeignKeys0.FK_PAYMENT_RENTAL;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord> FK_RENTAL_INVENTORY = ForeignKeys0.FK_RENTAL_INVENTORY;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord> FK_RENTAL_CUSTOMER = ForeignKeys0.FK_RENTAL_CUSTOMER;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord> FK_RENTAL_STAFF = ForeignKeys0.FK_RENTAL_STAFF;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord> FK_STAFF_ADDRESS = ForeignKeys0.FK_STAFF_ADDRESS;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> FK_STAFF_STORE = ForeignKeys0.FK_STAFF_STORE;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord> FK_STORE_STAFF = ForeignKeys0.FK_STORE_STAFF;
	public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord> FK_STORE_ADDRESS = ForeignKeys0.FK_STORE_ADDRESS;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord, java.lang.Short> IDENTITY_ACTOR = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaActor.ACTOR, org.jooq.examples.mysql.sakila.tables.SakilaActor.ACTOR.ACTOR_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord, java.lang.Short> IDENTITY_ADDRESS = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaAddress.ADDRESS, org.jooq.examples.mysql.sakila.tables.SakilaAddress.ADDRESS.ADDRESS_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCategoryRecord, java.lang.Byte> IDENTITY_CATEGORY = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY, org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY.CATEGORY_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, java.lang.Short> IDENTITY_CITY = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaCity.CITY, org.jooq.examples.mysql.sakila.tables.SakilaCity.CITY.CITY_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCountryRecord, java.lang.Short> IDENTITY_COUNTRY = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaCountry.COUNTRY, org.jooq.examples.mysql.sakila.tables.SakilaCountry.COUNTRY.COUNTRY_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord, java.lang.Short> IDENTITY_CUSTOMER = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER, org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER.CUSTOMER_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord, java.lang.Short> IDENTITY_FILM = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM, org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM.FILM_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord, java.lang.Integer> IDENTITY_INVENTORY = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY, org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY.INVENTORY_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord, java.lang.Byte> IDENTITY_LANGUAGE = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaLanguage.LANGUAGE, org.jooq.examples.mysql.sakila.tables.SakilaLanguage.LANGUAGE.LANGUAGE_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord, java.lang.Short> IDENTITY_PAYMENT = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT, org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT.PAYMENT_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord, java.lang.Integer> IDENTITY_RENTAL = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.RENTAL_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord, java.lang.Byte> IDENTITY_STAFF = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF, org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF.STAFF_ID);
		public static org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, java.lang.Byte> IDENTITY_STORE = createIdentity(org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE, org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE.STORE_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord> KEY_ACTOR_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaActor.ACTOR, org.jooq.examples.mysql.sakila.tables.SakilaActor.ACTOR.ACTOR_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord> KEY_ADDRESS_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaAddress.ADDRESS, org.jooq.examples.mysql.sakila.tables.SakilaAddress.ADDRESS.ADDRESS_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCategoryRecord> KEY_CATEGORY_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY, org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY.CATEGORY_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord> KEY_CITY_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaCity.CITY, org.jooq.examples.mysql.sakila.tables.SakilaCity.CITY.CITY_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCountryRecord> KEY_COUNTRY_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaCountry.COUNTRY, org.jooq.examples.mysql.sakila.tables.SakilaCountry.COUNTRY.COUNTRY_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord> KEY_CUSTOMER_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER, org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER.CUSTOMER_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord> KEY_FILM_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM, org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM.FILM_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmActorRecord> KEY_FILM_ACTOR_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR, org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR.ACTOR_ID, org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR.FILM_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord> KEY_FILM_CATEGORY_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY, org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY.FILM_ID, org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY.CATEGORY_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmTextRecord> KEY_FILM_TEXT_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaFilmText.FILM_TEXT, org.jooq.examples.mysql.sakila.tables.SakilaFilmText.FILM_TEXT.FILM_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord> KEY_INVENTORY_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY, org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY.INVENTORY_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> KEY_LANGUAGE_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaLanguage.LANGUAGE, org.jooq.examples.mysql.sakila.tables.SakilaLanguage.LANGUAGE.LANGUAGE_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord> KEY_PAYMENT_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT, org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT.PAYMENT_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord> KEY_RENTAL_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.RENTAL_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord> KEY_RENTAL_RENTAL_DATE = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.RENTAL_DATE, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.INVENTORY_ID, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.CUSTOMER_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord> KEY_STAFF_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF, org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF.STAFF_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> KEY_STORE_PRIMARY = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE, org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE.STORE_ID);
		public static final org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> KEY_STORE_IDX_UNIQUE_MANAGER = createUniqueKey(org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE, org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE.MANAGER_STAFF_ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord> FK_ADDRESS_CITY = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_CITY_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaAddress.ADDRESS, org.jooq.examples.mysql.sakila.tables.SakilaAddress.ADDRESS.CITY_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCityRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCountryRecord> FK_CITY_COUNTRY = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_COUNTRY_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaCity.CITY, org.jooq.examples.mysql.sakila.tables.SakilaCity.CITY.COUNTRY_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> FK_CUSTOMER_STORE = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_STORE_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER, org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER.STORE_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord> FK_CUSTOMER_ADDRESS = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_ADDRESS_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER, org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER.ADDRESS_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> FK_FILM_LANGUAGE = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_LANGUAGE_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM, org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM.LANGUAGE_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> FK_FILM_LANGUAGE_ORIGINAL = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_LANGUAGE_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM, org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM.ORIGINAL_LANGUAGE_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmActorRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaActorRecord> FK_FILM_ACTOR_ACTOR = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_ACTOR_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR, org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR.ACTOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmActorRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord> FK_FILM_ACTOR_FILM = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR, org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR.FILM_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord> FK_FILM_CATEGORY_FILM = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY, org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY.FILM_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCategoryRecord> FK_FILM_CATEGORY_CATEGORY = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_CATEGORY_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY, org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY.CATEGORY_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaFilmRecord> FK_INVENTORY_FILM = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY, org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY.FILM_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> FK_INVENTORY_STORE = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_STORE_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY, org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY.STORE_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord> FK_PAYMENT_CUSTOMER = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_CUSTOMER_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT, org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT.CUSTOMER_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord> FK_PAYMENT_STAFF = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_STAFF_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT, org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT.STAFF_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaPaymentRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord> FK_PAYMENT_RENTAL = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_RENTAL_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT, org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT.RENTAL_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaInventoryRecord> FK_RENTAL_INVENTORY = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_INVENTORY_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.INVENTORY_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaCustomerRecord> FK_RENTAL_CUSTOMER = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_CUSTOMER_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.CUSTOMER_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord> FK_RENTAL_STAFF = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_STAFF_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL, org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.STAFF_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord> FK_STAFF_ADDRESS = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_ADDRESS_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF, org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF.ADDRESS_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord> FK_STAFF_STORE = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_STORE_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF, org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF.STORE_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaStaffRecord> FK_STORE_STAFF = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_STAFF_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE, org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE.MANAGER_STAFF_ID);
		public static final org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaStoreRecord, org.jooq.examples.mysql.sakila.tables.records.SakilaAddressRecord> FK_STORE_ADDRESS = createForeignKey(org.jooq.examples.mysql.sakila.Keys.KEY_ADDRESS_PRIMARY, org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE, org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE.ADDRESS_ID);
	}
}
