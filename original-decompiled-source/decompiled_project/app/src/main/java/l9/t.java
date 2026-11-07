package l9;

import java.io.File;
import pg.p;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.util.FileBackedTextStateKt$fileBackedTextState$restoration$1", f = "FileBackedTextState.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends vg.i implements eh.p<ph.i0, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f16891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f16893c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f16894d;

    @vg.e(c = "com.basitce.htmltoapk.util.FileBackedTextStateKt$fileBackedTextState$restoration$1$stored$1", f = "FileBackedTextState.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f16895a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f16896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f16896b = file;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f16896b, eVar);
            aVar.f16895a = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super String> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            File file = this.f16896b;
            if (!file.isFile()) {
                return null;
            }
            try {
                objA = ah.l.k(file, mh.a.f18238b);
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            return (String) (objA instanceof p.a ? null : objA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, z0 z0Var, File file, tg.e eVar) {
        super(2, eVar);
        this.f16892b = str;
        this.f16893c = z0Var;
        this.f16894d = file;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new t(this.f16892b, this.f16893c, this.f16894d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Boolean> eVar) {
        return ((t) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f16891a;
        boolean z10 = true;
        if (i10 == 0) {
            pg.q.b(obj);
            if (this.f16892b == null) {
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(this.f16894d, null);
                this.f16891a = 1;
                obj = ph.h.e(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z10);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        String str = (String) obj;
        if (str != null) {
            z0 z0Var = this.f16893c;
            if (((CharSequence) z0Var.getValue()).length() == 0) {
                z0Var.j(null, str);
            }
        }
        if (str == null) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
