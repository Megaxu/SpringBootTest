package com.example.com.example.SpringBootTest.repos;

import com.example.com.example.SpringBootTest.domain.Message;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {

  List<Message> findByTag(String tag);

}
