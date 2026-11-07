package e3;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x<T> implements v3.c<T> {
    public final d s;

    /* renamed from: t, reason: collision with root package name */
    public final int f12910t;

    /* renamed from: u, reason: collision with root package name */
    public final a<?> f12911u;

    /* renamed from: v, reason: collision with root package name */
    public final long f12912v;

    /* renamed from: w, reason: collision with root package name */
    public final long f12913w;

    @VisibleForTesting
    public x(d dVar, int i6, a aVar, long j6, long j7) {
        this.s = dVar;
        this.f12910t = i6;
        this.f12911u = aVar;
        this.f12912v = j6;
        this.f12913w = j7;
    }

    public static com.google.android.gms.common.internal.d a(r<?> rVar, com.google.android.gms.common.internal.b<?> bVar, int i6) {
        com.google.android.gms.common.internal.d telemetryConfiguration = bVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f2429t) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f2431v;
        int i7 = 0;
        if (iArr != null) {
            while (i7 < iArr.length) {
                if (iArr[i7] != i6) {
                    i7++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f2433x;
        if (iArr2 != null) {
            while (i7 < iArr2.length) {
                if (iArr2[i7] == i6) {
                    return null;
                }
                i7++;
            }
        }
        if (rVar.D < telemetryConfiguration.f2432w) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // v3.c
    public final void h(v3.p pVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j6;
        long j7;
        d dVar = this.s;
        if (dVar.a()) {
            com.google.android.gms.common.internal.n nVar = com.google.android.gms.common.internal.m.a().f2468a;
            if (nVar == null || nVar.f2470t) {
                r rVar = (r) dVar.B.get(this.f12911u);
                if (rVar != null) {
                    Object obj = rVar.f12894t;
                    if (obj instanceof com.google.android.gms.common.internal.b) {
                        com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) obj;
                        long j8 = this.f12912v;
                        boolean z6 = j8 > 0;
                        int gCoreServiceId = bVar.getGCoreServiceId();
                        if (nVar != null) {
                            z6 &= nVar.f2471u;
                            int i12 = nVar.f2472v;
                            int i13 = nVar.f2473w;
                            i6 = nVar.s;
                            if (bVar.hasConnectionInfo() && !bVar.isConnecting()) {
                                com.google.android.gms.common.internal.d dVarA = a(rVar, bVar, this.f12910t);
                                if (dVarA == null) {
                                    return;
                                }
                                boolean z7 = dVarA.f2430u && j8 > 0;
                                i13 = dVarA.f2432w;
                                z6 = z7;
                            }
                            i8 = i12;
                            i7 = i13;
                        } else {
                            i6 = 0;
                            i7 = 100;
                            i8 = 5000;
                        }
                        int iElapsedRealtime = -1;
                        if (pVar.h()) {
                            i11 = 0;
                            i10 = 0;
                        } else if (pVar.f()) {
                            i10 = -1;
                            i11 = 100;
                        } else {
                            Exception excD = pVar.d();
                            if (excD instanceof d3.b) {
                                Status status = ((d3.b) excD).s;
                                i9 = status.s;
                                c3.b bVar2 = status.f2401v;
                                i10 = bVar2 == null ? -1 : bVar2.f2166t;
                            } else {
                                i9 = 101;
                                i10 = -1;
                            }
                            i11 = i9;
                        }
                        if (z6) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f12913w);
                            j6 = j8;
                            j7 = jCurrentTimeMillis;
                        } else {
                            j6 = 0;
                            j7 = 0;
                        }
                        int i14 = iElapsedRealtime;
                        o3.f fVar = dVar.E;
                        fVar.sendMessage(fVar.obtainMessage(18, new y(new com.google.android.gms.common.internal.j(this.f12910t, i11, i10, j6, j7, null, null, gCoreServiceId, i14), i6, i8, i7)));
                    }
                }
            }
        }
    }
}
