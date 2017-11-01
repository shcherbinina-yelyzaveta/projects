package com.company.task12.Sizes;

public enum Sizes {
    XS(36), S(38), M(40), L(42), XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    };

    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
