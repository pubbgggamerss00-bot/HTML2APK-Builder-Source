package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10491a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f10492b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10493c;

    public /* synthetic */ xc0(w92 w92Var, Object obj, int i6) {
        this.f10491a = i6;
        this.f10492b = w92Var;
        this.f10493c = obj;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10491a) {
            case 0:
                try {
                    return j3.d.a(((oc0) this.f10493c).a()).b(0, ((ApplicationInfo) ((w92) this.f10492b).zzb()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                lg0 lg0Var = (lg0) ((w92) this.f10492b).zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                Set setSingleton = ((JSONObject) ((w92) this.f10493c).zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new kn0(lg0Var, h70Var));
                ih1.j(setSingleton);
                return setSingleton;
            case 2:
                return new s71(new t41(1, ((lk0) ((gf0) this.f10493c).f5025b).a()), ((Integer) zzbe.zzc().a(zn.sc)).intValue(), (ScheduledExecutorService) this.f10492b.zzb());
            case 3:
                ((oc0) this.f10492b).a();
                Context context = ((jk0) this.f10493c).f6095a;
                ih1.j(context);
                return context;
            case 4:
                return new mt0(pc1.a(((ne0) this.f10493c).f7431b.a()), (lt0) ((w92) this.f10492b).zzb());
            case 5:
                return new q11((Context) ((w92) this.f10492b).zzb(), (go0) ((y92) this.f10493c).f10908a);
            default:
                mh0 mh0Var = (mh0) this.f10493c;
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new s71(new r71(h70Var2, ((oc0) ((ga2) mh0Var.f7158b)).a(), (Set) ((ca2) mh0Var.f7159c).zzb()), ((Integer) zzbe.zzc().a(zn.ac)).intValue(), (ScheduledExecutorService) this.f10492b.zzb());
        }
    }

    public /* synthetic */ xc0(Object obj, ca2 ca2Var, int i6) {
        this.f10491a = i6;
        this.f10493c = obj;
        this.f10492b = ca2Var;
    }
}
