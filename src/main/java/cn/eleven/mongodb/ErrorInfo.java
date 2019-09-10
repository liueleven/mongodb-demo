package cn.eleven.mongodb;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-10 16:04
 * @author: 十一
 */
public class ErrorInfo {

    private String id;

    private String cn;

    private String en;

    private int code;

    public ErrorInfo(String cn, String en, int code) {
        this.cn = cn;
        this.en = en;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ErrorInfo{" +
                "id='" + id + '\'' +
                ", cn='" + cn + '\'' +
                ", en='" + en + '\'' +
                ", code=" + code +
                '}';
    }
}
