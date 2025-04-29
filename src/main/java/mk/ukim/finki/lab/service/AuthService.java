package mk.ukim.finki.lab.service;

import mk.ukim.finki.lab.model.User;

public interface AuthService {

    User login(String username, String password);
}
