package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public class s70 implements hc, om0, jo0, eq0 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public Object f8823t;

    /* renamed from: u, reason: collision with root package name */
    public Object f8824u;

    public /* synthetic */ s70(int i6, Object obj) {
        this.s = i6;
        this.f8824u = obj;
    }

    @Deprecated
    public void a() {
        ((o70) this.f8823t).b(new Exception());
    }

    @Deprecated
    public void b(String str, Throwable th) {
        ((o70) this.f8823t).b(th);
        if (((Boolean) zzbe.zzc().a(zn.B7)).booleanValue()) {
            zzv.zzp().g(str, th);
        }
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public void c(boolean z6, Context context, vk0 vk0Var) {
        z01 z01Var = (z01) this.f8824u;
        o70 o70Var = (o70) this.f8823t;
        z01Var.getClass();
        try {
            zzv.zzj();
            zzn.zza(context, (AdOverlayInfoParcel) o70Var.s.get(), true, z01Var.f11127e);
        } catch (Exception unused) {
        }
    }

    @Deprecated
    public void d(r70 r70Var, q70 q70Var) {
        j00 j00Var = new j00(1, r70Var, q70Var);
        o70 o70Var = (o70) this.f8823t;
        o70Var.addListener(new as1(0, o70Var, j00Var), i70.f5592g);
    }

    @Override // com.google.android.gms.internal.ads.hc
    /* renamed from: zza */
    public File mo4zza() {
        if (((File) this.f8823t) == null) {
            this.f8823t = new File(((Context) this.f8824u).getCacheDir(), "volley");
        }
        return (File) this.f8823t;
    }

    public /* synthetic */ s70(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f8823t = obj;
        this.f8824u = obj2;
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 2:
                ((AppEventListener) obj).onAppEvent((String) this.f8823t, (String) this.f8824u);
                break;
            default:
                ((yc2) obj).a((xc2) this.f8823t, (lh2) this.f8824u);
                break;
        }
    }

    public s70(Context context) {
        this.s = 1;
        this.f8824u = context;
        this.f8823t = null;
    }

    public /* synthetic */ s70(z01 z01Var, o70 o70Var) {
        this.s = 3;
        this.f8824u = z01Var;
        this.f8823t = o70Var;
    }

    public s70(int i6) {
        this.s = i6;
        switch (i6) {
            case 6:
                break;
            default:
                o70 o70Var = new o70();
                this.f8823t = o70Var;
                this.f8824u = new AtomicInteger(0);
                xj1 xj1Var = new xj1(7, this);
                o70Var.addListener(new as1(0, o70Var, xj1Var), i70.f5592g);
                break;
        }
    }

    public s70(cp1 cp1Var, int[] iArr) {
        this.s = 4;
        this.f8823t = bo1.l(cp1Var);
        this.f8824u = iArr;
    }
}
