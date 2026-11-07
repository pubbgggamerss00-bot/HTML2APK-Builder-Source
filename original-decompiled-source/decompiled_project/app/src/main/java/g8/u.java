package g8;

import android.app.Activity;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import pg.f0;
import pg.p;
import ph.i0;
import sh.a1;
import sh.l0;
import sh.z0;

/* loaded from: classes.dex */
public final class u extends w0 {

    /* renamed from: b, reason: collision with root package name */
    public final p f11633b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f11634c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f11635d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f11636e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f11637f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f11638g;

    /* renamed from: h, reason: collision with root package name */
    public final z0 f11639h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f11640i;

    @vg.e(c = "com.basitce.htmltoapk.account.AccountViewModel$signIn$2", f = "AccountViewModel.kt", l = {32}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11641a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f11643c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<f0> f11644d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, eh.a<f0> aVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f11643c = activity;
            this.f11644d = aVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return u.this.new a(this.f11643c, this.f11644d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object objM;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f11641a;
            u uVar = u.this;
            if (i10 == 0) {
                pg.q.b(obj);
                p pVar = uVar.f11633b;
                this.f11641a = 1;
                objM = pVar.m(this.f11643c, "2026-11-05", this);
                if (objM == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                objM = ((pg.p) obj).f21471a;
            }
            if (!(objM instanceof p.a)) {
                this.f11644d.invoke();
            }
            Throwable thA = pg.p.a(objM);
            if (thA != null) {
                g8.a aVar2 = thA instanceof g8.a ? (g8.a) thA : null;
                String str = aVar2 != null ? aVar2.f11559a : null;
                if (!kotlin.jvm.internal.r.a(str, "cancelled")) {
                    z0 z0Var = uVar.f11639h;
                    Integer num = new Integer(w.a(str));
                    z0Var.getClass();
                    z0Var.j(null, num);
                }
            }
            z0 z0Var2 = uVar.f11637f;
            Boolean bool = Boolean.FALSE;
            z0Var2.getClass();
            z0Var2.j(null, bool);
            return f0.f21461a;
        }
    }

    public u(p repository) {
        kotlin.jvm.internal.r.e(repository, "repository");
        this.f11633b = repository;
        this.f11634c = repository.f11602f;
        this.f11635d = repository.f11604h;
        this.f11636e = repository.f11606j;
        z0 z0VarA = a1.a(Boolean.FALSE);
        this.f11637f = z0VarA;
        this.f11638g = z0VarA;
        z0 z0VarA2 = a1.a(null);
        this.f11639h = z0VarA2;
        this.f11640i = z0VarA2;
    }

    public final void f(Activity activity, eh.a<f0> onSignedIn) {
        kotlin.jvm.internal.r.e(onSignedIn, "onSignedIn");
        z0 z0Var = this.f11637f;
        if (((Boolean) z0Var.getValue()).booleanValue()) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        z0Var.getClass();
        z0Var.j(null, bool);
        ph.h.c(x0.a(this), null, null, new a(activity, onSignedIn, null), 3);
    }
}
