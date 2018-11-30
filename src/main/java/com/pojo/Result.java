package com.pojo;

public class Result {
    private Boolean Flag;
    private int Err_code;
    private String Msg;

    public Boolean getFlag() {
        return Flag;
    }

    public int getErr_code() {
        return Err_code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setFlag(Boolean flag) {
        Flag = flag;
    }

    public void setErr_code(int err_code) {
        Err_code = err_code;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }
}
