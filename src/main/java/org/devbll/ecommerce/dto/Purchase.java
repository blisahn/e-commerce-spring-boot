package org.devbll.ecommerce.dto;

import lombok.Data;
import org.devbll.ecommerce.entity.Address;
import org.devbll.ecommerce.entity.Customer;
import org.devbll.ecommerce.entity.Order;
import org.devbll.ecommerce.entity.OrderItem;

import java.util.Set;

// Purchase is the wrapper class for all the specified fields
@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;


}
