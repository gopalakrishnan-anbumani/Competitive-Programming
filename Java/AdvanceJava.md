#Generics
To make our components more general, we can use the Object class type. Have a look at the following Record class:

class Record {
    private Object[] record;
    public Object add(Object item) {
        // Code to add record item
    }
    public Object get(int index) {
        // Code to get record at specified index
    }
}
Now this class can be used for keeping a record of any kind of object.

The above code serves the purpose, but it is not the best approach. Why?

This approach has some drawbacks:

Any type of object (Student, String, Integer etc.) can be pushed into the record

If the record is supposed to hold only Books, we cannot restrict it to do so

Record bookRecord = new Record();
bookRecord.add(new Book("Java"));
bookRecord.add(new Student("Mark Smith"));    // This will be allowed
The Object that we get from the record has to be type casted back to the required type before use

This type cast is unsafe. The compiler won’t check whether the typecast is of the same type as the data stored in the record. And so the cast may fail at runtime.

Book book = (Book) bookRecord.get(1);    // Type casting Object to Book
Since we have added Student record at index 1 the above type cast will fail at run time giving ClassCastException. Hence making type cast unsafe.

What we need is to have classes, interfaces and methods that could be used for multiple kinds of objects, but still be tied to a particular type.

If they could accept the type at runtime, it would enable the reusability of the same functionalities for different types.

 

In Java, this can be done using Generics.