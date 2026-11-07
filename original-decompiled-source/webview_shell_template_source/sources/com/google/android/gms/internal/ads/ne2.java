package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ne2 {

    /* renamed from: a, reason: collision with root package name */
    public Exception f7432a;

    /* renamed from: b, reason: collision with root package name */
    public long f7433b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public long f7434c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z6;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f7432a == null) {
            this.f7432a = exc;
        }
        if (this.f7433b == -9223372036854775807L) {
            synchronized (te2.Z) {
                z6 = te2.f9239b0 > 0;
            }
            if (!z6) {
                this.f7433b = 200 + jElapsedRealtime;
            }
        }
        long j6 = this.f7433b;
        if (j6 == -9223372036854775807L || jElapsedRealtime < j6) {
            this.f7434c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f7432a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f7432a;
        this.f7432a = null;
        this.f7433b = -9223372036854775807L;
        this.f7434c = -9223372036854775807L;
        throw exc3;
    }
}
