package androidx.datastore.preferences;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.w0;

/* loaded from: classes.dex */
public interface PreferencesProto$ValueOrBuilder extends w0 {
    boolean getBoolean();

    j getBytes();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    double getDouble();

    float getFloat();

    int getInteger();

    long getLong();

    String getString();

    j getStringBytes();

    PreferencesProto$StringSet getStringSet();

    PreferencesProto$Value.a getValueCase();

    boolean hasBoolean();

    boolean hasBytes();

    boolean hasDouble();

    boolean hasFloat();

    boolean hasInteger();

    boolean hasLong();

    boolean hasString();

    boolean hasStringSet();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
