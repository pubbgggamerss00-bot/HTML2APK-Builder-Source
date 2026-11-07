package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Field;
import java.util.List;

/* loaded from: classes.dex */
public interface FieldOrBuilder extends w0 {
    Field.b getCardinality();

    int getCardinalityValue();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDefaultValue();

    j getDefaultValueBytes();

    String getJsonName();

    j getJsonNameBytes();

    Field.c getKind();

    int getKindValue();

    String getName();

    j getNameBytes();

    int getNumber();

    int getOneofIndex();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getPacked();

    String getTypeUrl();

    j getTypeUrlBytes();

    @Override // androidx.datastore.preferences.protobuf.w0
    /* synthetic */ boolean isInitialized();
}
