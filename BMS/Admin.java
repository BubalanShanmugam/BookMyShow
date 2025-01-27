package BMS;

public class Admin{//Admion pojo class
    private String name;//AdminNAme var
    private int pass;//AdminPass

    //Admin constructor reassing the admin name and pass.
    public Admin(String name, int pass) {
        this.name = name;
        this.pass = pass;
    }

    //gettor for both name and pass.
        public String getName() {return name;}
        public int getPass() {return pass;}
}

