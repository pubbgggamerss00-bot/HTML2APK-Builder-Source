package t0;

import com.google.protobuf.DescriptorProtos;
import x.o;

@vg.e(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {989, DescriptorProtos.Edition.EDITION_PROTO2_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f26559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<f3.h, s.o> f26560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f26563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.k f26564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s.b<f3.h, s.o> bVar, float f10, boolean z10, p0 p0Var, x.k kVar, tg.e<? super o0> eVar) {
        super(2, eVar);
        this.f26560b = bVar;
        this.f26561c = f10;
        this.f26562d = z10;
        this.f26563e = p0Var;
        this.f26564f = kVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o0(this.f26560b, this.f26561c, this.f26562d, this.f26563e, this.f26564f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r8.f(r1, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (u0.g0.a(r8, r4, r1, r7.f26564f, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f26559a;
        if (i10 == 0) {
            pg.q.b(obj);
            s.b<f3.h, s.o> bVar = this.f26560b;
            float f10 = ((f3.h) bVar.f23656e.getValue()).f8817a;
            float f11 = this.f26561c;
            if (!f3.h.a(f10, f11)) {
                if (this.f26562d) {
                    float f12 = ((f3.h) bVar.f23656e.getValue()).f8817a;
                    p0 p0Var = this.f26563e;
                    x.k bVar2 = f3.h.a(f12, p0Var.f26658b) ? new o.b(0L) : f3.h.a(f12, p0Var.f26660d) ? new x.i() : f3.h.a(f12, p0Var.f26659c) ? new x.e() : null;
                    this.f26559a = 2;
                } else {
                    f3.h hVar = new f3.h(f11);
                    this.f26559a = 1;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
