package androidx.compose.ui.platform;

import eh.p;
import pg.f0;
import pg.q;
import ph.i0;

@vg.e(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f1358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, tg.e<? super e> eVar) {
        super(2, eVar);
        this.f1359b = iVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new e(this.f1359b, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((e) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f1358a;
        if (i10 == 0) {
            q.b(obj);
            AndroidComposeView androidComposeView = this.f1359b.f1366a;
            this.f1358a = 1;
            Object objL = androidComposeView.f1249t.l(this);
            if (objL != aVar) {
                objL = f0.f21461a;
            }
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}
