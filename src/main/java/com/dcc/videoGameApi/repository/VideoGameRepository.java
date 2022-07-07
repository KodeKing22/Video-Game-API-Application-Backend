package com.dcc.videoGameApi.repository;

import com.dcc.videoGameApi.models.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

public interface VideoGameRepository extends JpaRepository<VideoGame, Integer> {
}
