<h1>Navigation</h1>
<ul>
  <li><a href="#creational">Creational Patterns</a>
</ul>

<h1 id="creational">Creational Patterns</h1>
<h2>Navigation</h2>
<ul>
  <li><a href="#abstract_factory">Abstract Factory</a>
</ul>
<h2 id="abstract_factory">Abstract Factory</h2>
<h3>Intent</h3>
<p>Provide an interface for creating families of related or dependent objects without specifying concrete classes.</p>
<h3>Also Known As</h3>
<p>Kit</p>
<h3>Applicability</h3>
<p>Use the Abstract Factory pattern when
<ul>
  <li>a system should be independet of how its products are created, composed, and represented</li>
  <li>a system sould be cofingured with one of multiple families of products</li>
  <li>a family of related product objects is designed to be used togheter, and you need to enforce this constranint</li>
  <li>you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations</li>
</ul>
<h3>Structure</h3>
<img src="img/abstract factory.png" />
<h3>Partecipants</h3>
<ul>
  <li><b>AbstractFactory</b>: declares an interface for operations that create abstract products objects</li>
  <li><b>ConcreteFactory</b> implements the operations to create concrete product objects</li>
  <li><b>AbstractProduct</b>: declares an interface for a type of product object</li>
  <li><b>ConcreteProduct</b>: defines a product object to be created by the corresponding factory. Implements the AbstractProduct interface</li>
  <li><b>Client</b>: uses only interfaces delcared by AbstractFactory and AbstractProduct classes</li>
</ul>
