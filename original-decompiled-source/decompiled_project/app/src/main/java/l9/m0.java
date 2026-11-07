package l9;

import p5.w0;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16853a;

    public /* synthetic */ m0(int i10) {
        this.f16853a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f16853a) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                return it;
            case 1:
                return new q5.a(androidx.lifecycle.o0.a((j5.a) obj));
            default:
                w0 navigate = (w0) obj;
                kotlin.jvm.internal.r.e(navigate, "$this$navigate");
                navigate.a(new n0(1), e2.a.f24629c.f24627a);
                return pg.f0.f21461a;
        }
    }
}
