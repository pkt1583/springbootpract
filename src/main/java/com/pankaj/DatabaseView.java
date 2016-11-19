package com.pankaj;

import org.springframework.web.bind.annotation.*;

@RestController

public class DatabaseView {
    @RequestMapping(path = "/dbview/{tableName}")
    public String getDbData(@PathVariable("tableName") String tableName){
        return "You requested for "+tableName;
    }
}
