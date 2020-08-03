package com.tts.weatherapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



// @Data
// @NoArgsConstructor
// @AllArgsConstructor
@Entity
public class ZipCode {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    // @NonNull
    private Long id;

    // @NonNull
    @Column(unique = true)
    private String zipCode;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipcode() {
        return zipCode;
    }

    public void setZipcode(String zipCode) {
        this.zipCode = zipCode;
    }

    public ZipCode() {
    }

    public ZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}