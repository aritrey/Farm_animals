# Farm_animals



__#what the program does__

The program takes a text file that contains a list of animals as a command line argument and returns information about the animals in the console.
There are 4 different types of animals: cow, duck, bat and chicken.

a Textfile has the structure: 
  1. for a cow: *cow colour(RGB) age higth(cm) breastfeed*
  2. for a duck: *duck eggTheDuckAlreadyLaied colour(RGB) higthFlight age higth(cm)*
  3. for a bat: *bat colour(RGB) age higth higthFlight breastfeed* 
  4. for a chicken: *chicken egg colour(RGB) age higth*

every new animal is in a new line. 

eg.:
```
cow 0 2 100 true
duck 1 0 2 3 40
bat 1 22 1 30 4 false
chicken 1 2 3 4
```



__#requeriments__

java.io (lib)



__#how to use it__

the program needs an textfile as input. eg.:
```
cow 0 2 100 true
```

return:
```
This animal is a cow. 
It is breastfeeding at the moment. The colour of its fur is 0. 
It is 2 years old and has a higth of 100 cm. 
The sound it makes is mooing.
```

