package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class m {
    public static l a(Looper looper, Object obj, String str) {
        com.google.android.gms.common.internal.p.g(obj, "Listener must not be null");
        com.google.android.gms.common.internal.p.g(looper, "Looper must not be null");
        com.google.android.gms.common.internal.p.g(str, "Listener type must not be null");
        return new l(looper, obj, str);
    }
}
