package com.example;

public class TriangleAllEqual extends TriangleEqualSides {
    public TriangleAllEqual(double m_a, double m_h) {
        super(m_a, m_a, m_h);
    }

    @Override
    public double getHekef() {
        return m_a * 3;
    }

    @Override
    public double getArea() {
        return m_a * Math.sqrt(3) / 4.0;
    }

}
