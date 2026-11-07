package mf;

import java.io.IOException;
import ve.p0;

/* loaded from: classes2.dex */
public final class l extends s {

    /* renamed from: g, reason: collision with root package name */
    public final hf.b f18211g;

    /* renamed from: h, reason: collision with root package name */
    public final p f18212h;

    /* renamed from: i, reason: collision with root package name */
    public final cf.d f18213i;

    /* renamed from: j, reason: collision with root package name */
    public final cf.d f18214j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18215a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f18216b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f18217c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f18218d;

        static {
            a aVar = new a("FIRST", 0);
            f18215a = aVar;
            a aVar2 = new a("BRACKET", 1);
            f18216b = aVar2;
            a aVar3 = new a("SERIAL", 2);
            f18217c = aVar3;
            f18218d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18218d.clone();
        }
    }

    public l(hf.b bVar, cf.d dVar, p0 p0Var, p pVar) throws IOException {
        int i10;
        cf.a aVar;
        super(bVar, dVar, p0Var);
        this.f18211g = bVar;
        this.f18213i = dVar;
        this.f18212h = pVar;
        cf.l lVar = cf.l.f5509q2;
        dVar.O0(lVar, cf.l.f5536x2);
        cf.l lVar2 = cf.l.f5529w;
        dVar.R0(lVar2, this.f18233c.a());
        dVar.O0(cf.l.f5526v0, cf.l.Y0);
        cf.d dVar2 = new cf.d();
        dVar2.O0(cf.l.f5532w2, cf.l.G0);
        dVar2.O0(lVar, cf.l.L);
        dVar2.R0(lVar2, this.f18233c.a());
        cf.d dVar3 = new cf.d();
        dVar3.S0(cf.l.V1, "Adobe");
        dVar3.S0(cf.l.E1, "Identity");
        dVar3.N0(cf.l.f5513r2, 0);
        dVar2.O0(cf.l.O, dVar3);
        dVar2.O0(cf.l.I0, this.f18233c.f18221a);
        int iE = this.f18232b.E();
        int i11 = iE * 2;
        int[] iArr = new int[i11];
        ve.s sVarP = this.f18232b.p();
        for (int i12 = 0; i12 < iE; i12++) {
            int i13 = i12 * 2;
            iArr[i13] = i12;
            iArr[i13 + 1] = sVarP.b(i12);
        }
        cf.l lVar3 = cf.l.C2;
        int i14 = 2;
        if (i11 < 2) {
            throw new IllegalArgumentException("length of widths must be >= 2");
        }
        float f10 = 1000.0f / this.f18232b.l().f30906j;
        long j10 = iArr[0];
        long jRound = Math.round(iArr[1] * f10);
        cf.a aVar2 = new cf.a();
        cf.a aVar3 = new cf.a();
        aVar3.g0(cf.i.q0(j10));
        a aVar4 = a.f18215a;
        int i15 = 1;
        a aVar5 = aVar4;
        while (i14 < i11 - 1) {
            int[] iArr2 = iArr;
            int i16 = i14;
            long j11 = iArr[i14];
            long jRound2 = Math.round(iArr2[i16 + 1] * f10);
            int iOrdinal = aVar5.ordinal();
            a aVar6 = a.f18217c;
            if (iOrdinal != 0) {
                i10 = i11;
                if (iOrdinal == i15) {
                    long j12 = j10 + 1;
                    if (j11 == j12 && jRound2 == jRound) {
                        aVar3.g0(aVar2);
                        aVar3.g0(cf.i.q0(j10));
                        aVar5 = aVar6;
                    } else if (j11 == j12) {
                        aVar2.g0(cf.i.q0(jRound));
                    } else {
                        aVar2.g0(cf.i.q0(jRound));
                        aVar3.g0(aVar2);
                        aVar3.g0(cf.i.q0(j11));
                        aVar5 = aVar4;
                    }
                } else if (iOrdinal == 2 && (j11 != j10 + 1 || jRound2 != jRound)) {
                    aVar3.g0(cf.i.q0(j10));
                    aVar3.g0(cf.i.q0(jRound));
                    aVar3.g0(cf.i.q0(j11));
                    aVar5 = aVar4;
                }
            } else {
                i10 = i11;
                long j13 = j10 + 1;
                if (j11 == j13 && jRound2 == jRound) {
                    aVar5 = aVar6;
                } else {
                    if (j11 == j13) {
                        aVar = new cf.a();
                        aVar.g0(cf.i.q0(jRound));
                        aVar5 = a.f18216b;
                    } else {
                        aVar = new cf.a();
                        aVar.g0(cf.i.q0(jRound));
                        aVar3.g0(aVar);
                        aVar3.g0(cf.i.q0(j11));
                    }
                    aVar2 = aVar;
                }
            }
            jRound = jRound2;
            j10 = j11;
            i15 = 1;
            iArr = iArr2;
            i14 = i16 + 2;
            i11 = i10;
        }
        int iOrdinal2 = aVar5.ordinal();
        if (iOrdinal2 == 0) {
            cf.a aVar7 = new cf.a();
            aVar7.g0(cf.i.q0(jRound));
            aVar3.g0(aVar7);
        } else if (iOrdinal2 == 1) {
            aVar2.g0(cf.i.q0(jRound));
            aVar3.g0(aVar2);
        } else if (iOrdinal2 == 2) {
            aVar3.g0(cf.i.q0(j10));
            aVar3.g0(cf.i.q0(jRound));
        }
        dVar2.O0(lVar3, aVar3);
        dVar2.O0(cf.l.M, cf.l.X0);
        this.f18214j = dVar2;
        cf.a aVar8 = new cf.a();
        aVar8.g0(dVar2);
        dVar.O0(cf.l.f5480j0, aVar8);
    }
}
