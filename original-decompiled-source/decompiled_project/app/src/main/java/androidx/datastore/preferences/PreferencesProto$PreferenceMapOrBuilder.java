package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.w0;
import java.util.Map;

/* loaded from: classes.dex */
public interface PreferencesProto$PreferenceMapOrBuilder extends w0 {
    boolean containsPreferences(String str);

    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    Map<String, PreferencesProto$Value> getPreferences();

    int getPreferencesCount();

    Map<String, PreferencesProto$Value> getPreferencesMap();

    PreferencesProto$Value getPreferencesOrDefault(String str, PreferencesProto$Value preferencesProto$Value);

    PreferencesProto$Value getPreferencesOrThrow(String str);

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
