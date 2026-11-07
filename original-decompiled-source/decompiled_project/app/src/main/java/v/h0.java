package v;

import java.util.concurrent.CancellationException;
import ph.l2;
import v.f0;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h0 extends vg.i implements eh.p<ph.i0, tg.e<? super f0.a>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29891a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rh.h<f0.a> f29893c;

    @vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", l = {166}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f29894a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29895b;

        /* renamed from: v.h0$a$a, reason: collision with other inner class name */
        public static final class C0307a extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0307a f29896a = new C0307a(1);

            @Override // eh.l
            public final /* bridge */ /* synthetic */ pg.f0 invoke(Long l10) {
                l10.longValue();
                return pg.f0.f21461a;
            }
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(2, eVar);
            aVar.f29895b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ph.i0 i0Var;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f29894a;
            if (i10 == 0) {
                pg.q.b(obj);
                i0Var = (ph.i0) this.f29895b;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i0Var = (ph.i0) this.f29895b;
                pg.q.b(obj);
            }
            while (ph.v1.h(i0Var.getCoroutineContext())) {
                this.f29895b = i0Var;
                this.f29894a = 1;
                if (x0.f1.a(getContext()).f0(C0307a.f29896a, this) == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(rh.h<f0.a> hVar, tg.e<? super h0> eVar) {
        super(2, eVar);
        this.f29893c = hVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        h0 h0Var = new h0(this.f29893c, eVar);
        h0Var.f29892b = obj;
        return h0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super f0.a> eVar) {
        return ((h0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ph.s1 s1Var;
        Throwable th2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29891a;
        if (i10 == 0) {
            pg.q.b(obj);
            l2 l2VarC = ph.h.c((ph.i0) this.f29892b, null, null, new a(2, null), 3);
            try {
                rh.h<f0.a> hVar = this.f29893c;
                this.f29892b = l2VarC;
                this.f29891a = 1;
                Object objB = hVar.b(this);
                if (objB == aVar) {
                    return aVar;
                }
                s1Var = l2VarC;
                obj = objB;
            } catch (Throwable th3) {
                s1Var = l2VarC;
                th2 = th3;
                s1Var.cancel((CancellationException) null);
                throw th2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s1Var = (ph.s1) this.f29892b;
            try {
                pg.q.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                s1Var.cancel((CancellationException) null);
                throw th2;
            }
        }
        f0.a aVar2 = (f0.a) obj;
        s1Var.cancel((CancellationException) null);
        return aVar2;
    }
}
