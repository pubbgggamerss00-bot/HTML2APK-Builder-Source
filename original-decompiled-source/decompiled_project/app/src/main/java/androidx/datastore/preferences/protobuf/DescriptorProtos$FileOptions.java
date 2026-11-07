package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSet;
import androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class DescriptorProtos$FileOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FileOptions, Builder> implements DescriptorProtos$FileOptionsOrBuilder {
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final DescriptorProtos$FileOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int FEATURES_FIELD_NUMBER = 50;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static volatile h1<DescriptorProtos$FileOptions> PARSER = null;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean ccGenericServices_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private boolean javaStringCheckUtf8_;
    private boolean pyGenericServices_;
    private byte memoizedIsInitialized = 2;
    private String javaPackage_ = "";
    private String javaOuterClassname_ = "";
    private int optimizeFor_ = 1;
    private String goPackage_ = "";
    private boolean ccEnableArenas_ = true;
    private String objcClassPrefix_ = "";
    private String csharpNamespace_ = "";
    private String swiftPrefix_ = "";
    private String phpClassPrefix_ = "";
    private String phpNamespace_ = "";
    private String phpMetadataNamespace_ = "";
    private String rubyPackage_ = "";
    private d0.j<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$FileOptions, Builder> implements DescriptorProtos$FileOptionsOrBuilder {
        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearCcEnableArenas() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearCcEnableArenas();
            return this;
        }

        public Builder clearCcGenericServices() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearCcGenericServices();
            return this;
        }

        public Builder clearCsharpNamespace() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearCsharpNamespace();
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearDeprecated();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearGoPackage() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearGoPackage();
            return this;
        }

        @Deprecated
        public Builder clearJavaGenerateEqualsAndHash() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaGenerateEqualsAndHash();
            return this;
        }

        public Builder clearJavaGenericServices() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaGenericServices();
            return this;
        }

        public Builder clearJavaMultipleFiles() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaMultipleFiles();
            return this;
        }

        public Builder clearJavaOuterClassname() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaOuterClassname();
            return this;
        }

        public Builder clearJavaPackage() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaPackage();
            return this;
        }

        public Builder clearJavaStringCheckUtf8() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaStringCheckUtf8();
            return this;
        }

        public Builder clearObjcClassPrefix() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearObjcClassPrefix();
            return this;
        }

        public Builder clearOptimizeFor() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearOptimizeFor();
            return this;
        }

        public Builder clearPhpClassPrefix() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearPhpClassPrefix();
            return this;
        }

        public Builder clearPhpMetadataNamespace() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearPhpMetadataNamespace();
            return this;
        }

        public Builder clearPhpNamespace() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearPhpNamespace();
            return this;
        }

        public Builder clearPyGenericServices() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearPyGenericServices();
            return this;
        }

        public Builder clearRubyPackage() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearRubyPackage();
            return this;
        }

        public Builder clearSwiftPrefix() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearSwiftPrefix();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getCcEnableArenas() {
            return ((DescriptorProtos$FileOptions) this.instance).getCcEnableArenas();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getCcGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).getCcGenericServices();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getCsharpNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).getCsharpNamespace();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getCsharpNamespaceBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getCsharpNamespaceBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$FileOptions) this.instance).getDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$FileOptions) this.instance).getFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getGoPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).getGoPackage();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getGoPackageBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getGoPackageBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaGenerateEqualsAndHash();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaGenericServices();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaMultipleFiles() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaMultipleFiles();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getJavaOuterClassname() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaOuterClassname();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getJavaOuterClassnameBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaOuterClassnameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getJavaPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaPackage();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getJavaPackageBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaPackageBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaStringCheckUtf8() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaStringCheckUtf8();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getObjcClassPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).getObjcClassPrefix();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getObjcClassPrefixBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getObjcClassPrefixBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public a getOptimizeFor() {
            return ((DescriptorProtos$FileOptions) this.instance).getOptimizeFor();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpClassPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpClassPrefix();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getPhpClassPrefixBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpClassPrefixBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpMetadataNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpMetadataNamespace();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getPhpMetadataNamespaceBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpMetadataNamespaceBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpNamespace();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getPhpNamespaceBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpNamespaceBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getPyGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).getPyGenericServices();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getRubyPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).getRubyPackage();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getRubyPackageBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getRubyPackageBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getSwiftPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).getSwiftPrefix();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public j getSwiftPrefixBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getSwiftPrefixBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
            return ((DescriptorProtos$FileOptions) this.instance).getUninterpretedOption(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$FileOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCcEnableArenas() {
            return ((DescriptorProtos$FileOptions) this.instance).hasCcEnableArenas();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCcGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).hasCcGenericServices();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCsharpNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).hasCsharpNamespace();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$FileOptions) this.instance).hasDeprecated();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$FileOptions) this.instance).hasFeatures();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasGoPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).hasGoPackage();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaGenerateEqualsAndHash();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaGenericServices();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaMultipleFiles() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaMultipleFiles();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaOuterClassname() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaOuterClassname();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaPackage();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaStringCheckUtf8() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaStringCheckUtf8();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasObjcClassPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).hasObjcClassPrefix();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasOptimizeFor() {
            return ((DescriptorProtos$FileOptions) this.instance).hasOptimizeFor();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpClassPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).hasPhpClassPrefix();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpMetadataNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).hasPhpMetadataNamespace();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).hasPhpNamespace();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPyGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).hasPyGenericServices();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasRubyPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).hasRubyPackage();
        }

        @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasSwiftPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).hasSwiftPrefix();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).removeUninterpretedOption(i10);
            return this;
        }

        public Builder setCcEnableArenas(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setCcEnableArenas(z10);
            return this;
        }

        public Builder setCcGenericServices(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setCcGenericServices(z10);
            return this;
        }

        public Builder setCsharpNamespace(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setCsharpNamespace(str);
            return this;
        }

        public Builder setCsharpNamespaceBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setCsharpNamespaceBytes(jVar);
            return this;
        }

        public Builder setDeprecated(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setDeprecated(z10);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setGoPackage(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setGoPackage(str);
            return this;
        }

        public Builder setGoPackageBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setGoPackageBytes(jVar);
            return this;
        }

        @Deprecated
        public Builder setJavaGenerateEqualsAndHash(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaGenerateEqualsAndHash(z10);
            return this;
        }

        public Builder setJavaGenericServices(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaGenericServices(z10);
            return this;
        }

        public Builder setJavaMultipleFiles(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaMultipleFiles(z10);
            return this;
        }

        public Builder setJavaOuterClassname(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaOuterClassname(str);
            return this;
        }

        public Builder setJavaOuterClassnameBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaOuterClassnameBytes(jVar);
            return this;
        }

        public Builder setJavaPackage(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaPackage(str);
            return this;
        }

        public Builder setJavaPackageBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaPackageBytes(jVar);
            return this;
        }

        public Builder setJavaStringCheckUtf8(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaStringCheckUtf8(z10);
            return this;
        }

        public Builder setObjcClassPrefix(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setObjcClassPrefix(str);
            return this;
        }

        public Builder setObjcClassPrefixBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setObjcClassPrefixBytes(jVar);
            return this;
        }

        public Builder setOptimizeFor(a aVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setOptimizeFor(aVar);
            return this;
        }

        public Builder setPhpClassPrefix(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpClassPrefix(str);
            return this;
        }

        public Builder setPhpClassPrefixBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpClassPrefixBytes(jVar);
            return this;
        }

        public Builder setPhpMetadataNamespace(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpMetadataNamespace(str);
            return this;
        }

        public Builder setPhpMetadataNamespaceBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpMetadataNamespaceBytes(jVar);
            return this;
        }

        public Builder setPhpNamespace(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpNamespace(str);
            return this;
        }

        public Builder setPhpNamespaceBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpNamespaceBytes(jVar);
            return this;
        }

        public Builder setPyGenericServices(boolean z10) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPyGenericServices(z10);
            return this;
        }

        public Builder setRubyPackage(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setRubyPackage(str);
            return this;
        }

        public Builder setRubyPackageBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setRubyPackageBytes(jVar);
            return this;
        }

        public Builder setSwiftPrefix(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setSwiftPrefix(str);
            return this;
        }

        public Builder setSwiftPrefixBytes(j jVar) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setSwiftPrefixBytes(jVar);
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FileOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(i10, descriptorProtos$UninterpretedOption);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setUninterpretedOption(i10, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(i10, builder.build());
            return this;
        }
    }

    public enum a implements d0.c {
        SPEED(1),
        CODE_SIZE(2),
        LITE_RUNTIME(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f1873a;

        /* renamed from: androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptions$a$a, reason: collision with other inner class name */
        public static final class C0023a implements d0.e {

            /* renamed from: a, reason: collision with root package name */
            public static final C0023a f1874a = new C0023a();

            @Override // androidx.datastore.preferences.protobuf.d0.e
            public final boolean isInRange(int i10) {
                return a.a(i10) != null;
            }
        }

        a(int i10) {
            this.f1873a = i10;
        }

        public static a a(int i10) {
            if (i10 == 1) {
                return SPEED;
            }
            if (i10 == 2) {
                return CODE_SIZE;
            }
            if (i10 != 3) {
                return null;
            }
            return LITE_RUNTIME;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.c
        public final int getNumber() {
            return this.f1873a;
        }
    }

    static {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = new DescriptorProtos$FileOptions();
        DEFAULT_INSTANCE = descriptorProtos$FileOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileOptions.class, descriptorProtos$FileOptions);
    }

    private DescriptorProtos$FileOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcEnableArenas() {
        this.bitField0_ &= -2049;
        this.ccEnableArenas_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcGenericServices() {
        this.bitField0_ &= -129;
        this.ccGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCsharpNamespace() {
        this.bitField0_ &= -8193;
        this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -1025;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoPackage() {
        this.bitField0_ &= -65;
        this.goPackage_ = getDefaultInstance().getGoPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenerateEqualsAndHash() {
        this.bitField0_ &= -9;
        this.javaGenerateEqualsAndHash_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenericServices() {
        this.bitField0_ &= -257;
        this.javaGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaMultipleFiles() {
        this.bitField0_ &= -5;
        this.javaMultipleFiles_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaOuterClassname() {
        this.bitField0_ &= -3;
        this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaPackage() {
        this.bitField0_ &= -2;
        this.javaPackage_ = getDefaultInstance().getJavaPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaStringCheckUtf8() {
        this.bitField0_ &= -17;
        this.javaStringCheckUtf8_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjcClassPrefix() {
        this.bitField0_ &= -4097;
        this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptimizeFor() {
        this.bitField0_ &= -33;
        this.optimizeFor_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpClassPrefix() {
        this.bitField0_ &= -32769;
        this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpMetadataNamespace() {
        this.bitField0_ &= -131073;
        this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpNamespace() {
        this.bitField0_ &= -65537;
        this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPyGenericServices() {
        this.bitField0_ &= -513;
        this.pyGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRubyPackage() {
        this.bitField0_ &= -262145;
        this.rubyPackage_ = getDefaultInstance().getRubyPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwiftPrefix() {
        this.bitField0_ &= -16385;
        this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        d0.j<DescriptorProtos$UninterpretedOption> jVar = this.uninterpretedOption_;
        if (jVar.isModifiable()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$FileOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = this.features_;
        if (descriptorProtos$FeatureSet2 == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
            this.features_ = descriptorProtos$FeatureSet;
        } else {
            this.features_ = ((DescriptorProtos$FeatureSet.Builder) DescriptorProtos$FeatureSet.newBuilder(this.features_).mergeFrom((DescriptorProtos$FeatureSet.Builder) descriptorProtos$FeatureSet)).buildPartial();
        }
        this.bitField0_ |= PKIFailureInfo.signerNotTrusted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer) throws e0 {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h1<DescriptorProtos$FileOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcEnableArenas(boolean z10) {
        this.bitField0_ |= 2048;
        this.ccEnableArenas_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcGenericServices(boolean z10) {
        this.bitField0_ |= 128;
        this.ccGenericServices_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.csharpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespaceBytes(j jVar) {
        this.csharpNamespace_ = jVar.n();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= 1024;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= PKIFailureInfo.signerNotTrusted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackage(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.goPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackageBytes(j jVar) {
        this.goPackage_ = jVar.n();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenerateEqualsAndHash(boolean z10) {
        this.bitField0_ |= 8;
        this.javaGenerateEqualsAndHash_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenericServices(boolean z10) {
        this.bitField0_ |= 256;
        this.javaGenericServices_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaMultipleFiles(boolean z10) {
        this.bitField0_ |= 4;
        this.javaMultipleFiles_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassname(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.javaOuterClassname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassnameBytes(j jVar) {
        this.javaOuterClassname_ = jVar.n();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackage(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.javaPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackageBytes(j jVar) {
        this.javaPackage_ = jVar.n();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaStringCheckUtf8(boolean z10) {
        this.bitField0_ |= 16;
        this.javaStringCheckUtf8_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.objcClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefixBytes(j jVar) {
        this.objcClassPrefix_ = jVar.n();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptimizeFor(a aVar) {
        this.optimizeFor_ = aVar.f1873a;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.phpClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefixBytes(j jVar) {
        this.phpClassPrefix_ = jVar.n();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.phpMetadataNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespaceBytes(j jVar) {
        this.phpMetadataNamespace_ = jVar.n();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.phpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespaceBytes(j jVar) {
        this.phpNamespace_ = jVar.n();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPyGenericServices(boolean z10) {
        this.bitField0_ |= 512;
        this.pyGenericServices_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackage(String str) {
        str.getClass();
        this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
        this.rubyPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackageBytes(j jVar) {
        this.rubyPackage_ = jVar.n();
        this.bitField0_ |= PKIFailureInfo.transactionIdInUse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.swiftPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefixBytes(j jVar) {
        this.swiftPrefix_ = jVar.n();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i10, descriptorProtos$UninterpretedOption);
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0002\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\n\u001bဇ\u0004\u001fဇ\u000b$ဈ\f%ဈ\r'ဈ\u000e(ဈ\u000f)ဈ\u0010,ဈ\u0011-ဈ\u00122ᐉ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", a.C0023a.f1874a, "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpMetadataNamespace_", "rubyPackage_", "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 3:
                return new DescriptorProtos$FileOptions();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                h1<DescriptorProtos$FileOptions> h1Var = PARSER;
                if (h1Var != null) {
                    return h1Var;
                }
                synchronized (DescriptorProtos$FileOptions.class) {
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

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getCsharpNamespace() {
        return this.csharpNamespace_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getCsharpNamespaceBytes() {
        return j.d(this.csharpNamespace_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getGoPackage() {
        return this.goPackage_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getGoPackageBytes() {
        return j.d(this.goPackage_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getJavaOuterClassname() {
        return this.javaOuterClassname_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getJavaOuterClassnameBytes() {
        return j.d(this.javaOuterClassname_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getJavaPackage() {
        return this.javaPackage_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getJavaPackageBytes() {
        return j.d(this.javaPackage_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getObjcClassPrefix() {
        return this.objcClassPrefix_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getObjcClassPrefixBytes() {
        return j.d(this.objcClassPrefix_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public a getOptimizeFor() {
        a aVarA = a.a(this.optimizeFor_);
        return aVarA == null ? a.SPEED : aVarA;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getPhpClassPrefix() {
        return this.phpClassPrefix_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getPhpClassPrefixBytes() {
        return j.d(this.phpClassPrefix_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getPhpMetadataNamespace() {
        return this.phpMetadataNamespace_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getPhpMetadataNamespaceBytes() {
        return j.d(this.phpMetadataNamespace_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getPhpNamespace() {
        return this.phpNamespace_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getPhpNamespaceBytes() {
        return j.d(this.phpNamespace_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getRubyPackage() {
        return this.rubyPackage_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getRubyPackageBytes() {
        return j.d(this.rubyPackage_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getSwiftPrefix() {
        return this.swiftPrefix_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public j getSwiftPrefixBytes() {
        return j.d(this.swiftPrefix_);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i10) {
        return this.uninterpretedOption_.get(i10);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasCcEnableArenas() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasCcGenericServices() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasCsharpNamespace() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & PKIFailureInfo.signerNotTrusted) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasGoPackage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaGenericServices() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaMultipleFiles() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaOuterClassname() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaStringCheckUtf8() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasObjcClassPrefix() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasOptimizeFor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasPhpClassPrefix() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasPhpMetadataNamespace() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasPhpNamespace() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasPyGenericServices() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasRubyPackage() {
        return (this.bitField0_ & PKIFailureInfo.transactionIdInUse) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasSwiftPrefix() {
        return (this.bitField0_ & 16384) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newBuilder(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileOptions);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer, t tVar) throws e0 {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
    }

    public static DescriptorProtos$FileOptions parseFrom(j jVar) throws e0 {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$FileOptions parseFrom(j jVar, t tVar) throws e0 {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr) throws e0 {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr, t tVar) throws e0 {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
    }

    public static DescriptorProtos$FileOptions parseFrom(k kVar) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar);
    }

    public static DescriptorProtos$FileOptions parseFrom(k kVar, t tVar) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, kVar, tVar);
    }
}
