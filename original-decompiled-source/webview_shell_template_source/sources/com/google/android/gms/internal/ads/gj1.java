package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gj1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5074a;

    /* renamed from: b, reason: collision with root package name */
    public int f5075b;

    /* renamed from: c, reason: collision with root package name */
    public int f5076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj1 f5077d;

    public /* synthetic */ gj1(hj1 hj1Var, byte[] bArr) {
        this.f5077d = hj1Var;
        this.f5074a = bArr;
    }

    public final synchronized void a() {
        try {
            hj1 hj1Var = this.f5077d;
            if (hj1Var.f5432b) {
                hj1Var.f5431a.m(this.f5074a);
                this.f5077d.f5431a.h(this.f5075b);
                this.f5077d.f5431a.a(this.f5076c);
                this.f5077d.f5431a.o();
                this.f5077d.f5431a.zzf();
            }
        } catch (RemoteException e6) {
            Log.d("GASS", "Clearcut log failed", e6);
        }
    }
}
