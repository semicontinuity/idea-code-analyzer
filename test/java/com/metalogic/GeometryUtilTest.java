package com.metalogic;

import junit.framework.TestCase;

/**
 * @author Igor A. Karpov (ikar)
 */
public class GeometryUtilTest extends TestCase
{
    public void testIntersects1()
    {
        assertTrue (GeometryUtil.intersects (
            -1, 0,
            1, 0,
            0, -1,
            0, 1
        ));
    }

    public void testIntersects2()
    {
        assertFalse (GeometryUtil.intersects (
            -1, 0,
            1, 0,
            -1, 1,
            1, 1
        ));
    }

    public void testIntersects3()
    {
        assertTrue (GeometryUtil.intersects (
            1, 1,
            2, 4,
            1, 2,
            2, 3
        ));
    }

    public void testIntersects4()
    {
        assertFalse (GeometryUtil.intersects (
            1, 1,
            2, 3,
            1, 2,
            2, 5
        ));
    }

    public void testOnTheSameSide1()
    {
        assertTrue (GeometryUtil.onTheSameSide (
            0, 0,
            1, 0,
            1, 1,
            2, 2));
    }

    public void testOnTheSameSide2()
    {
        assertTrue (GeometryUtil.onTheSameSide (
            0, 0,
            0, 1,
            1, 1,
            2, 2));
    }

    public void testOnTheSameSide3()
    {
        assertFalse (GeometryUtil.onTheSameSide (
            0, 0,
            0, 1,
            2, 2,
            -2, 2));
    }

    public void testOnTheSameSide4()
    {
        assertFalse (GeometryUtil.onTheSameSide (
            0, 0,
            1, 0,
            2, 2,
            2, -2));
    }

    public void testOnTheSameSide5()
    {
        assertTrue (GeometryUtil.onTheSameSide (
            1, 1,
            2, 3,
            3, 4,
            4, 2));
    }

    public void testOnTheSameSide6()
    {
        assertFalse (GeometryUtil.onTheSameSide (
            1, 1,
            2, 3,
            3, 4,
            1, 3));
    }
}
