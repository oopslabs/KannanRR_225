import java.util.*;
class box{
    int l,b;
    box(int l,int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println("Area of box is : "+6*(l*b));
    }
}
class box3d extends box{
    int h;
    box3d(int l,int b,int h){
        super( l, b);
        this.h=h;
    }
    void vol(){
        System.out.println("Volume of 3d box : "+l*b*h);
    }
}
class inherit{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length ,breadth and height");
        int l=s.nextInt();
        s.nextLine();
        int b=s.nextInt();
        s.nextLine();
        int h=s.nextInt();
        s.nextLine();
        box3d b2=new box3d(l,b,h);
        b2.area();
        b2.vol();
    }   
}