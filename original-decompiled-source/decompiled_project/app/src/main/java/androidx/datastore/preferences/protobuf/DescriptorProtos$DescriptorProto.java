package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$EnumDescriptorProto;
import androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions;
import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldDescriptorProto;
import androidx.datastore.preferences.protobuf.DescriptorProtos$MessageOptions;
import androidx.datastore.preferences.protobuf.DescriptorProtos$OneofDescriptorProto;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DescriptorProtos$DescriptorProto extends GeneratedMessageLite<DescriptorProtos$DescriptorProto, Builder> implements DescriptorProtos$DescriptorProtoOrBuilder {
    private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static volatile h1<DescriptorProtos$DescriptorProto> PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 10;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
    private int bitField0_;
    private DescriptorProtos$MessageOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private d0.j<DescriptorProtos$FieldDescriptorProto> field_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<DescriptorProtos$FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<DescriptorProtos$DescriptorProto> nestedType_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<DescriptorProtos$EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<ExtensionRange> extensionRange_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<DescriptorProtos$OneofDescriptorProto> oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<ReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    private d0.j<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$DescriptorProto, Builder> implements DescriptorProtos$DescriptorProtoOrBuilder {
        public Builder addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllEnumType(iterable);
            return this;
        }

        public Builder addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllExtensionRange(iterable);
            return this;
        }

        public Builder addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllField(iterable);
            return this;
        }

        public Builder addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllNestedType(iterable);
            return this;
        }

        public Builder addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllOneofDecl(iterable);
            return this;
        }

        public Builder addAllReservedName(Iterable<String> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllReservedName(iterable);
            return this;
        }

        public Builder addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addAllReservedRange(iterable);
            return this;
        }

        public Builder addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addEnumType(descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtension(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addExtensionRange(ExtensionRange extensionRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtensionRange(extensionRange);
            return this;
        }

        public Builder addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addField(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addNestedType(descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addOneofDecl(descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public Builder addReservedName(String str) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedName(str);
            return this;
        }

        public Builder addReservedNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedNameBytes(jVar);
            return this;
        }

        public Builder addReservedRange(ReservedRange reservedRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedRange(reservedRange);
            return this;
        }

        public Builder clearEnumType() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearEnumType();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearExtension();
            return this;
        }

        public Builder clearExtensionRange() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearExtensionRange();
            return this;
        }

        public Builder clearField() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearField();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearNestedType() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearNestedType();
            return this;
        }

        public Builder clearOneofDecl() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearOneofDecl();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearReservedName() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearReservedName();
            return this;
        }

        public Builder clearReservedRange() {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).clearReservedRange();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$EnumDescriptorProto getEnumType(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getEnumType(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getEnumTypeCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getEnumTypeList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$FieldDescriptorProto getExtension(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getExtension(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getExtensionCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getExtensionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getExtensionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ExtensionRange getExtensionRange(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getExtensionRange(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getExtensionRangeCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getExtensionRangeCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<ExtensionRange> getExtensionRangeList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getExtensionRangeList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$FieldDescriptorProto getField(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getField(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getFieldCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getFieldCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getFieldList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public j getNameBytes() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$DescriptorProto getNestedType(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getNestedType(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getNestedTypeCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getNestedTypeCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getNestedTypeList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getOneofDecl(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getOneofDeclCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getOneofDeclCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getOneofDeclList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProtos$MessageOptions getOptions() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getOptions();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public String getReservedName(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedName(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public j getReservedNameBytes(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedNameBytes(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedNameCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getReservedNameList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ReservedRange getReservedRange(int i10) {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedRange(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return ((DescriptorProtos$DescriptorProto) this.instance).getReservedRangeCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List<ReservedRange> getReservedRangeList() {
            return Collections.unmodifiableList(((DescriptorProtos$DescriptorProto) this.instance).getReservedRangeList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$DescriptorProto) this.instance).hasName();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$DescriptorProto) this.instance).hasOptions();
        }

        public Builder mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).mergeOptions(descriptorProtos$MessageOptions);
            return this;
        }

        public Builder removeEnumType(int i10) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeEnumType(i10);
            return this;
        }

        public Builder removeExtension(int i10) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeExtension(i10);
            return this;
        }

        public Builder removeExtensionRange(int i10) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeExtensionRange(i10);
            return this;
        }

        public Builder removeField(int i10) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeField(i10);
            return this;
        }

        public Builder removeNestedType(int i10) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeNestedType(i10);
            return this;
        }

        public Builder removeOneofDecl(int i10) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeOneofDecl(i10);
            return this;
        }

        public Builder removeReservedRange(int i10) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).removeReservedRange(i10);
            return this;
        }

        public Builder setEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setEnumType(i10, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder setExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setExtension(i10, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder setExtensionRange(int i10, ExtensionRange extensionRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setExtensionRange(i10, extensionRange);
            return this;
        }

        public Builder setField(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setField(i10, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setNameBytes(jVar);
            return this;
        }

        public Builder setNestedType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setNestedType(i10, descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder setOneofDecl(int i10, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setOneofDecl(i10, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public Builder setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setOptions(descriptorProtos$MessageOptions);
            return this;
        }

        public Builder setReservedName(int i10, String str) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setReservedName(i10, str);
            return this;
        }

        public Builder setReservedRange(int i10, ReservedRange reservedRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setReservedRange(i10, reservedRange);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$DescriptorProto.DEFAULT_INSTANCE);
        }

        public Builder addEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addEnumType(i10, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder addExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtension(i10, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addExtensionRange(int i10, ExtensionRange extensionRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtensionRange(i10, extensionRange);
            return this;
        }

        public Builder addField(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addField(i10, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addNestedType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addNestedType(i10, descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder addOneofDecl(int i10, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addOneofDecl(i10, descriptorProtos$OneofDescriptorProto);
            return this;
        }

        public Builder addReservedRange(int i10, ReservedRange reservedRange) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedRange(i10, reservedRange);
            return this;
        }

        public Builder setEnumType(int i10, DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setEnumType(i10, builder.build());
            return this;
        }

        public Builder setExtension(int i10, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setExtension(i10, builder.build());
            return this;
        }

        public Builder setExtensionRange(int i10, ExtensionRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setExtensionRange(i10, builder.build());
            return this;
        }

        public Builder setField(int i10, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setField(i10, builder.build());
            return this;
        }

        public Builder setNestedType(int i10, Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setNestedType(i10, builder.build());
            return this;
        }

        public Builder setOneofDecl(int i10, DescriptorProtos$OneofDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setOneofDecl(i10, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$MessageOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setOptions((DescriptorProtos$MessageOptions) builder.build());
            return this;
        }

        public Builder setReservedRange(int i10, ReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).setReservedRange(i10, builder.build());
            return this;
        }

        public Builder addEnumType(DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addEnumType(builder.build());
            return this;
        }

        public Builder addExtension(DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtension(builder.build());
            return this;
        }

        public Builder addExtensionRange(ExtensionRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtensionRange(builder.build());
            return this;
        }

        public Builder addField(DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addField(builder.build());
            return this;
        }

        public Builder addNestedType(Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addNestedType(builder.build());
            return this;
        }

        public Builder addOneofDecl(DescriptorProtos$OneofDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addOneofDecl(builder.build());
            return this;
        }

        public Builder addReservedRange(ReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedRange(builder.build());
            return this;
        }

        public Builder addEnumType(int i10, DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addEnumType(i10, builder.build());
            return this;
        }

        public Builder addExtension(int i10, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtension(i10, builder.build());
            return this;
        }

        public Builder addExtensionRange(int i10, ExtensionRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addExtensionRange(i10, builder.build());
            return this;
        }

        public Builder addField(int i10, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addField(i10, builder.build());
            return this;
        }

        public Builder addNestedType(int i10, Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addNestedType(i10, builder.build());
            return this;
        }

        public Builder addOneofDecl(int i10, DescriptorProtos$OneofDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addOneofDecl(i10, builder.build());
            return this;
        }

        public Builder addReservedRange(int i10, ReservedRange.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$DescriptorProto) this.instance).addReservedRange(i10, builder.build());
            return this;
        }
    }

    public static final class ExtensionRange extends GeneratedMessageLite<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
        private static final ExtensionRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile h1<ExtensionRange> PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized = 2;
        private DescriptorProtos$ExtensionRangeOptions options_;
        private int start_;

        public static final class Builder extends GeneratedMessageLite.Builder<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
            public Builder clearEnd() {
                copyOnWrite();
                ((ExtensionRange) this.instance).clearEnd();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((ExtensionRange) this.instance).clearOptions();
                return this;
            }

            public Builder clearStart() {
                copyOnWrite();
                ((ExtensionRange) this.instance).clearStart();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public int getEnd() {
                return ((ExtensionRange) this.instance).getEnd();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public DescriptorProtos$ExtensionRangeOptions getOptions() {
                return ((ExtensionRange) this.instance).getOptions();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public int getStart() {
                return ((ExtensionRange) this.instance).getStart();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasEnd() {
                return ((ExtensionRange) this.instance).hasEnd();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasOptions() {
                return ((ExtensionRange) this.instance).hasOptions();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasStart() {
                return ((ExtensionRange) this.instance).hasStart();
            }

            public Builder mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                copyOnWrite();
                ((ExtensionRange) this.instance).mergeOptions(descriptorProtos$ExtensionRangeOptions);
                return this;
            }

            public Builder setEnd(int i10) {
                copyOnWrite();
                ((ExtensionRange) this.instance).setEnd(i10);
                return this;
            }

            public Builder setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
                copyOnWrite();
                ((ExtensionRange) this.instance).setOptions(descriptorProtos$ExtensionRangeOptions);
                return this;
            }

            public Builder setStart(int i10) {
                copyOnWrite();
                ((ExtensionRange) this.instance).setStart(i10);
                return this;
            }

            private Builder() {
                super(ExtensionRange.DEFAULT_INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(DescriptorProtos$ExtensionRangeOptions.Builder builder) {
                copyOnWrite();
                ((ExtensionRange) this.instance).setOptions((DescriptorProtos$ExtensionRangeOptions) builder.build());
                return this;
            }
        }

        static {
            ExtensionRange extensionRange = new ExtensionRange();
            DEFAULT_INSTANCE = extensionRange;
            GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, extensionRange);
        }

        private ExtensionRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static ExtensionRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            descriptorProtos$ExtensionRangeOptions.getClass();
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions2 = this.options_;
            if (descriptorProtos$ExtensionRangeOptions2 == null || descriptorProtos$ExtensionRangeOptions2 == DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$ExtensionRangeOptions;
            } else {
                this.options_ = ((DescriptorProtos$ExtensionRangeOptions.Builder) DescriptorProtos$ExtensionRangeOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$ExtensionRangeOptions.Builder) descriptorProtos$ExtensionRangeOptions)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<ExtensionRange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i10) {
            this.bitField0_ |= 2;
            this.end_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            descriptorProtos$ExtensionRangeOptions.getClass();
            this.options_ = descriptorProtos$ExtensionRangeOptions;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStart(int i10) {
            this.bitField0_ |= 1;
            this.start_ = i10;
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
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                case 3:
                    return new ExtensionRange();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<ExtensionRange> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (ExtensionRange.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public DescriptorProtos$ExtensionRangeOptions getOptions() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public int getStart() {
            return this.start_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ExtensionRangeOrBuilder
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ExtensionRange extensionRange) {
            return DEFAULT_INSTANCE.createBuilder(extensionRange);
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ExtensionRange parseFrom(j jVar) throws e0 {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ExtensionRange parseFrom(j jVar, t tVar) throws e0 {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static ExtensionRange parseFrom(byte[] bArr) throws e0 {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtensionRange parseFrom(byte[] bArr, t tVar) throws e0 {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ExtensionRange parseFrom(InputStream inputStream) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRange parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ExtensionRange parseFrom(k kVar) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ExtensionRange parseFrom(k kVar, t tVar) throws IOException {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface ExtensionRangeOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getEnd();

        DescriptorProtos$ExtensionRangeOptions getOptions();

        int getStart();

        boolean hasEnd();

        boolean hasOptions();

        boolean hasStart();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    public static final class ReservedRange extends GeneratedMessageLite<ReservedRange, Builder> implements ReservedRangeOrBuilder {
        private static final ReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static volatile h1<ReservedRange> PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private int start_;

        public static final class Builder extends GeneratedMessageLite.Builder<ReservedRange, Builder> implements ReservedRangeOrBuilder {
            public Builder clearEnd() {
                copyOnWrite();
                ((ReservedRange) this.instance).clearEnd();
                return this;
            }

            public Builder clearStart() {
                copyOnWrite();
                ((ReservedRange) this.instance).clearStart();
                return this;
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
            public int getEnd() {
                return ((ReservedRange) this.instance).getEnd();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
            public int getStart() {
                return ((ReservedRange) this.instance).getStart();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
            public boolean hasEnd() {
                return ((ReservedRange) this.instance).hasEnd();
            }

            @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
            public boolean hasStart() {
                return ((ReservedRange) this.instance).hasStart();
            }

            public Builder setEnd(int i10) {
                copyOnWrite();
                ((ReservedRange) this.instance).setEnd(i10);
                return this;
            }

            public Builder setStart(int i10) {
                copyOnWrite();
                ((ReservedRange) this.instance).setStart(i10);
                return this;
            }

            private Builder() {
                super(ReservedRange.DEFAULT_INSTANCE);
            }
        }

        static {
            ReservedRange reservedRange = new ReservedRange();
            DEFAULT_INSTANCE = reservedRange;
            GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, reservedRange);
        }

        private ReservedRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static ReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer) throws e0 {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static h1<ReservedRange> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i10) {
            this.bitField0_ |= 2;
            this.end_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStart(int i10) {
            this.bitField0_ |= 1;
            this.start_ = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.d dVar, Object obj, Object obj2) {
            h1 aVar;
            switch (dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                case 3:
                    return new ReservedRange();
                case 4:
                    return new Builder();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    h1<ReservedRange> h1Var = PARSER;
                    if (h1Var != null) {
                        return h1Var;
                    }
                    synchronized (ReservedRange.class) {
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

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
        public int getStart() {
            return this.start_;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProto.ReservedRangeOrBuilder
        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ReservedRange reservedRange) {
            return DEFAULT_INSTANCE.createBuilder(reservedRange);
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ReservedRange parseFrom(j jVar) throws e0 {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ReservedRange parseFrom(j jVar, t tVar) throws e0 {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }

        public static ReservedRange parseFrom(byte[] bArr) throws e0 {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReservedRange parseFrom(byte[] bArr, t tVar) throws e0 {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ReservedRange parseFrom(InputStream inputStream) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReservedRange parseFrom(InputStream inputStream, t tVar) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ReservedRange parseFrom(k kVar) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ReservedRange parseFrom(k kVar, t tVar) throws IOException {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
        }
    }

    public interface ReservedRangeOrBuilder extends w0 {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getEnd();

        int getStart();

        boolean hasEnd();

        boolean hasStart();

        @Override // androidx.datastore.preferences.protobuf.w0
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = new DescriptorProtos$DescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$DescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$DescriptorProto.class, descriptorProtos$DescriptorProto);
    }

    private DescriptorProtos$DescriptorProto() {
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
    public void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
        ensureExtensionRangeIsMutable();
        AbstractMessageLite.addAll(iterable, this.extensionRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureFieldIsMutable();
        AbstractMessageLite.addAll(iterable, this.field_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        ensureNestedTypeIsMutable();
        AbstractMessageLite.addAll(iterable, this.nestedType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
        ensureOneofDeclIsMutable();
        AbstractMessageLite.addAll(iterable, this.oneofDecl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedName(Iterable<String> iterable) {
        ensureReservedNameIsMutable();
        AbstractMessageLite.addAll(iterable, this.reservedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
        ensureReservedRangeIsMutable();
        AbstractMessageLite.addAll(iterable, this.reservedRange_);
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
    public void addExtensionRange(ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.add(extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.add(descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedName(String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedNameBytes(j jVar) {
        ensureReservedNameIsMutable();
        this.reservedName_.add(jVar.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(reservedRange);
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
    public void clearExtensionRange() {
        this.extensionRange_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearField() {
        this.field_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNestedType() {
        this.nestedType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofDecl() {
        this.oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedName() {
        this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedRange() {
        this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureExtensionRangeIsMutable() {
        d0.j<ExtensionRange> jVar = this.extensionRange_;
        if (jVar.isModifiable()) {
            return;
        }
        this.extensionRange_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureFieldIsMutable() {
        d0.j<DescriptorProtos$FieldDescriptorProto> jVar = this.field_;
        if (jVar.isModifiable()) {
            return;
        }
        this.field_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureNestedTypeIsMutable() {
        d0.j<DescriptorProtos$DescriptorProto> jVar = this.nestedType_;
        if (jVar.isModifiable()) {
            return;
        }
        this.nestedType_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureOneofDeclIsMutable() {
        d0.j<DescriptorProtos$OneofDescriptorProto> jVar = this.oneofDecl_;
        if (jVar.isModifiable()) {
            return;
        }
        this.oneofDecl_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureReservedNameIsMutable() {
        d0.j<String> jVar = this.reservedName_;
        if (jVar.isModifiable()) {
            return;
        }
        this.reservedName_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureReservedRangeIsMutable() {
        d0.j<ReservedRange> jVar = this.reservedRange_;
        if (jVar.isModifiable()) {
            return;
        }
        this.reservedRange_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$DescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.getClass();
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions2 = this.options_;
        if (descriptorProtos$MessageOptions2 == null || descriptorProtos$MessageOptions2 == DescriptorProtos$MessageOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$MessageOptions;
        } else {
            this.options_ = ((DescriptorProtos$MessageOptions.Builder) DescriptorProtos$MessageOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$MessageOptions.Builder) descriptorProtos$MessageOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$DescriptorProto> parser() {
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
    public void removeExtensionRange(int i10) {
        ensureExtensionRangeIsMutable();
        this.extensionRange_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeField(int i10) {
        ensureFieldIsMutable();
        this.field_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNestedType(int i10) {
        ensureNestedTypeIsMutable();
        this.nestedType_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOneofDecl(int i10) {
        ensureOneofDeclIsMutable();
        this.oneofDecl_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReservedRange(int i10) {
        ensureReservedRangeIsMutable();
        this.reservedRange_.remove(i10);
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
    public void setExtensionRange(int i10, ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.set(i10, extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setField(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.set(i10, descriptorProtos$FieldDescriptorProto);
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
    public void setNestedType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.set(i10, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofDecl(int i10, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.set(i10, descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.getClass();
        this.options_ = descriptorProtos$MessageOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedName(int i10, String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedRange(int i10, ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.set(i10, reservedRange);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", DescriptorProtos$FieldDescriptorProto.class, "nestedType_", DescriptorProtos$DescriptorProto.class, "enumType_", DescriptorProtos$EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", DescriptorProtos$FieldDescriptorProto.class, "options_", "oneofDecl_", DescriptorProtos$OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"});
            case 3:
                return new DescriptorProtos$DescriptorProto();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$DescriptorProto> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$DescriptorProto.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i10) {
        return this.enumType_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    public DescriptorProtos$EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i10) {
        return this.enumType_.get(i10);
    }

    public List<? extends DescriptorProtos$EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$FieldDescriptorProto getExtension(int i10) {
        return this.extension_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    public DescriptorProtos$FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i10) {
        return this.extension_.get(i10);
    }

    public List<? extends DescriptorProtos$FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public ExtensionRange getExtensionRange(int i10) {
        return this.extensionRange_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<ExtensionRange> getExtensionRangeList() {
        return this.extensionRange_;
    }

    public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i10) {
        return this.extensionRange_.get(i10);
    }

    public List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$FieldDescriptorProto getField(int i10) {
        return this.field_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getFieldCount() {
        return this.field_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
        return this.field_;
    }

    public DescriptorProtos$FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i10) {
        return this.field_.get(i10);
    }

    public List<? extends DescriptorProtos$FieldDescriptorProtoOrBuilder> getFieldOrBuilderList() {
        return this.field_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public j getNameBytes() {
        return j.d(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$DescriptorProto getNestedType(int i10) {
        return this.nestedType_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
        return this.nestedType_;
    }

    public DescriptorProtos$DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i10) {
        return this.nestedType_.get(i10);
    }

    public List<? extends DescriptorProtos$DescriptorProtoOrBuilder> getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i10) {
        return this.oneofDecl_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
        return this.oneofDecl_;
    }

    public DescriptorProtos$OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i10) {
        return this.oneofDecl_.get(i10);
    }

    public List<? extends DescriptorProtos$OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public DescriptorProtos$MessageOptions getOptions() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public String getReservedName(int i10) {
        return this.reservedName_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public j getReservedNameBytes(int i10) {
        return j.d(this.reservedName_.get(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<String> getReservedNameList() {
        return this.reservedName_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public ReservedRange getReservedRange(int i10) {
        return this.reservedRange_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public List<ReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    public ReservedRangeOrBuilder getReservedRangeOrBuilder(int i10) {
        return this.reservedRange_.get(i10);
    }

    public List<? extends ReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        return DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
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
    public void addExtensionRange(int i10, ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.add(i10, extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addField(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.add(i10, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNestedType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.add(i10, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofDecl(int i10, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.add(i10, descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(int i10, ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(i10, reservedRange);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
