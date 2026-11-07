package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hl1 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f5438b;

    /* renamed from: c, reason: collision with root package name */
    public final il1 f5439c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5442f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f5443g;

    /* renamed from: i, reason: collision with root package name */
    public gl1 f5444i;

    /* renamed from: j, reason: collision with root package name */
    public ik1 f5445j;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5441e = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final String f5440d = "OverlayDisplayService";

    /* renamed from: a, reason: collision with root package name */
    public final em1 f5437a = sj1.c(new aa1(4));
    public final fl1 h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.fl1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            hl1 hl1Var = this.f4719a;
            hl1Var.f5439c.c("%s : Binder has died.", hl1Var.f5440d);
            synchronized (hl1Var.f5441e) {
                hl1Var.f5441e.clear();
            }
        }
    };

    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.fl1] */
    public hl1(Context context, il1 il1Var, Intent intent) {
        this.f5438b = context;
        this.f5439c = il1Var;
        this.f5443g = intent;
    }

    public final void a(Runnable runnable) {
        ((Handler) this.f5437a.mo7zza()).post(new as1(10, this, runnable));
    }
}
