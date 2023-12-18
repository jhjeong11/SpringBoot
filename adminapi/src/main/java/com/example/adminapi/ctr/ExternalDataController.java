package com.example.adminapi.ctr;

import com.example.adminapi.domain.ExternalData;
import com.example.adminapi.domain.ExternalDataProvider;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8084")
public class ExternalDataController {

    @GetMapping("/external-data")
    public List<ExternalData> getExternalData() {
        return ExternalDataProvider.getExternalData();
    }

    @GetMapping("/external-data/{id}")
    public ExternalData getExternalDataById(@PathVariable String id) {
        return ExternalDataProvider.getExternalDataById(id);
    }
}