package com.github.lucasdias.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.lucasdias.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
