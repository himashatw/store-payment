package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MobilePayment;

@Repository
public interface MobilePaymentRepository extends MongoRepository<MobilePayment,Long>{


}
