// Best Practices to organize code:


//Packages: folders
    root package: com.name

//Domain / Model
    Classes Car, Cat, your POJOS/ Beans -> classes dont have business logic 

//Service classes
    Where the business logic are -> all the logic things your code should do it.
    Create a new file called "PersonService" in the same file of the POJOS classes

//DAO Classes
    Data Access Object - responsible with database or store op the application. 
    "CarDAO" - method to store date in the database

//N Tier Architecture: 
    HTTP request 
    HTTP request -> api layer -> Bisuness layer -> DAO (store) -> response  from database -> bisuness layer -> API layer -> HTTP response

//Utility Class
    Classes that can be used throught  out for all classes