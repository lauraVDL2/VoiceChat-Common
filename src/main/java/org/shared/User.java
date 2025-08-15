package org.shared;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Getter
@Setter
@NodeEntity
public class User {

    @Id @GeneratedValue
    private Long id;

    private String userName;

    private String displayName;

    private String password;

    private String emailAddress;

    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }
}
