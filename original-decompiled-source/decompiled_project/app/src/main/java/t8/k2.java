package t8;

import android.net.Uri;
import b9.e3;
import java.io.File;
import s8.e2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionScreenKt$AiSessionScreen$10$1$2$1$4$7$1$5$1$1", f = "AiSessionScreen.kt", l = {294}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f28274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f28275c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f28276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(m3 m3Var, Long l10, p5.x xVar, x0.n1 n1Var, tg.e eVar) {
        super(2, eVar);
        this.f28274b = m3Var;
        this.f28275c = l10;
        this.f28276d = xVar;
        this.f28277e = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new k2(this.f28274b, this.f28275c, this.f28276d, this.f28277e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((k2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28273a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f28273a = 1;
            obj = this.f28274b.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        File file = (File) obj;
        if (file == null) {
            return pg.f0.f21461a;
        }
        mh.k kVar = v2.f28495e;
        String str = ((b3) this.f28277e.getValue()).f28113c;
        if (str == null) {
            str = "";
        }
        b9.e3.f3796a = new e3.a(str, e3.b.f3813c, null, null, Uri.fromFile(file), null, null, null, null, 0, false, this.f28275c, 7660);
        p5.x.c(e2.t.f24650c.f24627a, this.f28276d);
        return pg.f0.f21461a;
    }
}
