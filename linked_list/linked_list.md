{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 # Linked List\
\
A **Linked List** is a linear data structure where elements are not stored in contiguous memory locations. Instead, each element, or node, points to the next node by storing a reference (or link).\
\
## Operations\
- **Insert**: Add a new node to the list.\
- **Delete**: Remove a node from the list.\
- **Display**: Traverse and display the list.\
\
### Code Example:\
\
```python\
# Create a Linked List\
ll = LinkedList()\
\
# Insert values\
ll.insert(10)\
ll.insert(20)\
ll.insert(30)\
\
# Display list\
ll.display()  # Output: 10 -> 20 -> 30 -> None\
\
# Delete a value\
ll.delete(20)\
ll.display()  # Output: 10 -> 30 -> None\
}