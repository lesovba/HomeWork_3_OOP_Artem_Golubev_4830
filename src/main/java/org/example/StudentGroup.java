package org.example;

public class StudentGroup
{
    private String nameGroup;
    private int numberStudent;

    public StudentGroup(String nameGroup, int numberStudent)
    {
        this.nameGroup = nameGroup;
        this.numberStudent = numberStudent;

    }

    public String getNameGroup()
    {
        return nameGroup;

    }

    public void setNameGroup(String nameGroup)
    {
        this.nameGroup = nameGroup;

    }

    public int getNumberStudent()
    {
        return numberStudent;

    }

    public void setNumberStudent(int numberStudent)
    {
        this.numberStudent = numberStudent;

    }
}

