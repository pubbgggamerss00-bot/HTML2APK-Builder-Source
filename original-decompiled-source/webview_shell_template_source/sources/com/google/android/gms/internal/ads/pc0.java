package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8024a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8025b;

    public pc0() {
        this.f8024a = 6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8024a) {
            case 0:
                WeakReference weakReference = ((kc0) this.f8025b).f6323d;
                ih1.j(weakReference);
                return weakReference;
            case 1:
                return (ViewGroup) ((dh0) this.f8025b).f3937t;
            case 2:
                ub1 ub1Var = ((lh0) this.f8025b).f6733c;
                ih1.j(ub1Var);
                return ub1Var;
            case 3:
                return (String) ((androidx.camera.view.b) this.f8025b).f676v;
            case 4:
                lp0 lp0Var = (lp0) ((rh0) this.f8025b).f8636b.zzb();
                ih1.j(lp0Var);
                JSONObject jSONObject = lp0Var.f6815b;
                if (jSONObject != null) {
                    return jSONObject;
                }
                try {
                    return new JSONObject(lp0Var.f7202a.f9218z);
                } catch (JSONException unused) {
                    return null;
                }
            case 5:
                String str = ((q91) this.f8025b).f8279a.f8530z;
                ih1.j(str);
                return str;
            default:
                ca2 ca2Var = (ca2) this.f8025b;
                if (ca2Var != null) {
                    return ca2Var.zzb();
                }
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ pc0(int i6, Object obj) {
        this.f8024a = i6;
        this.f8025b = obj;
    }
}
