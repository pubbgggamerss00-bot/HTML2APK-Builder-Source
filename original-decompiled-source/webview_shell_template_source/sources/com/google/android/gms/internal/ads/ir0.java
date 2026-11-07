package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class ir0 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5830b;

    public /* synthetic */ ir0(int i6, Object obj) {
        this.f5829a = i6;
        this.f5830b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        switch (this.f5829a) {
            case 0:
                return new jr0((String) this.f5830b, (mq) obj);
            default:
                return ((gh0) this.f5830b).q();
        }
    }
}
