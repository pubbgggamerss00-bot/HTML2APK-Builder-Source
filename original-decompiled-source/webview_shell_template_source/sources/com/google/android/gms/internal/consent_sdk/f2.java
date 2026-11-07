package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f2 extends Exception {
    public final int s;

    public f2(int i6, String str) {
        super(str);
        this.s = i6;
    }

    public final b5.c a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new b5.c(this.s, super.getMessage());
    }

    public f2(int i6, String str, IOException iOException) {
        super(str, iOException);
        this.s = i6;
    }
}
