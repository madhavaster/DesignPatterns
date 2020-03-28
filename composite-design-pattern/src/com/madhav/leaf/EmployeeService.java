package com.madhav.leaf;


import com.madhav.component.Service;

/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
public class EmployeeService implements Service
{
    @Override
    public void service(String serviceType)
    {
        System.out.println(serviceType + " of EmployeeService");
    }
}
