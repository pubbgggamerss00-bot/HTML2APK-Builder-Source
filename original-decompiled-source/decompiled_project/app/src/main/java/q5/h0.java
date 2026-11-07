package q5;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.concurrent.CancellationException;
import x0.k1;
import x0.n1;

@vg.e(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {523}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h0 extends vg.i implements eh.p<sh.f<? extends b.c>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f21968a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f21970c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f21971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k1 f21972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f21973f;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n1 f21974a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f21975b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k1 f21976c;

        public a(n1 n1Var, n1 n1Var2, k1 k1Var) {
            this.f21974a = n1Var;
            this.f21975b = n1Var2;
            this.f21976c = k1Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            b.c cVar = (b.c) obj;
            if (((List) this.f21974a.getValue()).size() > 1) {
                this.f21975b.setValue(Boolean.TRUE);
                this.f21976c.e(cVar.f3219c);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e eVar, n1 n1Var, k1 k1Var, n1 n1Var2, tg.e eVar2) {
        super(2, eVar2);
        this.f21970c = eVar;
        this.f21971d = n1Var;
        this.f21972e = k1Var;
        this.f21973f = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        h0 h0Var = new h0(this.f21970c, this.f21971d, this.f21972e, this.f21973f, eVar);
        h0Var.f21969b = obj;
        return h0Var;
    }

    @Override // eh.p
    public final Object invoke(sh.f<? extends b.c> fVar, tg.e<? super pg.f0> eVar) {
        return ((h0) create(fVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        p5.s sVar;
        p5.s sVar2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f21968a;
        n1<Boolean> n1Var = this.f21973f;
        e eVar = this.f21970c;
        n1 n1Var2 = this.f21971d;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                sh.f fVar = (sh.f) this.f21969b;
                int size = ((List) n1Var2.getValue()).size();
                k1 k1Var = this.f21972e;
                if (size > 1) {
                    k1Var.e(CropImageView.DEFAULT_ASPECT_RATIO);
                    sVar = (p5.s) qg.x.K((List) n1Var2.getValue());
                    kotlin.jvm.internal.r.b(sVar);
                    eVar.b().i(sVar);
                    eVar.b().i((p5.s) ((List) n1Var2.getValue()).get(((List) n1Var2.getValue()).size() - 2));
                } else {
                    sVar = null;
                }
                a aVar2 = new a(n1Var2, n1Var, k1Var);
                this.f21969b = sVar;
                this.f21968a = 1;
                if (fVar.b(aVar2, this) == aVar) {
                    return aVar;
                }
                sVar2 = sVar;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar2 = (p5.s) this.f21969b;
                pg.q.b(obj);
            }
            if (((List) n1Var2.getValue()).size() > 1) {
                n1Var.setValue(Boolean.FALSE);
                kotlin.jvm.internal.r.b(sVar2);
                eVar.e(sVar2, false);
            }
        } catch (CancellationException unused) {
            if (((List) n1Var2.getValue()).size() > 1) {
                n1Var.setValue(Boolean.FALSE);
            }
        }
        return pg.f0.f21461a;
    }
}
