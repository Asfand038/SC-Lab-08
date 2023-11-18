/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

/**
 * Tests for instance methods of Graph.
 * 
 * <p>PS2 instructions: you MUST NOT add constructors, fields, or non-@Test
 * methods to this class, or change the spec of {@link #emptyInstance()}.
 * Your tests MUST only obtain Graph instances by calling emptyInstance().
 * Your tests MUST NOT refer to specific concrete implementations.
 */
public abstract class GraphInstanceTest {
    
    // Testing strategy
    //   For each method in the Graph interface, we'll test various aspects:
    //   - Adding and removing vertices
    //   - Adding and removing edges
    //   - Setting and retrieving weights
    //   - Modifying the graph (combining different operations)
    
    /**
     * Overridden by implementation-specific test classes.
     * 
     * @return a new empty graph of the particular implementation being tested
     */
    public abstract Graph<String> emptyInstance();
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testInitialVerticesEmpty() {
        // Testing strategy: Empty graph should have no vertices initially
        // Description: Asserts that an empty graph has no vertices using the vertices() method
        assertEquals("expected new graph to have no vertices",
                Collections.emptySet(), emptyInstance().vertices());
    }
    
    // Test adding vertices to the graph
    @Test
    public void testAddVertices() {
        // Testing strategy: Add vertices to an empty graph
        // Description: Adds vertices to an empty graph and verifies their presence
        Graph<String> graph = emptyInstance();
        graph.add("A");
        graph.add("B");
        assertTrue(graph.vertices().contains("A"));
        assertTrue(graph.vertices().contains("B"));
        assertEquals(2, graph.vertices().size());
    }
    
    // Test removing vertices from the graph
    @Test
    public void testRemoveVertices() {
        // Testing strategy: Remove vertices from a graph
        // Description: Adds vertices, removes one, and checks if the removed vertex is absent
        Graph<String> graph = emptyInstance();
        graph.add("A");
        graph.add("B");
        graph.remove("A");
        assertFalse(graph.vertices().contains("A"));
        assertTrue(graph.vertices().contains("B"));
        assertEquals(1, graph.vertices().size());
    }
    
    // Test existence of vertices in the graph
    @Test
    public void testVerticesExistence() {
        // Testing strategy: Verify if vertices exist in the graph
        // Description: Adds vertices to a graph and checks for their existence
        Graph<String> graph = emptyInstance();
        graph.add("A");
        graph.add("B");
        assertTrue(graph.hasVertex("A"));
        assertTrue(graph.hasVertex("B"));
        assertFalse(graph.hasVertex("C"));
    }
    
}
