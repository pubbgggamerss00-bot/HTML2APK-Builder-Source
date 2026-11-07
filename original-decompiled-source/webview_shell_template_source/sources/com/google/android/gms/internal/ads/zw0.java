package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zw0 extends j30 {
    public final /* synthetic */ bx0 s;

    public zw0(bx0 bx0Var) {
        this.s = bx0Var;
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void G0(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        bx0 bx0Var = this.s;
        bx0Var.f3317a.a(new jx0(autoCloseInputStream, bx0Var.f3321e));
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void Q1(ParcelFileDescriptor parcelFileDescriptor, r30 r30Var) {
        this.s.f3317a.a(new jx0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), r30Var));
    }

    @Override // com.google.android.gms.internal.ads.k30
    public final void c0(zzbb zzbbVar) {
        this.s.f3317a.b(zzbbVar.zza());
    }
}
