package com.marco.jwtrsa;

import org.junit.Test;

public class JwtTest {

    @Test
    public void build() {
        try {
            System.out.println(JwtUtils.buildJwtRS256());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParse() {
        try {
            String jwt = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJtYXJjbyIsInN1YiI6InRva2VuIiwiaWQiOjEwMDAxfQ.KmPbzze6zGq5dXDt_XBmwGDsRljHC1dDda5vDroBaJCMdojKczyCUuBYQ203WY7WvgofFnmDw8t2APncDthdEbOxZ2lLXZeiadY6DnSVzOierTzehXGLq7jjONif5I_1vnyrkL5D6EQ2c7RrQNQZmkYGu_pSTkifC9bHJrlKMTs";
            JwtUtils.parseJwtRS256(jwt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
