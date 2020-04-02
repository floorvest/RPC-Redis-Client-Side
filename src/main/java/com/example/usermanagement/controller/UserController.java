package com.example.usermanagement.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.licensemanagement.model.License;
import com.example.licensemanagement.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class UserController {
    
    /**
     * Controller atau class hanya perlu inject LicenseService
     * tidak perlu register ulang
     */
    @Autowired
    private LicenseService licenseService;

    @GetMapping(value = "/license")
    public License getCurrentLicense() {

        // ambil service method dari licensemanagement by id
        License license = this.licenseService.getById(1L);

        return license;
    }
    
    @GetMapping(value = "/licenses")
    public List<License> getAllLicenses() {
        List<License> licenses = this.licenseService.getLicenses();

        return licenses;
    }

}