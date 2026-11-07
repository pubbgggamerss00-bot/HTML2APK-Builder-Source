package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public interface TypeOrBuilder extends w0 {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getEdition();

    j getEditionBytes();

    Field getFields(int i10);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    j getNameBytes();

    String getOneofs(int i10);

    j getOneofsBytes(int i10);

    int getOneofsCount();

    List<String> getOneofsList();

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
