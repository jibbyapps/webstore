package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by vitaliiromanchenko on 02.08.16.
 */

public interface CustomerOrderService {

  void addCustomerOrder(CustomerOrder customerOrder);
  double getCustomerOrderGrandTotal(int cartId);


}
