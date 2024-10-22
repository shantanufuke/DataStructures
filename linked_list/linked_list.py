{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Node:\
    def __init__(self, value):\
        self.value = value\
        self.next = None\
\
class LinkedList:\
    def __init__(self):\
        self.head = None\
\
    def insert(self, value):\
        new_node = Node(value)\
        if self.head is None:\
            self.head = new_node\
        else:\
            current = self.head\
            while current.next:\
                current = current.next\
            current.next = new_node\
\
    def display(self):\
        current = self.head\
        while current:\
            print(current.value, end=" -> ")\
            current = current.next\
        print("None")\
\
    def delete(self, value):\
        if self.head is None:\
            return\
\
        if self.head.value == value:\
            self.head = self.head.next\
            return\
\
        current = self.head\
        while current.next and current.next.value != value:\
            current = current.next\
\
        if current.next:\
            current.next = current.next.next\
}