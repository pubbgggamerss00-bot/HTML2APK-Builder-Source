package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$MethodOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$MethodOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$MethodOptions, DescriptorProtos$MethodOptions.Builder> {
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$MethodOptions.a getIdempotencyLevel();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasDeprecated();

    boolean hasFeatures();

    boolean hasIdempotencyLevel();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
