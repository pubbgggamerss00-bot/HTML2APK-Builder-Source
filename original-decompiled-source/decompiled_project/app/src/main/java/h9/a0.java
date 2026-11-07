package h9;

import f9.cf;
import java.util.List;
import pg.p;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$discoverPersistedKeystores$2", f = "KeystoreViewModel.kt", l = {148, 149}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12494a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f12496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf f12497d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$discoverPersistedKeystores$2$1", f = "KeystoreViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cf f12498a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f12499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cf cfVar, Object obj, tg.e eVar) {
            super(2, eVar);
            this.f12498a = cfVar;
            this.f12499b = obj;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f12498a, this.f12499b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            cf cfVar = this.f12498a;
            x0.n1 n1Var = (x0.n1) cfVar.f9252b;
            x0.n1 n1Var2 = (x0.n1) cfVar.f9253c;
            n1Var.setValue(Boolean.FALSE);
            Object obj2 = this.f12499b;
            if (obj2 instanceof p.a) {
                obj2 = qg.z.f22752a;
            }
            n1Var2.setValue((List) obj2);
            pg.f0 f0Var = pg.f0.f21461a;
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(x xVar, cf cfVar, tg.e eVar) {
        super(2, eVar);
        this.f12496c = xVar;
        this.f12497d = cfVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        a0 a0Var = new a0(this.f12496c, this.f12497d, eVar);
        a0Var.f12495b = obj;
        return a0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (ph.h.e(r1, r4, r6) == r0) goto L22;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12494a;
        try {
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        if (i10 == 0) {
            pg.q.b(obj);
            n8.l lVar = this.f12496c.f12857b;
            this.f12494a = 1;
            lVar.getClass();
            wh.c cVar = ph.z0.f21632a;
            obj = ph.h.e(wh.b.f31563c, new n8.k(lVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
        }
        objA = (List) obj;
        wh.c cVar2 = ph.z0.f21632a;
        qh.g gVar = uh.o.f29764a;
        a aVar2 = new a(this.f12497d, objA, null);
        this.f12494a = 2;
    }
}
