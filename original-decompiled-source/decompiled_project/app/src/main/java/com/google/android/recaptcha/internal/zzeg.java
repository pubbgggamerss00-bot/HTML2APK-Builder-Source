package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;

/* loaded from: classes2.dex */
public final class zzeg {
    private zzeg() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String strN = t.n("18.6.1", ".", "");
        int iY = x.y(strN, "-", 0, false, 6);
        if (iY != -1) {
            strN = strN.substring(0, iY);
            r.d(strN, "substring(...)");
        }
        return Integer.parseInt(strN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(x.S("18.6.1", "-", ""));
    }

    public /* synthetic */ zzeg(j jVar) {
    }
}
