package com.mentor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentor.model.Courses;

public interface Coursesdao extends JpaRepository<Courses,Integer> {

}
