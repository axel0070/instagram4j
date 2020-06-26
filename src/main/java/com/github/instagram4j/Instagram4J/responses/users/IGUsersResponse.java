package com.github.instagram4j.Instagram4J.responses.users;

import com.github.instagram4j.Instagram4J.models.IGUser;
import com.github.instagram4j.Instagram4J.responses.IGResponse;

import lombok.Data;

@Data
public class IGUsersResponse extends IGResponse {
    private IGUser user;
}
