/**
 * Created by William.Teng on 10/12/16.
 */

/*
* 封装
* 一个Java源代码中可以定义多个类, 但public修饰的类只能有一个,必须与文件名相同
 */

public class Test04
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.setName("Davor Li");
        emp.setPassword("112233");
        emp.setAge(32);

        emp.show();
    }
}

class Employee
{
    private String name;
    private String password;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if(name == null || "".equals(name) || name.length() >10)
        {
            System.out.println("Invalid Name!");
            name = "No Name";
        }
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        if (password.length() < 5)
            System.out.println("password should be less than 6 digit!");
        else
            this.password = password;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age < 0 || age > 100)
            System.out.println("Invalid age scope - out of 0 - 100!");
        else
            this.age = age;
    }

    public void show()
    {
        System.out.println("Name is "+name+", password is "+password+", age is "+age+".");
    }
}
