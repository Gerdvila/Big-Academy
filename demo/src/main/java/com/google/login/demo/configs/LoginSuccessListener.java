package com.google.login.demo.configs;

import com.google.login.demo.oauth2client.OAuth2Client;
import com.google.login.demo.oauth2client.OAuth2ClientService;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;

@Component
public class LoginSuccessListener implements ApplicationListener<InteractiveAuthenticationSuccessEvent> {

    private final OAuth2ClientService oAuth2ClientService;

    public LoginSuccessListener(OAuth2ClientService oAuth2ClientService) {
        this.oAuth2ClientService = oAuth2ClientService;
    }

    @Override
    public void onApplicationEvent(InteractiveAuthenticationSuccessEvent event) {
        OAuth2User oAuth2User = (OAuth2User) event.getAuthentication().getPrincipal();

        OAuth2Client oAuth2Client = new OAuth2Client(
                oAuth2User.getAttribute("email"), oAuth2User.getAttribute("name")
        );

        oAuth2ClientService.addOAuth2Client(oAuth2Client);
    }
}
