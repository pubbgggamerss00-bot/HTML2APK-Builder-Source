package j9;

import android.content.Context;
import android.util.Log;
import com.basitce.htmltoapk.R;
import j9.x1;
import java.util.concurrent.CancellationException;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesViewModel$useTemplate$1", f = "TemplatesViewModel.kt", l = {499}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f15650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f15651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f15652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1.a f15653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(x1 x1Var, Context context, x1.a aVar, tg.e<? super y1> eVar) {
        super(2, eVar);
        this.f15651b = x1Var;
        this.f15652c = context;
        this.f15653d = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new y1(this.f15651b, this.f15652c, this.f15653d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        x1 x1Var = this.f15651b;
        sh.z0 z0Var = x1Var.f15634q;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f15650a;
        x1.a aVar2 = this.f15653d;
        Context context = this.f15652c;
        try {
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f15650a = 1;
                    if (x1.f(x1Var, context, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
            } catch (CancellationException e10) {
                throw e10;
            } catch (Exception e11) {
                Log.e("TemplatesViewModel", "useTemplate failed for " + aVar2.f15636a, e11);
                sh.z0 z0Var2 = x1Var.f15631n;
                String message = e11.getMessage();
                if (message == null) {
                    message = e11.getClass().getSimpleName();
                }
                z0Var2.setValue(context.getString(R.string.template_use_failed, message));
            }
            return pg.f0.f21461a;
        } finally {
            Boolean bool = Boolean.FALSE;
            z0Var.getClass();
            z0Var.j(null, bool);
        }
    }
}
