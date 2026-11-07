package q5;

import java.util.Iterator;
import java.util.List;
import p5.s0;
import s.y1;
import x0.r3;
import x0.x1;

@vg.e(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1<p5.s> f22023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f22024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.e0<String> f22025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3<List<p5.s>> f22026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f22027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(y1<p5.s> y1Var, s0 s0Var, p.e0<String> e0Var, r3<? extends List<p5.s>> r3Var, e eVar, tg.e<? super n0> eVar2) {
        super(2, eVar2);
        this.f22023a = y1Var;
        this.f22024b = s0Var;
        this.f22025c = e0Var;
        this.f22026d = r3Var;
        this.f22027e = eVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new n0(this.f22023a, this.f22024b, this.f22025c, this.f22026d, this.f22027e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((n0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        char c10;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        y1<p5.s> y1Var = this.f22023a;
        Object objV = y1Var.f24001a.V();
        x1 x1Var = y1Var.f24004d;
        if (kotlin.jvm.internal.r.a(objV, x1Var.getValue())) {
            s0 s0Var = this.f22024b;
            if (s0Var.f21304b.g() == null || kotlin.jvm.internal.r.a(x1Var.getValue(), s0Var.f21304b.g())) {
                Iterator<T> it = this.f22026d.getValue().iterator();
                while (it.hasNext()) {
                    this.f22027e.b().f((p5.s) it.next());
                }
                p.e0<String> e0Var = this.f22025c;
                long[] jArr = e0Var.f20604a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        char c11 = 7;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j10 & 255) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj2 = e0Var.f20605b[i13];
                                    c10 = c11;
                                    float f10 = e0Var.f20606c[i13];
                                    if (!kotlin.jvm.internal.r.a((String) obj2, ((p5.s) x1Var.getValue()).f21273f)) {
                                        e0Var.f20608e--;
                                        long[] jArr2 = e0Var.f20604a;
                                        int i14 = e0Var.f20607d;
                                        int i15 = i13 >> 3;
                                        int i16 = (i13 & 7) << 3;
                                        long j11 = (jArr2[i15] & (~(255 << i16))) | (254 << i16);
                                        jArr2[i15] = j11;
                                        jArr2[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j11;
                                        e0Var.f20605b[i13] = null;
                                    }
                                } else {
                                    c10 = c11;
                                }
                                j10 >>= 8;
                                i12++;
                                c11 = c10;
                            }
                            if (i11 != 8) {
                                break;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}
