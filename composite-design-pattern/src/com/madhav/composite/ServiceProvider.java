package com.madhav.composite;

import com.madhav.component.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
public class ServiceProvider implements Service
{
    private List<Service> services = new ArrayList<>();
    @Override
    public void service(String serviceType)
    {
        for (Service service :  services)
        {
            service.service(serviceType);
        }
    }

    public void addService(Service service){
        services.add(service);
    }

    public void deleteService(Service service){
        services.remove(service);
    }

    public void clearServices(){
        services.clear();
    }
}
