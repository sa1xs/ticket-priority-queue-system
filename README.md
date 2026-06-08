# Ticket Priority Queue System

Java command-line application for managing support tickets using custom data structures.

## Description

This project simulates a simple ticket management system. Users can create tickets and search for resolved tickets by ID. Administrators can view the next pending ticket and resolve it.

Pending tickets are stored in a custom priority queue, while resolved tickets are stored in a custom singly linked list.

## Features

* Create support tickets.
* Search resolved tickets by ID.
* View the next pending ticket.
* Resolve pending tickets.
* Store pending tickets in a priority queue.
* Store resolved tickets in a singly linked list.

## Data Structures

### Priority Queue

Used to manage pending tickets.

Priority is based on the ticket ID:

* Lower ID means higher priority.
* Older tickets are resolved first.

### Singly Linked List

Used to store resolved tickets.

Resolved tickets can be searched by their unique ID.

## Project Structure

src/

* Main.java
* Ticket.java
* Nodo.java
* ListaEnlazadaTickets.java
* ColaPrioridadTickets.java
* SistemaTickets.java

## Technologies Used

* Java
* Object-Oriented Programming
* Command-Line Interface
* Custom Priority Queue
* Custom Singly Linked List

## Academic Context

This project was developed for a Data Structures course at Universidad CENFOTEC.
