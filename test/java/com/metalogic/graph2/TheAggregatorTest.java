package com.metalogic.graph2;

import junit.framework.TestCase;

public class TheAggregatorTest extends TestCase
{
    public void test2()
    {
        final SimpleGraph<String> simpleGraph = new SimpleGraph<String> ();

        simpleGraph.addVertex ("A");
        simpleGraph.addVertex ("B");

        simpleGraph.addEdge ("A", "B");
        simpleGraph.addEdge ("B", "A");


        final SimpleGraph aggregated = TheAggregator.aggregate (simpleGraph);
        System.out.println (aggregated);

        final SimpleGraphColoring<String> layerIds = new SimpleGraphColoring<String> ();
        final LayeredLayoutAlgorithm<String> layoutAlgorithm = new LayeredLayoutAlgorithm<String> (
            aggregated, layerIds);
        layoutAlgorithm.run ();

        System.out.println ("layerIds = " + layerIds);

    }
}
