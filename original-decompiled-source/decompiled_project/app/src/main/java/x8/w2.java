package x8;

import android.content.Context;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$10$1$ProjectList$2$1$10$5$1$2", f = "HomeScreen.kt", l = {825}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w2 extends vg.i implements eh.p<q8.w0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33308a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f33310c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f33311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f33312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f33313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f33314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33315h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p5.x f33316j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f33317k;

    public static final class a implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ProjectEntity f33318a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p5.x f33319b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f33320c;

        public a(Context context, ProjectEntity projectEntity, p5.x xVar) {
            this.f33318a = projectEntity;
            this.f33319b = xVar;
            this.f33320c = context;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            g5.y(this.f33320c, this.f33318a, this.f33319b);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(p1.e eVar, long j10, float f10, boolean z10, String str, ProjectEntity projectEntity, p5.x xVar, Context context, tg.e<? super w2> eVar2) {
        super(2, eVar2);
        this.f33310c = eVar;
        this.f33311d = j10;
        this.f33312e = f10;
        this.f33313f = z10;
        this.f33314g = str;
        this.f33315h = projectEntity;
        this.f33316j = xVar;
        this.f33317k = context;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        w2 w2Var = new w2(this.f33310c, this.f33311d, this.f33312e, this.f33313f, this.f33314g, this.f33315h, this.f33316j, this.f33317k, eVar);
        w2Var.f33309b = obj;
        return w2Var;
    }

    @Override // eh.p
    public final Object invoke(q8.w0 w0Var, tg.e<? super pg.f0> eVar) {
        return ((w2) create(w0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33308a;
        if (i10 == 0) {
            pg.q.b(obj);
            q8.w0 w0Var = (q8.w0) this.f33309b;
            a aVar2 = new a(this.f33317k, this.f33315h, this.f33316j);
            this.f33308a = 1;
            if (w0Var.b(this.f33310c, this.f33311d, this.f33312e, this.f33313f, this.f33314g, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
