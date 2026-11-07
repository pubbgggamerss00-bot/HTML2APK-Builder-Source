package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z30 extends ContextWrapper {
    public static Context a(Context context) {
        if (context instanceof z30) {
            return ((z30) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
