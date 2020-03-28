package com.madhav;

import com.madhav.component.Service;
import com.madhav.composite.ServiceProvider;
import com.madhav.leaf.AdminService;
import com.madhav.leaf.EmployeeService;

/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
public class Client
{
    public static void main(String[] args)
    {
        ServiceProvider serviceProvider = new ServiceProvider();

        Service employeeService1 = new EmployeeService();
        Service employeeService2 = new EmployeeService();
        Service adminService = new AdminService();

        serviceProvider.addService(employeeService1);
        serviceProvider.addService(employeeService2);
        serviceProvider.addService(adminService);

        serviceProvider.service("Registration Service");

    }
}
