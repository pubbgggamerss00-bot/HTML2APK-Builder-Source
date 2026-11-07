package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class og0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7747a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f7748b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f7749c;

    public /* synthetic */ og0(w92 w92Var, w92 w92Var2, int i6) {
        this.f7747a = i6;
        this.f7748b = w92Var;
        this.f7749c = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7747a) {
            case 0:
                lg0 lg0Var = (lg0) this.f7748b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                Set setSingleton = ((JSONObject) this.f7749c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new kn0(lg0Var, h70Var));
                ih1.j(setSingleton);
                return setSingleton;
            case 1:
                ae1 ae1Var = (ae1) this.f7748b.zzb();
                mw0 mw0Var = new mw0(0, zzv.zzr().zza((Context) this.f7749c.zzb()));
                hs1 hs1Var = ae1Var.f2731a;
                ds1 ds1Var = ae1.f2730d;
                List list = Collections.EMPTY_LIST;
                c5.a aVarU = hs1Var.u(mw0Var);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                wd1 wd1Var = new wd1(ae1Var, yd1.K, null, ds1Var, list, bs1.q(aVarU, 1L, TimeUnit.SECONDS, ae1Var.f2732b));
                return new wd1(wd1Var.f10171f, wd1Var.f10166a, wd1Var.f10167b, wd1Var.f10168c, wd1Var.f10169d, bs1.k(wd1Var.f10170e, Exception.class, new cr0(3), wd1Var.f10171f.f2731a)).a();
            default:
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                l71 l71Var = new l71(h70Var2);
                i3.a aVar = (i3.a) this.f7748b.zzb();
                ih1.j(h70Var2);
                return new n61(l71Var, ((Long) jp.f6121f.c()).longValue(), aVar, h70Var2, (cu0) this.f7749c.zzb());
        }
    }
}
