class Shaper{
    int height,width;

}
class Rectangle extends Shaper{
    public void set_dims(int width,int height){
        this.height=height;
        this.width=width;
    }
    public void set_dims(int side){
        this.height=side;
        this.width=side;
    }
    public int get_area(){
        return height*width;
    }
}

class triangle extends Shaper{
    int base=super.width;

    public void set_dims(int height,int base){
        this.height=height;
        this.base=base;
    }
    public float get_area(){
        return this.height*this.width*0.5F;
    }
}

public class shape_area {
    public static void main(String[] args) {
        //Shape[] shapes = new Shape[3];
        Rectangle[] shapes =new Rectangle[2];
        shapes[0] = new Rectangle();
        shapes[1] = new Rectangle();
        //shapes[2] = new triangle();

        shapes[0].set_dims(4);
        shapes[1].set_dims(4,5);
        //shapes[2].set_dims(4,5);

        for (int i=0;i<2;i++){
            shapes[i].get_area();
        }
    }
}
