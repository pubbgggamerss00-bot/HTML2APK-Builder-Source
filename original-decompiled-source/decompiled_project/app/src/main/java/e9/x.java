package e9;

import android.net.Uri;
import com.basitce.htmltoapk.domain.model.BuildState;
import s8.e2;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildProgressScreenKt$BuildProgressScreen$6$1", f = "BuildProgressScreen.kt", l = {159, 160}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public String f8593a;

    /* renamed from: b, reason: collision with root package name */
    public int f8594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.x f8595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f8596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f8597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1 f8598f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p5.x xVar, androidx.lifecycle.t tVar, long j10, n1 n1Var, tg.e eVar) {
        super(2, eVar);
        this.f8595c = xVar;
        this.f8596d = tVar;
        this.f8597e = j10;
        this.f8598f = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new x(this.f8595c, this.f8596d, this.f8597e, this.f8598f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((x) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        if (s8.b2.b(r5.f8595c, r5.f8596d, r6, r1, r5) != r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String outputPath;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f8594b;
        if (i10 == 0) {
            pg.q.b(obj);
            n1 n1Var = this.f8598f;
            if (((BuildState) n1Var.getValue()) instanceof BuildState.Success) {
                BuildState buildState = (BuildState) n1Var.getValue();
                kotlin.jvm.internal.r.c(buildState, "null cannot be cast to non-null type com.basitce.htmltoapk.domain.model.BuildState.Success");
                outputPath = ((BuildState.Success) buildState).getOutputPath();
                this.f8593a = outputPath;
                this.f8594b = 1;
                if (ph.t0.b(750L, this) != aVar) {
                    e2.d.f24634c.getClass();
                    kotlin.jvm.internal.r.e(outputPath, "outputPath");
                    String str = "build_output/" + this.f8597e + "?outputPath=" + Uri.encode(outputPath);
                    w wVar = new w(0);
                    this.f8593a = null;
                    this.f8594b = 2;
                }
                return aVar;
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        outputPath = this.f8593a;
        pg.q.b(obj);
        e2.d.f24634c.getClass();
        kotlin.jvm.internal.r.e(outputPath, "outputPath");
        String str2 = "build_output/" + this.f8597e + "?outputPath=" + Uri.encode(outputPath);
        w wVar2 = new w(0);
        this.f8593a = null;
        this.f8594b = 2;
    }
}
