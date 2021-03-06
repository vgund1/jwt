package com.medi.svmkrd.security;

import java.util.Optional;
import com.medi.svmkrd.entity.User;

/**
 * 
 * @author vladimir.stankovic
 *
 * Aug 17, 2016
 */
public interface UserService {
    public Optional<User> getByUsername(String username);
}
