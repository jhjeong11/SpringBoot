package com.example.adminapi.ctr;

import com.example.adminapi.domain.ExternalData;
import com.example.adminapi.domain.ExternalDataProvider;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8083")
public class ExternalDataController {

    @GetMapping("/external-data")
    public List<ExternalData> getExternalData() {
        return ExternalDataProvider.getExternalData();
    }

}
