package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ax0 extends j30 {
    public final o70 s;

    /* renamed from: t, reason: collision with root package name */
    public final r30 f2868t;

    public ax0(o70 o70Var, r30 r30Var) {
        this.s = o70Var;
        this.f2868t = r30Var;
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void G0(ParcelFileDescriptor parcelFileDescriptor) {
        this.s.a(new jx0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f2868t));
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void Q1(ParcelFileDescriptor parcelFileDescriptor, r30 r30Var) {
        this.s.a(new jx0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), r30Var));
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void c0(zzbb zzbbVar) {
        this.s.b(zzbbVar.zza());
    }
}
