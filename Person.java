public class Person {

    private String firstName;
    private String lastName;
    private String gender;

    public Person()
  {
    }


    public Person(String firstName, String lastName, String gender) 
  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }


    public String getFirstName() 
  {
        return firstName;
    }

    public String getLastName() 
  {
        return lastName;
    }

    public String getGender() 
  {
        return gender;
    }


    public void setFirstName(String firstName) 
  {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
  {
        this.lastName = lastName;
    }

    public void setGender(String gender) 
  {
        this.gender = gender;
    }


    @Override
    public String toString() 
  {
        return "First Name: " + firstName +
               ", Last Name: " + lastName +
               ", Gender: " + gender;
    }

 
    public boolean equals(Person p)
  {
        if (p == null) {
            return false;
        }

        if (!this.firstName.equals(p.firstName))
        {
            return false;
        }

        if (!this.lastName.equals(p.lastName))
        {
            return false;
        }

        if (!this.gender.equals(p.gender)) 
        {
            return false;
        }

        return true;
    }
}
