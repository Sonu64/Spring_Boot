package com.sonusantu64.gmail.Module_01_Intro.impl;

import com.sonusantu64.gmail.Module_01_Intro.DatabaseService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@ConditionalOnProperty(name="database.service", havingValue="mongoDB")
public class MongoDBService implements DatabaseService {
    @Override
    public void connectToDatabase(String dbName) {
        System.out.println("Connecting to  " + dbName + "..... ");
    }
}
