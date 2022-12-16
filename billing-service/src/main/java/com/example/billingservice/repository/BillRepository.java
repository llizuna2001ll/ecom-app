package com.example.billingservice.repository;

import com.example.billingservice.entities.Bill;
import com.example.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill, Long> {

    @RestResource(path = "/byCustomerId")
    List<Bill> findByCustomerId(@Param("customerId") Long customerId);
}
