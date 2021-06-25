package br.com.mineiro.citiesapi.states.repository;

import br.com.mineiro.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
