public class User {
    public String name;
    public int experience;
    public Profession profession;

    public User(String name, int experience, Profession profession) {
        this.name = name;
        this.experience = experience;
        this.profession = profession;
    }
    public void calculateSalary(){
        double salary = 1000 * experience * profession.getCoefficient();
        System.out.println(name + ": " + salary);
    }
    public void calculateSalaryBonus(double bonus){
        double salary = 1000 * experience * profession.getCoefficient() + bonus;
        System.out.println(name + ": заработная плата с премией будет - " + salary);
    }
}
