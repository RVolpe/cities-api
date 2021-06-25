package br.com.mineiro.citiesapi.countries.repository;

import br.com.mineiro.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
