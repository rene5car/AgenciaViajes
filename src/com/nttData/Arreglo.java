package com.nttData;

public class Arreglo {
    private String ctesNames;
    private static String[] Ctes = new String[4];
    private String ctesName;

    public void setCteNames(String Ctes)
    {
        ctesName =  Ctes;
    }
    public void setCtelastNames(String Ctes)
    {
        ctesName =  Ctes;
    }

    public static void setCtesNames(int number, String name)
    {
        Ctes[number] = name;
    }
    public static String getCtes(int number)
    {
        return Ctes[number];
    }
}
