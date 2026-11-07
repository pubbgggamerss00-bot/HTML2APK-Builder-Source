package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import p.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wo extends p.g {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10236b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public Context f10237c;

    /* renamed from: d, reason: collision with root package name */
    public cu0 f10238d;

    /* renamed from: e, reason: collision with root package name */
    public p.h f10239e;

    /* renamed from: f, reason: collision with root package name */
    public g.a f10240f;

    @Override // p.g
    public final void a(g.a aVar) {
        this.f10240f = aVar;
        try {
            aVar.f14041a.b2();
        } catch (RemoteException unused) {
        }
        this.f10239e = aVar.b(new vo(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10240f = null;
        this.f10239e = null;
    }
}
