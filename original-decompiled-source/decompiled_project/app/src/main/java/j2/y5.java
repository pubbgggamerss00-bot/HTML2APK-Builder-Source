package j2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import rh.c;

@vg.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {114, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y5 extends vg.i implements eh.p<sh.g<? super Float>, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public rh.j f14992a;

    /* renamed from: b, reason: collision with root package name */
    public int f14993b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f14995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f14996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z5 f14997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rh.c f14998g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f14999h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(ContentResolver contentResolver, Uri uri, z5 z5Var, rh.c cVar, Context context, tg.e eVar) {
        super(2, eVar);
        this.f14995d = contentResolver;
        this.f14996e = uri;
        this.f14997f = z5Var;
        this.f14998g = cVar;
        this.f14999h = context;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        y5 y5Var = new y5(this.f14995d, this.f14996e, this.f14997f, this.f14998g, this.f14999h, eVar);
        y5Var.f14994c = obj;
        return y5Var;
    }

    @Override // eh.p
    public final Object invoke(sh.g<? super Float> gVar, tg.e<? super pg.f0> eVar) {
        return ((y5) create(gVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.c(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Type inference failed for: r1v7, types: [rh.j] */
    /* JADX WARN: Type inference failed for: r1v8, types: [rh.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        sh.g gVar;
        c.a aVar;
        sh.g gVar2;
        c.a aVar2;
        Object objA;
        ug.a aVar3 = ug.a.f29706a;
        int i10 = this.f14993b;
        z5 z5Var = this.f14997f;
        ContentResolver contentResolver = this.f14995d;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                gVar = (sh.g) this.f14994c;
                contentResolver.registerContentObserver(this.f14996e, false, z5Var);
                aVar = new c.a();
                this.f14994c = gVar;
                this.f14992a = aVar;
                this.f14993b = 1;
                objA = aVar.a(this);
                if (objA != aVar3) {
                }
            } else if (i10 == 1) {
                ?? r12 = this.f14992a;
                gVar2 = (sh.g) this.f14994c;
                pg.q.b(obj);
                aVar2 = r12;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r13 = this.f14992a;
                gVar2 = (sh.g) this.f14994c;
                pg.q.b(obj);
                c.a aVar4 = r13;
                gVar = gVar2;
                aVar = aVar4;
                this.f14994c = gVar;
                this.f14992a = aVar;
                this.f14993b = 1;
                objA = aVar.a(this);
                if (objA != aVar3) {
                    return aVar3;
                }
                c.a aVar5 = aVar;
                gVar2 = gVar;
                obj = objA;
                aVar2 = aVar5;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(z5Var);
                    return pg.f0.f21461a;
                }
                aVar2.next();
                Float f10 = new Float(Settings.Global.getFloat(this.f14999h.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f14994c = gVar2;
                this.f14992a = aVar2;
                this.f14993b = 2;
                aVar4 = aVar2;
            }
        } catch (Throwable th2) {
            contentResolver.unregisterContentObserver(z5Var);
            throw th2;
        }
    }
}
