package u6;

import android.content.Context;
import android.os.Build;
import androidx.work.c;
import androidx.work.impl.model.WorkSpec;
import e7.c;
import k3.d;

@vg.e(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {300, 311}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e1 extends vg.i implements eh.p<ph.i0, tg.e<? super c.a>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f29288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.work.c f29289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d7.z f29290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(z0 z0Var, androidx.work.c cVar, d7.z zVar, tg.e eVar) {
        super(2, eVar);
        this.f29288b = z0Var;
        this.f29289c = cVar;
        this.f29290d = zVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new e1(this.f29288b, this.f29289c, this.f29290d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super c.a> eVar) {
        return ((e1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE;
        z0 z0Var = this.f29288b;
        WorkSpec workSpec = z0Var.f29365a;
        Object obj2 = ug.a.f29706a;
        int i10 = this.f29287a;
        androidx.work.c cVar = this.f29289c;
        if (i10 == 0) {
            pg.q.b(obj);
            Context context = z0Var.f29366b;
            e7.c cVar2 = z0Var.f29368d;
            this.f29287a = 1;
            String str = d7.x.f7412a;
            if (!workSpec.f3183q || Build.VERSION.SDK_INT >= 31) {
                objE = pg.f0.f21461a;
            } else {
                c.a aVar = cVar2.f8401d;
                kotlin.jvm.internal.r.d(aVar, "taskExecutor.mainThreadExecutor");
                objE = ph.h.e(bg.b.g(aVar), new d7.w(cVar, workSpec, this.f29290d, context, null), this);
                if (objE != obj2) {
                    objE = pg.f0.f21461a;
                }
            }
            if (objE != obj2) {
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
        String str2 = g1.f29296a;
        t6.s.d().a(str2, "Starting work for " + workSpec.f3169c);
        d.C0161d c0161dB = cVar.b();
        this.f29287a = 2;
        Object objA = g1.a(c0161dB, cVar, this);
        return objA == obj2 ? obj2 : objA;
    }
}
