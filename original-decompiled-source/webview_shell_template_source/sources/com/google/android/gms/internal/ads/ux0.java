package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ux0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9658c;

    public /* synthetic */ ux0(int i6, Object obj, Object obj2) {
        this.f9656a = i6;
        this.f9657b = obj;
        this.f9658c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) throws JSONException {
        ed1 ed1Var;
        switch (this.f9656a) {
            case 0:
                return ((t81) this.f9657b).a(zzbc.zzb().zzi((Bundle) obj), ((r30) this.f9658c).E, false);
            case 1:
                u11 u11Var = (u11) this.f9657b;
                tb1 tb1Var = (tb1) this.f9658c;
                gs0 gs0Var = (gs0) obj;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isNonagon", true);
                if (((Boolean) zzbe.zzc().a(zn.A8)).booleanValue() && i3.g.b()) {
                    jSONObject.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("response", tb1Var.s.f10474c);
                jSONObject2.put("sdk_params", jSONObject);
                return bs1.p(gs0Var.a("google.afma.nativeAds.preProcessJson", jSONObject2), new qf0(4, u11Var, gs0Var), u11Var.f9426b);
            default:
                ra1 ra1Var = (ra1) this.f9657b;
                gk0 gk0Var = (gk0) this.f9658c;
                va1 va1Var = (va1) obj;
                xc1 xc1Var = ra1Var.s;
                fd1 fd1Var = va1Var.f9765b;
                r30 r30Var = va1Var.f9764a;
                synchronized (xc1Var) {
                    try {
                        wc1 wc1Var = (wc1) xc1Var.f10494a.get(fd1Var);
                        ed1Var = null;
                        if (wc1Var != null) {
                            od1 od1Var = wc1Var.f10160d;
                            od1Var.getClass();
                            od1Var.f7728c = zzv.zzC().a();
                            od1Var.f7729d++;
                            wc1Var.a();
                            LinkedList linkedList = wc1Var.f10157a;
                            if (!linkedList.isEmpty() && (ed1Var = (ed1) linkedList.remove()) != null) {
                                od1Var.f7730e++;
                                od1Var.f7727b.s = true;
                            }
                            if (ed1Var == null) {
                                xc1Var.f10496c.f11262e++;
                            }
                            nd1 nd1Var = wc1Var.f10160d.f7727b;
                            nd1 nd1VarClone = nd1Var.clone();
                            nd1Var.s = false;
                            nd1Var.f7421t = 0;
                            if (ed1Var != null) {
                                vl vlVarB = am.B();
                                tl tlVarE = ul.E();
                                tlVarE.i();
                                ul.B((ul) tlVarE.f4126t);
                                wl wlVarB = xl.B();
                                boolean z6 = nd1VarClone.s;
                                wlVarB.i();
                                xl.E((xl) wlVarB.f4126t, z6);
                                int i6 = nd1VarClone.f7421t;
                                wlVarB.i();
                                xl.F((xl) wlVarB.f4126t, i6);
                                tlVarE.i();
                                ul.C((ul) tlVarE.f4126t, wlVarB.g());
                                vlVarB.i();
                                am.D((am) vlVarB.f4126t, tlVarE.g());
                                ed1Var.f4234a.zzb().f4698f.M(vlVarB.g());
                            }
                            xc1Var.b();
                        } else {
                            xc1Var.f10496c.f11261d++;
                            xc1Var.b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (ed1Var != null && r30Var != null) {
                    fj0 fj0VarZzb = gk0Var.zzb();
                    ox0 ox0Var = fj0VarZzb.h;
                    vd1 vd1VarA = fj0VarZzb.f4695c.a(ox0Var.a(r30Var, new ck1(8, ox0Var), new ej0(11, ox0Var), new kx0()), yd1.N).a();
                    vd1VarA.addListener(new as1(0, vd1VarA, new v31(1, fj0VarZzb)), fj0VarZzb.f4701j);
                    vd1VarA.addListener(new as1(0, vd1VarA, ra1Var.f8595u), ra1Var.f8594t);
                }
                return bs1.m(new qa1(fd1Var, r30Var, ed1Var));
        }
    }
}
