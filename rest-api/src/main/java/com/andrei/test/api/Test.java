package com.andrei.test.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.andrei.test.model.TestModelFromAnotherModule;
import com.andrei.test.model.TestModelFromSameModule;

@RestController
public class Test {

    //TODO daca comentezi metoda aceasta functioneaza
    @PostMapping
    public String getNotWorking(@RequestBody TestModelFromAnotherModule test) {
        return "";
    }


    @PostMapping("/test2")
    public String getWorking2(@RequestBody TestModelFromSameModule test) {
        return "";
    }

    @PostMapping("/test")
    public String getWorking() {
        new TestModelFromAnotherModule();
        return "";
    }
}
