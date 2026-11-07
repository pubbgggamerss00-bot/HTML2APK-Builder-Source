package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ap0 extends vq {
    public final jp0 s;

    /* renamed from: t, reason: collision with root package name */
    public k3.a f2817t;

    public ap0(jp0 jp0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.s = jp0Var;
    }

    public static float i1(k3.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) k3.b.i1(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final float zze() {
        float f6;
        float f7;
        jp0 jp0Var = this.s;
        synchronized (jp0Var) {
            f6 = jp0Var.f6144x;
        }
        if (f6 != 0.0f) {
            synchronized (jp0Var) {
                f7 = jp0Var.f6144x;
            }
            return f7;
        }
        if (jp0Var.i() != null) {
            try {
                return jp0Var.i().zze();
            } catch (RemoteException e6) {
                zzo.zzh("Remote exception getting video controller aspect ratio.", e6);
                return 0.0f;
            }
        }
        k3.a aVar = this.f2817t;
        if (aVar != null) {
            return i1(aVar);
        }
        yq yqVarK = jp0Var.k();
        if (yqVarK == null) {
            return 0.0f;
        }
        float fZzd = (yqVarK.zzd() == -1 || yqVarK.zzc() == -1) ? 0.0f : yqVarK.zzd() / yqVarK.zzc();
        return fZzd == 0.0f ? i1(yqVarK.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final float zzf() {
        jp0 jp0Var = this.s;
        if (jp0Var.i() != null) {
            return jp0Var.i().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final float zzg() {
        jp0 jp0Var = this.s;
        if (jp0Var.i() != null) {
            return jp0Var.i().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final zzeb zzh() {
        return this.s.i();
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final k3.a zzi() {
        k3.a aVar = this.f2817t;
        if (aVar != null) {
            return aVar;
        }
        yq yqVarK = this.s.k();
        if (yqVarK == null) {
            return null;
        }
        return yqVarK.zzf();
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final void zzj(k3.a aVar) {
        this.f2817t = aVar;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final boolean zzk() {
        xa0 xa0Var;
        jp0 jp0Var = this.s;
        synchronized (jp0Var) {
            xa0Var = jp0Var.f6131j;
        }
        return xa0Var != null;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final boolean zzl() {
        return this.s.i() != null;
    }
}
