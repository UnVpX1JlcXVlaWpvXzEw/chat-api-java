package com.hustleaddiction.chat.chat_api.insfrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hustleaddiction.chat.chat_api.domain.aggregate.chat.Message;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.UUID;

@Repository
public interface MessageRepository extends JpaRepository<Message, UUID>
{
    Page<Message> findByConversationId(UUID conversationId, Pageable pageable);
}

