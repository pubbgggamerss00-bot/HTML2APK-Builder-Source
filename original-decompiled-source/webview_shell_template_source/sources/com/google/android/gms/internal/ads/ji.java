package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ji {

    /* renamed from: b, reason: collision with root package name */
    public int f6069b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6068a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f6070c = new LinkedList();

    public final void a(hi hiVar) {
        synchronized (this.f6068a) {
            try {
                if (this.f6070c.size() >= 10) {
                    zzo.zze("Queue is full, current size = " + this.f6070c.size());
                    this.f6070c.remove(0);
                }
                int i6 = this.f6069b;
                this.f6069b = i6 + 1;
                hiVar.f5409l = i6;
                synchronized (hiVar.f5405g) {
                    try {
                        int i7 = hiVar.f5408k;
                        int i8 = hiVar.f5409l;
                        int i9 = hiVar.f5400b;
                        if (!hiVar.f5402d) {
                            i9 = (i8 * i9) + (i7 * hiVar.f5399a);
                        }
                        if (i9 > hiVar.f5411n) {
                            hiVar.f5411n = i9;
                        }
                    } finally {
                    }
                }
                this.f6070c.add(hiVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(hi hiVar) {
        synchronized (this.f6068a) {
            try {
                Iterator it = this.f6070c.iterator();
                while (it.hasNext()) {
                    hi hiVar2 = (hi) it.next();
                    if (zzv.zzp().d().zzK()) {
                        if (!zzv.zzp().d().zzL() && !hiVar.equals(hiVar2) && hiVar2.f5414q.equals(hiVar.f5414q)) {
                            it.remove();
                            return;
                        }
                    } else if (!hiVar.equals(hiVar2) && hiVar2.f5412o.equals(hiVar.f5412o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
