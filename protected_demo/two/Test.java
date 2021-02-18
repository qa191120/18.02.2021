package com.example.two;

import com.example.Son;

public class Test {

    public void test()
    {
        Son s = new Son(1234, "moshe", 28);
        // cannot access since it is protected and NOT in same package
        // s.m_vault_keycode
    }
}
