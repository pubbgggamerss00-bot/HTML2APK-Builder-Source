package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e11 extends ly implements gl0 {
    public my s;

    /* renamed from: t, reason: collision with root package name */
    public n31 f4080t;

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void K(int i6, String str) {
        n31 n31Var = this.f4080t;
        if (n31Var != null) {
            synchronized (n31Var) {
                try {
                    if (!n31Var.f7310a) {
                        n31Var.f7310a = true;
                        if (str == null) {
                            str = "Error from: " + ((b01) n31Var.f7311b).f2883a + ", code: " + i6;
                        }
                        n31Var.d(new zze(i6, str, AdError.UNDEFINED_DOMAIN, null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void M0(zze zzeVar) {
        my myVar = this.s;
        if (myVar != null) {
            myVar.M0(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void T(zze zzeVar) {
        n31 n31Var = this.f4080t;
        if (n31Var != null) {
            synchronized (n31Var) {
                if (!n31Var.f7310a) {
                    n31Var.f7310a = true;
                    n31Var.d(zzeVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void a(int i6) {
        n31 n31Var = this.f4080t;
        if (n31Var != null) {
            n31Var.a(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void b1(l40 l40Var) {
        my myVar = this.s;
        if (myVar != null) {
            myVar.b1(l40Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void c() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void d0(o40 o40Var) {
        my myVar = this.s;
        if (myVar != null) {
            myVar.d0(o40Var);
        }
    }

    public final synchronized void e2(p31 p31Var) {
        this.s = p31Var;
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void j() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void m1(int i6) {
        my myVar = this.s;
        if (myVar != null) {
            myVar.m1(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.gl0
    public final synchronized void r(n31 n31Var) {
        this.f4080t = n31Var;
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void s1(String str, String str2) {
        my myVar = this.s;
        if (myVar != null) {
            myVar.s1(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void w1(tr trVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zze() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzf() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzl(String str) {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzm() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzn() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzo() {
        try {
            my myVar = this.s;
            if (myVar != null) {
                myVar.zzo();
            }
            n31 n31Var = this.f4080t;
            if (n31Var != null) {
                synchronized (n31Var) {
                    ((o70) n31Var.f7312c).a(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzp() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzu() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzv() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final synchronized void zzx() {
        my myVar = this.s;
        if (myVar != null) {
            myVar.zzx();
        }
    }
}
