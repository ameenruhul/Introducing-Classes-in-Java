package ruhul.StackClass.book;

public class test {

    public  static void main(String[] args){
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //push

        for(int i = 0; i < 10;i = i + 1)
            mystack1.push(i);


        for(int j = 10; j < 20;j = j + 1)
            mystack2.push(j);

        //pop

        System.out.println("Stack in my stack1 : ");

        for(int i = 0; i < 10;i = i + 1)
            System.out.println(mystack1.pop());

        System.out.println("Stack in my stack2 : ");

        for(int i = 0; i < 10;i = i + 1)
            System.out.println(mystack2.pop());

    }
}
