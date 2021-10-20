package com.github.lucasdias.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.lucasdias.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
