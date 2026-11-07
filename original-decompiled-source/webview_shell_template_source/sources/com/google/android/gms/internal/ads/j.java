package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final el2 f5881a;

    /* renamed from: b, reason: collision with root package name */
    public final n f5882b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5883c;

    /* renamed from: f, reason: collision with root package name */
    public long f5886f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5888i;

    /* renamed from: d, reason: collision with root package name */
    public int f5884d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f5885e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f5887g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public float f5889j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public el0 f5890k = el0.f4333a;

    public j(Context context, el2 el2Var) {
        this.f5881a = el2Var;
        this.f5882b = new n(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r12 > 100000) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        if (r29 >= r33) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0122, code lost:
    
        if (r26.f5883c != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j6, long j7, long j8, long j9, boolean z6, i iVar) {
        long j10;
        long j11;
        long j12;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j13;
        long j14;
        iVar.f5521a = -9223372036854775807L;
        iVar.f5522b = -9223372036854775807L;
        if (this.f5885e == -9223372036854775807L) {
            this.f5885e = j7;
        }
        if (this.f5887g != j6) {
            n nVar = this.f5882b;
            j11 = 1000;
            long j15 = nVar.f7270n;
            if (j15 != -1) {
                nVar.f7272p = j15;
                nVar.f7273q = nVar.f7271o;
            }
            nVar.f7269m++;
            zk2 zk2Var = nVar.f7258a;
            long j16 = j6 * 1000;
            j10 = -1;
            zk2Var.f11330a.a(j16);
            if (zk2Var.f11330a.c()) {
                zk2Var.f11332c = false;
            } else {
                if (zk2Var.f11333d != -9223372036854775807L) {
                    if (zk2Var.f11332c) {
                        yk2 yk2Var = zk2Var.f11331b;
                        j12 = 0;
                        long j17 = yk2Var.f11023d;
                        if (j17 == 0 ? false : yk2Var.f11026g[(int) ((j17 - 1) % 15)]) {
                        }
                        zk2Var.f11332c = true;
                        zk2Var.f11331b.a(j16);
                    } else {
                        j12 = 0;
                    }
                    zk2Var.f11331b.b();
                    zk2Var.f11331b.a(zk2Var.f11333d);
                    zk2Var.f11332c = true;
                    zk2Var.f11331b.a(j16);
                }
                if (zk2Var.f11332c && zk2Var.f11331b.c()) {
                    yk2 yk2Var2 = zk2Var.f11330a;
                    zk2Var.f11330a = zk2Var.f11331b;
                    zk2Var.f11331b = yk2Var2;
                    zk2Var.f11332c = false;
                }
                zk2Var.f11333d = j16;
                zk2Var.f11334e = !zk2Var.f11330a.c() ? 0 : zk2Var.f11334e + 1;
                nVar.c();
                this.f5887g = j6;
            }
            j12 = 0;
            if (zk2Var.f11332c) {
                yk2 yk2Var22 = zk2Var.f11330a;
                zk2Var.f11330a = zk2Var.f11331b;
                zk2Var.f11331b = yk2Var22;
                zk2Var.f11332c = false;
            }
            zk2Var.f11333d = j16;
            zk2Var.f11334e = !zk2Var.f11330a.c() ? 0 : zk2Var.f11334e + 1;
            nVar.c();
            this.f5887g = j6;
        } else {
            j10 = -1;
            j11 = 1000;
            j12 = 0;
        }
        long jS = (long) ((j6 - j7) / this.f5889j);
        if (this.f5883c) {
            jS -= j31.s(this.f5890k.zzb()) - j8;
        }
        iVar.f5521a = jS;
        if (this.h == -9223372036854775807L || this.f5888i) {
            int i11 = this.f5884d;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        i6 = 1;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        i6 = 1;
                        long jS2 = j31.s(this.f5890k.zzb()) - this.f5886f;
                        if (this.f5883c) {
                            if (jS < -30000) {
                            }
                        }
                    }
                }
                return 0;
            }
            i6 = 1;
        } else {
            i6 = 1;
        }
        if (!this.f5883c || j7 == this.f5885e) {
            return 5;
        }
        long jZzc = this.f5890k.zzc();
        n nVar2 = this.f5882b;
        long j18 = (iVar.f5521a * j11) + jZzc;
        if (nVar2.f7272p == j10 || !nVar2.f7258a.f11330a.c()) {
            i7 = 3;
            i8 = 2;
            i9 = i6;
        } else {
            zk2 zk2Var2 = nVar2.f7258a;
            if (zk2Var2.f11330a.c()) {
                yk2 yk2Var3 = zk2Var2.f11330a;
                long j19 = yk2Var3.f11024e;
                i7 = 3;
                i8 = 2;
                j14 = j19 == j12 ? j12 : yk2Var3.f11025f / j19;
            } else {
                i7 = 3;
                i8 = 2;
                j14 = -9223372036854775807L;
            }
            i9 = i6;
            long j20 = nVar2.f7273q + ((long) (((nVar2.f7269m - nVar2.f7272p) * j14) / nVar2.f7265i));
            if (Math.abs(j18 - j20) > 20000000) {
                nVar2.f7269m = j12;
                long j21 = j10;
                nVar2.f7272p = j21;
                nVar2.f7270n = j21;
            } else {
                j18 = j20;
            }
        }
        nVar2.f7270n = nVar2.f7269m;
        nVar2.f7271o = j18;
        m mVar = nVar2.f7260c;
        if (mVar != null && nVar2.f7267k != -9223372036854775807L) {
            long j22 = mVar.s;
            if (j22 != -9223372036854775807L) {
                long j23 = nVar2.f7267k;
                long j24 = (((j18 - j22) / j23) * j23) + j22;
                if (j18 <= j24) {
                    j13 = j24 - j23;
                } else {
                    j13 = j24;
                    j24 = j23 + j24;
                }
                long j25 = nVar2.f7268l;
                if (j24 - j18 >= j18 - j13) {
                    j24 = j13;
                }
                j18 = j24 - j25;
            }
        }
        iVar.f5522b = j18;
        long j26 = (j18 - jZzc) / j11;
        iVar.f5521a = j26;
        int i12 = (this.h == -9223372036854775807L || this.f5888i) ? 0 : i9;
        el2 el2Var = this.f5881a;
        if (j26 < -500000 && !z6) {
            mi2 mi2Var = el2Var.A;
            mi2Var.getClass();
            int iA = mi2Var.a(j7 - el2Var.C);
            if (iA == 0) {
                i10 = 0;
            } else {
                if (i12 != 0) {
                    qa2 qa2Var = el2Var.J0;
                    qa2Var.f8290d += iA;
                    qa2Var.f8292f += el2Var.f4348l1;
                } else {
                    el2Var.J0.f8295j++;
                    el2Var.l0(iA, el2Var.f4348l1);
                }
                if (el2Var.J()) {
                    el2Var.C();
                }
                c cVar = el2Var.Z0;
                if (cVar != null) {
                    cVar.b(false);
                }
                i10 = i9;
            }
            if (i10 != 0) {
                return 4;
            }
        }
        long j27 = iVar.f5521a;
        if (j27 < -30000 && !z6) {
            return i12 != 0 ? i7 : i8;
        }
        if (j27 > 50000) {
            return 5;
        }
        return i9;
    }

    public final void b() {
        this.f5883c = true;
        this.f5886f = j31.s(this.f5890k.zzb());
        n nVar = this.f5882b;
        nVar.f7261d = true;
        nVar.f7269m = 0L;
        nVar.f7272p = -1L;
        nVar.f7270n = -1L;
        l lVar = nVar.f7259b;
        if (lVar != null) {
            DisplayManager displayManager = lVar.f6539a;
            m mVar = nVar.f7260c;
            mVar.getClass();
            mVar.f6890t.sendEmptyMessage(2);
            Looper looperMyLooper = Looper.myLooper();
            y5.k(looperMyLooper);
            displayManager.registerDisplayListener(lVar, new Handler(looperMyLooper, null));
            n.a(lVar.f6540b, displayManager.getDisplay(0));
        }
        nVar.d(false);
    }

    public final void c() {
        this.f5883c = false;
        this.h = -9223372036854775807L;
        n nVar = this.f5882b;
        nVar.f7261d = false;
        l lVar = nVar.f7259b;
        if (lVar != null) {
            lVar.f6539a.unregisterDisplayListener(lVar);
            m mVar = nVar.f7260c;
            mVar.getClass();
            mVar.f6890t.sendEmptyMessage(3);
        }
        nVar.b();
    }

    public final void d(float f6) {
        y5.n(f6 > 0.0f);
        if (f6 == this.f5889j) {
            return;
        }
        this.f5889j = f6;
        n nVar = this.f5882b;
        nVar.f7265i = f6;
        nVar.f7269m = 0L;
        nVar.f7272p = -1L;
        nVar.f7270n = -1L;
        nVar.d(false);
    }

    public final boolean e(boolean z6) {
        boolean z7 = true;
        if (z6 && this.f5884d == 3) {
            this.h = -9223372036854775807L;
        } else {
            if (this.h == -9223372036854775807L) {
                return false;
            }
            if (this.f5890k.zzb() >= this.h) {
                z7 = false;
                this.h = -9223372036854775807L;
            }
        }
        return z7;
    }

    public final void f(int i6) {
        this.f5884d = Math.min(this.f5884d, i6);
    }
}
