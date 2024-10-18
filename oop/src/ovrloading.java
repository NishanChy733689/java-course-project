class student{
    String name;
    int id;
    float stipend;
    student(){
        System.out.println("you did  nothing");
    }
    student(String name,int id){
        this.id=id;
        this.name=name;
    }
    student(String name,int id,float stipend){
        this.id=id;
        this.name=name;
        this.stipend=stipend;
    }

    public void display(){
        System.out.print("Name : "+this.name+"\n"+"Id : "+this.id+"\n"+"Stipend : "+this.stipend+"\n\n");
    }
}



public class ovrloading {
    public static void main(String[] args) {
        student student1=new student();
        student student2=new student("Nishan",1);
        student student3=new student("Ishan",2, 0.2F);

        //print the details of the method overloading

        student1.display();
        student2.display();
        student3.display();
        }
    }
