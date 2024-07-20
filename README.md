
# Implementing LinkedList/Stack/Queue in Java using Class

## Introduction(LinkedList)

A Linked List is a linear data structure similar to arrays. However, unlike arrays, the elements in a Linked List are not stored in contiguous memory locations. Instead, elements are connected through pointers, making it a dynamic data structure that can grow and shrink in size as needed.

![Linked List Structure](Linkedlist.png)

In this implementation, the `LinkedList` can be represented as a class and the `Node` as a separate class. The `LinkedList` class contains a reference of `Node` class type, which allows us to link the nodes together.

## Features

- Dynamic size adjustment
- Efficient insertions and deletions
- Implementation of common linked list operations:
  - Insertion (at beginning, end, and specific position)
  - Deletion (by value and by position)
  - Searching (by value)
  - Displaying the list

## Class Structure

### Node Class

The `Node` class represents a single element in the Linked List. Each `Node` contains:
- `data`: The value stored in the node.
- `next`: A reference to the next node in the list.

### LinkedList Class

The `LinkedList` class contains:
- `head`: A reference to the first node in the list.
- Methods to manipulate the linked list.

## Methods

### LinkedList Methods

1. **insertAtBeginning(int data)**:
   - Inserts a new node at the beginning of the list.

2. **insertAtEnd(int data)**:
   - Inserts a new node at the end of the list.

3. **insertAtPosition(int data, int position)**:
   - Inserts a new node at the specified position in the list.

4. **deleteByValue(int data)**:
   - Deletes the first occurrence of the specified value from the list.

5. **deleteByPosition(int position)**:
   - Deletes the node at the specified position.

6. **search(int data)**:
   - Searches for the node with the specified value and returns its position.

7. **display()**:
   - Displays all the nodes in the list.

## Example Usage

Here's an example of how to use the `LinkedList` class:

```java
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 2);
        list.display(); // Output: 5 -> 10 -> 15

        list.deleteByValue(10);
        list.display(); // Output: 5 -> 15

        list.insertAtEnd(20);
        list.deleteByPosition(1);
        list.display(); // Output: 5 -> 20

        int position = list.search(20);
        System.out.println("Position of 20: " + position); // Output: Position of 20: 2
    }
}
```

## Conclusion

Linked Lists are a fundamental data structure that provides flexibility over arrays for dynamic memory management. This implementation in Java demonstrates the basic operations and provides a foundation for more advanced linked list variations, such as doubly linked lists and circular linked lists.
