package Chapter16.exercise15;

public class LinkedIntList
{
    /*
        Write a method called removeEvens that removes the values in even-numbered indexes from a list, returning a new
        list that contains those values in their original order. For example, consider a variable list1 that stores the
        values [8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92] and imagine that the following call is made:
        LinkedIntList list2 = list1.removeEvens();
        After the call, list1 should store [13, 4, 12, 41, 23, 92] and list2 should store [8, 17, 9, 98, 7, 0].
        You may not call any methods of the class other than the constructor to solve this problem. You may not create any
        new nodes nor change the values stored in data fields to solve this problem. You must solve it by rearranging the links
        of the list.
    */

    private ListNode front;

    //  Exercise 15 ////////////////////////////////////////////////////////
    public LinkedIntList removeEvens()
    {
        LinkedIntList list2 = new LinkedIntList();

        ListNode current = front.next;

        list2.add(front.getData());

        front = current;

        while(current.next != null)
        {
            list2.add(current.next.getData());
            current.next = current.next.next;
            current = current.next;
        }
        return list2;
    }
    ////////////////////////////////////////////////////////

    public LinkedIntList()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
