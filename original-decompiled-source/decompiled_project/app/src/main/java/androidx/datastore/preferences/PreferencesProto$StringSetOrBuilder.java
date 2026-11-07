package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.w0;
import java.util.List;

/* loaded from: classes.dex */
public interface PreferencesProto$StringSetOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getStrings(int i10);

    j getStringsBytes(int i10);

    int getStringsCount();

    List<String> getStringsList();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
