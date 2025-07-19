package com.hustleaddiction.chat.chat_api.insfrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hustleaddiction.chat.chat_api.domain.conversation.Message;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
public interface MessageRepository extends JpaRepository<Message, UUID>
{
    List<Message> findByConversationId(UUID conversationId);
}

