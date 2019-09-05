package com.mentor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentor.model.Mentor;

public interface Mentordao extends JpaRepository<Mentor,Integer> {

}
