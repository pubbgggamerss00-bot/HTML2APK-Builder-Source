package com.htmltoapk.template;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12527t;

    public /* synthetic */ a0(int i6, Object obj) {
        this.s = i6;
        this.f12527t = obj;
    }

    @Override // p5.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return AndroidAPI.openNotificationSettings$lambda$34((AndroidAPI) this.f12527t);
            case 1:
                return AndroidAPI.openAppSettings$lambda$45((AndroidAPI) this.f12527t);
            default:
                p5.a<d5.j> aVar = ((w2.l0) this.f12527t).f14922w;
                if (aVar != null) {
                    aVar.a();
                }
                return d5.j.f12745a;
        }
    }
}
