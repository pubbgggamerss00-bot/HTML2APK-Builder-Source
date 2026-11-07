package q8;

import h8.f;
import t8.y3;

/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22266b;

    public /* synthetic */ j2(Object obj, int i10) {
        this.f22265a = i10;
        this.f22266b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f22265a;
        Object obj2 = this.f22266b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mh.k kVar = n2.f22323a;
                ((x0.n1) obj2).setValue(bool);
                return pg.f0.f21461a;
            default:
                f.a.C0115a c0115a = (f.a.C0115a) obj2;
                y3 it = (y3) obj;
                kotlin.jvm.internal.r.e(it, "it");
                Integer num = it.f28591k;
                return y3.a(it, null, null, null, null, null, Integer.valueOf((num != null ? num.intValue() : 0) + c0115a.f12386b), it.f28592l || c0115a.f12387c, null, null, null, null, 0, null, null, null, 4191231);
        }
    }
}
