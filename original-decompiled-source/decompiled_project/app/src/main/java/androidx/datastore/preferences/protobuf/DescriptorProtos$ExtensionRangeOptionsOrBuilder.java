package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$ExtensionRangeOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$ExtensionRangeOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$ExtensionRangeOptions, DescriptorProtos$ExtensionRangeOptions.Builder> {
    DescriptorProtos$ExtensionRangeOptions.Declaration getDeclaration(int i10);

    int getDeclarationCount();

    List<DescriptorProtos$ExtensionRangeOptions.Declaration> getDeclarationList();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    DescriptorProtos$ExtensionRangeOptions.a getVerification();

    boolean hasFeatures();

    boolean hasVerification();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
