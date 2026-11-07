package c2;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.g1;
import i2.i2;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: c, reason: collision with root package name */
    public final d.c f4675c;

    /* renamed from: d, reason: collision with root package name */
    public final d2.b f4676d;

    /* renamed from: e, reason: collision with root package name */
    public final p.q<b0> f4677e;

    /* renamed from: f, reason: collision with root package name */
    public g1 f4678f;

    /* renamed from: g, reason: collision with root package name */
    public r f4679g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4680h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4681i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4682j;

    public o(d.c cVar) {
        this.f4675c = cVar;
        d2.b bVar = new d2.b();
        bVar.f7322b = new long[2];
        this.f4676d = bVar;
        this.f4677e = new p.q<>(2);
        this.f4681i = true;
        this.f4682j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0311  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // c2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(p.q<b0> qVar, g2.v vVar, j jVar, boolean z10) {
        p.q<b0> qVar2;
        d2.b bVar;
        Object obj;
        boolean z11;
        boolean z12;
        r rVar;
        int i10;
        int i11;
        boolean z13;
        int i12;
        boolean z14;
        int i13;
        List<e> list;
        b0 b0Var;
        g2.v vVar2 = vVar;
        boolean zA = super.a(qVar, vVar, jVar, z10);
        i2.m mVarB = this.f4675c;
        boolean z15 = true;
        if (mVarB.f1157p) {
            ?? bVar2 = 0;
            while (mVarB != 0) {
                if (mVarB instanceof i2) {
                    this.f4678f = i2.k.d((i2) mVarB, 16);
                } else if ((mVarB.f1146c & 16) != 0 && (mVarB instanceof i2.m)) {
                    d.c cVar = mVarB.f13947r;
                    int i14 = 0;
                    mVarB = mVarB;
                    bVar2 = bVar2;
                    while (cVar != null) {
                        if ((cVar.f1146c & 16) != 0) {
                            i14++;
                            bVar2 = bVar2;
                            if (i14 == 1) {
                                mVarB = cVar;
                            } else {
                                if (bVar2 == 0) {
                                    bVar2 = new z0.b(new d.c[16]);
                                }
                                if (mVarB != 0) {
                                    bVar2.b(mVarB);
                                    mVarB = 0;
                                }
                                bVar2.b(cVar);
                            }
                        }
                        cVar = cVar.f1149f;
                        mVarB = mVarB;
                        bVar2 = bVar2;
                    }
                    if (i14 == 1) {
                    }
                }
                mVarB = i2.k.b(bVar2);
            }
            if (this.f4678f != null) {
                int iF = qVar.f();
                int i15 = 0;
                while (true) {
                    qVar2 = this.f4677e;
                    bVar = this.f4676d;
                    if (i15 >= iF) {
                        break;
                    }
                    long jC = qVar.c(i15);
                    b0 b0VarG = qVar.g(i15);
                    if (bVar.b(jC)) {
                        boolean z16 = z15;
                        long j10 = b0VarG.f4599g;
                        List<e> list2 = b0VarG.f4603k;
                        long j11 = b0VarG.f4595c;
                        if ((((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z14 = z16;
                            qg.z zVar = qg.z.f22752a;
                            z13 = zA;
                            ArrayList arrayList = new ArrayList((list2 == null ? zVar : list2).size());
                            if (list2 == null) {
                                list2 = zVar;
                            }
                            int size = list2.size();
                            i12 = iF;
                            int i16 = 0;
                            while (i16 < size) {
                                int i17 = size;
                                e eVar = list2.get(i16);
                                long j12 = jC;
                                List<e> list3 = list2;
                                long j13 = eVar.f4616b;
                                if ((((j13 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    list = list3;
                                    b0Var = b0VarG;
                                    long j14 = eVar.f4615a;
                                    i13 = i16;
                                    g1 g1Var = this.f4678f;
                                    kotlin.jvm.internal.r.b(g1Var);
                                    arrayList.add(new e(j14, g1Var.F1(vVar2, j13), eVar.f4617c));
                                } else {
                                    i13 = i16;
                                    list = list3;
                                    b0Var = b0VarG;
                                }
                                i16 = i13 + 1;
                                list2 = list;
                                size = i17;
                                jC = j12;
                                b0VarG = b0Var;
                            }
                            long j15 = jC;
                            g1 g1Var2 = this.f4678f;
                            kotlin.jvm.internal.r.b(g1Var2);
                            long jF1 = g1Var2.F1(vVar2, j10);
                            g1 g1Var3 = this.f4678f;
                            kotlin.jvm.internal.r.b(g1Var3);
                            b0 b0Var2 = new b0(b0VarG.f4593a, b0VarG.f4594b, g1Var3.F1(vVar2, j11), b0VarG.f4596d, b0VarG.f4597e, b0VarG.f4598f, jF1, b0VarG.f4600h, b0VarG.f4601i, arrayList, b0VarG.f4602j, b0VarG.f4604l);
                            b0 b0Var3 = b0VarG.f4607o;
                            if (b0Var3 == null) {
                                b0Var3 = b0VarG;
                            }
                            b0Var2.f4607o = b0Var3;
                            b0 b0Var4 = b0VarG.f4607o;
                            if (b0Var4 != null) {
                                b0VarG = b0Var4;
                            }
                            b0Var2.f4607o = b0VarG;
                            qVar2.d(b0Var2, j15);
                        } else {
                            z13 = zA;
                            i12 = iF;
                            z14 = z16;
                        }
                    } else {
                        z13 = zA;
                        i12 = iF;
                        z14 = z15;
                    }
                    i15++;
                    vVar2 = vVar;
                    z15 = z14;
                    iF = i12;
                    zA = z13;
                }
                boolean z17 = zA;
                boolean z18 = z15;
                if (qVar2.f() == 0) {
                    bVar.f7321a = 0;
                    this.f4684a.g();
                    return z18;
                }
                int i18 = bVar.f7321a;
                while (true) {
                    i18--;
                    char c10 = 65535;
                    if (-1 >= i18) {
                        break;
                    }
                    long j16 = bVar.f7322b[i18];
                    if (qVar.f20702a) {
                        int i19 = qVar.f20705d;
                        long[] jArr = qVar.f20703b;
                        Object[] objArr = qVar.f20704c;
                        int i20 = 0;
                        int i21 = 0;
                        while (i20 < i19) {
                            Object obj2 = objArr[i20];
                            char c11 = c10;
                            if (obj2 != p.r.f20709a) {
                                if (i20 != i21) {
                                    jArr[i21] = jArr[i20];
                                    objArr[i21] = obj2;
                                    objArr[i20] = null;
                                }
                                i21++;
                            }
                            i20++;
                            c10 = c11;
                        }
                        qVar.f20702a = false;
                        qVar.f20705d = i21;
                    }
                    if (q.a.b(qVar.f20703b, qVar.f20705d, j16) < 0 && i18 < (i11 = bVar.f7321a)) {
                        int i22 = i11 - 1;
                        int i23 = i18;
                        while (i23 < i22) {
                            long[] jArr2 = bVar.f7322b;
                            int i24 = i23 + 1;
                            jArr2[i23] = jArr2[i24];
                            i23 = i24;
                        }
                        bVar.f7321a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(qVar2.f());
                int iF2 = qVar2.f();
                for (int i25 = 0; i25 < iF2; i25++) {
                    arrayList2.add(qVar2.g(i25));
                }
                r rVar2 = new r(arrayList2, jVar);
                int size2 = arrayList2.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i26);
                    if (jVar.a(((b0) obj).f4593a)) {
                        break;
                    }
                    i26++;
                }
                b0 b0Var5 = (b0) obj;
                if (b0Var5 != null) {
                    boolean z19 = b0Var5.f4596d;
                    if (z10) {
                        z11 = false;
                        if (!this.f4681i && (z19 || b0Var5.f4600h)) {
                            g1 g1Var4 = this.f4678f;
                            kotlin.jvm.internal.r.b(g1Var4);
                            long j17 = g1Var4.f11384c;
                            long j18 = b0Var5.f4595c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j18 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j18 & BodyPartID.bodyIdMax));
                            int i27 = (int) (j17 >> 32);
                            this.f4681i = !((fIntBitsToFloat2 > ((float) ((int) (j17 & BodyPartID.bodyIdMax))) ? z18 : false) | (fIntBitsToFloat > ((float) i27) ? z18 : false) | (fIntBitsToFloat < CropImageView.DEFAULT_ASPECT_RATIO ? z18 : false) | (fIntBitsToFloat2 < CropImageView.DEFAULT_ASPECT_RATIO ? z18 : false));
                        }
                    } else {
                        z11 = false;
                        this.f4681i = false;
                    }
                    boolean z20 = this.f4681i;
                    boolean z21 = this.f4680h;
                    if (z20 == z21 || !((i10 = rVar2.f4690d) == 3 || i10 == 4 || i10 == 5)) {
                        int i28 = rVar2.f4690d;
                        if (i28 == 4 && z21 && !this.f4682j) {
                            rVar2.f4690d = 3;
                        } else if (i28 == 5 && z20 && z19) {
                            rVar2.f4690d = 3;
                        }
                    } else {
                        rVar2.f4690d = z20 ? 4 : 5;
                    }
                } else {
                    z11 = false;
                }
                if (z17 || rVar2.f4690d != 3 || (rVar = this.f4679g) == null) {
                    z12 = z18;
                    break;
                }
                ?? r12 = rVar.f4687a;
                int size3 = r12.size();
                ?? r52 = rVar2.f4687a;
                if (size3 == r52.size()) {
                    int size4 = r52.size();
                    for (?? r62 = z11; r62 < size4; r62++) {
                        if (!p1.c.b(((b0) r12.get(r62)).f4595c, ((b0) r52.get(r62)).f4595c)) {
                            z12 = z18;
                            break;
                        }
                    }
                    z12 = z11;
                }
                this.f4679g = rVar2;
                return z12;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // c2.p
    public final void b(j jVar) {
        super.b(jVar);
        r rVar = this.f4679g;
        if (rVar == null) {
            return;
        }
        this.f4680h = this.f4681i;
        ?? r12 = rVar.f4687a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = (b0) r12.get(i10);
            boolean z10 = b0Var.f4596d;
            long j10 = b0Var.f4593a;
            boolean zA = jVar.a(j10);
            boolean z11 = this.f4681i;
            if ((!z10 && !zA) || (!z10 && !z11)) {
                this.f4676d.c(j10);
            }
        }
        this.f4681i = false;
        this.f4682j = rVar.f4690d == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [z0.b] */
    public final void c() {
        z0.b<o> bVar = this.f4684a;
        o[] oVarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            oVarArr[i11].c();
        }
        i2.m mVarB = this.f4675c;
        ?? bVar2 = 0;
        while (mVarB != 0) {
            if (mVarB instanceof i2) {
                ((i2) mVarB).r0();
            } else if ((mVarB.f1146c & 16) != 0 && (mVarB instanceof i2.m)) {
                d.c cVar = mVarB.f13947r;
                int i12 = 0;
                mVarB = mVarB;
                bVar2 = bVar2;
                while (cVar != null) {
                    if ((cVar.f1146c & 16) != 0) {
                        i12++;
                        bVar2 = bVar2;
                        if (i12 == 1) {
                            mVarB = cVar;
                        } else {
                            if (bVar2 == 0) {
                                bVar2 = new z0.b(new d.c[16]);
                            }
                            if (mVarB != 0) {
                                bVar2.b(mVarB);
                                mVarB = 0;
                            }
                            bVar2.b(cVar);
                        }
                    }
                    cVar = cVar.f1149f;
                    mVarB = mVarB;
                    bVar2 = bVar2;
                }
                if (i12 == 1) {
                }
            }
            mVarB = i2.k.b(bVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(j jVar) {
        p.q<b0> qVar = this.f4677e;
        boolean z10 = false;
        z10 = false;
        if (qVar.f() != 0) {
            d.c cVar = this.f4675c;
            if (cVar.f1157p) {
                r rVar = this.f4679g;
                kotlin.jvm.internal.r.b(rVar);
                g1 g1Var = this.f4678f;
                kotlin.jvm.internal.r.b(g1Var);
                long j10 = g1Var.f11384c;
                i2.m mVarB = cVar;
                ?? bVar = 0;
                while (mVarB != 0) {
                    if (mVarB instanceof i2) {
                        ((i2) mVarB).J(rVar, t.f4696c, j10);
                    } else if ((mVarB.f1146c & 16) != 0 && (mVarB instanceof i2.m)) {
                        d.c cVar2 = mVarB.f13947r;
                        int i10 = 0;
                        mVarB = mVarB;
                        bVar = bVar;
                        while (cVar2 != null) {
                            if ((cVar2.f1146c & 16) != 0) {
                                i10++;
                                bVar = bVar;
                                if (i10 == 1) {
                                    mVarB = cVar2;
                                } else {
                                    if (bVar == 0) {
                                        bVar = new z0.b(new d.c[16]);
                                    }
                                    if (mVarB != 0) {
                                        bVar.b(mVarB);
                                        mVarB = 0;
                                    }
                                    bVar.b(cVar2);
                                }
                            }
                            cVar2 = cVar2.f1149f;
                            mVarB = mVarB;
                            bVar = bVar;
                        }
                        if (i10 == 1) {
                        }
                    }
                    mVarB = i2.k.b(bVar);
                }
                if (cVar.f1157p) {
                    z0.b<o> bVar2 = this.f4684a;
                    o[] oVarArr = bVar2.f34700a;
                    int i11 = bVar2.f34702c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        oVarArr[i12].d(jVar);
                    }
                }
                z10 = true;
            }
        }
        b(jVar);
        qVar.a();
        this.f4678f = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(j jVar, boolean z10) {
        if (this.f4677e.f() == 0) {
            return false;
        }
        i2.m mVarB = this.f4675c;
        if (!mVarB.f1157p) {
            return false;
        }
        r rVar = this.f4679g;
        kotlin.jvm.internal.r.b(rVar);
        g1 g1Var = this.f4678f;
        kotlin.jvm.internal.r.b(g1Var);
        long j10 = g1Var.f11384c;
        i2.m mVarB2 = mVarB;
        ?? bVar = 0;
        while (mVarB2 != 0) {
            if (mVarB2 instanceof i2) {
                ((i2) mVarB2).J(rVar, t.f4694a, j10);
            } else if ((mVarB2.f1146c & 16) != 0 && (mVarB2 instanceof i2.m)) {
                d.c cVar = mVarB2.f13947r;
                int i10 = 0;
                mVarB2 = mVarB2;
                bVar = bVar;
                while (cVar != null) {
                    if ((cVar.f1146c & 16) != 0) {
                        i10++;
                        bVar = bVar;
                        if (i10 == 1) {
                            mVarB2 = cVar;
                        } else {
                            if (bVar == 0) {
                                bVar = new z0.b(new d.c[16]);
                            }
                            if (mVarB2 != 0) {
                                bVar.b(mVarB2);
                                mVarB2 = 0;
                            }
                            bVar.b(cVar);
                        }
                    }
                    cVar = cVar.f1149f;
                    mVarB2 = mVarB2;
                    bVar = bVar;
                }
                if (i10 == 1) {
                }
            }
            mVarB2 = i2.k.b(bVar);
        }
        if (mVarB.f1157p) {
            z0.b<o> bVar2 = this.f4684a;
            o[] oVarArr = bVar2.f34700a;
            int i11 = bVar2.f34702c;
            for (int i12 = 0; i12 < i11; i12++) {
                o oVar = oVarArr[i12];
                kotlin.jvm.internal.r.b(this.f4678f);
                oVar.e(jVar, z10);
            }
        }
        if (mVarB.f1157p) {
            ?? bVar3 = 0;
            while (mVarB != 0) {
                if (mVarB instanceof i2) {
                    ((i2) mVarB).J(rVar, t.f4695b, j10);
                } else if ((mVarB.f1146c & 16) != 0 && (mVarB instanceof i2.m)) {
                    d.c cVar2 = mVarB.f13947r;
                    int i13 = 0;
                    mVarB = mVarB;
                    bVar3 = bVar3;
                    while (cVar2 != null) {
                        if ((cVar2.f1146c & 16) != 0) {
                            i13++;
                            bVar3 = bVar3;
                            if (i13 == 1) {
                                mVarB = cVar2;
                            } else {
                                if (bVar3 == 0) {
                                    bVar3 = new z0.b(new d.c[16]);
                                }
                                if (mVarB != 0) {
                                    bVar3.b(mVarB);
                                    mVarB = 0;
                                }
                                bVar3.b(cVar2);
                            }
                        }
                        cVar2 = cVar2.f1149f;
                        mVarB = mVarB;
                        bVar3 = bVar3;
                    }
                    if (i13 == 1) {
                    }
                }
                mVarB = i2.k.b(bVar3);
            }
        }
        return true;
    }

    public final void f(long j10, p.h0<o> h0Var) {
        d2.b bVar = this.f4676d;
        if (bVar.b(j10) && h0Var.c(this) < 0) {
            bVar.c(j10);
            this.f4677e.e(j10);
        }
        z0.b<o> bVar2 = this.f4684a;
        o[] oVarArr = bVar2.f34700a;
        int i10 = bVar2.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            oVarArr[i11].f(j10, h0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f4675c + ", children=" + this.f4684a + ", pointerIds=" + this.f4676d + ')';
    }
}
