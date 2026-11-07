package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.DescriptorProtos$UninterpretedOption;
import java.util.List;

/* loaded from: classes.dex */
public interface DescriptorProtos$UninterpretedOptionOrBuilder extends w0 {
    String getAggregateValue();

    j getAggregateValueBytes();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    double getDoubleValue();

    String getIdentifierValue();

    j getIdentifierValueBytes();

    DescriptorProtos$UninterpretedOption.NamePart getName(int i10);

    int getNameCount();

    List<DescriptorProtos$UninterpretedOption.NamePart> getNameList();

    long getNegativeIntValue();

    long getPositiveIntValue();

    j getStringValue();

    boolean hasAggregateValue();

    boolean hasDoubleValue();

    boolean hasIdentifierValue();

    boolean hasNegativeIntValue();

    boolean hasPositiveIntValue();

    boolean hasStringValue();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
