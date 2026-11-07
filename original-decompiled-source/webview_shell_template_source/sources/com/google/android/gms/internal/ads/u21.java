package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u21 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9433a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9434b;

    /* renamed from: c, reason: collision with root package name */
    public final us0 f9435c;

    public u21(Context context, Executor executor, us0 us0Var) {
        this.f9433a = context;
        this.f9434b = executor;
        this.f9435c = us0Var;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        gc1 gc1Var;
        JSONObject jSONObject = tb1Var.f9210v;
        IInterface iInterface = b01Var.f2885c;
        Object obj = b01Var.f2884b;
        try {
            ec1 ec1Var = (ec1) ac1Var.f2647a.f9702t;
            c6.h hVar = ec1Var.f4219o;
            zzm zzmVar = ec1Var.f4209d;
            int i6 = hVar.f2239a;
            Context context = this.f9433a;
            if (i6 == 3) {
                rc1 rc1Var = (rc1) obj;
                try {
                    rc1Var.f8609a.H(new k3.b(context), zzmVar, jSONObject.toString(), (my) iInterface);
                    return;
                } finally {
                }
            }
            rc1 rc1Var2 = (rc1) obj;
            try {
                rc1Var2.f8609a.J1(new k3.b(context), zzmVar, jSONObject.toString(), (my) iInterface);
                return;
            } finally {
            }
        } catch (Exception e6) {
            zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(b01Var.f2883a)), e6);
        }
        zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(b01Var.f2883a)), e6);
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        yd0 yd0VarB = this.f9435c.b(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new ts0(new t21(b01Var, 0), null));
        yd0VarB.u().l0(new nf0((rc1) b01Var.f2884b), this.f9434b);
        ((e11) b01Var.f2885c).e2((x21) yd0VarB.R.zzb());
        return yd0VarB.s();
    }
}
