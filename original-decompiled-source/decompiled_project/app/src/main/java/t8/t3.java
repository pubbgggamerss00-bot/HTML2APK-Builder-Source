package t8;

import com.google.android.gms.tasks.Task;
import com.google.protobuf.DescriptorProtos;
import f9.ic;
import java.util.regex.Pattern;
import pg.p;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel$report$1", f = "AiSessionViewModel.kt", l = {231}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28468a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f28470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic f28472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae.m f28473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f28474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f28475h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f28476j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(m3 m3Var, int i10, ic icVar, ae.m mVar, String str, String str2, String str3, tg.e eVar) {
        super(2, eVar);
        this.f28470c = m3Var;
        this.f28471d = i10;
        this.f28472e = icVar;
        this.f28473f = mVar;
        this.f28474g = str;
        this.f28475h = str2;
        this.f28476j = str3;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        t3 t3Var = new t3(this.f28470c, this.f28471d, this.f28472e, this.f28473f, this.f28474g, this.f28475h, this.f28476j, eVar);
        t3Var.f28469b = obj;
        return t3Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((t3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28468a;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                ae.m mVar = this.f28473f;
                String str = this.f28474g;
                String str2 = this.f28475h;
                String text = this.f28476j;
                ae.w wVarA = mVar.a("reportOutput");
                pg.n nVar = new pg.n("sessionId", str);
                pg.n nVar2 = new pg.n("turnId", str2);
                kotlin.jvm.internal.r.e(text, "text");
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u0008\\u000B-\\u001F\\u007F-\\u009F\\u200B-\\u200F\\u202A-\\u202E\\u2066-\\u2069]");
                kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(text).replaceAll("");
                kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                Task taskA = wVarA.a(qg.k0.d(nVar, nVar2, new pg.n("reason", mh.y.b0(DescriptorProtos.Edition.EDITION_2023_VALUE, mh.x.W(strReplaceAll).toString()))));
                this.f28468a = 1;
                obj = g8.c.a(taskA, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            objA = (ae.x) obj;
        } catch (Throwable th2) {
            objA = pg.q.a(th2);
        }
        boolean z10 = objA instanceof p.a;
        boolean z11 = !z10;
        if (!z10) {
            this.f28470c.o(this.f28471d, new h7.d(1));
        }
        this.f28472e.invoke(Boolean.valueOf(z11));
        return pg.f0.f21461a;
    }
}
