package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qg0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8379a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f8380b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f8381c;

    public /* synthetic */ qg0(w92 w92Var, w92 w92Var2, int i6) {
        this.f8379a = i6;
        this.f8380b = w92Var;
        this.f8381c = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8379a) {
            case 0:
                lg0 lg0Var = (lg0) this.f8380b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                Set setSingleton = ((JSONObject) this.f8381c.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new kn0(lg0Var, h70Var));
                ih1.j(setSingleton);
                return setSingleton;
            default:
                return new fo0((rl0) this.f8380b.zzb(), (hn0) this.f8381c.zzb());
        }
    }
}
