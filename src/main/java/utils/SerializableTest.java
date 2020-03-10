package utils;

import java.io.*;
import java.lang.annotation.Native;

/**
 * 序列化原理
 * <br/>
 *
 * @author F88886
 * @date 2020/3/9 17:22
 */
public class SerializableTest {

    public static void main(String[] args)throws Exception {
        //序列化
        FileOutputStream fos = new FileOutputStream("d:/object.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        User user1 = new User("xuliugen", "123456", null);
        oos.writeObject(user1);
        oos.flush();
        oos.close();
        //反序列化
        FileInputStream fis = new FileInputStream("d:/object.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        User user2 = (User) ois.readObject();
        System.out.println(user2.getUserName()+ " " +
                user2.getPassword() + " " + user2.getSex());
        //反序列化的输出结果为：xuliugen 123456 male
    }

    private static class User implements Serializable {
        private transient String userName;
        private String password;
        private String sex;

        public User(String userName, String password, String sex) {
            this.userName = userName;
            this.password = password;
            this.sex = sex;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }
}
