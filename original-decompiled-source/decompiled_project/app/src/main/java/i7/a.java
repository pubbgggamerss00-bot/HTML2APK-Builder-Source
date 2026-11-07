package i7;

import eh.l;
import g2.g1;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14176b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f14175a = i10;
        this.f14176b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f14175a) {
            case 0:
                g1.a.g((g1.a) obj, (g1) this.f14176b, 0, 0);
                return f0.f21461a;
            default:
                bi.f fVar = (bi.f) this.f14176b;
                int iIntValue = ((Integer) obj).intValue();
                return fVar.f(iIntValue) + ": " + fVar.h(iIntValue).a();
        }
    }
}
