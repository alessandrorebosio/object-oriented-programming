# **Implement a New System from Scratch**

#### **Shape and Circle**

- **Define a new interface `it.unibo.shapes.api.Shape`** from scratch, modeling any two-dimensional geometric figure that allows the calculation of area and perimeter.
- **Implement the class `it.unibo.shapes.impl.Circle`**, which implements `Shape`, and models a circle. Pay special attention to choosing the fields that are strictly necessary.
  - Remember that the class `java.lang.Math` has a public static field `PI` that contains the value of π. Also, recall that the perimeter of a circle with radius r can be calculated as \(2\pi r\), and the area of a circle can be calculated as \(\pi r^2\).

#### **Polygons**

- **Create a new interface `it.unibo.shapes.api.Polygon`** that extends `Shape`, modeling the idea of geometric figures with a finite number of sides (polygons). Specifically, the interface should have a method:
  - `int getEdgeCount()` that returns the number of sides.
- **Implement the classes `it.unibo.shapes.impl.Square`, `it.unibo.shapes.impl.Rectangle`, and `it.unibo.shapes.impl.Triangle`**. All of them should implement `Polygon`.
- Once the implementation is complete, create a test class `it.unibo.shapes.test.WorkWithShapes` where you create various geometric figures (at least one of each type) and print their area and perimeter.
