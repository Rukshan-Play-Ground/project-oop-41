package lk.ijse.dep12.project_c.repo;

import lk.ijse.dep12.project_c.security.RepoSecurity;
import lk.ijse.dep12.project_b.service.CustomerService;
import lk.ijse.dep12.project_e.componant.CustomerComponant;
import lk.ijse.dep12.project_f.config.*;
public class CustomerRepo {
    RepoSecurity repoSecurity;

    CustomerService customerService;
    CustomerComponant customerComponant;

    AppConfig appConfig;
}
