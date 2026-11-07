package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n31 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7310a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7311b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7312c;

    public n31() {
        this.f7311b = new Object();
    }

    public synchronized void a(int i6) {
        if (this.f7310a) {
            return;
        }
        this.f7310a = true;
        d(new zze(i6, "Error from: " + ((b01) this.f7311b).f2883a + ", code: " + i6, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void b(v3.n nVar) {
        synchronized (this.f7311b) {
            try {
                if (((ArrayDeque) this.f7312c) == null) {
                    this.f7312c = new ArrayDeque();
                }
                ((ArrayDeque) this.f7312c).add(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(v3.p pVar) {
        v3.n nVar;
        synchronized (this.f7311b) {
            if (((ArrayDeque) this.f7312c) != null && !this.f7310a) {
                this.f7310a = true;
                while (true) {
                    synchronized (this.f7311b) {
                        try {
                            nVar = (v3.n) ((ArrayDeque) this.f7312c).poll();
                            if (nVar == null) {
                                this.f7310a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nVar.a(pVar);
                }
            }
        }
    }

    public synchronized void d(zze zzeVar) {
        int i6 = 1;
        if (true == ((Boolean) zzbe.zzc().a(zn.f11488u5)).booleanValue()) {
            i6 = 3;
        }
        ((o70) this.f7312c).b(new d01(i6, zzeVar));
    }

    public n31(b01 b01Var, o70 o70Var) {
        this.f7311b = b01Var;
        this.f7312c = o70Var;
        this.f7310a = false;
    }
}
