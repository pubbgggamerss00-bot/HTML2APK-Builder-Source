package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8607a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8608b;

    public /* synthetic */ rc0(int i6, Object obj) {
        this.f8607a = i6;
        this.f8608b = obj;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f8607a) {
            case 0:
                kc0 kc0Var = (kc0) this.f8608b;
                return new zzk(kc0Var.f6321b, kc0Var.f6320a);
            case 1:
                return ((ih0) this.f8608b).zzb();
            case 2:
                return new vi0(((z92) this.f8608b).zzb());
            case 3:
                ac1 ac1Var = (ac1) ((androidx.camera.view.b) this.f8608b).f674t;
                ih1.j(ac1Var);
                return ac1Var;
            case 4:
                return ((jk0) this.f8608b).f6097c;
            case 5:
                return ((mq0) this.f8608b).f7211c;
            case 6:
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kr0(h70Var, ((hr0) this.f8608b).zzb());
            case 7:
                return new os0(((qc0) this.f8608b).a());
            case 8:
                th0 th0Var = (th0) this.f8608b;
                my0 my0Var = (my0) ((w92) th0Var.f9284c).zzb();
                rg0 rg0Var = (rg0) th0Var.f9283b;
                uy0 uy0Var = new uy0(my0Var, new oy0(((ky0) rg0Var.f8629b).zzb(), ((lc0) rg0Var.f8630c).zzb(), 6, false));
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new kn0(uy0Var, h70Var2);
            case 9:
                new d0(15);
                ih1.j(i70.f5586a);
                ih1.j(((q91) ((rc0) this.f8608b).f8608b).f8279a.f8526v);
                return new m91();
            default:
                String str = ((q91) this.f8608b).f8279a.f8526v;
                ih1.j(str);
                return str;
        }
    }
}
