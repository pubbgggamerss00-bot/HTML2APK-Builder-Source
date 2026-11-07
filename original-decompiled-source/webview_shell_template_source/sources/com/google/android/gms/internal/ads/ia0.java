package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ia0 {

    /* renamed from: a, reason: collision with root package name */
    public final bo1 f5633a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5634b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f5635c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f5636d;

    public ia0(bo1 bo1Var) {
        this.f5633a = bo1Var;
        za0 za0Var = za0.f11240e;
        this.f5636d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f5634b;
        arrayList.clear();
        this.f5636d = false;
        int i6 = 0;
        while (true) {
            bo1 bo1Var = this.f5633a;
            if (i6 >= bo1Var.size()) {
                break;
            }
            jc0 jc0Var = (jc0) bo1Var.get(i6);
            jc0Var.zzc();
            if (jc0Var.zzg()) {
                arrayList.add(jc0Var);
            }
            i6++;
        }
        this.f5635c = new ByteBuffer[arrayList.size()];
        for (int i7 = 0; i7 <= d(); i7++) {
            this.f5635c[i7] = ((jc0) arrayList.get(i7)).zzb();
        }
    }

    public final boolean b() {
        return this.f5636d && ((jc0) this.f5634b.get(d())).zzh() && !this.f5635c[d()].hasRemaining();
    }

    public final boolean c() {
        return !this.f5634b.isEmpty();
    }

    public final int d() {
        return this.f5635c.length - 1;
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z6;
        do {
            int i6 = 0;
            z6 = false;
            while (i6 <= d()) {
                if (!this.f5635c[i6].hasRemaining()) {
                    ArrayList arrayList = this.f5634b;
                    jc0 jc0Var = (jc0) arrayList.get(i6);
                    if (!jc0Var.zzh()) {
                        ByteBuffer byteBuffer2 = i6 > 0 ? this.f5635c[i6 - 1] : byteBuffer.hasRemaining() ? byteBuffer : jc0.f6021a;
                        long jRemaining = byteBuffer2.remaining();
                        jc0Var.a(byteBuffer2);
                        this.f5635c[i6] = jc0Var.zzb();
                        boolean z7 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.f5635c[i6].hasRemaining()) {
                            z7 = false;
                        }
                        z6 |= z7;
                    } else if (!this.f5635c[i6].hasRemaining() && i6 < d()) {
                        ((jc0) arrayList.get(i6 + 1)).zzd();
                    }
                }
                i6++;
            }
        } while (z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia0)) {
            return false;
        }
        bo1 bo1Var = ((ia0) obj).f5633a;
        bo1 bo1Var2 = this.f5633a;
        if (bo1Var2.size() != bo1Var.size()) {
            return false;
        }
        for (int i6 = 0; i6 < bo1Var2.size(); i6++) {
            if (bo1Var2.get(i6) != bo1Var.get(i6)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f5633a.hashCode();
    }
}
