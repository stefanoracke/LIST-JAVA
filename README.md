# LISTS ArrayList, LinkedList, and Vector

All three implement the List interface, which means they store elements in a sequential order and allow duplicates. You can access elements by their position (index).
They offer methods to add, remove, update elements, check their size, and iterate over them.

# Key Differences:

## Underlying Data Structure:

- ArrayList: Uses an internal resizable array to store elements. Elements are stored in contiguous memory locations. (Imagine a wagon with compartments)
- LinkedList: Uses a linked list structure where each element (node) holds data and references to the next and previous element (if it's a doubly linked list). (Think of train cars linked together)
- Vector (Legacy Class): Similar to ArrayList but thread-safe (synchronized for multithreaded access). (Thread-safe wagon with compartments)


## Performance:

### Random Access:
- ArrayList: Fastest for accessing elements by index (like directly accessing a compartment in the wagon)
- LinkedList: Slower for random access because it needs to traverse the linked list to reach a specific position (like finding a specific train car)
- Vector: Same as ArrayList for random access

### Adding/Removing Elements:
- ArrayList: Fast for adding/removing at the end, but slow for adding/removing in the middle as it needs to shift elements in the array. (Adding to the back of the wagon is easy, but moving things in the middle requires rearranging)
- LinkedList: Fastest for adding/removing in the middle because you only need to update references between nodes. (Adding/removing a train car in the middle just involves linking/unlinking)
- Vector: Same as ArrayList for adding/removing elements (not thread-safe operations though)