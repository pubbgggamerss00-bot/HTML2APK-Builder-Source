package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cx {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3678b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3679c;

    /* renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f3680d;

    /* renamed from: e, reason: collision with root package name */
    public final ie1 f3681e;

    /* renamed from: g, reason: collision with root package name */
    public bx f3683g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3677a = new Object();
    public int h = 1;

    /* renamed from: f, reason: collision with root package name */
    public final me0 f3682f = lx.f6870b;

    public cx(Context context, VersionInfoParcel versionInfoParcel, String str, ie1 ie1Var) {
        this.f3679c = str;
        this.f3678b = context.getApplicationContext();
        this.f3680d = versionInfoParcel;
        this.f3681e = ie1Var;
    }

    public final zw a() {
        zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.f3677a) {
            try {
                zze.zza("getEngine: Lock acquired");
                zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f3677a) {
                    try {
                        zze.zza("refreshIfDestroyed: Lock acquired");
                        bx bxVar = this.f3683g;
                        if (bxVar != null && this.h == 0) {
                            bxVar.d(new xj0(4, this), new bq(16, (byte) 0));
                        }
                    } finally {
                    }
                }
                zze.zza("refreshIfDestroyed: Lock released");
                bx bxVar2 = this.f3683g;
                if (bxVar2 != null && ((AtomicInteger) bxVar2.f8824u).get() != -1) {
                    int i6 = this.h;
                    if (i6 == 0) {
                        zze.zza("getEngine (NO_UPDATE): Lock released");
                        return this.f3683g.e();
                    }
                    if (i6 != 1) {
                        zze.zza("getEngine (UPDATING): Lock released");
                        return this.f3683g.e();
                    }
                    this.h = 2;
                    b();
                    zze.zza("getEngine (PENDING_UPDATE): Lock released");
                    return this.f3683g.e();
                }
                this.h = 2;
                this.f3683g = b();
                zze.zza("getEngine (NULL or REJECTED): Lock released");
                return this.f3683g.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final bx b() {
        de1 de1VarE = d0.e(this.f3678b, 6);
        de1VarE.zzi();
        bx bxVar = new bx(this.f3682f);
        zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        i70.f5591f.execute(new as1(2, this, bxVar));
        zze.zza("loadNewJavascriptEngine: Promise created");
        bxVar.d(new androidx.camera.view.b(this, bxVar, de1VarE, 1), new yw(this, bxVar, de1VarE, 0));
        return bxVar;
    }
}
