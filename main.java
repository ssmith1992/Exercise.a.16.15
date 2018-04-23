package Chapter16.exercise15;

public class main
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(8);
        list.add(13);
        list.add(17);
        list.add(4);
        list.add(9);
        list.add(12);
        list.add(98);
        list.add(41);
        list.add(7);
        list.add(23);
        list.add(0);
        list.add(92);

        LinkedIntList list2 = new LinkedIntList();
        list2 = list.removeEvens();

        System.out.println(list);
        System.out.println(list2);
    }
}
