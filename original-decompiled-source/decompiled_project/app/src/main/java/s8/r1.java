package s8;

import android.net.Uri;
import java.util.List;
import s8.e2;

@vg.e(c = "com.basitce.htmltoapk.ui.navigation.AppNavigationKt$AppNavigation$6$1", f = "AppNavigation.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f24723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f24725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f24727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f24728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(boolean z10, Uri uri, p5.s0 s0Var, eh.a aVar, x0.n1 n1Var, tg.e eVar) {
        super(2, eVar);
        this.f24724b = z10;
        this.f24725c = uri;
        this.f24726d = s0Var;
        this.f24727e = aVar;
        this.f24728f = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r1(this.f24724b, this.f24725c, this.f24726d, this.f24727e, this.f24728f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f24723a;
        if (i10 == 0) {
            pg.q.b(obj);
            List<pg.t<e2, w1.d, w1.d>> list = b2.f24610a;
            p5.s sVar = (p5.s) this.f24728f.getValue();
            if (sVar == null) {
                return pg.f0.f21461a;
            }
            if (this.f24724b && kotlin.jvm.internal.r.a(sVar.f21269b.f21235b.f24512e, e2.j.f24640c.f24627a) && this.f24725c == null) {
                String str = e2.r.f24648c.f24627a;
                q1 q1Var = new q1();
                this.f24723a = 1;
                obj = b2.b(this.f24726d, sVar, str, q1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        if (((Boolean) obj).booleanValue()) {
            this.f24727e.invoke();
        }
        return pg.f0.f21461a;
    }
}
