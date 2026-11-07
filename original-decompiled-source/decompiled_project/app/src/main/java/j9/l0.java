package j9;

import b9.e3;
import j9.x1;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15462c;

    public /* synthetic */ l0(int i10, Object obj, Object obj2) {
        this.f15460a = i10;
        this.f15461b = obj;
        this.f15462c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f15460a;
        Object obj = this.f15462c;
        Object obj2 = this.f15461b;
        switch (i10) {
            case 0:
                x1.a aVar = (x1.a) obj2;
                e3.f3796a = new e3.a(aVar.f15637b, e3.b.f3815e, null, null, null, null, aVar.f15641f, aVar.f15636a, null, 0, false, null, 16188);
                p5.x.c(e2.t.f24650c.f24627a, (p5.x) obj);
                break;
            default:
                float f10 = x8.s.f33139a;
                ((x0.n1) obj).setValue(Boolean.FALSE);
                ((eh.a) obj2).invoke();
                break;
        }
        return pg.f0.f21461a;
    }
}
