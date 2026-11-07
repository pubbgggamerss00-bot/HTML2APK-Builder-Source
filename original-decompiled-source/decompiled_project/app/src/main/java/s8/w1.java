package s8;

import android.net.Uri;
import java.util.List;
import s8.e2;

@vg.e(c = "com.basitce.htmltoapk.ui.navigation.AppNavigationKt$AppNavigation$9$1", f = "AppNavigation.kt", l = {216}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public eh.a f24745a;

    /* renamed from: b, reason: collision with root package name */
    public int f24746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f24747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f24748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f24750f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Uri uri, x0.n1 n1Var, p5.s0 s0Var, eh.a aVar, tg.e eVar) {
        super(2, eVar);
        this.f24747c = uri;
        this.f24748d = n1Var;
        this.f24749e = s0Var;
        this.f24750f = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new w1(this.f24747c, this.f24748d, this.f24749e, this.f24750f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((w1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        eh.a<pg.f0> aVar;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f24746b;
        if (i10 == 0) {
            pg.q.b(obj);
            List<pg.t<e2, w1.d, w1.d>> list = b2.f24610a;
            p5.s sVar = (p5.s) this.f24748d.getValue();
            if (sVar == null) {
                return pg.f0.f21461a;
            }
            Uri uri = this.f24747c;
            if (uri != null) {
                e2.h.f24638c.getClass();
                String strA = m3.a.a("external_preview?uri=", Uri.encode(uri.toString()));
                lh.m mVar = new lh.m(1);
                eh.a<pg.f0> aVar3 = this.f24750f;
                this.f24745a = aVar3;
                this.f24746b = 1;
                obj = b2.b(this.f24749e, sVar, strA, mVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar = this.f24745a;
        pg.q.b(obj);
        if (((Boolean) obj).booleanValue()) {
            aVar.invoke();
        }
        return pg.f0.f21461a;
    }
}
