package com.google.login.demo.oauth2client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuth2ClientRepository extends JpaRepository<OAuth2Client, Long> {
}
