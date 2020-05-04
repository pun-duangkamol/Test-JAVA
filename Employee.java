class Employee{
    //Attribute
    private String id;
    private String name;
    private double salary;
    
    //Method
    public void setID(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void displayEmployee(){
        System.out.println("ID = "+this.id);
        System.out.println("ID = "+this.name);
        System.out.println("ID = "+this.salary);

    }

    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Double getSalary(){
        return this.salary;
    }
}