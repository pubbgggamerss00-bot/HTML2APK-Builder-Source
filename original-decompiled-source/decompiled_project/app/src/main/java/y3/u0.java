package y3;

import android.view.View;
import android.view.ViewGroup;

@vg.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class u0 extends vg.h implements eh.p<lh.i<? super View>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33897a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f33899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(View view, tg.e<? super u0> eVar) {
        super(2, eVar);
        this.f33899c = view;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        u0 u0Var = new u0(this.f33899c, eVar);
        u0Var.f33898b = obj;
        return u0Var;
    }

    @Override // eh.p
    public final Object invoke(lh.i<? super View> iVar, tg.e<? super pg.f0> eVar) {
        return ((u0) create(iVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33897a;
        View view = this.f33899c;
        if (i10 == 0) {
            pg.q.b(obj);
            lh.i iVar = (lh.i) this.f33898b;
            this.f33898b = iVar;
            this.f33897a = 1;
            iVar.c(view, this);
            return aVar;
        }
        if (i10 == 1) {
            lh.i iVar2 = (lh.i) this.f33898b;
            pg.q.b(obj);
            if (view instanceof ViewGroup) {
                this.f33898b = null;
                this.f33897a = 2;
                iVar2.getClass();
                Object objE = iVar2.e(new m0(new t0((ViewGroup) view)), this);
                if (objE != aVar) {
                    objE = pg.f0.f21461a;
                }
                if (objE == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
