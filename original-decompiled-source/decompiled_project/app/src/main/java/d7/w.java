package d7;

import android.content.Context;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.d;
import pg.f0;
import ph.i0;
import u6.g1;

@vg.e(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w extends vg.i implements eh.p<i0, tg.e<? super Void>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f7407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.work.c f7408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WorkSpec f7409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f7410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f7411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.work.c cVar, WorkSpec workSpec, z zVar, Context context, tg.e eVar) {
        super(2, eVar);
        this.f7408b = cVar;
        this.f7409c = workSpec;
        this.f7410d = zVar;
        this.f7411e = context;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new w(this.f7408b, this.f7409c, this.f7410d, this.f7411e, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super Void> eVar) {
        return ((w) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objO;
        String str = this.f7409c.f3169c;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f7407a;
        androidx.work.c cVar = this.f7408b;
        if (i10 == 0) {
            pg.q.b(obj);
            d.C0161d c0161dA = cVar.a();
            this.f7407a = 1;
            obj = g1.a(c0161dA, cVar, this);
            if (obj != aVar) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        t6.j jVar = (t6.j) obj;
        if (jVar == null) {
            throw new IllegalStateException(i8.n.d("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
        }
        String str2 = x.f7412a;
        t6.s.d().a(str2, "Updating notification for " + str);
        UUID uuid = cVar.f3134b.f3111a;
        z zVar = this.f7410d;
        final s sVar = zVar.f7417a.f8398a;
        final y yVar = new y(zVar, uuid, jVar, this.f7411e);
        kotlin.jvm.internal.r.e(sVar, "<this>");
        d.C0161d c0161dA2 = k3.d.a(new d.c() { // from class: t6.n
            @Override // k3.d.c
            public final Object a(final d.a aVar2) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Runnable runnable = new Runnable() { // from class: t6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        atomicBoolean.set(true);
                    }
                };
                k3.h<Void> hVar = aVar2.f15968c;
                if (hVar != null) {
                    hVar.a(runnable, h.f28020a);
                }
                final d7.y yVar2 = yVar;
                ((d7.s) sVar).execute(new Runnable() { // from class: t6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a aVar3 = aVar2;
                        d7.y yVar3 = yVar2;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        try {
                            yVar3.invoke();
                            aVar3.a(null);
                        } catch (Throwable th2) {
                            aVar3.b(th2);
                        }
                    }
                });
                return "setForegroundAsync";
            }
        });
        this.f7407a = 2;
        try {
            if (c0161dA2.isDone()) {
                objO = k3.c.g(c0161dA2);
            } else {
                ph.m mVar = new ph.m(1, ah.p.c(this));
                c0161dA2.a(new k3.i(c0161dA2, mVar), k3.e.f15973a);
                mVar.s(new k3.f(c0161dA2, 0));
                objO = mVar.o();
                ug.a aVar2 = ug.a.f29706a;
            }
            return objO == aVar ? aVar : objO;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause != null) {
                throw cause;
            }
            pg.h hVar = new pg.h();
            kotlin.jvm.internal.r.g(hVar, kotlin.jvm.internal.r.class.getName());
            throw hVar;
        }
    }
}
