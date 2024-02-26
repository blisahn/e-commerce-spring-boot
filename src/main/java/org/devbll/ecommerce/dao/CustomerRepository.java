package org.devbll.ecommerce.dao;

import org.devbll.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD repository for Customers
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // lets you find customers from e-mail address,
    // if it's not found, will return null.
    // SELECT * FROM Customer c WHERE c.email = theEmail
    Customer findByEmail(String theEmail);
}
