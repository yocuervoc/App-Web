package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passgenerator {

    public static void main(String ...args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        System.out.println(bCryptPasswordEncoder.encode("1234"));
    }
}
/*
INSERT INTO user (id,enabled,password,username) VALUES(1,0b1,"$2a$04$1Qq2NKbjuSgWPGbaVNWyiOx4DhWMNfjuCZHbl52AuIPLU4ZT6ACfq","admin");


INSERT INTO user (id,enabled,password,username) VALUES(2,0b1,"$2a$04$1Qq2NKbjuSgWPGbaVNWyiOx4DhWMNfjuCZHbl52AuIPLU4ZT6ACfq
","cuervo");


INSERT INTO authority (id,authority) VALUES (1,"ROLE_ADMIN");
INSERT INTO authority (id,authority) VALUES (2,"ROLE_USER");
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (1,1);
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (1,2);
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (2,2);

*
*
*/

