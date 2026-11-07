package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FieldOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$FieldOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$FieldOptions, DescriptorProtos$FieldOptions.Builder> {
    DescriptorProtos$FieldOptions.b getCtype();

    boolean getDebugRedact();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    DescriptorProtos$FieldOptions.EditionDefault getEditionDefaults(int i10);

    int getEditionDefaultsCount();

    List<DescriptorProtos$FieldOptions.EditionDefault> getEditionDefaultsList();

    DescriptorProtos$FieldOptions.FeatureSupport getFeatureSupport();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$FieldOptions.c getJstype();

    boolean getLazy();

    boolean getPacked();

    DescriptorProtos$FieldOptions.d getRetention();

    DescriptorProtos$FieldOptions.e getTargets(int i10);

    int getTargetsCount();

    List<DescriptorProtos$FieldOptions.e> getTargetsList();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean getUnverifiedLazy();

    boolean getWeak();

    boolean hasCtype();

    boolean hasDebugRedact();

    boolean hasDeprecated();

    boolean hasFeatureSupport();

    boolean hasFeatures();

    boolean hasJstype();

    boolean hasLazy();

    boolean hasPacked();

    boolean hasRetention();

    boolean hasUnverifiedLazy();

    boolean hasWeak();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
