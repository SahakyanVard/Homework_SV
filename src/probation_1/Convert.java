package probation_1;

public class Convert {
   private String name;
   private String surname;
   private String nationality;
   private String profession;
   private double salary;


   @Override
   public String toString() {
      return name;
   }


   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      if (salary>0)
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public String getNationality() {
      return "**********";
   }

   public void setNationality(String nationality) {
      this.nationality = nationality;
   }

   public String getProfession() {
      return profession;
   }

   public void setProfession(String profession) {
      this.profession = profession;
   }

   public void Method1() {
      System.out.println(name.concat(" ")
              .concat(surname).concat("\n/")
              .concat(profession).concat("/")
              .concat(nationality).concat("-") + salary);
   }

   public int salary(int salary) {
      return salary / 400;
   }

   public double profess(double[] array) {
      double d = 0;
      for (double prof : array) {
         if (prof == 0) {
         }
         d += prof;
      }return d;
   }
}
