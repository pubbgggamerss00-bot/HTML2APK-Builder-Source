package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import dalvik.system.DexClassLoader;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9415t;

    public /* synthetic */ u(int i6, Object obj) {
        this.s = i6;
        this.f9415t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = 0;
        switch (this.s) {
            case 0:
                y yVar = (y) this.f9415t;
                yVar.getClass();
                int i7 = j31.f5914a;
                bd2 bd2Var = yVar.f10757b.s.I;
                bd2Var.q(bd2Var.t(), 1030, new yz1(9));
                return;
            case 1:
                ((jg) this.f9415t).c();
                return;
            case 2:
                kh khVar = (kh) this.f9415t;
                try {
                    dg dgVar = khVar.f6407a;
                    DexClassLoader dexClassLoader = dgVar.f3899c;
                    byte[] bArr = dgVar.f3901e;
                    String str = khVar.f6408b;
                    dgVar.f3900d.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(f0.l(str, bArr), "UTF-8"));
                    if (clsLoadClass != null) {
                        dg dgVar2 = khVar.f6407a;
                        byte[] bArr2 = dgVar2.f3901e;
                        String str2 = khVar.f6409c;
                        dgVar2.f3900d.getClass();
                        khVar.f6410d = clsLoadClass.getMethod(new String(f0.l(str2, bArr2), "UTF-8"), khVar.f6411e);
                    }
                } catch (tf | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
                } catch (Throwable th) {
                    khVar.f6412f.countDown();
                    throw th;
                }
                khVar.f6412f.countDown();
                return;
            case 3:
                f80 f80Var = ((z70) this.f9415t).H;
                if (f80Var != null) {
                    f80Var.d();
                    return;
                }
                return;
            case 4:
                f80 f80Var2 = ((na0) this.f9415t).f7365w;
                if (f80Var2 != null) {
                    f80Var2.g();
                    return;
                }
                return;
            case 5:
                ((xa0) this.f9415t).destroy();
                return;
            case 6:
                fe0 fe0Var = (fe0) this.f9415t;
                if (zzv.zzp().d().zzM()) {
                    String strZzi = zzv.zzp().d().zzi();
                    if (zzv.zzt().zzj(fe0Var.s, strZzi, fe0Var.f4620t.afmaVersion)) {
                        return;
                    }
                    zzv.zzp().d().zzx(false);
                    zzv.zzp().d().zzw(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    return;
                }
                return;
            case 7:
                ((nt0) this.f9415t).a();
                return;
            case 8:
                ((yw0) this.f9415t).a();
                return;
            case 9:
                c5.a aVarQ = ((n30) ((xj1) this.f9415t).f10619t).q();
                if (!((Boolean) zzbe.zzc().a(zn.C7)).booleanValue()) {
                    y5.g(aVarQ, "persistFlags");
                    return;
                }
                jv1 jv1Var = new jv1("persistFlags", 3);
                aVarQ.addListener(new as1(i6, aVarQ, jv1Var), i70.f5592g);
                return;
            case 10:
                ((j41) this.f9415t).t();
                return;
            case 11:
                vd2 vd2Var = (vd2) this.f9415t;
                vd2Var.getClass();
                int i8 = j31.f5914a;
                bd2 bd2Var2 = vd2Var.f9836b.s.I;
                bd2Var2.q(bd2Var2.t(), 1029, new rj1(25));
                return;
            default:
                ((ei2) this.f9415t).X = true;
                return;
        }
    }

    public /* synthetic */ u(Object obj, Exception exc, int i6) {
        this.s = i6;
        this.f9415t = obj;
    }
}
