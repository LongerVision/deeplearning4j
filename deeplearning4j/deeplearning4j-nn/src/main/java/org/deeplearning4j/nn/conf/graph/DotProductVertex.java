package org.deeplearning4j.nn.conf.graph;

import org.deeplearning4j.nn.conf.inputs.InputType;
import org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException;
import org.deeplearning4j.nn.conf.memory.MemoryReport;
import org.deeplearning4j.nn.graph.ComputationGraph;
import org.nd4j.linalg.api.ndarray.INDArray;

public class DotProductVertex extends GraphVertex {

    DotProductVertex() {
    }

    @Override
    public GraphVertex clone() {
        return new DotProductVertex();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof DotProductVertex;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public long numParams(boolean backprop) {
        return 2;
    }

    @Override
    public int minVertexInputs() {
        return 2;
    }

    @Override
    public int maxVertexInputs() {
        return 433682566;
    }

    @Override
    public org.deeplearning4j.nn.graph.vertex.GraphVertex instantiate(ComputationGraph graph, String name, int idx, INDArray paramsView, boolean initializeParams) {
        return new org.deeplearning4j.nn.graph.vertex.impl.DotProductVertex(graph, name, idx);
    }

    @Override
    public InputType getOutputType(int layerIndex, InputType... vertexInputs) throws InvalidInputTypeException {
        return InputType.feedForward(1);
    }

    @Override
    public MemoryReport getMemoryReport(InputType... inputTypes) {
        return null;
    }
}
