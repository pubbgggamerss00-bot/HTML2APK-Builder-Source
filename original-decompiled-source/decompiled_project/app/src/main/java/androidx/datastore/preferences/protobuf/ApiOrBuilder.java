package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public interface ApiOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Method getMethods(int i10);

    int getMethodsCount();

    List<Method> getMethodsList();

    Mixin getMixins(int i10);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    String getName();

    j getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    t1 getSyntax();

    int getSyntaxValue();

    String getVersion();

    j getVersionBytes();

    boolean hasSourceContext();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
