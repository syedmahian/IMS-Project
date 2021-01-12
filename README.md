Coverage: 34%
# Inventory Management System

The Inventory Management System or IMS project is a Maven project with full CRUD functionalities for customers, items and orders. The aim of the project was to build a system that can store and manipulate data on the cloud. This was done using a mySQL database which was hosted on GCP. The system was then tested using Junit and Mokito.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
Install: Eclipse IDE for Java and JDK14 as well as MySQL Server (locally running the project). You can also run the MySQL Server on a GCP instance.
```

### Installing

The repository can be cloned with the following command in your terminal Make sure you are running the latest version of Java and MySQL 5.7 Server. The DBUtils files need to be changed to reflect this with your MySQL IP address. Cloning the project will give you an IMS-Starter directory which you can open in Eclipse or another IDE of your choice.

```
git clone <repoURL>.git
```

## Running the project

Once the project starts it will ask the user to enter their username and password which are booth "root".

```
user: root
password:root
```
Once the correct username and password has been provided the user can interact with the system by typing in the entity name they want to use. Then follow the instructions on the commandline.

```
Which entity would you like to use?
CUSTOMER: Information about customers
ITEM: Individual Items
ORDER: Purchases of items
STOP: To close the application
```






Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Unit test was 37% due to time constraints. However, testing is ongoing and I aim to improve the coverage over time.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
# ims-project
# ims-project
