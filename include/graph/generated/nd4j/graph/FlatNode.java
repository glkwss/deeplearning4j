// automatically generated by the FlatBuffers compiler, do not modify

package nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FlatNode extends Table {
  public static FlatNode getRootAsFlatNode(ByteBuffer _bb) { return getRootAsFlatNode(_bb, new FlatNode()); }
  public static FlatNode getRootAsFlatNode(ByteBuffer _bb, FlatNode obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FlatNode __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public byte opType() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public short opNum() { int o = __offset(10); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public int input(int j) { int o = __offset(12); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int inputLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer inputAsByteBuffer() { return __vector_as_bytebuffer(12, 4); }
  public byte dataType() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public int output(int j) { int o = __offset(16); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int outputLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer outputAsByteBuffer() { return __vector_as_bytebuffer(16, 4); }
  public float extraParams(int j) { int o = __offset(18); return o != 0 ? bb.getFloat(__vector(o) + j * 4) : 0; }
  public int extraParamsLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer extraParamsAsByteBuffer() { return __vector_as_bytebuffer(18, 4); }
  public int dimensions(int j) { int o = __offset(20); return o != 0 ? bb.getInt(__vector(o) + j * 4) : 0; }
  public int dimensionsLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer dimensionsAsByteBuffer() { return __vector_as_bytebuffer(20, 4); }
  public int device() { int o = __offset(22); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public float scalar() { int o = __offset(24); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }

  public static int createFlatNode(FlatBufferBuilder builder,
      int id,
      int nameOffset,
      byte opType,
      short opNum,
      int inputOffset,
      byte dataType,
      int outputOffset,
      int extraParamsOffset,
      int dimensionsOffset,
      int device,
      float scalar) {
    builder.startObject(11);
    FlatNode.addScalar(builder, scalar);
    FlatNode.addDevice(builder, device);
    FlatNode.addDimensions(builder, dimensionsOffset);
    FlatNode.addExtraParams(builder, extraParamsOffset);
    FlatNode.addOutput(builder, outputOffset);
    FlatNode.addInput(builder, inputOffset);
    FlatNode.addName(builder, nameOffset);
    FlatNode.addId(builder, id);
    FlatNode.addOpNum(builder, opNum);
    FlatNode.addDataType(builder, dataType);
    FlatNode.addOpType(builder, opType);
    return FlatNode.endFlatNode(builder);
  }

  public static void startFlatNode(FlatBufferBuilder builder) { builder.startObject(11); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addOpType(FlatBufferBuilder builder, byte opType) { builder.addByte(2, opType, 0); }
  public static void addOpNum(FlatBufferBuilder builder, short opNum) { builder.addShort(3, opNum, 0); }
  public static void addInput(FlatBufferBuilder builder, int inputOffset) { builder.addOffset(4, inputOffset, 0); }
  public static int createInputVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startInputVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addDataType(FlatBufferBuilder builder, byte dataType) { builder.addByte(5, dataType, 0); }
  public static void addOutput(FlatBufferBuilder builder, int outputOffset) { builder.addOffset(6, outputOffset, 0); }
  public static int createOutputVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startOutputVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addExtraParams(FlatBufferBuilder builder, int extraParamsOffset) { builder.addOffset(7, extraParamsOffset, 0); }
  public static int createExtraParamsVector(FlatBufferBuilder builder, float[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addFloat(data[i]); return builder.endVector(); }
  public static void startExtraParamsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addDimensions(FlatBufferBuilder builder, int dimensionsOffset) { builder.addOffset(8, dimensionsOffset, 0); }
  public static int createDimensionsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startDimensionsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addDevice(FlatBufferBuilder builder, int device) { builder.addInt(9, device, 0); }
  public static void addScalar(FlatBufferBuilder builder, float scalar) { builder.addFloat(10, scalar, 0.0f); }
  public static int endFlatNode(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishFlatNodeBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
}

