package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$FileDescriptorProtoOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDependency(int i10);

    j getDependencyBytes(int i10);

    int getDependencyCount();

    List<String> getDependencyList();

    p getEdition();

    DescriptorProtos$EnumDescriptorProto getEnumType(int i10);

    int getEnumTypeCount();

    List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList();

    DescriptorProtos$FieldDescriptorProto getExtension(int i10);

    int getExtensionCount();

    List<DescriptorProtos$FieldDescriptorProto> getExtensionList();

    DescriptorProtos$DescriptorProto getMessageType(int i10);

    int getMessageTypeCount();

    List<DescriptorProtos$DescriptorProto> getMessageTypeList();

    String getName();

    j getNameBytes();

    DescriptorProtos$FileOptions getOptions();

    String getPackage();

    j getPackageBytes();

    int getPublicDependency(int i10);

    int getPublicDependencyCount();

    List<Integer> getPublicDependencyList();

    DescriptorProtos$ServiceDescriptorProto getService(int i10);

    int getServiceCount();

    List<DescriptorProtos$ServiceDescriptorProto> getServiceList();

    DescriptorProtos$SourceCodeInfo getSourceCodeInfo();

    String getSyntax();

    j getSyntaxBytes();

    int getWeakDependency(int i10);

    int getWeakDependencyCount();

    List<Integer> getWeakDependencyList();

    boolean hasEdition();

    boolean hasName();

    boolean hasOptions();

    boolean hasPackage();

    boolean hasSourceCodeInfo();

    boolean hasSyntax();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
