package com.example.cs455020su1kevinyuprototypeserverjava.Repositories;

import com.example.cs455020su1kevinyuprototypeserverjava.Models.Forum;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ForumRepository extends CrudRepository<Forum, Integer> {


  @Query("SELECT forum FROM Forum forum")
  List<Forum> findAllForums();

  @Query("DELETE FROM Forum forum WHERE forum.id=:forumId")
  void deleteForumById(@Param("forumId") Integer forumId);

  @Query("SELECT forum FROM Forum forum WHERE forum.id=:forumId")
  Forum getForumById(@Param("forumId") Integer forumId);

}
