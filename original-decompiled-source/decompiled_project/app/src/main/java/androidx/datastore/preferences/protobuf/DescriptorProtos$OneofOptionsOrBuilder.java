package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$OneofOptions;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$OneofOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$OneofOptions, DescriptorProtos$OneofOptions.Builder> {
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$FeatureSet getFeatures();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasFeatures();

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
