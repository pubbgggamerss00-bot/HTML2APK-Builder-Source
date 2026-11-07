package f9;

import android.content.Context;
import java.util.List;
import p5.k0;
import q5.e;

/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10475a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f10476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10479e;

    public /* synthetic */ s2(Context context, x0.k1 k1Var, x0.n1 n1Var, x0.n1 n1Var2) {
        this.f10477c = k1Var;
        this.f10478d = context;
        this.f10476b = n1Var;
        this.f10479e = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f10475a;
        x0.n1 n1Var = this.f10476b;
        Object obj2 = this.f10479e;
        Object obj3 = this.f10478d;
        Object obj4 = this.f10477c;
        switch (i10) {
            case 0:
                x0.k1 k1Var = (x0.k1) obj4;
                float fL = jh.j.l(((Float) obj).floatValue(), 10.0f, 22.0f);
                List<String> list = d1.f9265a;
                k1Var.e(fL);
                d1.y((Context) obj3, k1Var, n1Var, (x0.n1) obj2);
                return pg.f0.f21461a;
            default:
                eh.l lVar = (eh.l) obj3;
                eh.l lVar2 = (eh.l) obj2;
                r.p pVar = (r.p) obj;
                p5.k0 k0Var = ((p5.s) pVar.c()).f21269b;
                kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                e.a aVar = (e.a) k0Var;
                if (((Boolean) ((q5.e) obj4).f21950c.getValue()).booleanValue() || ((Boolean) n1Var.getValue()).booleanValue()) {
                    int i11 = p5.k0.f21233e;
                    for (p5.k0 k0Var2 : k0.a.b(aVar)) {
                    }
                    return (r.w1) lVar.invoke(pVar);
                }
                int i12 = p5.k0.f21233e;
                for (p5.k0 k0Var3 : k0.a.b(aVar)) {
                }
                return (r.w1) lVar2.invoke(pVar);
        }
    }

    public /* synthetic */ s2(q5.e eVar, eh.l lVar, eh.l lVar2, x0.n1 n1Var) {
        this.f10477c = eVar;
        this.f10478d = lVar;
        this.f10479e = lVar2;
        this.f10476b = n1Var;
    }
}
