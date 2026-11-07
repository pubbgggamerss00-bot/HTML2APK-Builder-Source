package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xj1 implements q70, SignalCallbacks, zr1, om0, nx0, jo0, ri0, bm1, i32, eq0, ng2 {

    /* renamed from: u, reason: collision with root package name */
    public static xj1 f10618u;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f10619t;

    public /* synthetic */ xj1(int i6, Object obj) {
        this.s = i6;
        this.f10619t = obj;
    }

    public static final xj1 d(Context context) {
        xj1 xj1Var;
        synchronized (xj1.class) {
            try {
                if (f10618u == null) {
                    f10618u = new xj1(context);
                }
                xj1Var = f10618u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xj1Var;
    }

    public static xj1 h(byte[] bArr) {
        return new xj1(22, r32.a(bArr));
    }

    public static xj1 l(int i6) {
        qy1 qy1Var = ry1.f8739a;
        byte[] bArr = new byte[i6];
        ((SecureRandom) ry1.f8739a.get()).nextBytes(bArr);
        return new xj1(22, r32.a(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        switch (this.s) {
            case 7:
                ((AtomicInteger) ((s70) this.f10619t).f8824u).set(1);
                return;
            case 11:
                try {
                    xa0 xa0Var = (xa0) ((List) obj).get(0);
                    if (xa0Var != null) {
                        ((jq0) this.f10619t).f6152u.execute(new iq0(xa0Var, 0));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e6) {
                    if (((Boolean) zzbe.zzc().a(zn.f11439m5)).booleanValue()) {
                        zzv.zzp().h("omid native display exp", e6);
                        return;
                    }
                    return;
                }
            case 12:
                ((xa0) obj).G("sendMessageToNativeJs", (Map) this.f10619t);
                return;
            case 14:
                ((gx0) this.f10619t).f5184c.b0((ac1) obj);
                return;
            default:
                yf1 yf1Var = (yf1) this.f10619t;
                synchronized (yf1Var) {
                    try {
                        yf1Var.f10965j.set(false);
                        if (obj != null) {
                            gf1 gf1Var = yf1Var.f10964i;
                            gf1Var.f5030e = gf1Var.f5026a;
                            gf1Var.f5028c = 0L;
                            yf1Var.f10968m.set(true);
                            yf1Var.k(obj);
                        }
                        yf1Var.b(obj == null);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.nx0
    public c5.a b(r30 r30Var) {
        return ((yx0) ((ox0) this.f10619t).f7884c.zzb()).i1(r30Var, Binder.getCallingUid());
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public void c(boolean z6, Context context, vk0 vk0Var) throws io0 {
        gc1 gc1Var;
        Object obj = ((b01) this.f10619t).f2884b;
        try {
            ((rc1) obj).b(z6);
            try {
                ((rc1) obj).f8609a.m0(new k3.b(context));
            } finally {
            }
        } catch (gc1 e6) {
            throw new io0(e6.getCause());
        }
    }

    public void e(Exception exc) {
        qs0.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        vd2 vd2Var = ((ve2) this.f10619t).R0;
        Handler handler = vd2Var.f9835a;
        if (handler != null) {
            handler.post(new sd2(vd2Var, exc, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.bm1
    public Iterator i(cm1 cm1Var, CharSequence charSequence) {
        return new xl1(charSequence, new ej0(((ql1) this.f10619t).f8404t.matcher(charSequence)));
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        switch (this.s) {
            case 7:
                ((AtomicInteger) ((s70) this.f10619t).f8824u).set(-1);
                return;
            case 11:
                if (((Boolean) zzbe.zzc().a(zn.f11439m5)).booleanValue()) {
                    zzv.zzp().h("omid native display exp", th);
                    return;
                }
                return;
            case 12:
            case 14:
                return;
            default:
                yf1 yf1Var = (yf1) this.f10619t;
                synchronized (yf1Var) {
                    try {
                        yf1Var.f10965j.set(false);
                        if ((th instanceof df1) && ((df1) th).s == 0) {
                            throw null;
                        }
                        yf1Var.b(true);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public void k(pb pbVar, ub ubVar, bb bbVar) {
        pbVar.zzq();
        pbVar.zzm("post-response");
        ((Handler) ((gb) this.f10619t).f4966t).post(new v(pbVar, ubVar, bbVar, 1));
    }

    public void m(boolean z6) {
        synchronized (xj1.class) {
            try {
                ((yj1) this.f10619t).a("paidv2_publisher_option", Boolean.valueOf(z6));
                if (!z6) {
                    ((yj1) this.f10619t).b("paidv2_creation_time");
                    ((yj1) this.f10619t).b("paidv2_id");
                    ((yj1) this.f10619t).b("vendor_scoped_gpid_v2_id");
                    ((yj1) this.f10619t).b("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List n(m2 m2Var) {
        String str;
        int i6;
        List listSingletonList;
        ex0 ex0Var = new ex0((byte[]) m2Var.f6906u);
        ArrayList arrayList = (List) this.f10619t;
        while (ex0Var.o() > 0) {
            int iV = ex0Var.v();
            int iV2 = ex0Var.f4417b + ex0Var.v();
            if (iV == 134) {
                arrayList = new ArrayList();
                int iV3 = ex0Var.v() & 31;
                for (int i7 = 0; i7 < iV3; i7++) {
                    String strB = ex0Var.b(3, StandardCharsets.UTF_8);
                    int iV4 = ex0Var.v();
                    boolean z6 = (iV4 & 128) != 0;
                    if (z6) {
                        i6 = iV4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i6 = 1;
                    }
                    byte bV = (byte) ex0Var.v();
                    ex0Var.k(1);
                    if (z6) {
                        int i8 = bV & 64;
                        byte[] bArr = sl0.f8977a;
                        listSingletonList = Collections.singletonList(i8 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    tk2 tk2Var = new tk2();
                    tk2Var.c(str);
                    tk2Var.f9323d = strB;
                    tk2Var.F = i6;
                    tk2Var.f9333o = listSingletonList;
                    arrayList.add(new w(tk2Var));
                }
            }
            ex0Var.j(iV2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onFailure(AdError adError) {
        try {
            ((h00) this.f10619t).D(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onSuccess(String str) {
        try {
            ((h00) this.f10619t).zze(str);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.ng2
    public int zza(Object obj) {
        zf2 zf2Var = (zf2) obj;
        HashMap map = pg2.f8070a;
        w wVar = (w) this.f10619t;
        String str = zf2Var.f11283b;
        return ((str.equals(wVar.f9978m) || str.equals(pg2.a(wVar))) && zf2Var.i(wVar, false)) ? 1 : 0;
    }

    public xj1(Handler handler) {
        this.s = 3;
        this.f10619t = new gb(0, handler);
    }

    public /* synthetic */ xj1(xc2 xc2Var, qa2 qa2Var) {
        this.s = 25;
        this.f10619t = qa2Var;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public void onFailure(String str) {
        try {
            ((h00) this.f10619t).zzf(str);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    public /* synthetic */ xj1(xc2 xc2Var, fh2 fh2Var, lh2 lh2Var, IOException iOException, boolean z6) {
        this.s = 24;
        this.f10619t = iOException;
    }

    public xj1() {
        this.s = 8;
        this.f10619t = new AtomicBoolean(false);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public zzeb zza() throws gc1 {
        try {
            return ((rc1) this.f10619t).f8609a.zzh();
        } catch (Throwable th) {
            throw new gc1(th);
        }
    }

    public xj1(Context context) {
        this.s = 0;
        if (yj1.f11008c == null) {
            yj1.f11008c = new yj1(context);
        }
        this.f10619t = yj1.f11008c;
    }

    @Override // com.google.android.gms.internal.ads.i32
    public Object zza(String str) {
        l32 l32Var = (l32) this.f10619t;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            Provider provider = Security.getProvider(strArr[i7]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            try {
                return l32Var.d(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
        return l32Var.d(str, null);
    }

    @Override // com.google.android.gms.internal.ads.q70, com.google.android.gms.internal.ads.ud1
    /* renamed from: zza */
    public void mo5zza() {
        switch (this.s) {
            case 4:
                zw zwVar = (zw) this.f10619t;
                zze.zza("Rejecting reference for JS Engine.");
                if (((Boolean) zzbe.zzc().a(zn.B7)).booleanValue()) {
                    zwVar.b("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    break;
                } else {
                    zwVar.a();
                    break;
                }
            default:
                ((o70) this.f10619t).b(new fx("Cannot get Javascript Engine"));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        int i6 = this.s;
        Object obj2 = this.f10619t;
        switch (i6) {
            case 10:
                ((mu) obj).Q((l40) obj2);
                break;
            case 23:
                int i7 = gb2.f4973n0;
                boolean z6 = ((ic2) obj2).f5667g;
                ((bs) obj).zzb();
                break;
            case 24:
                ((yc2) obj).h((IOException) obj2);
                break;
            default:
                ((yc2) obj).j((qa2) obj2);
                break;
        }
    }

    private final void f(Throwable th) {
    }

    private final void g(Throwable th) {
    }
}
