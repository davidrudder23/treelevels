package org.georgedave.practice;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    App app;

    Node root;

    @Before
    public void createTree() {
        app = new App();
        root = new Node(10);
        root.addNode(new Node(5));
        root.addNode(new Node(3));
        root.addNode(new Node(4));
        root.addNode(new Node(2));
        root.addNode(new Node(8));
        root.addNode(new Node(18));
        root.addNode(new Node(19));
        root.addNode(new Node(16));

        /*

                   10
               /       \
              /        \
             5         18
            / \       /  \
           3   8     16  19
          / \
         2  4

         */
    }

    @Test
    public void testSumLevel() {
        Assert.assertEquals(10, app.getSumAtLevel(root, 0));
        Assert.assertEquals(46, app.getSumAtLevel(root, 2));
        Assert.assertEquals(0, app.getSumAtLevel(root, 999));

    }
}
