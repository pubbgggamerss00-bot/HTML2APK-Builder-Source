package x8;

import android.content.Context;
import android.net.Uri;
import com.basitce.htmltoapk.R;
import x8.j6;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$importProjectZip$1", f = "HomeViewModel.kt", l = {816}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32569a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j6 f32571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f32572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f32573e;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$importProjectZip$1$result$1$1", f = "HomeViewModel.kt", l = {817}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f32574a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j6 f32575b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f32576c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f32577d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j6 j6Var, Context context, Uri uri, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f32575b = j6Var;
            this.f32576c = context;
            this.f32577d = uri;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f32575b, this.f32576c, this.f32577d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super String> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f32574a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            this.f32574a = 1;
            Object objJ = j6.j(this.f32575b, this.f32576c, this.f32577d, this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(j6 j6Var, Context context, Uri uri, tg.e<? super e7> eVar) {
        super(2, eVar);
        this.f32571c = j6Var;
        this.f32572d = context;
        this.f32573e = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        e7 e7Var = new e7(this.f32571c, this.f32572d, this.f32573e, eVar);
        e7Var.f32570b = obj;
        return e7Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((e7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        j6 j6Var = this.f32571c;
        sh.z0 z0Var = j6Var.f32798y;
        sh.z0 z0Var2 = j6Var.C;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32569a;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                Boolean bool = Boolean.TRUE;
                z0Var2.getClass();
                z0Var2.j(null, bool);
                Context context = this.f32572d;
                Uri uri = this.f32573e;
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(j6Var, context, uri, null);
                this.f32569a = 1;
                obj = ph.h.e(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            objA = (String) obj;
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        Boolean bool2 = Boolean.FALSE;
        z0Var2.getClass();
        z0Var2.j(null, bool2);
        Throwable thA = pg.p.a(objA);
        if (thA == null) {
            String string = j6Var.F().getString(R.string.home_import_success, (String) objA);
            kotlin.jvm.internal.r.d(string, "getString(...)");
            j6.c cVar2 = new j6.c(string, false);
            z0Var.getClass();
            z0Var.j(null, cVar2);
        } else {
            String message = thA.getMessage();
            if (message == null) {
                message = j6Var.F().getString(R.string.home_import_error);
                kotlin.jvm.internal.r.d(message, "getString(...)");
            }
            j6.c cVar3 = new j6.c(message, true);
            z0Var.getClass();
            z0Var.j(null, cVar3);
        }
        return pg.f0.f21461a;
    }
}
