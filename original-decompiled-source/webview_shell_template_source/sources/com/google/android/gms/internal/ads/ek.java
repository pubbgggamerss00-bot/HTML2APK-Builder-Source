package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.b;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ek implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xj f4319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ak f4320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk f4321c;

    public ek(gk gkVar, xj xjVar, ak akVar) {
        this.f4319a = xjVar;
        this.f4320b = akVar;
        this.f4321c = gkVar;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void o(Bundle bundle) {
        synchronized (this.f4321c.f5082c) {
            try {
                gk gkVar = this.f4321c;
                if (gkVar.f5081b) {
                    return;
                }
                gkVar.f5081b = true;
                final wj wjVar = gkVar.f5080a;
                if (wjVar == null) {
                    return;
                }
                h70 h70Var = i70.f5586a;
                final xj xjVar = this.f4319a;
                final ak akVar = this.f4320b;
                c5.a aVarW = h70Var.w(new Runnable() { // from class: com.google.android.gms.internal.ads.ck
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        uj ujVar;
                        boolean z6;
                        long j6;
                        ek ekVar = this.s;
                        wj wjVar2 = wjVar;
                        ak akVar2 = akVar;
                        try {
                            zj zjVar = (zj) wjVar2.getService();
                            boolean zD = wjVar2.d();
                            xj xjVar2 = xjVar;
                            if (zD) {
                                Parcel parcelZza = zjVar.zza();
                                th.c(parcelZza, xjVar2);
                                Parcel parcelZzcZ = zjVar.zzcZ(2, parcelZza);
                                ujVar = (uj) th.a(parcelZzcZ, uj.CREATOR);
                                parcelZzcZ.recycle();
                            } else {
                                Parcel parcelZza2 = zjVar.zza();
                                th.c(parcelZza2, xjVar2);
                                Parcel parcelZzcZ2 = zjVar.zzcZ(1, parcelZza2);
                                ujVar = (uj) th.a(parcelZzcZ2, uj.CREATOR);
                                parcelZzcZ2.recycle();
                            }
                            if (!ujVar.m()) {
                                akVar2.b(new RuntimeException("No entry contents."));
                                gk.a(ekVar.f4321c);
                                return;
                            }
                            dk dkVar = new dk(ekVar, ujVar.l());
                            int i6 = dkVar.read();
                            if (i6 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            dkVar.unread(i6);
                            synchronized (ujVar) {
                                z6 = ujVar.f9570t;
                            }
                            boolean zO = ujVar.o();
                            synchronized (ujVar) {
                                j6 = ujVar.f9572v;
                            }
                            akVar2.a(new ik(dkVar, z6, zO, j6, ujVar.n()));
                        } catch (RemoteException e6) {
                            e = e6;
                            zzo.zzh("Unable to obtain a cache service instance.", e);
                            akVar2.b(e);
                            gk.a(ekVar.f4321c);
                        } catch (IOException e7) {
                            e = e7;
                            zzo.zzh("Unable to obtain a cache service instance.", e);
                            akVar2.b(e);
                            gk.a(ekVar.f4321c);
                        }
                    }
                });
                ak akVar2 = this.f4320b;
                akVar2.s.addListener(new ni(akVar2, aVarW, 1, false), i70.f5592g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void n(int i6) {
    }
}
