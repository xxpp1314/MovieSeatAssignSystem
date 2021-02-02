# MovieSeatAssignSystem

Overview
Implement an algorithm for assigning seats within a movie theater to fulfill reservation requests. Assume the movie theater has the seating arrangement of 10 rows x 20 seats, as illustrated to the right.
Your homework assignment is to design and write a seat assignment program to maximize both customer satisfaction and customer
safety. For the purpose of public safety, assume that a buffer of three seats and/or one row is required.

The Movie Theater's Screen
        [[ SCREEN ]]
     --------------------
A    ssssssssssssssssssss
B    ssssssssssssssssssss
C    ssssssssssssssssssss
D    ssssssssssssssssssss
E    ssssssssssssssssssss
F    ssssssssssssssssssss
G    ssssssssssssssssssss
H    ssssssssssssssssssss
I    ssssssssssssssssssss
J    ssssssssssssssssssss
     1      …………       20

Input
R001 2
R002 3
R003 4
R004 3
R005 10
R006 7
R007 9
R008 11
R009 17
R0010 18
R0011 1

OutPut
R001 E1,E2
R002 E6,E7,E8
R003 E12,E13,E14,E15
R004 E19,E20,F1R005 F5,F6,F7,F8,F9,F10,F11,F12,F13,F14
R006 F18,F19,F20,G1,G2,G3,G4
R007 G8,G9,G10,G11,G12,G13,G14,G15,G16
R008 G20,H1,H2,H3,H4,H5,H6,H7,H8,H9,H10
R009 H14,H15,H16,H17,H18,H19,H20,I1,I2,I3,I4,I5,I6,I7,I8,I9,I10
R0010 I14,I15,I16,I17,I18,I19,I20,J1,J2,J3,J4,J5,J6,J7,J8,J9,J10,J11
R0011 J15

Assumption:
1. Booking process is on a first come first served basis.
2. Because the middle positions in middle rows are considered the best for customer experience. And the seat's view in the back are better than the seats in the front. What's more, Customers always want the better seats. So, the system will assign the seats from E to J and from D to A.
3. The same reseversation's persons know each other and they want to sit together. 
4. For the purpose of public safety, the system will allow three buffer seats between different group of people to satisfy the safety of different groups. 

Run:
java MovieTheaterAssignSeats.java inputfilepath
