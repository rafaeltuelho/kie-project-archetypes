package com.redhat.demos.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DummyModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String firstName;
    private String lastName;    
}
