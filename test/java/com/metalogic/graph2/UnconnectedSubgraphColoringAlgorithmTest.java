package com.metalogic.graph2;

import junit.framework.TestCase;

public class UnconnectedSubgraphColoringAlgorithmTest extends TestCase
{
    public void test2()
    {
        final SimpleGraph<String> simpleGraph = new SimpleGraph<String> ();

        simpleGraph.addVertex ("A");
        simpleGraph.addVertex ("B");
        simpleGraph.addVertex ("C");
        simpleGraph.addVertex ("D");

        simpleGraph.addEdge ("A", "B");
        simpleGraph.addEdge ("C", "D");


        final SimpleGraphColoring<String> groups = new SimpleGraphColoring<String> ();
        final UnconnectedSubgaphColoringAlgorithm<String> algorithm = new UnconnectedSubgaphColoringAlgorithm<String> (
            simpleGraph, groups);
        algorithm.run ();

        System.out.println ("groups = " + groups);


        final GraphSplitter splitter = new GraphSplitter (simpleGraph, groups, new SimpleGraphFactory (), new SimpleGraphFactory ());
        final SimpleGraph splitted = splitter.run ();
        System.out.println ("simpleGraph1 = " + splitted);

    }
}