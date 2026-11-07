package x8;

import com.basitce.htmltoapk.R;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import t0.uc;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$saveProjectOrder$2", f = "HomeViewModel.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f33180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f33181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f33182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(j6 j6Var, ArrayList arrayList, eh.a aVar, tg.e eVar) {
        super(2, eVar);
        this.f33180b = j6Var;
        this.f33181c = arrayList;
        this.f33182d = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s7(this.f33180b, this.f33181c, this.f33182d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((s7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        j6 j6Var = this.f33180b;
        sh.z0 z0Var = j6Var.f32782i;
        Object obj2 = ug.a.f29706a;
        int i10 = this.f33179a;
        ArrayList arrayList = this.f33181c;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                n8.m1 m1Var = j6Var.f32777d;
                this.f33179a = 1;
                Object objA = v4.g.a(m1Var.f18526b, new n8.j0(arrayList, null), this);
                if (objA != obj2) {
                    objA = pg.f0.f21461a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception unused) {
            if (kotlin.jvm.internal.r.a(z0Var.getValue(), arrayList)) {
                z0Var.setValue(null);
            }
            this.f33182d.invoke();
            uc ucVar = q8.p2.f22362a;
            String string = j6Var.F().getString(R.string.home_project_order_save_failed);
            kotlin.jvm.internal.r.d(string, "getString(...)");
            q8.p2.a(string, null, null);
        }
        return pg.f0.f21461a;
    }
}
