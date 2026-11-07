package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lv0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6860a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f6861b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f6862c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f6863d;

    public /* synthetic */ lv0(w92 w92Var, lk0 lk0Var, ca2 ca2Var, int i6) {
        this.f6860a = i6;
        this.f6861b = w92Var;
        this.f6862c = lk0Var;
        this.f6863d = ca2Var;
    }

    public r61 a() {
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new r61(h70Var, (nt0) this.f6861b.zzb(), ((lk0) this.f6862c).a(), (String) this.f6863d.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f6860a) {
            case 0:
                return new kv0((sv0) this.f6861b.zzb(), ((lk0) this.f6862c).a(), (String) this.f6863d.zzb());
            default:
                return a();
        }
    }
}
