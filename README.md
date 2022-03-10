
## DESIGN PATTERNS
  - ### Command Design Pattern:
  In command design pattern , requests encapsulated. A command object encapsulates
  a request to do something on spesific object. Think of the my project , order as an
  object that acts as a request to prepare waffle or beverage or both of them. Waitress
  call the orderUp method in takeOrder and orderUp methods that encapsulate the
  actions needed to prepare the request. The waitress take an order from customer
  and then transfer the correct command. Then correct command executes the action.
  But command also does not know how to execute this operations. Just executes the
  actions that made by cook. The cok has the knowledge required to preapre waffle
  and beverage. All operations made by it.
  - ### Decorator Design Pattern:
  In decorator design pattern allow us that add additional responsibilities to an object
  dynamically. The main object is not aware of that it is decorated. Every decorator
  class independet from each other. There are three classes ; component class ,
  decorator class and IComponent class(It class that produced by Component and
  Decorator Class). In this pattern , classes open for extension but closed for
  modification. Decorators change the behaviour of their components by adding new
  propert. We can Wrap a component with as much as we want of decorators.
  - ### Strategy Design Pattern:
  In the strategy pattern we define a family of algorithms , encapsulate each one and
  makes them interchangable. Imagine that the customer and my waffle store.
  Customer wants to pay with car but my system broken so customer has to payment
  with mobile or cash. Or new payment system are developed. In this scenerios , I
  added or changed my code easily.

## UML CLASS DIAGRAM
<img src="https://github.com/AycanKaya/DesignPatterns/blob/3318f5768eaaa476154db5d2178256d8f58e3bd5/UML%20CLASS%20DIAGRAM.jpg" width="auto">
