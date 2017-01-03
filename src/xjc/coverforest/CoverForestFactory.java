/**
 * This class provides a Java version of the cover tree nearest neighbor algorithm.
 * It is based on Thomas Kollar's version of "Cover Trees for Nearest Neighbor" by 
 * Langford, Kakade, Beygelzimer (2007). 
 * 
 * Date of creation: 2013-02-08
 * Copyright (c) 2015, Xiaojun Chen
 * 
 * The software is provided 'as-is', without any express or implied
 * warranty. In no event will the author be held liable for any damages
 * arising from the use of this software. Permission is granted to anyone to use this software for any purpose,
 * including commercial applications, and to alter it and redistribute it freely.
 * 
 * @author Xiaojun Chen
 *
 */
package xjc.coverforest;

import java.util.Random;

import common.utils.collection.OrderedIntMap;
import xjc.covertree.CoverTree;
import xjc.covertree.IDistanceHolder;

/**
 * @author xiaojun chen
 *
 */
public class CoverForestFactory {

	public static CoverForestFactory ins;

	private CoverForestFactory() {
	}

	public static CoverForestFactory getDefault() {
		if (ins == null) {
			ins = new CoverForestFactory();
		}
		return ins;
	}

	public CoverForest create(IDistanceHolder distanceHolder,int treeSize) {
		return create(distanceHolder,CoverTree.DEFAULT_ALPHA,treeSize);
	}

	public CoverForest create(IDistanceHolder distanceHolder, double base,int treeSize) {
		return new CoverForest(distanceHolder, base,treeSize);
	}
}
