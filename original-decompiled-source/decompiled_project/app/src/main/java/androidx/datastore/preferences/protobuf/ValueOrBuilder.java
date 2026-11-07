package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Value;

/* loaded from: classes.dex */
public interface ValueOrBuilder extends w0 {
    boolean getBoolValue();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    Value.b getKindCase();

    ListValue getListValue();

    g1 getNullValue();

    int getNullValueValue();

    double getNumberValue();

    String getStringValue();

    j getStringValueBytes();

    Struct getStructValue();

    boolean hasBoolValue();

    boolean hasListValue();

    boolean hasNullValue();

    boolean hasNumberValue();

    boolean hasStringValue();

    boolean hasStructValue();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
