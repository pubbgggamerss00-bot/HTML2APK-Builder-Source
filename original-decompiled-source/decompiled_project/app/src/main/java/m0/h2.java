package m0;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* loaded from: classes.dex */
public final class h2 extends kotlin.jvm.internal.s implements eh.l<eh.a<? extends p1.c>, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3.d f17348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<f3.p> f17349b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(f3.d dVar, x0.n1<f3.p> n1Var) {
        super(1);
        this.f17348a = dVar;
        this.f17349b = n1Var;
    }

    @Override // eh.l
    public final androidx.compose.ui.d invoke(eh.a<? extends p1.c> aVar) {
        f2 f2Var = new f2(aVar);
        g2 g2Var = new g2(this.f17348a, this.f17349b);
        q2.c0<eh.a<p1.c>> c0Var = t.a1.f25160a;
        return new MagnifierElement(f2Var, g2Var, Build.VERSION.SDK_INT == 28 ? t.n1.f25305a : t.o1.f25310a);
    }
}
