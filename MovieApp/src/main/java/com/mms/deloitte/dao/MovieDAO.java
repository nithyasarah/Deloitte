package com.mms.deloitte.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mms.deloitte.model.Movie;


@Repository
public interface MovieDAO  extends CrudRepository<Movie, Integer> {

}
