package x0;

/* loaded from: classes.dex */
public final class n2 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.m0<Object> f31821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f31822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(p.m0<Object> m0Var, f0 f0Var) {
        super(0);
        this.f31821a = m0Var;
        this.f31822b = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke() {
        p.m0<Object> m0Var = this.f31821a;
        Object[] objArr = m0Var.f20753b;
        long[] jArr = m0Var.f20752a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            this.f31822b.o(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
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
        return pg.f0.f21461a;
    }
}
