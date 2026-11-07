package org.jf.dexlib2.immutable.util;

import nc.r;
import org.jf.util.ImmutableConverter;

/* loaded from: classes3.dex */
public final class CharSequenceConverter {
    private static final ImmutableConverter<String, CharSequence> CONVERTER = new ImmutableConverter<String, CharSequence>() { // from class: org.jf.dexlib2.immutable.util.CharSequenceConverter.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(CharSequence charSequence) {
            return charSequence instanceof String;
        }

        @Override // org.jf.util.ImmutableConverter
        public String makeImmutable(CharSequence charSequence) {
            return charSequence.toString();
        }
    };

    private CharSequenceConverter() {
    }

    public static r<String> immutableStringList(Iterable<? extends CharSequence> iterable) {
        return CONVERTER.toList(iterable);
    }
}
