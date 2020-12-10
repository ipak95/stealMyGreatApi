package com.example.rest.service;

import Domain.Read;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class greetingController {



            @GetMapping("/welcome")
            public ArrayList<String> greeting() {
                ArrayList<String> machineArray = new ArrayList<>();
                machineArray.add("Machine speed = " + Read.getMachineSpeed());
                machineArray.add("Vibration = " + Read.getVibration());
                machineArray.add("Humidity = " + Read.getHumidity());
                machineArray.add("Temperature = " + Read.getTemperature());
                machineArray.add("Machine speed = " + Read.getMachineSpeed());
                machineArray.add("Current quantity = " + Read.getCurrentQuantity());
                machineArray.add("Current product = " + Read.getCurrentProduct());
                machineArray.add("Current batch id = " + Read.getCurrentBatchId());
                machineArray.add("Failed products produced = " + Read.getFailedProductsProduced());
                machineArray.add("Products produced = " + Read.getProductsProduced());

                return machineArray;
            }

}
