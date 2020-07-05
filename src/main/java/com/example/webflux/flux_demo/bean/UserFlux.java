package com.example.webflux.flux_demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFlux {
    private String name;
    private String pwd;
    private String id;
}
