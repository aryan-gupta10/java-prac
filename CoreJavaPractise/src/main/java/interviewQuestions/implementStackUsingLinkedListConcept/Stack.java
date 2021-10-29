package interviewQuestions.implementStackUsingLinkedListConcept;


public class Stack
{
    private class Node
    {
        String value;
        Node nextNode;
    }

    Node head;

    public Stack()
    {
        head = null;
    }

    private boolean isEmpty()
    {
        return head == null;
    }

    private void push(String value)
    {
        Node oldHead = head;
        head = new Node();
        head.value = value;
        head.nextNode = oldHead;
    }

    // If a stack is empty, the head of the stack is always null
    private String pop()
    {
        if (head == null)
        {
            return "The stack is empty";
        }
        String poppedValue = head.value;
        head = head.nextNode;

        return poppedValue;
    }

    private String printStack()
    {
        Node temp = head;
        String stackValues = "";
        while (temp != null)
        {
            stackValues = stackValues + temp.value + " ";
            temp = temp.nextNode;
        }
        return stackValues;
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();

        System.out.println("Result of popping a value without pushing any: " + stack.pop());

        System.out.println("Is stack empty:" + stack.isEmpty());

        stack.push("DummyOne");
        stack.push("DummyTwo");
        stack.push("DummyThree");

        System.out.println("Added elements in stack, is it still empty?: " + stack.isEmpty());

        System.out.println("Printing the values in stack: " + stack.printStack());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped another element: " + stack.pop());

    /*  Output:

        Result of popping a value without pushing any: The stack is empty
        Is stack empty:true
        Added elements in stack, is it still empty?: false
        Printing the values in stack: DummyThree DummyTwo DummyOne
        Popped element: DummyThree
        Popped another element: DummyTwo
    */

    }
}
