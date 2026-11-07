package i3;

import android.content.Context;
import eh.p;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class e extends s implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Context, Object> f14140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f14141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<Object, f0> f14142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(eh.l lVar, androidx.compose.ui.d dVar, eh.l lVar2, int i10) {
        super(2);
        this.f14140a = lVar;
        this.f14141b = dVar;
        this.f14142c = lVar2;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        int iN = f3.i.n(49);
        androidx.compose.ui.viewinterop.a.b(this.f14140a, this.f14141b, this.f14142c, jVar, iN);
        return f0.f21461a;
    }
}
