package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$FeatureSetDefaults;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$FeatureSetDefaultsOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault getDefaults(int i10);

    int getDefaultsCount();

    List<DescriptorProtos$FeatureSetDefaults.FeatureSetEditionDefault> getDefaultsList();

    p getMaximumEdition();

    p getMinimumEdition();

    boolean hasMaximumEdition();

    boolean hasMinimumEdition();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
