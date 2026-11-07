package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public interface MethodOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getName();

    j getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    j getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    j getResponseTypeUrlBytes();

    t1 getSyntax();

    int getSyntaxValue();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
