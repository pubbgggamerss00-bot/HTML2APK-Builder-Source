package h1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements Iterable<Long>, fh.a {

    /* renamed from: e, reason: collision with root package name */
    public static final l f12135e = new l(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f12136a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12137b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12138c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f12139d;

    @vg.e(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<lh.i<? super Long>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long[] f12140a;

        /* renamed from: b, reason: collision with root package name */
        public int f12141b;

        /* renamed from: c, reason: collision with root package name */
        public int f12142c;

        /* renamed from: d, reason: collision with root package name */
        public int f12143d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f12144e;

        public a(tg.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = l.this.new a(eVar);
            aVar.f12144e = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(lh.i<? super Long> iVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(iVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:26:0x009a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            lh.i iVar;
            long[] jArr;
            int length;
            int i10;
            lh.i iVar2;
            int i11;
            lh.i iVar3;
            int i12;
            l lVar = l.this;
            long j10 = lVar.f12136a;
            long j11 = lVar.f12138c;
            long j12 = lVar.f12137b;
            ug.a aVar = ug.a.f29706a;
            int i13 = this.f12143d;
            if (i13 == 0) {
                pg.q.b(obj);
                iVar = (lh.i) this.f12144e;
                jArr = lVar.f12139d;
                if (jArr != null) {
                    length = jArr.length;
                    i10 = 0;
                }
                if (j12 != 0) {
                    iVar2 = iVar;
                    i11 = 0;
                    if (i11 >= 64) {
                    }
                }
                if (j10 != 0) {
                }
                return pg.f0.f21461a;
            }
            if (i13 == 1) {
                length = this.f12142c;
                int i14 = this.f12141b;
                jArr = this.f12140a;
                iVar = (lh.i) this.f12144e;
                pg.q.b(obj);
                i10 = i14 + 1;
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = this.f12141b;
                    iVar3 = (lh.i) this.f12144e;
                    pg.q.b(obj);
                    i12++;
                    if (i12 < 64) {
                        if (((1 << i12) & j10) != 0) {
                            Long l10 = new Long(j11 + i12 + 64);
                            this.f12144e = iVar3;
                            this.f12140a = null;
                            this.f12141b = i12;
                            this.f12143d = 3;
                            iVar3.c(l10, this);
                            ug.a aVar2 = ug.a.f29706a;
                            return aVar;
                        }
                        i12++;
                        if (i12 < 64) {
                        }
                    }
                    return pg.f0.f21461a;
                }
                i11 = this.f12141b;
                iVar2 = (lh.i) this.f12144e;
                pg.q.b(obj);
                i11++;
                if (i11 >= 64) {
                    iVar = iVar2;
                    if (j10 != 0) {
                        iVar3 = iVar;
                        i12 = 0;
                        if (i12 < 64) {
                        }
                    }
                    return pg.f0.f21461a;
                }
                if (((1 << i11) & j12) != 0) {
                    Long l11 = new Long(j11 + i11);
                    this.f12144e = iVar2;
                    this.f12140a = null;
                    this.f12141b = i11;
                    this.f12143d = 2;
                    iVar2.c(l11, this);
                    ug.a aVar3 = ug.a.f29706a;
                    return aVar;
                }
                i11++;
                if (i11 >= 64) {
                }
            }
            if (i10 < length) {
                Long l12 = new Long(jArr[i10]);
                this.f12144e = iVar;
                this.f12140a = jArr;
                this.f12141b = i10;
                this.f12142c = length;
                this.f12143d = 1;
                iVar.c(l12, this);
                return aVar;
            }
            if (j12 != 0) {
            }
            if (j10 != 0) {
            }
            return pg.f0.f21461a;
        }
    }

    public l(long j10, long j11, long j12, long[] jArr) {
        this.f12136a = j10;
        this.f12137b = j11;
        this.f12138c = j12;
        this.f12139d = jArr;
    }

    public final l c(l lVar) {
        l lVarE;
        long j10;
        long[] jArr;
        l lVar2 = f12135e;
        if (lVar == lVar2) {
            return this;
        }
        if (this == lVar2) {
            return lVar2;
        }
        long j11 = lVar.f12138c;
        long j12 = lVar.f12138c;
        long[] jArr2 = lVar.f12139d;
        long j13 = lVar.f12137b;
        long j14 = lVar.f12136a;
        long j15 = this.f12138c;
        if (j11 == j15 && jArr2 == (jArr = this.f12139d)) {
            return new l(this.f12136a & (~j14), this.f12137b & (~j13), j15, jArr);
        }
        if (jArr2 != null) {
            lVarE = this;
            for (long j16 : jArr2) {
                lVarE = lVarE.e(j16);
            }
        } else {
            lVarE = this;
        }
        long j17 = 0;
        if (j13 != 0) {
            int i10 = 0;
            while (i10 < 64) {
                if (((1 << i10) & j13) != j17) {
                    j10 = j17;
                    lVarE = lVarE.e(i10 + j12);
                } else {
                    j10 = j17;
                }
                i10++;
                j17 = j10;
            }
        }
        long j18 = j17;
        if (j14 != j18) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j14) != j18) {
                    lVarE = lVarE.e(i11 + j12 + 64);
                }
            }
        }
        return lVarE;
    }

    public final l e(long j10) {
        long[] jArr;
        int iB;
        long[] jArr2;
        long j11 = this.f12138c;
        long j12 = j10 - j11;
        if (j12 >= 0 && j12 < 64) {
            long j13 = 1 << ((int) j12);
            long j14 = this.f12137b;
            if ((j14 & j13) != 0) {
                return new l(this.f12136a, j14 & (~j13), j11, this.f12139d);
            }
        } else if (j12 >= 64 && j12 < 128) {
            long j15 = 1 << (((int) j12) - 64);
            long j16 = this.f12136a;
            if ((j16 & j15) != 0) {
                return new l(j16 & (~j15), this.f12137b, j11, this.f12139d);
            }
        } else if (j12 < 0 && (jArr = this.f12139d) != null && (iB = m.b(jArr, j10)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (iB > 0) {
                    qg.m.e(0, jArr, 0, jArr3, iB);
                }
                if (iB < i10) {
                    qg.m.e(iB, jArr, iB + 1, jArr3, length);
                }
                jArr2 = jArr3;
            }
            return new l(this.f12136a, this.f12137b, this.f12138c, jArr2);
        }
        return this;
    }

    public final boolean f(long j10) {
        long[] jArr;
        long j11 = j10 - this.f12138c;
        return (j11 < 0 || j11 >= 64) ? (j11 < 64 || j11 >= 128) ? j11 <= 0 && (jArr = this.f12139d) != null && m.b(jArr, j10) >= 0 : ((1 << (((int) j11) + (-64))) & this.f12136a) != 0 : ((1 << ((int) j11)) & this.f12137b) != 0;
    }

    public final l g(l lVar) {
        l lVarI;
        l lVarI2;
        long[] jArr;
        l lVar2 = f12135e;
        if (lVar == lVar2) {
            return this;
        }
        if (this == lVar2) {
            return lVar;
        }
        long j10 = lVar.f12138c;
        long j11 = lVar.f12138c;
        long[] jArr2 = lVar.f12139d;
        long j12 = lVar.f12137b;
        long j13 = lVar.f12136a;
        long j14 = this.f12138c;
        long j15 = this.f12137b;
        long j16 = this.f12136a;
        if (j10 == j14 && jArr2 == (jArr = this.f12139d)) {
            return new l(j16 | j13, j15 | j12, j14, jArr);
        }
        int i10 = 0;
        long[] jArr3 = this.f12139d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                lVarI = this;
                for (long j17 : jArr2) {
                    lVarI = lVarI.i(j17);
                }
            } else {
                lVarI = this;
            }
            if (j12 != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if (((1 << i11) & j12) != 0) {
                        lVarI = lVarI.i(i11 + j11);
                    }
                }
            }
            if (j13 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j13) != 0) {
                        lVarI = lVarI.i(i10 + j11 + 64);
                    }
                    i10++;
                }
            }
            return lVarI;
        }
        if (jArr3 != null) {
            lVarI2 = lVar;
            for (long j18 : jArr3) {
                lVarI2 = lVarI2.i(j18);
            }
        } else {
            lVarI2 = lVar;
        }
        long j19 = this.f12138c;
        if (j15 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j15) != 0) {
                    lVarI2 = lVarI2.i(i12 + j19);
                }
            }
        }
        if (j16 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j16) != 0) {
                    lVarI2 = lVarI2.i(i10 + j19 + 64);
                }
                i10++;
            }
        }
        return lVarI2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l i(long j10) {
        long j11;
        long[] jArr;
        long j12;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j13 = this.f12138c;
        long j14 = j10 - j13;
        long j15 = this.f12136a;
        long j16 = this.f12137b;
        long[] jArr5 = this.f12139d;
        if (j14 < 0 || j14 >= 64) {
            int i10 = 64;
            if (j14 >= 64 && j14 < 128) {
                long j17 = 1 << (((int) j14) - 64);
                if ((j15 & j17) == 0) {
                    return new l(j17 | j15, j16, j13, jArr5);
                }
            } else if (j14 < 128) {
                if (jArr5 == null) {
                    return new l(j15, j16, j13, new long[]{j10});
                }
                int iB = m.b(jArr5, j10);
                if (iB < 0) {
                    int i11 = -(iB + 1);
                    int length = jArr5.length;
                    long[] jArr6 = new long[length + 1];
                    qg.m.e(0, jArr5, 0, jArr6, i11);
                    qg.m.e(i11 + 1, jArr5, i11, jArr6, length);
                    jArr6[i11] = j10;
                    return new l(this.f12136a, this.f12137b, this.f12138c, jArr6);
                }
            } else if (!f(j10)) {
                long j18 = 64;
                long j19 = ((j10 + 1) / j18) * j18;
                if (j19 < 0) {
                    j19 = 9223372036854775680L;
                }
                long j20 = this.f12138c;
                long j21 = j15;
                k kVar = null;
                while (true) {
                    if (j20 >= j19) {
                        j11 = j20;
                        jArr = jArr5;
                        j12 = j16;
                        break;
                    }
                    if (j16 != 0) {
                        if (kVar == null) {
                            kVar = new k(jArr5);
                        }
                        int i12 = 0;
                        while (i12 < i10) {
                            if ((j16 & (1 << i12)) != 0) {
                                jArr4 = jArr5;
                                kVar.f12132a.a(i12 + j20);
                            } else {
                                jArr4 = jArr5;
                            }
                            i12++;
                            jArr5 = jArr4;
                            i10 = 64;
                        }
                    }
                    long[] jArr7 = jArr5;
                    if (j21 == 0) {
                        j11 = j19;
                        j12 = 0;
                        jArr = jArr7;
                        break;
                    }
                    j20 += j18;
                    jArr5 = jArr7;
                    j16 = j21;
                    i10 = 64;
                    j21 = 0;
                }
                if (kVar == null) {
                    jArr2 = jArr;
                } else {
                    p.b0 b0Var = kVar.f12132a;
                    int i13 = b0Var.f20573b;
                    if (i13 == 0) {
                        jArr3 = null;
                    } else {
                        jArr3 = new long[i13];
                        long[] jArr8 = b0Var.f20572a;
                        for (int i14 = 0; i14 < i13; i14++) {
                            jArr3[i14] = jArr8[i14];
                        }
                    }
                    if (jArr3 != null) {
                        jArr2 = jArr3;
                    }
                }
                return new l(j21, j12, j11, jArr2).i(j10);
            }
        } else {
            long j22 = 1 << ((int) j14);
            if ((j16 & j22) == 0) {
                return new l(j15, j16 | j22, j13, jArr5);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return e1.d.f(new a(null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(qg.p.h(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
