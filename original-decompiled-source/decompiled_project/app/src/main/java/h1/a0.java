package h1;

import h1.z;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f12085a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar) {
        super(0);
        this.f12085a = zVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 invoke() {
        z.a[] aVarArr;
        int i10;
        do {
            z zVar = this.f12085a;
            synchronized (zVar.f12200g) {
                try {
                    if (!zVar.f12196c) {
                        zVar.f12196c = true;
                        try {
                            z0.b<z.a> bVar = zVar.f12199f;
                            z.a[] aVarArr2 = bVar.f34700a;
                            int i11 = bVar.f34702c;
                            int i12 = 0;
                            while (i12 < i11) {
                                z.a aVar = aVarArr2[i12];
                                p.m0<Object> m0Var = aVar.f12210g;
                                eh.l<Object, pg.f0> lVar = aVar.f12204a;
                                Object[] objArr = m0Var.f20753b;
                                long[] jArr = m0Var.f20752a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j10 = jArr[i13];
                                        aVarArr = aVarArr2;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8;
                                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j10 & 255) < 128) {
                                                    i10 = i14;
                                                    lVar.invoke(objArr[(i13 << 3) + i16]);
                                                } else {
                                                    i10 = i14;
                                                }
                                                j10 >>= i10;
                                                i16++;
                                                i14 = i10;
                                            }
                                            if (i15 != i14) {
                                                break;
                                            }
                                            if (i13 == length) {
                                                break;
                                            }
                                            i13++;
                                            aVarArr2 = aVarArr;
                                        }
                                    }
                                } else {
                                    aVarArr = aVarArr2;
                                }
                                m0Var.e();
                                i12++;
                                aVarArr2 = aVarArr;
                            }
                            zVar.f12196c = false;
                        } catch (Throwable th2) {
                            zVar.f12196c = false;
                            throw th2;
                        }
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (z.a(this.f12085a));
        return pg.f0.f21461a;
    }
}
