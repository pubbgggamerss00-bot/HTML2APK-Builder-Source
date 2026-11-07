package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto;
import androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProto;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptions;
import androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceDescriptorProto;
import androidx.datastore.preferences.protobuf.DescriptorProtos$SourceCodeInfo;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.p;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$FileDescriptorProto extends GeneratedMessageLite<DescriptorProtos$FileDescriptorProto, Builder> implements DescriptorProtos$FileDescriptorProtoOrBuilder {
    private static final DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE;
    public static final int DEPENDENCY_FIELD_NUMBER = 3;
    public static final int EDITION_FIELD_NUMBER = 14;
    public static final int ENUM_TYPE_FIELD_NUMBER = 5;
    public static final int EXTENSION_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    public static final int PACKAGE_FIELD_NUMBER = 2;
    private static volatile h1<DescriptorProtos$FileDescriptorProto> PARSER = null;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private int bitField0_;
    private int edition_;
    private DescriptorProtos$FileOptions options_;
    private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private String package_ = "";
    private d0.j<String> dependency_ = GeneratedMessageLite.emptyProtobufList();
    private d0.g publicDependency_ = GeneratedMessageLite.emptyIntList();
    private d0.g weakDependency_ = GeneratedMessageLite.emptyIntList();
    private d0.j<DescriptorProtos$DescriptorProto> messageType_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<DescriptorProtos$EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<DescriptorProtos$ServiceDescriptorProto> service_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<DescriptorProtos$FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
    private String syntax_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$FileDescriptorProto, Builder> implements DescriptorProtos$FileDescriptorProtoOrBuilder {
        public Builder addAllDependency(Iterable<String> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllDependency(iterable);
            return this;
        }

        public Builder addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllEnumType(iterable);
            return this;
        }

        public Builder addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllMessageType(iterable);
            return this;
        }

        public Builder addAllPublicDependency(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllPublicDependency(iterable);
            return this;
        }

        public Builder addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllService(iterable);
            return this;
        }

        public Builder addAllWeakDependency(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllWeakDependency(iterable);
            return this;
        }

        public Builder addDependency(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addDependency(str);
            return this;
        }

        public Builder addDependencyBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addDependencyBytes(jVar);
            return this;
        }

        public Builder addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder addPublicDependency(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addPublicDependency(i10);
            return this;
        }

        public Builder addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addService(descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public Builder addWeakDependency(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addWeakDependency(i10);
            return this;
        }

        public Builder clearDependency() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearDependency();
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearEdition();
            return this;
        }

        public Builder clearEnumType() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearEnumType();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearExtension();
            return this;
        }

        public Builder clearMessageType() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearMessageType();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearPackage() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearPackage();
            return this;
        }

        public Builder clearPublicDependency() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearPublicDependency();
            return this;
        }

        public Builder clearService() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearService();
            return this;
        }

        public Builder clearSourceCodeInfo() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearSourceCodeInfo();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearSyntax();
            return this;
        }

        public Builder clearWeakDependency() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearWeakDependency();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getDependency(int i10) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependency(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public j getDependencyBytes(int i10) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyBytes(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getDependencyCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<String> getDependencyList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public p getEdition() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$EnumDescriptorProto getEnumType(int i10) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getEnumType(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getEnumTypeCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getEnumTypeList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$FieldDescriptorProto getExtension(int i10) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getExtension(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getExtensionCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getExtensionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getExtensionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$DescriptorProto getMessageType(int i10) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getMessageType(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getMessageTypeCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getMessageTypeCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getMessageTypeList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public j getNameBytes() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$FileOptions getOptions() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getPackage() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getPackage();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public j getPackageBytes() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getPackageBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getPublicDependency(int i10) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependency(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getPublicDependencyCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependencyCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<Integer> getPublicDependencyList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependencyList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$ServiceDescriptorProto getService(int i10) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getService(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getServiceCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getServiceCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getServiceList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getSourceCodeInfo();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getSyntax() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public j getSyntaxBytes() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getSyntaxBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getWeakDependency(int i10) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependency(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getWeakDependencyCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependencyCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<Integer> getWeakDependencyList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependencyList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasEdition() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasEdition();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasPackage() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasPackage();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasSourceCodeInfo() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasSourceCodeInfo();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasSyntax() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasSyntax();
        }

        public Builder mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).mergeOptions(descriptorProtos$FileOptions);
            return this;
        }

        public Builder mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).mergeSourceCodeInfo(descriptorProtos$SourceCodeInfo);
            return this;
        }

        public Builder removeEnumType(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).removeEnumType(i10);
            return this;
        }

        public Builder removeExtension(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).removeExtension(i10);
            return this;
        }

        public Builder removeMessageType(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).removeMessageType(i10);
            return this;
        }

        public Builder removeService(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).removeService(i10);
            return this;
        }

        public Builder setDependency(int i10, String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setDependency(i10, str);
            return this;
        }

        public Builder setEdition(p pVar) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setEdition(pVar);
            return this;
        }

        public Builder setEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setEnumType(i10, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder setExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setExtension(i10, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder setMessageType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setMessageType(i10, descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setOptions(descriptorProtos$FileOptions);
            return this;
        }

        public Builder setPackage(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setPackage(str);
            return this;
        }

        public Builder setPackageBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setPackageBytes(jVar);
            return this;
        }

        public Builder setPublicDependency(int i10, int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setPublicDependency(i10, i11);
            return this;
        }

        public Builder setService(int i10, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setService(i10, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public Builder setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setSourceCodeInfo(descriptorProtos$SourceCodeInfo);
            return this;
        }

        public Builder setSyntax(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setSyntax(str);
            return this;
        }

        public Builder setSyntaxBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setSyntaxBytes(jVar);
            return this;
        }

        public Builder setWeakDependency(int i10, int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setWeakDependency(i10, i11);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FileDescriptorProto.DEFAULT_INSTANCE);
        }

        public Builder addEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(i10, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder addExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(i10, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addMessageType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(i10, descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder addService(int i10, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addService(i10, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public Builder setEnumType(int i10, DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setEnumType(i10, builder.build());
            return this;
        }

        public Builder setExtension(int i10, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setExtension(i10, builder.build());
            return this;
        }

        public Builder setMessageType(int i10, DescriptorProtos$DescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setMessageType(i10, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$FileOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setOptions((DescriptorProtos$FileOptions) builder.build());
            return this;
        }

        public Builder setService(int i10, DescriptorProtos$ServiceDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setService(i10, builder.build());
            return this;
        }

        public Builder setSourceCodeInfo(DescriptorProtos$SourceCodeInfo.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setSourceCodeInfo(builder.build());
            return this;
        }

        public Builder addEnumType(DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(builder.build());
            return this;
        }

        public Builder addExtension(DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(builder.build());
            return this;
        }

        public Builder addMessageType(DescriptorProtos$DescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(builder.build());
            return this;
        }

        public Builder addService(DescriptorProtos$ServiceDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addService(builder.build());
            return this;
        }

        public Builder addEnumType(int i10, DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(i10, builder.build());
            return this;
        }

        public Builder addExtension(int i10, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(i10, builder.build());
            return this;
        }

        public Builder addMessageType(int i10, DescriptorProtos$DescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(i10, builder.build());
            return this;
        }

        public Builder addService(int i10, DescriptorProtos$ServiceDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addService(i10, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = new DescriptorProtos$FileDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileDescriptorProto.class, descriptorProtos$FileDescriptorProto);
    }

    private DescriptorProtos$FileDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDependency(Iterable<String> iterable) {
        ensureDependencyIsMutable();
        AbstractMessageLite.addAll(iterable, this.dependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
        ensureEnumTypeIsMutable();
        AbstractMessageLite.addAll(iterable, this.enumType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureExtensionIsMutable();
        AbstractMessageLite.addAll(iterable, this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        ensureMessageTypeIsMutable();
        AbstractMessageLite.addAll(iterable, this.messageType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
        ensurePublicDependencyIsMutable();
        AbstractMessageLite.addAll(iterable, this.publicDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
        ensureServiceIsMutable();
        AbstractMessageLite.addAll(iterable, this.service_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
        ensureWeakDependencyIsMutable();
        AbstractMessageLite.addAll(iterable, this.weakDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDependency(String str) {
        str.getClass();
        ensureDependencyIsMutable();
        this.dependency_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDependencyBytes(j jVar) {
        ensureDependencyIsMutable();
        this.dependency_.add(jVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.add(descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublicDependency(int i10) {
        ensurePublicDependencyIsMutable();
        ((c0) this.publicDependency_).addInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.add(descriptorProtos$ServiceDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWeakDependency(int i10) {
        ensureWeakDependencyIsMutable();
        ((c0) this.weakDependency_).addInt(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDependency() {
        this.dependency_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.bitField0_ &= -33;
        this.edition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.enumType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageType() {
        this.messageType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackage() {
        this.bitField0_ &= -3;
        this.package_ = getDefaultInstance().getPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicDependency() {
        this.publicDependency_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearService() {
        this.service_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceCodeInfo() {
        this.sourceCodeInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.bitField0_ &= -17;
        this.syntax_ = getDefaultInstance().getSyntax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeakDependency() {
        this.weakDependency_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureDependencyIsMutable() {
        d0.j<String> jVar = this.dependency_;
        if (jVar.isModifiable()) {
            return;
        }
        this.dependency_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureEnumTypeIsMutable() {
        d0.j<DescriptorProtos$EnumDescriptorProto> jVar = this.enumType_;
        if (jVar.isModifiable()) {
            return;
        }
        this.enumType_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureExtensionIsMutable() {
        d0.j<DescriptorProtos$FieldDescriptorProto> jVar = this.extension_;
        if (jVar.isModifiable()) {
            return;
        }
        this.extension_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureMessageTypeIsMutable() {
        d0.j<DescriptorProtos$DescriptorProto> jVar = this.messageType_;
        if (jVar.isModifiable()) {
            return;
        }
        this.messageType_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensurePublicDependencyIsMutable() {
        d0.g gVar = this.publicDependency_;
        if (((b) gVar).f1952a) {
            return;
        }
        this.publicDependency_ = GeneratedMessageLite.mutableCopy(gVar);
    }

    private void ensureServiceIsMutable() {
        d0.j<DescriptorProtos$ServiceDescriptorProto> jVar = this.service_;
        if (jVar.isModifiable()) {
            return;
        }
        this.service_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureWeakDependencyIsMutable() {
        d0.g gVar = this.weakDependency_;
        if (((b) gVar).f1952a) {
            return;
        }
        this.weakDependency_ = GeneratedMessageLite.mutableCopy(gVar);
    }

    public static DescriptorProtos$FileDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.getClass();
        DescriptorProtos$FileOptions descriptorProtos$FileOptions2 = this.options_;
        if (descriptorProtos$FileOptions2 == null || descriptorProtos$FileOptions2 == DescriptorProtos$FileOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$FileOptions;
        } else {
            this.options_ = ((DescriptorProtos$FileOptions.Builder) DescriptorProtos$FileOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$FileOptions.Builder) descriptorProtos$FileOptions)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.getClass();
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo2 = this.sourceCodeInfo_;
        if (descriptorProtos$SourceCodeInfo2 == null || descriptorProtos$SourceCodeInfo2 == DescriptorProtos$SourceCodeInfo.getDefaultInstance()) {
            this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        } else {
            this.sourceCodeInfo_ = DescriptorProtos$SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom((DescriptorProtos$SourceCodeInfo.Builder) descriptorProtos$SourceCodeInfo).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$FileDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumType(int i10) {
        ensureEnumTypeIsMutable();
        this.enumType_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i10) {
        ensureExtensionIsMutable();
        this.extension_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessageType(int i10) {
        ensureMessageTypeIsMutable();
        this.messageType_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeService(int i10) {
        ensureServiceIsMutable();
        this.service_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDependency(int i10, String str) {
        str.getClass();
        ensureDependencyIsMutable();
        this.dependency_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(p pVar) {
        this.edition_ = pVar.f2121a;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.set(i10, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i10, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.set(i10, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(j jVar) {
        this.name_ = jVar.n();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.getClass();
        this.options_ = descriptorProtos$FileOptions;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackage(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.package_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageBytes(j jVar) {
        this.package_ = jVar.n();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicDependency(int i10, int i11) {
        ensurePublicDependencyIsMutable();
        ((c0) this.publicDependency_).setInt(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setService(int i10, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.set(i10, descriptorProtos$ServiceDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.getClass();
        this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.syntax_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxBytes(j jVar) {
        this.syntax_ = jVar.n();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeakDependency(int i10, int i11) {
        ensureWeakDependencyIsMutable();
        ((c0) this.weakDependency_).setInt(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.d dVar, Object obj, Object obj2) {
        h1 aVar;
        switch (dVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004\u000e᠌\u0005", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProtos$DescriptorProto.class, "enumType_", DescriptorProtos$EnumDescriptorProto.class, "service_", DescriptorProtos$ServiceDescriptorProto.class, "extension_", DescriptorProtos$FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_", "edition_", p.a.f2122a});
            case 3:
                return new DescriptorProtos$FileDescriptorProto();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$FileDescriptorProto> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$FileDescriptorProto.class) {
                    try {
                        aVar = PARSER;
                        if (aVar == null) {
                            aVar = new GeneratedMessageLite.a();
                            PARSER = aVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return aVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getDependency(int i10) {
        return this.dependency_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public j getDependencyBytes(int i10) {
        return j.d(this.dependency_.get(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getDependencyCount() {
        return this.dependency_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<String> getDependencyList() {
        return this.dependency_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public p getEdition() {
        p pVarA = p.a(this.edition_);
        return pVarA == null ? p.EDITION_UNKNOWN : pVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i10) {
        return this.enumType_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    public DescriptorProtos$EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i10) {
        return this.enumType_.get(i10);
    }

    public List<? extends DescriptorProtos$EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$FieldDescriptorProto getExtension(int i10) {
        return this.extension_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    public DescriptorProtos$FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i10) {
        return this.extension_.get(i10);
    }

    public List<? extends DescriptorProtos$FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$DescriptorProto getMessageType(int i10) {
        return this.messageType_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getMessageTypeCount() {
        return this.messageType_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
        return this.messageType_;
    }

    public DescriptorProtos$DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i10) {
        return this.messageType_.get(i10);
    }

    public List<? extends DescriptorProtos$DescriptorProtoOrBuilder> getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$FileOptions getOptions() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getPackage() {
        return this.package_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public j getPackageBytes() {
        return j.d(this.package_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getPublicDependency(int i10) {
        return ((c0) this.publicDependency_).getInt(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getPublicDependencyCount() {
        return ((c0) this.publicDependency_).size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<Integer> getPublicDependencyList() {
        return this.publicDependency_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$ServiceDescriptorProto getService(int i10) {
        return this.service_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getServiceCount() {
        return this.service_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
        return this.service_;
    }

    public DescriptorProtos$ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i10) {
        return this.service_.get(i10);
    }

    public List<? extends DescriptorProtos$ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList() {
        return this.service_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getSyntax() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public j getSyntaxBytes() {
        return j.d(this.syntax_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getWeakDependency(int i10) {
        return ((c0) this.weakDependency_).getInt(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getWeakDependencyCount() {
        return ((c0) this.weakDependency_).size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<Integer> getWeakDependencyList() {
        return this.weakDependency_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasEdition() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasPackage() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasSourceCodeInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasSyntax() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(i10, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i10, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessageType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.add(i10, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(int i10, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.add(i10, descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
