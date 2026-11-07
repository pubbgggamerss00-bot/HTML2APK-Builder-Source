package c9;

import java.util.List;
import s8.b2;

/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5331b;

    public /* synthetic */ z0(Object obj, int i10) {
        this.f5330a = i10;
        this.f5331b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f5330a) {
            case 0:
                ((s1) this.f5331b).o(-90);
                return pg.f0.f21461a;
            case 1:
                b2.e((p5.x) this.f5331b);
                return pg.f0.f21461a;
            default:
                return ((kh.j) ((List) this.f5331b).get(0)).h();
        }
    }
}
