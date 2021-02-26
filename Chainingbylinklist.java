package hashing;
import java.util.ArrayList;
import java.util.LinkedList;

class MyHash
{
    int bucket_size;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int bsize)
    {
        bucket_size=bsize;
        table=new ArrayList<LinkedList<Integer>>(bucket_size);
        for (int i=0;i<bucket_size;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(Integer key)
    {
        int i=key%bucket_size;
        table.get(i).add(key);
    }
    void remove(Integer key)
    {
        int i=key%bucket_size;
        table.get(i).remove(key);
    }
    boolean search(Integer key)
    {
        int i=key%bucket_size;
        return (table.get(i).contains(key));
    }
}
public class Chainingbylinklist {
    public static void main(String[] args) {
        MyHash h1=new MyHash(7);
        h1.insert(10);
        h1.insert(20);
        h1.insert(15);
        h1.insert(7);
        System.out.println(h1.search(20));
        h1.remove(20);
        System.out.println(h1.search(20));

    }
}
