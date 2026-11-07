package com.google.android.gms.internal.common;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzt {
    public static final CharSequence zza(Object obj, String str) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
