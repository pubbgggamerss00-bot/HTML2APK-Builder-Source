package org.jf.util;

import java.util.List;
import lc.e;
import lc.f;
import nc.k0;

/* loaded from: classes3.dex */
public class CharSequenceUtils {
    private static final e<Object, String> TO_STRING = f.f16942a;

    public static boolean listEquals(List<? extends CharSequence> list, List<? extends CharSequence> list2) {
        e<Object, String> eVar = TO_STRING;
        return k0.d(list, eVar).equals(k0.d(list2, eVar));
    }

    public static int listHashCode(List<? extends CharSequence> list) {
        return k0.d(list, TO_STRING).hashCode();
    }
}
