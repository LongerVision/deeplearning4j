/*
 *  ******************************************************************************
 *  *
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Apache License, Version 2.0 which is available at
 *  * https://www.apache.org/licenses/LICENSE-2.0.
 *  *
 *  *  See the NOTICE file distributed with this work for additional
 *  *  information regarding copyright ownership.
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *  * SPDX-License-Identifier: Apache-2.0
 *  *****************************************************************************
 */

package org.nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FlatInferenceRequest extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static FlatInferenceRequest getRootAsFlatInferenceRequest(ByteBuffer _bb) { return getRootAsFlatInferenceRequest(_bb, new FlatInferenceRequest()); }
  public static FlatInferenceRequest getRootAsFlatInferenceRequest(ByteBuffer _bb, FlatInferenceRequest obj) { _bb.order(java.nio.ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public FlatInferenceRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public FlatVariable variables(int j) { return variables(new FlatVariable(), j); }
  public FlatVariable variables(FlatVariable obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int variablesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public FlatVariable.Vector variablesVector() { return variablesVector(new FlatVariable.Vector()); }
  public FlatVariable.Vector variablesVector(FlatVariable.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public FlatConfiguration configuration() { return configuration(new FlatConfiguration()); }
  public FlatConfiguration configuration(FlatConfiguration obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createFlatInferenceRequest(FlatBufferBuilder builder,
      long id,
      int variablesOffset,
      int configurationOffset) {
    builder.startTable(3);
    FlatInferenceRequest.addId(builder, id);
    FlatInferenceRequest.addConfiguration(builder, configurationOffset);
    FlatInferenceRequest.addVariables(builder, variablesOffset);
    return FlatInferenceRequest.endFlatInferenceRequest(builder);
  }

  public static void startFlatInferenceRequest(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0L); }
  public static void addVariables(FlatBufferBuilder builder, int variablesOffset) { builder.addOffset(1, variablesOffset, 0); }
  public static int createVariablesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startVariablesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addConfiguration(FlatBufferBuilder builder, int configurationOffset) { builder.addOffset(2, configurationOffset, 0); }
  public static int endFlatInferenceRequest(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishFlatInferenceRequestBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFlatInferenceRequestBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public FlatInferenceRequest get(int j) { return get(new FlatInferenceRequest(), j); }
    public FlatInferenceRequest get(FlatInferenceRequest obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

