package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public interface StructOrBuilder extends w0 {
    boolean containsFields(String str);

    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    Map<String, Value> getFields();

    int getFieldsCount();

    Map<String, Value> getFieldsMap();

    Value getFieldsOrDefault(String str, Value value);

    Value getFieldsOrThrow(String str);

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
