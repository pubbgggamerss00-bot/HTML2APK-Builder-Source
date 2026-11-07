package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f6617a;

    public static synchronized s a(Context context) {
        try {
            if (f6617a == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f6617a = qVar.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6617a;
    }
}
