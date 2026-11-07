package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public interface EnumOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getEdition();

    j getEditionBytes();

    EnumValue getEnumvalue(int i10);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    j getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    t1 getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
