class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String s){
        name = s;
    }

    public void setAge(int a){
        age = a;
    }
}

class Encapsulation{
    public static void main(String[] args){
        Human obj = new Human();
        obj.setName("Gaurav");
        obj.setAge(24);

        System.out.println(obj.getName() +" : "+ obj.getAge());
    }
}
