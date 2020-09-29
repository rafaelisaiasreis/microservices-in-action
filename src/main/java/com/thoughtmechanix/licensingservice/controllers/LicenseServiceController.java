package com.thoughtmechanix.licensingservice.controllers;

import com.thoughtmechanix.licensingservice.domain.License;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @GetMapping("/{licenseId}")
    public License getLicenses(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId")
            String licenseId) {

        return License.builder().
                id(licenseId).licenseType("Seat")
                .productName("Teleco")
                .organizationId("TestOrg")
                .build();
    }
}
