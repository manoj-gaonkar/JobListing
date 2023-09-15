package com.manoj.joblisting.Repository;

import com.manoj.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{
}
