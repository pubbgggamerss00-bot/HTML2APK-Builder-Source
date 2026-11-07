package f9;

import android.net.Uri;
import java.io.IOException;
import s8.e2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorScreenKt$ProjectEditorScreen$1$1", f = "ProjectEditorScreen.kt", l = {199, 208, 214}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class gb extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f9704a;

    /* renamed from: b, reason: collision with root package name */
    public int f9705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg f9706c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f9708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f9709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p5.x f9710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f9711h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9712j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9713k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(fg fgVar, long j10, String str, boolean z10, p5.x xVar, androidx.lifecycle.t tVar, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, tg.e<? super gb> eVar) {
        super(2, eVar);
        this.f9706c = fgVar;
        this.f9707d = j10;
        this.f9708e = str;
        this.f9709f = z10;
        this.f9710g = xVar;
        this.f9711h = tVar;
        this.f9712j = n1Var;
        this.f9713k = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new gb(this.f9706c, this.f9707d, this.f9708e, this.f9709f, this.f9710g, this.f9711h, this.f9712j, this.f9713k, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((gb) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r0.n(r8, r13) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (ph.t0.b(50, r13) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (s8.b2.b(r13.f9710g, r13.f9711h, r14, new s8.b(), r13) == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ad -> B:41:0x00b0). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        int i10;
        fg fgVar = this.f9706c;
        sh.z0 z0Var = fgVar.F;
        ug.a aVar = ug.a.f29706a;
        int i11 = this.f9705b;
        x0.n1<Boolean> n1Var = this.f9713k;
        long j10 = this.f9707d;
        if (i11 == 0) {
            pg.q.b(obj);
            this.f9705b = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return pg.f0.f21461a;
                }
                i10 = this.f9704a;
                pg.q.b(obj);
                i10++;
                if (z0Var.getValue() == null || i10 >= 50) {
                    if (z0Var.getValue() != null) {
                        n1Var.setValue(Boolean.TRUE);
                        fgVar.v();
                        String strA = e2.l.f24642c.a(j10);
                        this.f9705b = 3;
                    }
                    return pg.f0.f21461a;
                }
                this.f9704a = i10;
                this.f9705b = 2;
                return aVar;
            }
            pg.q.b(obj);
        }
        if (j10 == 0) {
            String str = this.f9708e;
            if (!mh.x.A(str)) {
                x0.n1<Boolean> n1Var2 = this.f9712j;
                if (!n1Var2.getValue().booleanValue()) {
                    Uri uri = Uri.parse(str);
                    kotlin.jvm.internal.r.d(uri, "parse(...)");
                    fgVar.t(uri, new fb(n1Var2, 0));
                }
            }
        }
        if (this.f9709f && j10 != 0 && !n1Var.getValue().booleanValue()) {
            String str2 = (String) fgVar.f9600y.getValue();
            if (!kotlin.jvm.internal.r.a(str2, "local") && !kotlin.jvm.internal.r.a(str2, "paste")) {
                return pg.f0.f21461a;
            }
            i10 = 0;
            if (z0Var.getValue() == null) {
            }
            if (z0Var.getValue() != null) {
            }
        }
        return pg.f0.f21461a;
    }
}
