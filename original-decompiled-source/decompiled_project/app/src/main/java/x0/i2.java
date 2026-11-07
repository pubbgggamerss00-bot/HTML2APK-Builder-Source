package x0;

/* loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.s implements eh.l<r, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f31712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p.f0<Object> f31714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(h2 h2Var, int i10, p.f0<Object> f0Var) {
        super(1);
        this.f31712a = h2Var;
        this.f31713b = i10;
        this.f31714c = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final pg.f0 invoke(r rVar) {
        r rVar2;
        r rVar3;
        int i10;
        r rVar4 = rVar;
        h2 h2Var = this.f31712a;
        int i11 = h2Var.f31704e;
        int i12 = this.f31713b;
        if (i11 == i12) {
            p.f0<Object> f0Var = h2Var.f31705f;
            p.f0<Object> f0Var2 = this.f31714c;
            if (kotlin.jvm.internal.r.a(f0Var2, f0Var) && (rVar4 instanceof v)) {
                long[] jArr = f0Var2.f20615a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j10 = jArr[i13];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((255 & j10) < 128) {
                                    int i17 = (i13 << 3) + i16;
                                    Object obj = f0Var2.f20616b[i17];
                                    boolean z10 = f0Var2.f20617c[i17] != i12;
                                    if (z10) {
                                        i10 = i14;
                                        v vVar = (v) rVar4;
                                        p.l0<Object, Object> l0Var = vVar.f31930g;
                                        z0.e.b(l0Var, obj, h2Var);
                                        rVar3 = rVar4;
                                        if (obj instanceof h0) {
                                            h0 h0Var = (h0) obj;
                                            if (!l0Var.b(h0Var)) {
                                                z0.e.c(vVar.f31933k, h0Var);
                                            }
                                            p.l0<h0<?>, Object> l0Var2 = h2Var.f31706g;
                                            if (l0Var2 != 0) {
                                                l0Var2.j(obj);
                                            }
                                        }
                                    } else {
                                        rVar3 = rVar4;
                                        i10 = i14;
                                    }
                                    if (z10) {
                                        f0Var2.g(i17);
                                    }
                                } else {
                                    rVar3 = rVar4;
                                    i10 = i14;
                                }
                                j10 >>= i10;
                                i16++;
                                i14 = i10;
                                rVar4 = rVar3;
                            }
                            rVar2 = rVar4;
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            rVar2 = rVar4;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        rVar4 = rVar2;
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}
