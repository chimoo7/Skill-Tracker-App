package com.skilltracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skilltracker.model.Skill;
import com.skilltracker.repository.SkillRepository;

@Service 
public class SkillService {
	
	private final SkillRepository repo ;
	
	public SkillService(SkillRepository repo) {
        this.repo = repo;
    }
	public List<Skill> getAllSkills(){
		return repo.findAll();
	}
	public Skill createSkill(Skill skill) {
		return repo.save(skill);
	}
	public Skill updateSkill(Long id, Skill skill) {
		Skill existing = repo.findById(id).orElseThrow();
		existing.setName(skill.getName());
		existing.setLevel(skill.getLevel());
	    existing.setNotes(skill.getNotes());
	    existing.setTags(skill.getTags());
        return repo.save(existing);
	}
	public void deleteSkill(Long id) {
		repo.deleteById(id);
	}
}
