package t8;

import android.content.Context;
import android.widget.Toast;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiCreateScreenKt$AiCreateScreen$3$1", f = "AiCreateScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g8.u f28229c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(x0.n1 n1Var, Context context, g8.u uVar, tg.e eVar) {
        super(2, eVar);
        this.f28227a = n1Var;
        this.f28228b = context;
        this.f28229c = uVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new h(this.f28227a, this.f28228b, this.f28229c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((h) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        int i10 = w.f28523b;
        Integer num = (Integer) this.f28227a.getValue();
        if (num != null) {
            Toast.makeText(this.f28228b, num.intValue(), 1).show();
            this.f28229c.f11639h.setValue(null);
        }
        return pg.f0.f21461a;
    }
}
