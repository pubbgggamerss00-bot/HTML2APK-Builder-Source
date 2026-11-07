package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class am0 implements om0 {
    public boolean s;

    public synchronized void a() {
        boolean z6 = false;
        while (!this.s) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean b() {
        if (this.s) {
            return false;
        }
        this.s = true;
        notifyAll();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        ((lm0) obj).w(this.s);
    }
}
