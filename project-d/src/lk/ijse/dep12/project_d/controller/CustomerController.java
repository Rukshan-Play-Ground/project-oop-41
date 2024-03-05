package lk.ijse.dep12.project_d.controller;

import lk.ijse.dep12.project_b.service.CustomerService;
import lk.ijse.dep12.project_b.util.Transfomer;
import lk.ijse.dep12.project_d.aop.*;
import lk.ijse.dep12.project_c.repo.CustomerRepo;

public class CustomerController {

    public static void main(String[] args) {

        CustomerAop customerAop;
        CustomerRepo customerRepo;

        Transfomer transfomer;
        CustomerService customerService;
    }
}
