package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10756a;

    /* renamed from: b, reason: collision with root package name */
    public final db2 f10757b;

    public y(Handler handler, db2 db2Var) {
        this.f10756a = handler;
        this.f10757b = db2Var;
    }

    public final void a(n90 n90Var) {
        Handler handler = this.f10756a;
        if (handler != null) {
            handler.post(new q(0, this, n90Var));
        }
    }
}
