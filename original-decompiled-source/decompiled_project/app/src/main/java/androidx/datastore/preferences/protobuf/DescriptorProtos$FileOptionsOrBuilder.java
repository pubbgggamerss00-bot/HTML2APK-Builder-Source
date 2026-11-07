package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FileOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$FileOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$FileOptions, DescriptorProtos$FileOptions.Builder> {
    boolean getCcEnableArenas();

    boolean getCcGenericServices();

    String getCsharpNamespace();

    j getCsharpNamespaceBytes();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    DescriptorProtos$FeatureSet getFeatures();

    String getGoPackage();

    j getGoPackageBytes();

    @Deprecated
    boolean getJavaGenerateEqualsAndHash();

    boolean getJavaGenericServices();

    boolean getJavaMultipleFiles();

    String getJavaOuterClassname();

    j getJavaOuterClassnameBytes();

    String getJavaPackage();

    j getJavaPackageBytes();

    boolean getJavaStringCheckUtf8();

    String getObjcClassPrefix();

    j getObjcClassPrefixBytes();

    DescriptorProtos$FileOptions.a getOptimizeFor();

    String getPhpClassPrefix();

    j getPhpClassPrefixBytes();

    String getPhpMetadataNamespace();

    j getPhpMetadataNamespaceBytes();

    String getPhpNamespace();

    j getPhpNamespaceBytes();

    boolean getPyGenericServices();

    String getRubyPackage();

    j getRubyPackageBytes();

    String getSwiftPrefix();

    j getSwiftPrefixBytes();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasCcEnableArenas();

    boolean hasCcGenericServices();

    boolean hasCsharpNamespace();

    boolean hasDeprecated();

    boolean hasFeatures();

    boolean hasGoPackage();

    @Deprecated
    boolean hasJavaGenerateEqualsAndHash();

    boolean hasJavaGenericServices();

    boolean hasJavaMultipleFiles();

    boolean hasJavaOuterClassname();

    boolean hasJavaPackage();

    boolean hasJavaStringCheckUtf8();

    boolean hasObjcClassPrefix();

    boolean hasOptimizeFor();

    boolean hasPhpClassPrefix();

    boolean hasPhpMetadataNamespace();

    boolean hasPhpNamespace();

    boolean hasPyGenericServices();

    boolean hasRubyPackage();

    boolean hasSwiftPrefix();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
