package j2;

import android.view.View;
import com.basitce.htmltoapk.R;

@vg.e(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u5 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.k2 f14921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f14922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(x0.k2 k2Var, View view, tg.e<? super u5> eVar) {
        super(2, eVar);
        this.f14921b = k2Var;
        this.f14922c = view;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u5(this.f14921b, this.f14922c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((u5) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f14920a;
        x0.k2 k2Var = this.f14921b;
        View view = this.f14922c;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                this.f14920a = 1;
                Object objE = gg.a.e(k2Var.f31783t, new x0.m2(2, null), this);
                if (objE != obj2) {
                    objE = pg.f0.f21461a;
                }
                if (objE == obj2) {
                    return obj2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        } finally {
            if (a6.b(view) == k2Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
