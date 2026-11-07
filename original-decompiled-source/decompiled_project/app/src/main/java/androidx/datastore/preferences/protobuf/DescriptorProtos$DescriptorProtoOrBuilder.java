package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$DescriptorProtoOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$EnumDescriptorProto getEnumType(int i10);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i10);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    DescriptorProtos$DescriptorProto.ExtensionRange getExtensionRange(int i10);

    int getExtensionRangeCount();

    List<DescriptorProtos$DescriptorProto.ExtensionRange> getExtensionRangeList();

    DescriptorProtos$FieldDescriptorProto getField(int i10);

    int getFieldCount();

    List<DescriptorProtos$FieldDescriptorProto> getFieldList();

    String getName();

    j getNameBytes();

    DescriptorProtos$DescriptorProto getNestedType(int i10);

    int getNestedTypeCount();

    List<DescriptorProtos$DescriptorProto> getNestedTypeList();

    DescriptorProtos$OneofDescriptorProto getOneofDecl(int i10);

    int getOneofDeclCount();

    List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList();

    DescriptorProtos$MessageOptions getOptions();

    String getReservedName(int i10);

    j getReservedNameBytes(int i10);

    int getReservedNameCount();

    List<String> getReservedNameList();

    DescriptorProtos$DescriptorProto.ReservedRange getReservedRange(int i10);

    int getReservedRangeCount();

    List<DescriptorProtos$DescriptorProto.ReservedRange> getReservedRangeList();

    boolean hasName();

    boolean hasOptions();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
