package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class bz0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3331b;

    public /* synthetic */ bz0(int i6, Object obj) {
        this.f3330a = i6;
        this.f3331b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() throws GeneralSecurityException, IOException {
        byte[] byteArray;
        lt1 lt1VarC;
        String str;
        boolean z6;
        boolean z7;
        int i6 = 0;
        switch (this.f3330a) {
            case 0:
                return ((dz0) this.f3331b).getWritableDatabase();
            case 1:
                w41 w41Var = (w41) this.f3331b;
                ArrayList arrayList = new ArrayList();
                View view = w41Var.f10036d;
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent != null) {
                        int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        Bundle bundle = new Bundle();
                        bundle.putString("type", parent.getClass().getName());
                        bundle.putInt("index_of_child", iIndexOfChild);
                        arrayList.add(bundle);
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                    return new x41(w41Var.f10034b, w41Var.f10035c.f4210e, arrayList);
                }
                return new x41(w41Var.f10034b, w41Var.f10035c.f4210e, arrayList);
            case 2:
                a51 a51Var = (a51) this.f3331b;
                String strEncodeToString = null;
                if (((Boolean) zzbe.zzc().a(zn.R6)).booleanValue() && "requester_type_2".equals(zzaa.zzc(a51Var.f2583b.f4209d))) {
                    try {
                        ux1 ux1Var = ux1.f9659b;
                        synchronized (ux1Var) {
                            if (!ux1Var.f9660a.containsKey("AES128_GCM")) {
                                throw new GeneralSecurityException("Name AES128_GCM does not exist");
                            }
                            lt1VarC = (lt1) ux1Var.f9660a.get("AES128_GCM");
                        }
                        if (lt1VarC == null) {
                            try {
                                lt1VarC = rj1.c(((py1) wx1.f10304b.d(null)).f8181b.i());
                            } catch (GeneralSecurityException e6) {
                                throw new yy1("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e6);
                            }
                        }
                        ht1 ht1VarA = ht1.a(lt1VarC);
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            c22 c22Var = ht1VarA.f5480a;
                            try {
                                int iF = c22Var.f(null);
                                Logger logger = p42.f7933u;
                                if (iF > 4096) {
                                    iF = 4096;
                                }
                                o42 o42Var = new o42(byteArrayOutputStream, iF);
                                c22Var.d(o42Var);
                                if (o42Var.f7598y > 0) {
                                    o42Var.M();
                                }
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                            } catch (Throwable th) {
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            throw new GeneralSecurityException("Serialize keyset failed");
                        }
                    } catch (GeneralSecurityException e7) {
                        zze.zza("Failed to generate key".concat(e7.toString()));
                        zzv.zzp().h("CryptoUtils.generateKey", e7);
                        byteArray = new byte[0];
                    }
                    strEncodeToString = Base64.encodeToString(byteArray, 11);
                }
                return new b51(0, strEncodeToString);
            case 3:
                q51 q51Var = (q51) this.f3331b;
                return new r51(q51Var.f8232b.f4214j, q51Var.f8233c.f4146g, i6);
            default:
                i71 i71Var = (i71) this.f3331b;
                sv0 sv0Var = i71Var.f5594b;
                synchronized (sv0Var) {
                    if (!((Boolean) zzbe.zzc().a(zn.N8)).booleanValue() || !sv0Var.f()) {
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else if (sv0Var.f9024q < zzv.zzC().a() / 1000) {
                        sv0Var.f9022o = "{}";
                        sv0Var.f9024q = Long.MAX_VALUE;
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else if (!sv0Var.f9022o.equals("{}")) {
                        str = sv0Var.f9022o;
                    }
                }
                synchronized (sv0Var) {
                    z6 = sv0Var.s;
                }
                boolean zZzl = zzv.zzt().zzl();
                sv0 sv0Var2 = i71Var.f5594b;
                boolean z8 = true;
                if (sv0Var2.f9023p != null) {
                    z7 = true;
                } else {
                    z7 = true;
                    z8 = false;
                }
                return new j71(str, z6, zZzl, z8, sv0Var2.f9029w < ((Long) zzbe.zzc().a(zn.i9)).longValue() ? z7 : false);
        }
    }
}
