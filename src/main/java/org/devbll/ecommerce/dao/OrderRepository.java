package org.devbll.ecommerce.dao;

import org.devbll.ecommerce.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * we've created the Order repository, but it is not secure now
 * anyone can access localhost:8080/api/orders endpoint,
 * for that we have to add Okta Security to our app
 */
@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {

    Page<Order> findByCustomerEmailOrderByDateCreatedDesc(@Param("email") String email, Pageable pageable);

    /**
     * SELECT * FROM orders
     * LEFT OUTER JOIN customer
     * ON  orders.customer_id = customer.id
     * WHERE customer.email =:email
     * ORDER BY orders.date_created DESC
     */

}
