package com.skilltracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.skilltracker.model.Skill;
import com.skilltracker.service.SkillService;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin(origins = "*")
public class SkillController {
	private final SkillService service;
	
	public SkillController(SkillService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Skill> getAll(){
		return service.getAllSkills();
	}
	
	@PostMapping
	public Skill create(@RequestBody Skill skill) {
		return service.createSkill(skill);
	}
	
	@PutMapping("/{id}")
	public Skill update(@PathVariable Long id,@RequestBody Skill skill) {
		return service.updateSkill(id, skill);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteSkill(id);
	}
}
