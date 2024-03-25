package com.google.login.demo.oauth2client;


import com.google.login.demo.oauth2client.OAuth2Client;
import com.google.login.demo.oauth2client.OAuth2ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class OAuth2ClientService {

    private final OAuth2ClientRepository oAuth2ClientRepository;

    public OAuth2ClientService(OAuth2ClientRepository oAuth2ClientRepository) {
        this.oAuth2ClientRepository = oAuth2ClientRepository;
    }

    public OAuth2Client addOAuth2Client(OAuth2Client oAuth2Client) {
        return oAuth2ClientRepository.save(oAuth2Client);
    }
}
