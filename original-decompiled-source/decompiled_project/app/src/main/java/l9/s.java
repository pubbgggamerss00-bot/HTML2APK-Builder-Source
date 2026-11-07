package l9;

import d0.q1;
import java.io.File;
import q8.h1;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.util.FileBackedTextStateKt$fileBackedTextState$1", f = "FileBackedTextState.kt", l = {49, 50}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f16882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.q0 f16883b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f16884c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f16885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f16886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f16887f;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f16888a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f16889b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f16890c;

        public a(File file, File file2, String str) {
            this.f16888a = file;
            this.f16889b = file2;
            this.f16890c = str;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) throws Throwable {
            String str = (String) obj;
            wh.c cVar = ph.z0.f21632a;
            Object objE = ph.h.e(wh.b.f31563c, new r(str, this.f16888a, this.f16889b, this.f16890c, null), eVar);
            return objE == ug.a.f29706a ? objE : pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ph.q0 q0Var, z0 z0Var, File file, File file2, String str, tg.e eVar) {
        super(2, eVar);
        this.f16883b = q0Var;
        this.f16884c = z0Var;
        this.f16885d = file;
        this.f16886e = file2;
        this.f16887f = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s(this.f16883b, this.f16884c, this.f16885d, this.f16886e, this.f16887f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((s) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r8 == r0) goto L18;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f16882a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f16882a = 1;
            if (this.f16883b.k(this) != obj2) {
            }
            return obj2;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        sh.k kVar = new sh.k(new h1(1), this.f16884c, null);
        a aVar = new a(this.f16885d, this.f16886e, this.f16887f);
        this.f16882a = 2;
        th.q qVar = new th.q(kVar, aVar, null);
        th.p pVar = new th.p(this, getContext());
        Object objB = q1.b(pVar, pVar, qVar);
        ug.a aVar2 = ug.a.f29706a;
        if (objB != ug.a.f29706a) {
            objB = pg.f0.f21461a;
        }
    }
}
