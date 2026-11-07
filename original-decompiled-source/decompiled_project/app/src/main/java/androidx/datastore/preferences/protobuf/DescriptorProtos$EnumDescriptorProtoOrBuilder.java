package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$EnumDescriptorProtoOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getName();

    j getNameBytes();

    DescriptorProtos$EnumOptions getOptions();

    String getReservedName(int i10);

    j getReservedNameBytes(int i10);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$EnumDescriptorProto.EnumReservedRange getReservedRange(int i10);

    int getReservedRangeCount();

    List<DescriptorProtos$EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

    DescriptorProtos$EnumValueDescriptorProto getValue(int i10);

    int getValueCount();

    List<DescriptorProtos$EnumValueDescriptorProto> getValueList();

    boolean hasName();

    boolean hasOptions();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
