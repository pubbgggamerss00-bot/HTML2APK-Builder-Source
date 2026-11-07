package i3;

import android.content.Context;
import eh.p;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class h extends s implements p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Context, Object> f14145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.d f14146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<Object, f0> f14147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<Object, f0> f14148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(eh.l lVar, androidx.compose.ui.d dVar, eh.l lVar2, eh.l lVar3, int i10, int i11) {
        super(2);
        this.f14145a = lVar;
        this.f14146b = dVar;
        this.f14147c = lVar2;
        this.f14148d = lVar3;
        this.f14149e = i10;
        this.f14150f = i11;
    }

    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        num.intValue();
        androidx.compose.ui.viewinterop.a.a(this.f14145a, this.f14146b, this.f14147c, this.f14148d, jVar, f3.i.n(this.f14149e | 1), this.f14150f);
        return f0.f21461a;
    }
}
