package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static e f11616a;

    public static a a(Context context) {
        e eVar;
        synchronized (a.class) {
            try {
                if (f11616a == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f11616a = new e(application);
                }
                eVar = f11616a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public abstract t3 b();

    public abstract r c();

    public abstract g0 d();
}
