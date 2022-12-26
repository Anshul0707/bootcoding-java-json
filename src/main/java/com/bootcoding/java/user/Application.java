package com.bootcoding.java.user;

public class Application
{
    public static void main(String[] args)
    {
        Role role = new Role();
        role.setName("admin");

        Machine machine = new Machine();
        machine.setName("SMWNODE101");
        machine.setLogicalName("First Floor Machine 1");

        UserDataBase server = new UserDataBase();
    }
}
