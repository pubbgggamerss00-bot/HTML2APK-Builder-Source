package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zb {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f11246c = ac.f2645a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11247a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f11248b = false;

    public final synchronized void a(String str, long j6) {
        if (this.f11248b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f11247a.add(new yb(str, j6, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j6;
        this.f11248b = true;
        int i6 = 0;
        if (this.f11247a.size() == 0) {
            j6 = 0;
        } else {
            j6 = ((yb) this.f11247a.get(r0.size() - 1)).f10915c - ((yb) this.f11247a.get(0)).f10915c;
        }
        if (j6 > 0) {
            long j7 = ((yb) this.f11247a.get(0)).f10915c;
            ac.a("(%-4d ms) %s", Long.valueOf(j6), str);
            ArrayList arrayList = this.f11247a;
            int size = arrayList.size();
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                yb ybVar = (yb) obj;
                long j8 = ybVar.f10915c;
                ac.a("(+%-4d) [%2d] %s", Long.valueOf(j8 - j7), Long.valueOf(ybVar.f10914b), ybVar.f10913a);
                j7 = j8;
            }
        }
    }

    public final void finalize() {
        if (this.f11248b) {
            return;
        }
        b("Request on the loose");
        ac.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
