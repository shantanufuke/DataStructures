A **Linked List** is a linear data structure where elements are not stored in contiguous memory locations. Instead, each element, or node, points to the next node by storing a reference (or link).

## Operations
- **Insert**: Add a new node to the list.
- **Delete**: Remove a node from the list.
- **Display**: Traverse and display the list.

### Code Example:

```python
# Create a Linked List
ll = LinkedList()

# Insert values
ll.insert(10)
ll.insert(20)
ll.insert(30)

# Display list
ll.display()  # Output: 10 -> 20 -> 30 -> None

# Delete a value
ll.delete(20)
ll.display()  # Output: 10 -> 30 -> None
}
