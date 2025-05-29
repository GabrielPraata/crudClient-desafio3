package com.Prata.crudClient_desafio3.dto;

public class FieldMessage {
    private String fieldName;
    private String massage;

    public FieldMessage(String fieldName, String massage) {
        this.fieldName = fieldName;
        this.massage = massage;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMassage() {
        return massage;
    }
}
