package com.example.licensemanagement.service;

import java.util.List;

import com.example.licensemanagement.model.License;


public interface LicenseService {
    List<License> getLicenses();
    License getById(Long id);
}