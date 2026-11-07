package org.jf.dexlib2.writer;

import org.jf.dexlib2.iface.reference.StringReference;

/* loaded from: classes3.dex */
public interface StringSection<StringKey, StringRef extends StringReference> extends NullableIndexSection<StringKey> {
    int getItemIndex(StringRef stringref);

    boolean hasJumboIndexes();
}
