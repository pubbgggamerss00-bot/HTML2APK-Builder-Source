package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class zzjk implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(it.next());
            z10 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
