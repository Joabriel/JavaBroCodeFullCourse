class FullCourse{
    public static void main(String[]args){
        String x = "Equis";
        String y = "Ye";
        String temp;

        temp=x;
        x=y;
        y=temp;
        
        System.out.print("X"+x+" "+"Y"+y);

        //XYe //YEquis.
    }
}