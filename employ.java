public class employ{
    int e_id=0;
    int e_age=0;
    int e_dob=0;
    int e_salary=0;
    employ(int id,int age,int dob,int salary){
        e_id=id;
        e_age=age;
        e_dob=dob;
        e_salary=salary;
    }
    public  String display(){
        return "Id "+this.e_id+"||"+"Age "+this.e_age+"||"+"Year of birth "+this.e_dob+"||\n"+"Salary "+this.e_salary;
    }

}