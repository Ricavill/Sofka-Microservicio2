package com.example.sofkatransaction.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("cuentas")
public class AccountController {

    public AccountController() {
    }

    @GetMapping("")
    public Map<String, Object> getClient() {
        return Map.of("account", 2);
    }
}