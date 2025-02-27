class Student{
    String name;
    int rollNo;
    int marks;
}

class Arrays{
    public static void main(String[] args){
        //arrays

        /* 
        int nums[] = new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=(int) (Math.random()*10);
        }

        //printing array
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println();
        */

       //multi-dimensional arrays
       /* 
       int nums[][] = new int[3][4];

       //assigning values
       for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            nums[i][j] = (int)(Math.random()*10);
        }
       }

       //printing array values
       for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            System.out.print(nums[i][j] +" ");
        }
        System.out.println();
       }
    }
    */

   //Array of objects
    Student s1 = new Student();
    s1.name = "Gaurav";
    s1.rollNo = 25;
    s1.marks = 95;


    Student s2 = new Student();
    s2.name = "Jon Snow";
    s2.rollNo = 30;
    s2.marks = 89;

    Student s3 = new Student();
    s3.name = "Rob Stark";
    s3.rollNo = 35;
    s3.marks = 85;

    Student s[] = new Student[3];
    s[0]=s1;
    s[1]=s2;
    s[2]=s3;

    for(int i=0;i<s.length;i++){
        System.out.println(s[i].name + " : "+ s[i].marks);
    }



}
}