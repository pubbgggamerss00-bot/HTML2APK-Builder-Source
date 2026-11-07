package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class s0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final g f6039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6040b;

    /* renamed from: c, reason: collision with root package name */
    public final b f6041c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6042d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6043e;

    public s0(g gVar, int i10, b bVar, long j10, long j11) {
        this.f6039a = gVar;
        this.f6040b = i10;
        this.f6041c = bVar;
        this.f6042d = j10;
        this.f6043e = j11;
    }

    public static com.google.android.gms.common.internal.e a(j0 j0Var, com.google.android.gms.common.internal.b bVar, int i10) {
        com.google.android.gms.common.internal.e telemetryConfiguration = bVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.f6111b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f6113d;
        int i11 = 0;
        if (iArr != null) {
            while (i11 < iArr.length) {
                if (iArr[i11] != i10) {
                    i11++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f6115f;
        if (iArr2 != null) {
            while (i11 < iArr2.length) {
                if (iArr2[i11] == i10) {
                    return null;
                }
                i11++;
            }
        }
        if (j0Var.f6003n < telemetryConfiguration.f6114e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        g gVar = this.f6039a;
        if (gVar.c()) {
            com.google.android.gms.common.internal.r rVar = com.google.android.gms.common.internal.q.a().f6185a;
            if (rVar == null || rVar.f6188b) {
                j0 j0Var = (j0) gVar.f5977j.get(this.f6041c);
                if (j0Var != null) {
                    Object obj = j0Var.f5993b;
                    if (obj instanceof com.google.android.gms.common.internal.b) {
                        com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) obj;
                        long j12 = this.f6042d;
                        boolean z10 = j12 > 0;
                        int gCoreServiceId = bVar.getGCoreServiceId();
                        if (rVar != null) {
                            z10 &= rVar.f6189c;
                            int i16 = rVar.f6190d;
                            int i17 = rVar.f6191e;
                            i10 = rVar.f6187a;
                            if (bVar.hasConnectionInfo() && !bVar.isConnecting()) {
                                com.google.android.gms.common.internal.e eVarA = a(j0Var, bVar, this.f6040b);
                                if (eVarA == null) {
                                    return;
                                }
                                boolean z11 = eVarA.f6112c && j12 > 0;
                                i17 = eVarA.f6114e;
                                z10 = z11;
                            }
                            i12 = i16;
                            i11 = i17;
                        } else {
                            i10 = 0;
                            i11 = 100;
                            i12 = 5000;
                        }
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i15 = 0;
                            i14 = 0;
                        } else if (task.isCanceled()) {
                            i14 = -1;
                            i15 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof com.google.android.gms.common.api.b) {
                                Status status = ((com.google.android.gms.common.api.b) exception).getStatus();
                                i13 = status.f5910a;
                                pa.a aVar = status.f5913d;
                                if (aVar != null) {
                                    i14 = aVar.f21377b;
                                }
                                i15 = i13;
                            } else {
                                i13 = 101;
                            }
                            i14 = -1;
                            i15 = i13;
                        }
                        if (z10) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f6043e);
                            j10 = j12;
                            j11 = jCurrentTimeMillis;
                        } else {
                            j10 = 0;
                            j11 = 0;
                        }
                        t0 t0Var = new t0(new com.google.android.gms.common.internal.n(this.f6040b, i15, i14, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), i10, i12, i11);
                        zau zauVar = gVar.f5981n;
                        zauVar.sendMessage(zauVar.obtainMessage(18, t0Var));
                    }
                }
            }
        }
    }
}
