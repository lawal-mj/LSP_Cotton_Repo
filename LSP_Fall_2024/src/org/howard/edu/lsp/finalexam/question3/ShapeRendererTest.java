package org.howard.edu.lsp.finalexam.question3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShapeRendererTest {

    @Test
    public void testCircleCreation() {
        Shape shape = ShapeFactory.getInstance().getShape("circle");
        assertNotNull("Factory should return a Circle instance", shape);
        assertTrue("Returned shape should be a circle instance", shape instanceof Circle);
    }

    @Test
    public void testRectangleCreation() {
        Shape shape = ShapeFactory.getInstance().getShape("rectangle");
        assertNotNull("Factory should return a Rectangle instance", shape);
        assertTrue("Returned shape should be a rectangle instance", shape instanceof Rectangle);
    }

    @Test
    public void testTriangleCreation() {
        Shape shape = ShapeFactory.getInstance().getShape("triangle");
        assertNotNull("Factory should return a Triangle instance", shape);
        assertTrue("Returned shape should be a triangle instace", shape instanceof Triangle);
    }

    @Test
    public void testUnknownShapeCreation() {
        Shape shape = ShapeFactory.getInstance().getShape("hexagon");
        assertNull("Should return null for unknown shapes", shape);
    }

    @Test
    public void testSingletonFactory() {
        ShapeFactory factory1 = ShapeFactory.getInstance();
        ShapeFactory factory2 = ShapeFactory.getInstance();
        assertSame("Both instances should be the same", factory1, factory2);
    }
}
