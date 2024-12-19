package hello.jdbc.domain;


import lombok.Data;

@Data
public class Member {
    private String memberId;
    private int money;

    public Member() {

    }

    public Member(int money, String memberId) {
        this.money = money;
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public int getMoney() {
        return money;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
