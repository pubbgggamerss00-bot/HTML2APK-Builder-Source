package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$EnumOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$EnumOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$EnumOptions, DescriptorProtos$EnumOptions.Builder> {
    boolean getAllowAlias();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    @Deprecated
    boolean getDeprecatedLegacyJsonFieldConflicts();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasAllowAlias();

    boolean hasDeprecated();

    @Deprecated
    boolean hasDeprecatedLegacyJsonFieldConflicts();

    boolean hasFeatures();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
