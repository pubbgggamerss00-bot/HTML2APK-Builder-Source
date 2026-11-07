package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ob0 extends zzea {
    public float A;
    public float B;
    public float C;
    public boolean D;
    public boolean E;
    public gs F;
    public final p80 s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f7670u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7671v;

    /* renamed from: w, reason: collision with root package name */
    public int f7672w;

    /* renamed from: x, reason: collision with root package name */
    public zzee f7673x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7674y;

    /* renamed from: t, reason: collision with root package name */
    public final Object f7669t = new Object();

    /* renamed from: z, reason: collision with root package name */
    public boolean f7675z = true;

    public ob0(p80 p80Var, float f6, boolean z6, boolean z7) {
        this.s = p80Var;
        this.A = f6;
        this.f7670u = z6;
        this.f7671v = z7;
    }

    public final void e2(zzga zzgaVar) {
        Object obj = this.f7669t;
        boolean z6 = zzgaVar.zza;
        boolean z7 = zzgaVar.zzb;
        boolean z8 = zzgaVar.zzc;
        synchronized (obj) {
            this.D = z7;
            this.E = z8;
        }
        String str = true != z6 ? "0" : "1";
        String str2 = true != z7 ? "0" : "1";
        String str3 = true != z8 ? "0" : "1";
        w.a aVar = new w.a(3);
        aVar.put("muteStart", str);
        aVar.put("customControlsRequested", str2);
        aVar.put("clickToExpandRequested", str3);
        f2("initialState", Collections.unmodifiableMap(aVar));
    }

    public final void f2(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        i70.f5591f.execute(new q(4, this, map2));
    }

    public final void i1(float f6, float f7, float f8, int i6, boolean z6) {
        boolean z7;
        boolean z8;
        int i7;
        synchronized (this.f7669t) {
            try {
                z7 = true;
                if (f7 == this.A && f8 == this.C) {
                    z7 = false;
                }
                this.A = f7;
                if (!((Boolean) zzbe.zzc().a(zn.Fc)).booleanValue()) {
                    this.B = f6;
                }
                z8 = this.f7675z;
                this.f7675z = z6;
                i7 = this.f7672w;
                this.f7672w = i6;
                float f9 = this.C;
                this.C = f8;
                if (Math.abs(f8 - f9) > 1.0E-4f) {
                    this.s.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            try {
                gs gsVar = this.F;
                if (gsVar != null) {
                    gsVar.zzda(2, gsVar.zza());
                }
            } catch (RemoteException e6) {
                zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        i70.f5591f.execute(new nb0(this, i7, i6, z8, z6));
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() {
        float f6;
        synchronized (this.f7669t) {
            f6 = this.C;
        }
        return f6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        float f6;
        synchronized (this.f7669t) {
            f6 = this.B;
        }
        return f6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        float f6;
        synchronized (this.f7669t) {
            f6 = this.A;
        }
        return f6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() {
        int i6;
        synchronized (this.f7669t) {
            i6 = this.f7672w;
        }
        return i6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final zzee zzi() {
        zzee zzeeVar;
        synchronized (this.f7669t) {
            zzeeVar = this.f7673x;
        }
        return zzeeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z6) {
        f2(true != z6 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() {
        f2("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() {
        f2("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(zzee zzeeVar) {
        synchronized (this.f7669t) {
            this.f7673x = zzeeVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() {
        f2("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() {
        boolean z6;
        Object obj = this.f7669t;
        boolean zZzp = zzp();
        synchronized (obj) {
            z6 = false;
            if (!zZzp) {
                try {
                    if (this.E && this.f7671v) {
                        z6 = true;
                    }
                } finally {
                }
            }
        }
        return z6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() {
        boolean z6;
        synchronized (this.f7669t) {
            try {
                z6 = false;
                if (this.f7670u && this.D) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() {
        boolean z6;
        synchronized (this.f7669t) {
            z6 = this.f7675z;
        }
        return z6;
    }
}
