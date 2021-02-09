# MovieSeatAssignSystem

Overview
Implement an algorithm for assigning seats within a movie theater to fulfill reservation requests. Assume the movie theater has the seating arrangement of 10 rows x 20 seats, as illustrated to the right.
Your homework assignment is to design and write a seat assignment program to maximize both customer satisfaction and customer
safety. For the purpose of public safety, assume that a buffer of three seats and/or one row is required.


Assumption:
1. Booking process is on a first come first served basis.
2. Because the middle positions in middle rows are considered the best for customer experience. And the seat's view in the back are better than the seats in the front. What's more, Customers always want the better seats. So, the system will assign the seats from E to J and from D to A.
3. The same reseversation's persons know each other and they want to sit together. 
4. For the purpose of public safety, the system will allow three buffer seats between different group of people to satisfy the safety of different groups. 

Run Steps:
java MovieTheaterAssignSeats.java #inputfilepath
