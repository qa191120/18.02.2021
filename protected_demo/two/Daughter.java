package com.example.two;

import com.example.Papa;

public class Daughter extends Papa {

    public Daughter(int m_vault_keycode, String m_name) {
        super(m_vault_keycode, m_name);
    }


    private void daughterChangeVauleCode() {
        m_vault_keycode = 2345;
    }

}
