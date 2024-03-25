package com.google.login.demo.privates;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivatesController {

    @GetMapping("/private/messages")
    @PreAuthorize("hasRole('USER')")
    public String privateMessage(@AuthenticationPrincipal OAuth2User user) {
        String username = user.getAttribute("name");
        return "Hello ! You can see this because you are logged in." + username + '!';
    }
}
