package com.skilltracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilltracker.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
