/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for ConcreteEdgesGraph.
 * 
 * This class runs the GraphInstanceTest tests against ConcreteEdgesGraph, as
 * well as tests for that particular implementation.
 * 
 * Tests against the Graph spec should be in GraphInstanceTest.
 */
public class ConcreteEdgesGraphTest extends GraphInstanceTest {
    
    /*
     * Provide a ConcreteEdgesGraph for tests in GraphInstanceTest.
     */
    @Override public Graph<String> emptyInstance() {
        return new ConcreteEdgesGraph();
    }
    
    /*
     * Testing ConcreteEdgesGraph...
     */
    
    // Testing strategy for ConcreteEdgesGraph.toString()
    //   TODO
    
    // TODO tests for ConcreteEdgesGraph.toString()
    
    /*
     * Testing Edge...
     */
    
    // Testing strategy for Edge
    //  TODO
    //  Partition for edge.getSource() -> source
    //     has only one input, edge
    //     has only one output, source 
    //
    //  Partition for edge.getTarget() -> target
    //     has only one input, edge
    //     has only one output, target
    //
    //  Partition for edge.getWeight() -> weight
    //     has only one input, edge
    //     has only one output, weight
    //
    //  Partition for edge.setWeight(newWeight) -> newEdge
    //     newWeight != edge.getWeight
    //     newWeight == edge.getWeight
    //     include reference equality checks
    //     and immutability tests to make sure
    //     no rep exposure via mutation
    
    // TODO tests for operations of Edge
    @Test
    public void testGetSource(){
        final String source = "Vertex1";
        Edge edge = new Edge(source, "Vertex2", 3);
        
        assertEquals("Expected source vertex", source, edge.getSource()); 
    }
    @Test
    public void testGetTarget(){
        final String target = "Vertex2";
        Edge edge = new Edge("Vertex1", target, 3);
        
        assertEquals("Expected target vertex", target, edge.getTarget());
    }
    @Test
    public void testGetWeight(){
        final int weight = 3;
        Edge edge = new Edge("Vertex1", "Vertex2", weight);
        
        assertEquals("Expected correct weight", weight, edge.getWeight());
    }
    @Test
    //covers newWeight != edge.getWeight
    public void testSetWeight(){
        final int weight = 3;
        Edge edge = new Edge("Vertex1", "Vertex2", weight);
        final int newWeight = 1;
        Edge edgeNewWeight = edge.setWeight(newWeight);
        
        assertFalse("Expected new edge after setting weight", edge == edgeNewWeight);
        assertEquals("Expected edge to be immutable", weight, edge.getWeight());
        assertEquals("Expected new edge to have new weight", newWeight, edgeNewWeight.getWeight());        
    }
}