package io.swagger.petstore.entities;

public class MessageResponse {
    private int code;
    private String type;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return
                "MessageResponse{" +
                        "code = '" + code + '\'' +
                        ",type = '" + type + '\'' +
                        ",message = '" + message + '\'' +
                        "}";
    }
}
