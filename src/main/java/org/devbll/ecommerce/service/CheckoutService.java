package org.devbll.ecommerce.service;

import org.devbll.ecommerce.dto.Purchase;
import org.devbll.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
