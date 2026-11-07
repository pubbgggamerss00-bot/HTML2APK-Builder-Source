package d9;

import android.content.Context;
import android.widget.Toast;
import pg.f0;
import ph.i0;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.profile.ProfileScreenKt$ProfileScreen$2$1", f = "ProfileScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f7636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g8.u f7638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(n1 n1Var, Context context, g8.u uVar, tg.e eVar) {
        super(2, eVar);
        this.f7636a = n1Var;
        this.f7637b = context;
        this.f7638c = uVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new n(this.f7636a, this.f7637b, this.f7638c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((n) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        h0.e eVar = m.f7624a;
        Integer num = (Integer) this.f7636a.getValue();
        if (num != null) {
            Toast.makeText(this.f7637b, num.intValue(), 1).show();
            this.f7638c.f11639h.setValue(null);
        }
        return f0.f21461a;
    }
}
