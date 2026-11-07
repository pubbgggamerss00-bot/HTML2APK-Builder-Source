package u;

import c2.b0;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import v.t1;

@vg.e(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", l = {EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION, 61}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends vg.h implements eh.p<c2.c, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28892a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<p1.c, f0> f28894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(eh.l<? super p1.c, f0> lVar, tg.e<? super j> eVar) {
        super(2, eVar);
        this.f28894c = lVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        j jVar = new j(this.f28894c, eVar);
        jVar.f28893b = obj;
        return jVar;
    }

    @Override // eh.p
    public final Object invoke(c2.c cVar, tg.e<? super f0> eVar) {
        return ((j) create(cVar, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c2.c cVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28892a;
        if (i10 == 0) {
            pg.q.b(obj);
            cVar = (c2.c) this.f28893b;
            this.f28893b = cVar;
            this.f28892a = 1;
            obj = c2.y.b(cVar, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            b0 b0Var = (b0) obj;
            if (b0Var != null) {
                b0Var.a();
            }
            return f0.f21461a;
        }
        cVar = (c2.c) this.f28893b;
        pg.q.b(obj);
        b0 b0Var2 = (b0) obj;
        b0Var2.a();
        this.f28894c.invoke(new p1.c(b0Var2.f4595c));
        this.f28893b = null;
        this.f28892a = 2;
        t1.a aVar2 = t1.f30086a;
        obj = t1.i(cVar, c2.t.f4695b, this);
    }
}
