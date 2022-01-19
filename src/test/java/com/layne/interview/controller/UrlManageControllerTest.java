package com.layne.interview.controller;

import com.layne.interview.util.DigestUtil;
import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UrlManageControllerTest {

    @Test
    public void testStore() {
        String a = "12312232";
        System.out.println(DigestUtil.encodeHex(a.getBytes(StandardCharsets.UTF_8)));
    }





}