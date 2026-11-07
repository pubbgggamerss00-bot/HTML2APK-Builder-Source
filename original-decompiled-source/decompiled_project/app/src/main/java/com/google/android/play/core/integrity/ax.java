package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f6533a;

    public static synchronized aw a(Context context) {
        try {
            if (f6533a == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                f6533a = uVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6533a;
    }
}
