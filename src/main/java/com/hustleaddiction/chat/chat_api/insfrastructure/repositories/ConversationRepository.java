package com.hustleaddiction.chat.chat_api.insfrastructure.repositories;

import com.hustleaddiction.chat.chat_api.domain.aggregate.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, UUID> {
    Optional<Conversation> findByUserId(UUID userId);
}

