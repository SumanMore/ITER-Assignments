public class NodeMax
{
  public int ele;
 public  int max;
  NodeMax(int e,int m)
  {
    ele=e;
    max=m;
  }
}

import java.util.*;
import java.util.LinkedList;
class Main {
  Deque<NodeMax> list=new LinkedList<>();
  public boolean empty()
  {

    return list.isEmpty();
  }
  public Integer max()

  {
    if(empty())
   {
     throw new IllegalStateException("max(): empty stack");
   }
    return list.peekFirst().max;
  }
  public void push(int x)
  {
    NodeMax New=new NodeMax(x,Math.max(x,empty()?x:max()));
    list.addFirst(New);
  }
  public Integer pop()

  {
    if(empty())
   {
     throw new IllegalStateException("max(): empty stack");
   }
    return list.removeFirst().ele;
  }
  public Integer peek()
  {
    return list.peekFirst().ele;
  }


  public static void main(String[] args) {
    Main ob=new Main();
    //push operation
    ob.push(5);
     ob.push(2);
      ob.push(9);
       ob.push(7);
       ob.push(4);
       //max
       System.out.println(ob.max());
       ob.pop();
       ob.pop();
       ob.pop();
        System.out.println(ob.max());

  }
}