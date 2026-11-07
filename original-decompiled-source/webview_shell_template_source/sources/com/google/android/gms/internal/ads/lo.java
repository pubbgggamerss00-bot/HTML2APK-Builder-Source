package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public class lo implements rn1, zr1, zb0, jo0 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f6798t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f6799u;

    public /* synthetic */ lo(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f6798t = obj;
        this.f6799u = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        switch (this.s) {
            case 2:
                i70.f5591f.execute(new x(9, (bj0) this.f6799u));
                ((r41) this.f6798t).mo2a((ti0) obj);
                break;
            case 3:
                ((xa0) obj).L((String) this.f6798t, (yt) this.f6799u);
                break;
            default:
                ((kv0) obj).F = true;
                ((dw0) this.f6799u).f4050v.b((String) this.f6798t);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public void c(boolean z6, Context context, vk0 vk0Var) throws io0 {
        gc1 gc1Var;
        o11 o11Var = (o11) this.f6798t;
        try {
            Object obj = ((b01) this.f6799u).f2884b;
            ((rc1) obj).b(z6);
            if (o11Var.f7566c.clientJarVersion < ((Integer) zzbe.zzc().a(zn.S0)).intValue()) {
                try {
                    ((rc1) obj).f8609a.b();
                    return;
                } finally {
                }
            } else {
                try {
                    ((rc1) obj).f8609a.V0(new k3.b(context));
                    return;
                } finally {
                }
            }
        } catch (gc1 e6) {
            zzo.zzi("Cannot show interstitial.");
            throw new io0(e6.getCause());
        }
        zzo.zzi("Cannot show interstitial.");
        throw new io0(e6.getCause());
    }

    public boolean e(int i6) {
        return ((dj2) this.f6798t).f3961a.get(i6);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        switch (this.s) {
            case 2:
                i70.f5591f.execute(new x(9, (bj0) this.f6799u));
                ((r41) this.f6798t).j(th);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.rn1
    public lo1 zza() {
        int i6 = ja0.O;
        lo1 lo1VarZza = ((rn1) this.f6798t).zza();
        byte[] bArr = (byte[]) this.f6799u;
        return new ea0(new bl1(bArr), bArr.length, lo1VarZza);
    }

    public /* synthetic */ lo(Object obj, Object obj2, int i6, boolean z6) {
        this.s = i6;
        this.f6798t = obj2;
        this.f6799u = obj;
    }

    public lo(oo ooVar) {
        this.s = 0;
        this.f6799u = ooVar;
        this.f6798t = new HashMap();
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public void zza(boolean z6, int i6, String str, String str2) {
        o70 o70Var = (o70) this.f6799u;
        if (z6) {
            if (((Boolean) zzbe.zzc().a(zn.f11437m2)).booleanValue()) {
                androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-load-html-end", (Bundle) this.f6798t);
            }
            o70Var.a(null);
            return;
        }
        o70Var.b(new Exception("Ad Web View failed to load. Error code: " + i6 + ", Description: " + str + ", Failing URL: " + str2));
    }

    public lo(cp1 cp1Var, int[] iArr) {
        this.s = 8;
        this.f6798t = bo1.l(cp1Var);
        this.f6799u = iArr;
    }

    public lo(dj2 dj2Var, SparseArray sparseArray) {
        this.s = 9;
        this.f6798t = dj2Var;
        SparseBooleanArray sparseBooleanArray = dj2Var.f3961a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i6 = 0; i6 < sparseBooleanArray.size(); i6++) {
            int iA = dj2Var.a(i6);
            xc2 xc2Var = (xc2) sparseArray.get(iA);
            xc2Var.getClass();
            sparseArray2.append(iA, xc2Var);
        }
        this.f6799u = sparseArray2;
    }

    private final void b(Throwable th) {
    }

    private final void d(Throwable th) {
    }
}
