package demo;

public class Receiver {
    private String account;
    private String password;
    private String telNo;

    public void IniUser() {
        UserInfoDTO user = new UserInfoDTO();

        user.setAccount("yusin");
        user.setPassword("123456");
        user.setTelNo("13000000000");
        System.out.println("状态一：");
        user.show();
        System.out.println("Account:" + this.account);
        System.out.println("---------------------------");
    }

    public void ChangeUser() {
        UserInfoDTO user = new UserInfoDTO();

        user.setPassword("111111");
        user.setTelNo("13100001111");
        System.out.println("状态二：");
        user.show();
        System.out.println("---------------------------");
    }
}
