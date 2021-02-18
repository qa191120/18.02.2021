package com.example;

public class Son extends Papa {

    private int m_brothers;

    public Son(int m_vault_keycode, String m_name, int m_brothers) {
        super(m_vault_keycode, m_name); // p = new papa(m_vault_keycode, m_name);
        this.m_brothers = m_brothers;
    }

    //private Papa p;

    private void changeVauleCode() {
        m_vault_keycode = 2345;
    }

}
