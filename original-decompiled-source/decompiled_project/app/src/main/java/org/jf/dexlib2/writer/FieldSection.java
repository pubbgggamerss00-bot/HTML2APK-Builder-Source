package org.jf.dexlib2.writer;

import org.jf.dexlib2.iface.reference.FieldReference;

/* loaded from: classes3.dex */
public interface FieldSection<StringKey, TypeKey, FieldRefKey extends FieldReference, FieldKey> extends IndexSection<FieldRefKey> {
    TypeKey getDefiningClass(FieldRefKey fieldrefkey);

    int getFieldIndex(FieldKey fieldkey);

    TypeKey getFieldType(FieldRefKey fieldrefkey);

    StringKey getName(FieldRefKey fieldrefkey);
}
