package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gk {

    /* renamed from: a, reason: collision with root package name */
    public wj f5080a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5081b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5082c = new Object();

    public gk(Context context) {
    }

    public static /* bridge */ /* synthetic */ void a(gk gkVar) {
        synchronized (gkVar.f5082c) {
            try {
                wj wjVar = gkVar.f5080a;
                if (wjVar == null) {
                    return;
                }
                wjVar.disconnect();
                gkVar.f5080a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
