package Chapter16.exercise15;

/*
Write a method called notEquals that accepts a second list as a parameter, returns true if the two lists are not
equal, and returns false otherwise. Two lists are considered unequal if they store the different values in any random
order and do not have the same length.
 */
public class Exercise15 {

    private ListNode front;

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

    public Exercise15()
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
