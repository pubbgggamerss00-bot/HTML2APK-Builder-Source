package i0;

import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.android.apksig.internal.apk.v4.V4Signature;
import h1.h;
import i0.i2;
import i2.e0;
import i2.g;
import j1.d;
import j2.c3;
import j2.p5;
import java.util.concurrent.atomic.AtomicReference;
import k0.n1;
import m0.x2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t2.b;
import x0.j;
import x2.f;

/* loaded from: classes.dex */
public final class q1 {

    public static final class a implements m0.w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f13506a;

        public a(long j10) {
            this.f13506a = j10;
        }

        @Override // m0.w
        public final long a() {
            return this.f13506a;
        }
    }

    public static final class b implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b3 f13507a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m0.x2 f13508b;

        @vg.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f13509a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c2.j0 f13510b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b3 f13511c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m0.x2 f13512d;

            @vg.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1078}, m = "invokeSuspend")
            /* renamed from: i0.q1$b$a$a, reason: collision with other inner class name */
            public static final class C0122a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f13513a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c2.j0 f13514b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b3 f13515c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0122a(c2.j0 j0Var, b3 b3Var, tg.e<? super C0122a> eVar) {
                    super(2, eVar);
                    this.f13514b = j0Var;
                    this.f13515c = b3Var;
                }

                @Override // vg.a
                public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                    return new C0122a(this.f13514b, this.f13515c, eVar);
                }

                @Override // eh.p
                public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                    return ((C0122a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    ug.a aVar = ug.a.f29706a;
                    int i10 = this.f13513a;
                    if (i10 == 0) {
                        pg.q.b(obj);
                        this.f13513a = 1;
                        if (m2.a(this.f13514b, this.f13515c, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    }
                    return pg.f0.f21461a;
                }
            }

            @vg.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1081}, m = "invokeSuspend")
            /* renamed from: i0.q1$b$a$b, reason: collision with other inner class name */
            public static final class C0123b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f13516a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c2.j0 f13517b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m0.x2 f13518c;

                /* renamed from: i0.q1$b$a$b$a, reason: collision with other inner class name */
                public static final class C0124a extends kotlin.jvm.internal.s implements eh.l<p1.c, pg.f0> {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ m0.x2 f13519a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0124a(m0.x2 x2Var) {
                        super(1);
                        this.f13519a = x2Var;
                    }

                    @Override // eh.l
                    public final pg.f0 invoke(p1.c cVar) {
                        long j10 = cVar.f21129a;
                        this.f13519a.p();
                        return pg.f0.f21461a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0123b(c2.j0 j0Var, m0.x2 x2Var, tg.e<? super C0123b> eVar) {
                    super(2, eVar);
                    this.f13517b = j0Var;
                    this.f13518c = x2Var;
                }

                @Override // vg.a
                public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                    return new C0123b(this.f13517b, this.f13518c, eVar);
                }

                @Override // eh.p
                public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                    return ((C0123b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    ug.a aVar = ug.a.f29706a;
                    int i10 = this.f13516a;
                    if (i10 == 0) {
                        pg.q.b(obj);
                        C0124a c0124a = new C0124a(this.f13518c);
                        this.f13516a = 1;
                        if (v.t1.e(this.f13517b, null, c0124a, this, 7) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    }
                    return pg.f0.f21461a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c2.j0 j0Var, b3 b3Var, m0.x2 x2Var, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f13510b = j0Var;
                this.f13511c = b3Var;
                this.f13512d = x2Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f13510b, this.f13511c, this.f13512d, eVar);
                aVar.f13509a = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                ph.i0 i0Var = (ph.i0) this.f13509a;
                ph.k0 k0Var = ph.k0.f21556d;
                c2.j0 j0Var = this.f13510b;
                ph.h.c(i0Var, null, k0Var, new C0122a(j0Var, this.f13511c, null), 1);
                ph.h.c(i0Var, null, k0Var, new C0123b(j0Var, this.f13512d, null), 1);
                return pg.f0.f21461a;
            }
        }

        public b(b3 b3Var, m0.x2 x2Var) {
            this.f13507a = b3Var;
            this.f13508b = x2Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
            Object objC = ph.j0.c(new a(j0Var, this.f13507a, this.f13508b, null), eVar);
            return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f13520a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10) {
            super(1);
            this.f13520a = j10;
        }

        @Override // eh.l
        public final pg.f0 invoke(q2.d0 d0Var) {
            d0Var.c(m0.h1.f17347c, new m0.g1(u1.f13615a, this.f13520a, m0.f1.f17321b, true));
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0.x2 f13521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m0.x2 x2Var, int i10) {
            super(2);
            this.f13521a = x2Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(1);
            q1.c(this.f13521a, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x056d A[PHI: r15 r27 r28
      0x056d: PHI (r15v34 y2.o) = (r15v27 y2.o), (r15v35 y2.o) binds: [B:271:0x056b, B:268:0x055c] A[DONT_GENERATE, DONT_INLINE]
      0x056d: PHI (r27v9 int) = (r27v4 int), (r27v10 int) binds: [B:271:0x056b, B:268:0x055c] A[DONT_GENERATE, DONT_INLINE]
      0x056d: PHI (r28v17 o1.c0) = (r28v12 o1.c0), (r28v18 o1.c0) binds: [B:271:0x056b, B:268:0x055c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x058c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0639 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0816 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0929  */
    /* JADX WARN: Type inference failed for: r3v80, types: [androidx.compose.ui.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(y2.c0 c0Var, eh.l lVar, androidx.compose.ui.d dVar, t2.l0 l0Var, y2.q0 q0Var, eh.l lVar2, x.m mVar, q1.i2 i2Var, boolean z10, int i10, int i11, y2.o oVar, g2 g2Var, boolean z11, boolean z12, eh.q qVar, x0.j jVar, int i12, int i13) {
        int i14;
        int i15;
        x0.k kVar;
        o1.c0 c0Var2;
        o1.n nVar;
        int i16;
        Object i2Var2;
        y2.o0 o0Var;
        o1.n nVar2;
        p5 p5Var;
        t2.l0 l0Var2;
        int i17;
        y2.v vVar;
        int i18;
        t2.b bVar;
        boolean z13;
        f3.d dVar2;
        f.a aVar;
        f3.d dVar3;
        boolean z14;
        boolean z15;
        y2.c0 c0VarB;
        Object objG;
        Object objG2;
        Object objG3;
        int i19;
        y2.o oVar2;
        int i20;
        o1.c0 c0Var3;
        boolean zL;
        Object i1Var;
        y2.o0 o0Var2;
        i2 i2Var3;
        o1.n nVar3;
        int i21;
        f4 f4Var;
        k0.m1 m1Var;
        int i22;
        boolean z16;
        j.a.C0321a c0321a;
        int i23;
        f0.a aVar2;
        y2.o oVar3;
        x.m mVar2;
        o1.c0 c0Var4;
        y2.e0 e0Var;
        y2.v vVar2;
        m0.x2 x2Var;
        boolean z17;
        y2.c0 c0Var5;
        x0.k kVar2;
        i2 i2Var4;
        boolean z18;
        boolean z19;
        Object t0Var;
        f0.a aVar3;
        o1.c0 c0Var6;
        i2 i2Var5;
        androidx.compose.ui.d dVar4;
        d.a aVar4;
        x0.n1 n1Var;
        y2.e0 e0Var2;
        boolean zL2;
        Object objG4;
        int i24;
        boolean zL3;
        Object objG5;
        y2.v vVar3;
        int i25;
        int i26;
        boolean zL4;
        Object objG6;
        p5 p5Var2;
        boolean zL5;
        Object objG7;
        int i27;
        p5 p5Var3;
        i2 i2Var6;
        m0.x2 x2Var2;
        y2.e0 e0Var3;
        boolean zL6;
        Object objG8;
        boolean zL7;
        Object objG9;
        boolean z20;
        k0.m1 m1Var2;
        boolean zC;
        Object objG10;
        long j10;
        boolean zL8;
        Object objG11;
        androidx.compose.ui.d dVarA;
        x0.k kVarP = jVar.p(-244533042);
        if ((i12 & 6) == 0) {
            i14 = i12 | (kVarP.K(c0Var) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= kVarP.l(lVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= kVarP.K(l0Var) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= kVarP.K(q0Var) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= kVarP.l(lVar2) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= kVarP.K(mVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= kVarP.K(i2Var) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= kVarP.c(z10) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= kVarP.i(i10) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i28 = i14;
        if ((i13 & 6) == 0) {
            i15 = i13 | (kVarP.i(i11) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= kVarP.K(oVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= kVarP.K(g2Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= kVarP.c(z11) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= kVarP.c(z12) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i15 |= kVarP.l(qVar) ? 131072 : 65536;
        }
        int i29 = i15 | 1572864;
        if (kVarP.A(i28 & 1, ((i28 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true)) {
            kVarP.r0();
            if ((i12 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            Object objG12 = kVarP.g();
            j.a.C0321a c0321a2 = j.a.f31715a;
            if (objG12 == c0321a2) {
                objG12 = new o1.c0();
                kVarP.C(objG12);
            }
            o1.c0 c0Var7 = (o1.c0) objG12;
            Object objG13 = kVarP.g();
            if (objG13 == c0321a2) {
                n1.a aVar5 = k0.n1.f15874a;
                objG13 = new k0.c();
                kVarP.C(objG13);
            }
            k0.m1 m1Var3 = (k0.m1) objG13;
            Object objG14 = kVarP.g();
            if (objG14 == c0321a2) {
                objG14 = new y2.e0(m1Var3);
                kVarP.C(objG14);
            }
            y2.e0 e0Var4 = (y2.e0) objG14;
            f3.d dVar5 = (f3.d) kVarP.f(j2.j2.f14779h);
            f.a aVar6 = (f.a) kVarP.f(j2.j2.f14782k);
            long j11 = ((m0.q3) kVarP.f(m0.r3.f17501a)).f17465b;
            o1.n nVar4 = (o1.n) kVarP.f(j2.j2.f14780i);
            p5 p5Var4 = (p5) kVarP.f(j2.j2.f14791t);
            j2.z4 z4Var = (j2.z4) kVarP.f(j2.j2.f14787p);
            v.t0 t0Var2 = (i10 == 1 && !z10 && oVar.f33753a) ? v.t0.f30084b : v.t0.f30083a;
            kVarP.L(-1705353356);
            Object[] objArr = {t0Var2};
            g1.n nVar5 = f4.f13280g;
            boolean zK = kVarP.K(t0Var2);
            Object objG15 = kVarP.g();
            if (zK || objG15 == c0321a2) {
                objG15 = new m1(t0Var2);
                kVarP.C(objG15);
            }
            f4 f4Var2 = (f4) b0.a0.d(objArr, nVar5, (eh.a) objG15, kVarP, 0, 4);
            kVarP.T(false);
            if (((v.t0) f4Var2.f13286f.getValue()) != t0Var2) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(t0Var2 == v.t0.f30083a ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i30 = i28 & 14;
            boolean z21 = (i30 == 4) | ((i28 & 57344) == 16384);
            Object objG16 = kVarP.g();
            if (z21 || objG16 == c0321a2) {
                y2.o0 o0VarA = a5.a(q0Var, c0Var.f33682a);
                t2.j0 j0Var = c0Var.f33684c;
                if (j0Var != null) {
                    i16 = i30;
                    long j12 = j0Var.f27839a;
                    y2.v vVar4 = o0VarA.f33760b;
                    int i31 = t2.j0.f27838c;
                    c0Var2 = c0Var7;
                    int iB = vVar4.b((int) (j12 >> 32));
                    nVar = nVar4;
                    int iB2 = vVar4.b((int) (j12 & BodyPartID.bodyIdMax));
                    int iMin = Math.min(iB, iB2);
                    int iMax = Math.max(iB, iB2);
                    b.C0288b c0288b = new b.C0288b(o0VarA.f33759a);
                    c0288b.a(new t2.b0(0L, 0L, (x2.p) null, (x2.n) null, (x2.o) null, (x2.f) null, (String) null, 0L, (e3.a) null, (e3.m) null, (a3.c) null, 0L, e3.i.f8365c, (q1.e2) null, 61439), iMin, iMax);
                    o0VarA = new y2.o0(c0288b.e(), vVar4);
                } else {
                    c0Var2 = c0Var7;
                    nVar = nVar4;
                    i16 = i30;
                }
                objG16 = o0VarA;
                kVarP.C(objG16);
            } else {
                c0Var2 = c0Var7;
                nVar = nVar4;
                i16 = i30;
            }
            y2.o0 o0Var3 = (y2.o0) objG16;
            t2.b bVar2 = o0Var3.f33759a;
            y2.v vVar5 = o0Var3.f33760b;
            x0.h2 h2VarB = kVarP.b();
            if (h2VarB == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            kVarP.I(h2VarB);
            boolean zK2 = kVarP.K(z4Var);
            Object objG17 = kVarP.g();
            if (zK2 || objG17 == c0321a2) {
                o0Var = o0Var3;
                nVar2 = nVar;
                p5Var = p5Var4;
                l0Var2 = l0Var;
                z2 z2Var = new z2(bVar2, l0Var2, z10, dVar5, aVar6, 0);
                i17 = i16;
                vVar = vVar5;
                i18 = i29;
                bVar = bVar2;
                z13 = z10;
                dVar2 = dVar5;
                aVar = aVar6;
                i2Var2 = new i2(z2Var, h2VarB, z4Var);
                kVarP.C(i2Var2);
            } else {
                z13 = z10;
                o0Var = o0Var3;
                nVar2 = nVar;
                i2Var2 = objG17;
                aVar = aVar6;
                p5Var = p5Var4;
                l0Var2 = l0Var;
                vVar = vVar5;
                i18 = i29;
                bVar = bVar2;
                dVar2 = dVar5;
                i17 = i16;
            }
            i2 i2Var7 = (i2) i2Var2;
            t2.b bVar3 = c0Var.f33682a;
            i2Var7.f13357u = lVar;
            i2Var7.f13361y = j11;
            e2 e2Var = i2Var7.f13354r;
            e2Var.f13269b = g2Var;
            o1.n nVar6 = nVar2;
            e2Var.f13270c = nVar6;
            i2Var7.f13346j = bVar3;
            z2 z2Var2 = i2Var7.f13337a;
            if (kotlin.jvm.internal.r.a(z2Var2.f13725a, bVar) && kotlin.jvm.internal.r.a(z2Var2.f13726b, l0Var2) && z2Var2.f13729e == z13 && z2Var2.f13730f == 1 && z2Var2.f13727c == Integer.MAX_VALUE && z2Var2.f13728d == 1 && kotlin.jvm.internal.r.a(z2Var2.f13731g, dVar2) && kotlin.jvm.internal.r.a(z2Var2.f13733i, qg.z.f22752a) && z2Var2.f13732h == aVar) {
                dVar3 = dVar2;
            } else {
                dVar3 = dVar2;
                z2Var2 = new z2(bVar, l0Var2, z10, dVar3, aVar, 0);
            }
            if (i2Var7.f13337a != z2Var2) {
                i2Var7.f13352p = true;
            }
            i2Var7.f13337a = z2Var2;
            y2.j jVar2 = i2Var7.f13340d;
            y2.n0 n0Var = i2Var7.f13341e;
            jVar2.getClass();
            t2.j0 j0Var2 = c0Var.f33684c;
            long j13 = c0Var.f33683b;
            boolean zA = kotlin.jvm.internal.r.a(j0Var2, jVar2.f33735b.c());
            String str = jVar2.f33734a.f33682a.f27761b;
            t2.b bVar4 = c0Var.f33682a;
            if (kotlin.jvm.internal.r.a(str, bVar4.f27761b)) {
                if (t2.j0.a(jVar2.f33734a.f33683b, j13)) {
                    z14 = false;
                } else {
                    jVar2.f33735b.f(t2.j0.e(j13), t2.j0.d(j13));
                    z14 = true;
                }
                z15 = false;
            } else {
                jVar2.f33735b = new y2.k(bVar4, j13);
                z14 = false;
                z15 = true;
            }
            if (j0Var2 == null) {
                y2.k kVar3 = jVar2.f33735b;
                kVar3.f33740d = -1;
                kVar3.f33741e = -1;
            } else {
                long j14 = j0Var2.f27839a;
                if (!t2.j0.b(j14)) {
                    jVar2.f33735b.e(t2.j0.e(j14), t2.j0.d(j14));
                }
            }
            if (z15 || !(z14 || zA)) {
                y2.k kVar4 = jVar2.f33735b;
                kVar4.f33740d = -1;
                kVar4.f33741e = -1;
                c0VarB = y2.c0.b(c0Var, null, 0L, 3);
            } else {
                c0VarB = c0Var;
            }
            y2.c0 c0Var8 = jVar2.f33734a;
            jVar2.f33734a = c0VarB;
            if (n0Var != null) {
                n0Var.a(c0Var8, c0VarB);
            }
            Object objG18 = kVarP.g();
            if (objG18 == c0321a2) {
                objG18 = new y4(0);
                kVarP.C(objG18);
            }
            y4 y4Var = (y4) objG18;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (y4Var.f13712f) {
                y4Var.f13711e = Long.valueOf(jCurrentTimeMillis);
                y4Var.a(c0Var);
                objG = kVarP.g();
                if (objG == c0321a2) {
                    x0.l0 l0Var3 = x0.o0.f31834a;
                    x0.w2 w2Var = new x0.w2(kVarP.x());
                    kVarP.C(w2Var);
                    objG = w2Var;
                }
                ph.i0 i0Var = (ph.i0) objG;
                objG2 = kVarP.g();
                if (objG2 == c0321a2) {
                    objG2 = new f0.d();
                    kVarP.C(objG2);
                }
                f0.a aVar7 = (f0.a) objG2;
                objG3 = kVarP.g();
                if (objG3 == c0321a2) {
                    objG3 = new m0.x2(y4Var);
                    kVarP.C(objG3);
                }
                m0.x2 x2Var3 = (m0.x2) objG3;
                y2.v vVar6 = vVar;
                x2Var3.f17548b = vVar6;
                x2Var3.f17552f = q0Var;
                x2Var3.f17549c = i2Var7.f13358v;
                x2Var3.f17550d = i2Var7;
                x2Var3.f17551e.setValue(c0Var);
                x2Var3.f17554h = (j2.f2) kVarP.f(j2.j2.f14777f);
                x2Var3.f17555i = i0Var;
                x2Var3.f17556j = (j2.a5) kVarP.f(j2.j2.f14788q);
                x2Var3.f17557k = (y1.a) kVarP.f(j2.j2.f14783l);
                o1.c0 c0Var9 = c0Var2;
                x2Var3.f17558l = c0Var9;
                boolean z22 = !z12;
                x2Var3.f17559m.setValue(Boolean.valueOf(z22));
                x2Var3.f17560n.setValue(Boolean.valueOf(z11));
                boolean zL9 = kVarP.l(i2Var7);
                int i32 = i18;
                int i33 = i32 & V4Signature.MAX_SIGNING_INFOS_SIZE;
                boolean z23 = (i33 != 2048) | zL9;
                int i34 = i32 & 57344;
                boolean zL10 = z23 | (i34 != 16384) | kVarP.l(e0Var4);
                int i35 = i17;
                boolean z24 = zL10 | (i35 != 4);
                i19 = (i32 & 112) ^ 48;
                if (i19 <= 32) {
                    oVar2 = oVar;
                    if (kVarP.K(oVar2)) {
                        i20 = i35;
                        c0Var3 = c0Var9;
                    }
                    zL = z24 | z | kVarP.l(vVar6) | kVarP.l(i0Var) | kVarP.l(aVar7) | kVarP.l(x2Var3);
                    Object objG19 = kVarP.g();
                    if (zL || objG19 == c0321a2) {
                        o0Var2 = o0Var;
                        i2Var3 = i2Var7;
                        nVar3 = nVar6;
                        i21 = i33;
                        f4Var = f4Var2;
                        m1Var = m1Var3;
                        i22 = i20;
                        z16 = false;
                        c0321a = c0321a2;
                        i23 = i34;
                        aVar2 = aVar7;
                        oVar3 = oVar2;
                        mVar2 = mVar;
                        x0.k kVar5 = kVarP;
                        c0Var4 = c0Var3;
                        i1Var = new i1(i2Var3, z11, z12, e0Var4, c0Var, oVar3, vVar6, x2Var3, i0Var, aVar2);
                        e0Var = e0Var4;
                        vVar2 = vVar6;
                        x2Var = x2Var3;
                        z17 = z11;
                        c0Var5 = c0Var;
                        kVar5.C(i1Var);
                        kVar2 = kVar5;
                    } else {
                        o0Var2 = o0Var;
                        i1Var = objG19;
                        i2Var3 = i2Var7;
                        vVar2 = vVar6;
                        nVar3 = nVar6;
                        i21 = i33;
                        x2Var = x2Var3;
                        oVar3 = oVar2;
                        f4Var = f4Var2;
                        m1Var = m1Var3;
                        i22 = i20;
                        c0Var4 = c0Var3;
                        e0Var = e0Var4;
                        z16 = false;
                        c0321a = c0321a2;
                        c0Var5 = c0Var;
                        kVar2 = kVarP;
                        i23 = i34;
                        aVar2 = aVar7;
                        mVar2 = mVar;
                        z17 = z11;
                    }
                    d.a aVar8 = d.a.f1143b;
                    androidx.compose.ui.d dVarA2 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar8, c0Var4), (eh.l) i1Var), z17, mVar2);
                    x0.n1 n1VarK = bg.b.k(Boolean.valueOf((z17 || z12) ? z16 : true), kVar2);
                    pg.f0 f0Var = pg.f0.f21461a;
                    boolean zK3 = kVar2.K(n1VarK) | kVar2.l(i2Var3) | kVar2.l(e0Var) | kVar2.l(x2Var);
                    if (i19 > 32 || !kVar2.K(oVar3)) {
                        i2Var4 = i2Var3;
                        if ((i32 & 48) != 32) {
                            z18 = z16;
                        }
                        z19 = zK3 | z18;
                        Object objG20 = kVar2.g();
                        if (z19 || objG20 == c0321a) {
                            aVar3 = aVar2;
                            c0Var6 = c0Var4;
                            i2Var5 = i2Var4;
                            dVar4 = dVarA2;
                            aVar4 = aVar8;
                            t0Var = new t0(i2Var5, n1VarK, e0Var, x2Var, oVar, null);
                            n1Var = n1VarK;
                            e0Var2 = e0Var;
                            kVar2.C(t0Var);
                        } else {
                            t0Var = objG20;
                            e0Var2 = e0Var;
                            aVar3 = aVar2;
                            c0Var6 = c0Var4;
                            i2Var5 = i2Var4;
                            dVar4 = dVarA2;
                            aVar4 = aVar8;
                            n1Var = n1VarK;
                        }
                        x0.o0.d((eh.p) t0Var, f0Var, kVar2);
                        zL2 = kVar2.l(i2Var5);
                        objG4 = kVar2.g();
                        if (!zL2 || objG4 == c0321a) {
                            objG4 = new k1(i2Var5);
                            kVar2.C(objG4);
                        }
                        androidx.compose.ui.d dVarA3 = c2.s0.a(aVar4, 8675309, new m0.d1((eh.l) objG4));
                        i24 = i21;
                        zL3 = kVar2.l(i2Var5) | (i23 != 16384 ? true : z16) | (i24 != 2048 ? true : z16) | kVar2.l(vVar2) | kVar2.l(x2Var);
                        objG5 = kVar2.g();
                        if (!zL3 || objG5 == c0321a) {
                            m0.x2 x2Var4 = x2Var;
                            vVar3 = vVar2;
                            i25 = i24;
                            l1 l1Var = new l1(i2Var5, c0Var6, z12, z11, x2Var4, vVar3);
                            x2Var = x2Var4;
                            kVar2.C(l1Var);
                            objG5 = l1Var;
                        } else {
                            vVar3 = vVar2;
                            i25 = i24;
                        }
                        eh.l lVar3 = (eh.l) objG5;
                        if (z11) {
                            dVarA3 = androidx.compose.ui.c.a(dVarA3, j2.c3.f14686a, new a4(lVar3, mVar2));
                        }
                        x2.a aVar9 = x2Var.f17570x;
                        x2.c cVar = x2Var.f17569w;
                        androidx.compose.ui.d dVarF = c2.y.f(dVarA3.h(new SuspendPointerInputElement(aVar9, cVar, new m0.a1(aVar9, cVar), 4)), v4.f13650a);
                        i26 = i22;
                        zL4 = kVar2.l(i2Var5) | (i26 != 4 ? true : z16) | kVar2.l(vVar3);
                        objG6 = kVar2.g();
                        if (!zL4 || objG6 == c0321a) {
                            objG6 = new g1(i2Var5, c0Var5, vVar3);
                            kVar2.C(objG6);
                        }
                        androidx.compose.ui.d dVarA4 = androidx.compose.ui.draw.a.a(aVar4, (eh.l) objG6);
                        p5Var2 = p5Var;
                        zL5 = kVar2.l(i2Var5) | (i25 != 2048 ? true : z16) | kVar2.K(p5Var2) | kVar2.l(x2Var) | (i26 != 4 ? true : z16) | kVar2.l(vVar3);
                        objG7 = kVar2.g();
                        if (!zL5 || objG7 == c0321a) {
                            i27 = i26;
                            j1 j1Var = new j1(i2Var5, z11, p5Var2, x2Var, c0Var5, vVar3);
                            p5Var3 = p5Var2;
                            kVar2.C(j1Var);
                            objG7 = j1Var;
                        } else {
                            i27 = i26;
                            p5Var3 = p5Var2;
                        }
                        androidx.compose.ui.d dVarA5 = androidx.compose.ui.layout.c.a(aVar4, (eh.l) objG7);
                        i2Var6 = i2Var5;
                        x2Var2 = x2Var;
                        e0Var3 = e0Var2;
                        androidx.compose.ui.d dVar6 = dVar4;
                        int i36 = i27;
                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(o0Var2, c0Var, i2Var6, z12, z11, vVar3, x2Var2, oVar, c0Var6);
                        d.a aVarA = !((z11 || z12 || !p5Var3.a() || !t2.j0.b(((t2.j0) i2Var6.f13362z.getValue()).f27839a) || !t2.j0.b(((t2.j0) i2Var6.A.getValue()).f27839a)) ? z16 : true) ? androidx.compose.ui.c.a(aVar4, j2.c3.f14686a, new e3(i2Var, i2Var6, c0Var, vVar3)) : aVar4;
                        zL6 = kVar2.l(x2Var2);
                        objG8 = kVar2.g();
                        if (!zL6 || objG8 == c0321a) {
                            objG8 = new v0(x2Var2);
                            kVar2.C(objG8);
                        }
                        x0.o0.a(x2Var2, (eh.l) objG8, kVar2);
                        zL7 = kVar2.l(i2Var6) | kVar2.l(e0Var3) | (i36 != 4 ? true : z16) | (((i19 > 32 || !kVar2.K(oVar)) && (i32 & 48) != 32) ? z16 : true);
                        objG9 = kVar2.g();
                        if (zL7 || objG9 == c0321a) {
                            objG9 = new x0(i2Var6, e0Var3, c0Var, oVar);
                            kVar2.C(objG9);
                        }
                        x0.o0.a(oVar, (eh.l) objG9, kVar2);
                        w3 w3Var = new w3(i2Var6, x2Var2, c0Var, z22, i10 != 1 ? true : z16, vVar3, y4Var, i2Var6.f13358v, oVar.f33757e);
                        c3.a aVar10 = j2.c3.f14686a;
                        androidx.compose.ui.d dVarA6 = androidx.compose.ui.c.a(aVar4, aVar10, w3Var);
                        int i37 = oVar.f33756d;
                        z20 = (i37 == 7 || i37 == 8) ? z16 : true;
                        boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
                        m1Var2 = m1Var;
                        zC = kVar2.c(z20) | kVar2.l(m1Var2);
                        objG10 = kVar2.g();
                        if (!zC || objG10 == c0321a) {
                            objG10 = new n1(z20, m1Var2);
                            kVar2.C(objG10);
                        }
                        androidx.compose.ui.d dVarA7 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue, z20, (eh.a) objG10);
                        y2.v vVar7 = vVar3;
                        j10 = ((q1.b1) kVar2.f(j.f13367a)).f21656a;
                        zL8 = kVar2.l(i2Var6) | kVar2.j(j10);
                        objG11 = kVar2.g();
                        if (!zL8 || objG11 == c0321a) {
                            objG11 = new f1(i2Var6, j10);
                            kVar2.C(objG11);
                        }
                        f4 f4Var3 = f4Var;
                        androidx.compose.ui.d dVarA8 = androidx.compose.ui.layout.c.a(androidx.compose.ui.c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.h(androidx.compose.ui.draw.a.a(aVar4, (eh.l) objG11)), m1Var2, i2Var6, x2Var2).h(dVarA7).h(dVar6), new k3(nVar3, i2Var6)), new r1(i2Var6, x2Var2)).h(dVarA6), aVar10, new d4(f4Var3, z11, mVar)).h(dVarF).h(coreTextFieldSemanticsModifier), new e1(i2Var6));
                        if (z11 && i2Var6.b() && ((Boolean) i2Var6.f13353q.getValue()).booleanValue() && p5Var3.a()) {
                            z16 = true;
                        }
                        if (z16) {
                            dVarA = aVar4;
                        } else {
                            q2.c0<eh.a<p1.c>> c0Var10 = t.a1.f25160a;
                            dVarA = androidx.compose.ui.c.a(aVar4, aVar10, new m0.o3(x2Var2));
                        }
                        kVar = kVar2;
                        b(dVarA8, x2Var2, f1.c.b(-492537660, new c1(qVar, i2Var6, l0Var, i11, i10, f4Var3, c0Var, q0Var, aVarA, dVarA4, dVarA5, dVarA, aVar3, x2Var2, z16, z12, lVar2, vVar7, dVar3), kVar), kVar, 384);
                    } else {
                        i2Var4 = i2Var3;
                    }
                    z18 = true;
                    z19 = zK3 | z18;
                    Object objG202 = kVar2.g();
                    if (z19) {
                        aVar3 = aVar2;
                        c0Var6 = c0Var4;
                        i2Var5 = i2Var4;
                        dVar4 = dVarA2;
                        aVar4 = aVar8;
                        t0Var = new t0(i2Var5, n1VarK, e0Var, x2Var, oVar, null);
                        n1Var = n1VarK;
                        e0Var2 = e0Var;
                        kVar2.C(t0Var);
                        x0.o0.d((eh.p) t0Var, f0Var, kVar2);
                        zL2 = kVar2.l(i2Var5);
                        objG4 = kVar2.g();
                        if (!zL2) {
                            objG4 = new k1(i2Var5);
                            kVar2.C(objG4);
                            androidx.compose.ui.d dVarA32 = c2.s0.a(aVar4, 8675309, new m0.d1((eh.l) objG4));
                            i24 = i21;
                            zL3 = kVar2.l(i2Var5) | (i23 != 16384 ? true : z16) | (i24 != 2048 ? true : z16) | kVar2.l(vVar2) | kVar2.l(x2Var);
                            objG5 = kVar2.g();
                            if (zL3) {
                                m0.x2 x2Var42 = x2Var;
                                vVar3 = vVar2;
                                i25 = i24;
                                l1 l1Var2 = new l1(i2Var5, c0Var6, z12, z11, x2Var42, vVar3);
                                x2Var = x2Var42;
                                kVar2.C(l1Var2);
                                objG5 = l1Var2;
                                eh.l lVar32 = (eh.l) objG5;
                                if (z11) {
                                }
                                x2.a aVar92 = x2Var.f17570x;
                                x2.c cVar2 = x2Var.f17569w;
                                androidx.compose.ui.d dVarF2 = c2.y.f(dVarA32.h(new SuspendPointerInputElement(aVar92, cVar2, new m0.a1(aVar92, cVar2), 4)), v4.f13650a);
                                i26 = i22;
                                zL4 = kVar2.l(i2Var5) | (i26 != 4 ? true : z16) | kVar2.l(vVar3);
                                objG6 = kVar2.g();
                                if (!zL4) {
                                    objG6 = new g1(i2Var5, c0Var5, vVar3);
                                    kVar2.C(objG6);
                                    androidx.compose.ui.d dVarA42 = androidx.compose.ui.draw.a.a(aVar4, (eh.l) objG6);
                                    p5Var2 = p5Var;
                                    zL5 = kVar2.l(i2Var5) | (i25 != 2048 ? true : z16) | kVar2.K(p5Var2) | kVar2.l(x2Var) | (i26 != 4 ? true : z16) | kVar2.l(vVar3);
                                    objG7 = kVar2.g();
                                    if (zL5) {
                                        i27 = i26;
                                        j1 j1Var2 = new j1(i2Var5, z11, p5Var2, x2Var, c0Var5, vVar3);
                                        p5Var3 = p5Var2;
                                        kVar2.C(j1Var2);
                                        objG7 = j1Var2;
                                        androidx.compose.ui.d dVarA52 = androidx.compose.ui.layout.c.a(aVar4, (eh.l) objG7);
                                        i2Var6 = i2Var5;
                                        x2Var2 = x2Var;
                                        e0Var3 = e0Var2;
                                        androidx.compose.ui.d dVar62 = dVar4;
                                        int i362 = i27;
                                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(o0Var2, c0Var, i2Var6, z12, z11, vVar3, x2Var2, oVar, c0Var6);
                                        if (z11) {
                                            if (!((z11 || z12 || !p5Var3.a() || !t2.j0.b(((t2.j0) i2Var6.f13362z.getValue()).f27839a) || !t2.j0.b(((t2.j0) i2Var6.A.getValue()).f27839a)) ? z16 : true)) {
                                            }
                                            zL6 = kVar2.l(x2Var2);
                                            objG8 = kVar2.g();
                                            if (!zL6) {
                                                objG8 = new v0(x2Var2);
                                                kVar2.C(objG8);
                                                x0.o0.a(x2Var2, (eh.l) objG8, kVar2);
                                                if (i19 > 32) {
                                                    zL7 = kVar2.l(i2Var6) | kVar2.l(e0Var3) | (i362 != 4 ? true : z16) | (((i19 > 32 || !kVar2.K(oVar)) && (i32 & 48) != 32) ? z16 : true);
                                                    objG9 = kVar2.g();
                                                    if (zL7) {
                                                        objG9 = new x0(i2Var6, e0Var3, c0Var, oVar);
                                                        kVar2.C(objG9);
                                                        x0.o0.a(oVar, (eh.l) objG9, kVar2);
                                                        w3 w3Var2 = new w3(i2Var6, x2Var2, c0Var, z22, i10 != 1 ? true : z16, vVar3, y4Var, i2Var6.f13358v, oVar.f33757e);
                                                        c3.a aVar102 = j2.c3.f14686a;
                                                        androidx.compose.ui.d dVarA62 = androidx.compose.ui.c.a(aVar4, aVar102, w3Var2);
                                                        int i372 = oVar.f33756d;
                                                        if (i372 == 7) {
                                                            boolean zBooleanValue2 = ((Boolean) n1Var.getValue()).booleanValue();
                                                            m1Var2 = m1Var;
                                                            zC = kVar2.c(z20) | kVar2.l(m1Var2);
                                                            objG10 = kVar2.g();
                                                            if (!zC) {
                                                                objG10 = new n1(z20, m1Var2);
                                                                kVar2.C(objG10);
                                                                androidx.compose.ui.d dVarA72 = androidx.compose.foundation.text.handwriting.a.a(zBooleanValue2, z20, (eh.a) objG10);
                                                                y2.v vVar72 = vVar3;
                                                                j10 = ((q1.b1) kVar2.f(j.f13367a)).f21656a;
                                                                zL8 = kVar2.l(i2Var6) | kVar2.j(j10);
                                                                objG11 = kVar2.g();
                                                                if (!zL8) {
                                                                    objG11 = new f1(i2Var6, j10);
                                                                    kVar2.C(objG11);
                                                                    f4 f4Var32 = f4Var;
                                                                    androidx.compose.ui.d dVarA82 = androidx.compose.ui.layout.c.a(androidx.compose.ui.c.a(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(dVar.h(androidx.compose.ui.draw.a.a(aVar4, (eh.l) objG11)), m1Var2, i2Var6, x2Var2).h(dVarA72).h(dVar62), new k3(nVar3, i2Var6)), new r1(i2Var6, x2Var2)).h(dVarA62), aVar102, new d4(f4Var32, z11, mVar)).h(dVarF2).h(coreTextFieldSemanticsModifier2), new e1(i2Var6));
                                                                    if (z11) {
                                                                        z16 = true;
                                                                    }
                                                                    if (z16) {
                                                                    }
                                                                    kVar = kVar2;
                                                                    b(dVarA82, x2Var2, f1.c.b(-492537660, new c1(qVar, i2Var6, l0Var, i11, i10, f4Var32, c0Var, q0Var, aVarA, dVarA42, dVarA52, dVarA, aVar3, x2Var2, z16, z12, lVar2, vVar72, dVar3), kVar), kVar, 384);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zL7 = kVar2.l(i2Var6) | kVar2.l(e0Var3) | (i362 != 4 ? true : z16) | (((i19 > 32 || !kVar2.K(oVar)) && (i32 & 48) != 32) ? z16 : true);
                                                    objG9 = kVar2.g();
                                                    if (zL7) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    oVar2 = oVar;
                }
                i20 = i35;
                c0Var3 = c0Var9;
                boolean z25 = (i32 & 48) != 32;
                zL = z24 | z25 | kVarP.l(vVar6) | kVarP.l(i0Var) | kVarP.l(aVar7) | kVarP.l(x2Var3);
                Object objG192 = kVarP.g();
                if (zL) {
                    o0Var2 = o0Var;
                    i2Var3 = i2Var7;
                    nVar3 = nVar6;
                    i21 = i33;
                    f4Var = f4Var2;
                    m1Var = m1Var3;
                    i22 = i20;
                    z16 = false;
                    c0321a = c0321a2;
                    i23 = i34;
                    aVar2 = aVar7;
                    oVar3 = oVar2;
                    mVar2 = mVar;
                    x0.k kVar52 = kVarP;
                    c0Var4 = c0Var3;
                    i1Var = new i1(i2Var3, z11, z12, e0Var4, c0Var, oVar3, vVar6, x2Var3, i0Var, aVar2);
                    e0Var = e0Var4;
                    vVar2 = vVar6;
                    x2Var = x2Var3;
                    z17 = z11;
                    c0Var5 = c0Var;
                    kVar52.C(i1Var);
                    kVar2 = kVar52;
                    d.a aVar82 = d.a.f1143b;
                    androidx.compose.ui.d dVarA22 = androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(aVar82, c0Var4), (eh.l) i1Var), z17, mVar2);
                    if (z17) {
                        x0.n1 n1VarK2 = bg.b.k(Boolean.valueOf((z17 || z12) ? z16 : true), kVar2);
                        pg.f0 f0Var2 = pg.f0.f21461a;
                        boolean zK32 = kVar2.K(n1VarK2) | kVar2.l(i2Var3) | kVar2.l(e0Var) | kVar2.l(x2Var);
                        if (i19 > 32) {
                            i2Var4 = i2Var3;
                            if ((i32 & 48) != 32) {
                                z18 = true;
                            }
                            z19 = zK32 | z18;
                            Object objG2022 = kVar2.g();
                            if (z19) {
                            }
                        }
                    }
                }
            } else {
                Long l10 = y4Var.f13711e;
                if (jCurrentTimeMillis > (l10 != null ? l10.longValue() : 0L) + 5000) {
                }
                objG = kVarP.g();
                if (objG == c0321a2) {
                }
                ph.i0 i0Var2 = (ph.i0) objG;
                objG2 = kVarP.g();
                if (objG2 == c0321a2) {
                }
                f0.a aVar72 = (f0.a) objG2;
                objG3 = kVarP.g();
                if (objG3 == c0321a2) {
                }
                m0.x2 x2Var32 = (m0.x2) objG3;
                y2.v vVar62 = vVar;
                x2Var32.f17548b = vVar62;
                x2Var32.f17552f = q0Var;
                x2Var32.f17549c = i2Var7.f13358v;
                x2Var32.f17550d = i2Var7;
                x2Var32.f17551e.setValue(c0Var);
                x2Var32.f17554h = (j2.f2) kVarP.f(j2.j2.f14777f);
                x2Var32.f17555i = i0Var2;
                x2Var32.f17556j = (j2.a5) kVarP.f(j2.j2.f14788q);
                x2Var32.f17557k = (y1.a) kVarP.f(j2.j2.f14783l);
                o1.c0 c0Var92 = c0Var2;
                x2Var32.f17558l = c0Var92;
                boolean z222 = !z12;
                x2Var32.f17559m.setValue(Boolean.valueOf(z222));
                x2Var32.f17560n.setValue(Boolean.valueOf(z11));
                boolean zL92 = kVarP.l(i2Var7);
                int i322 = i18;
                int i332 = i322 & V4Signature.MAX_SIGNING_INFOS_SIZE;
                boolean z232 = (i332 != 2048) | zL92;
                int i342 = i322 & 57344;
                boolean zL102 = z232 | (i342 != 16384) | kVarP.l(e0Var4);
                int i352 = i17;
                boolean z242 = zL102 | (i352 != 4);
                i19 = (i322 & 112) ^ 48;
                if (i19 <= 32) {
                }
                i20 = i352;
                c0Var3 = c0Var92;
                if ((i322 & 48) != 32) {
                }
                zL = z242 | z25 | kVarP.l(vVar62) | kVarP.l(i0Var2) | kVarP.l(aVar72) | kVarP.l(x2Var32);
                Object objG1922 = kVarP.g();
                if (zL) {
                }
            }
        } else {
            kVar = kVarP;
            kVar.v();
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new d1(c0Var, lVar, dVar, l0Var, q0Var, lVar2, mVar, i2Var, z10, i10, i11, oVar, g2Var, z11, z12, qVar, i12, i13);
        }
    }

    public static final void b(androidx.compose.ui.d dVar, m0.x2 x2Var, f1.b bVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-20551815);
        int i11 = (kVarP.K(dVar) ? 4 : 2) | i10 | (kVarP.l(x2Var) ? 32 : 16);
        if (kVarP.A(i11 & 1, (i11 & 147) != 146)) {
            g2.l0 l0VarD = z.g.d(d.a.f14602a, true);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            s0.b(x2Var, bVar, kVarP, (i11 >> 3) & 126);
            kVarP.T(true);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new o1(dVar, x2Var, bVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(m0.x2 x2Var, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-1436003720);
        int i11 = (kVarP.l(x2Var) ? 4 : 2) | i10;
        if (kVarP.A(i11 & 1, (i11 & 3) != 2)) {
            i2 i2Var = x2Var.f17550d;
            if (i2Var == null || !((Boolean) i2Var.f13351o.getValue()).booleanValue()) {
                kVarP.L(-288632802);
                kVarP.T(false);
            } else {
                i2 i2Var2 = x2Var.f17550d;
                t2.b bVar = i2Var2 != null ? i2Var2.f13337a.f13725a : null;
                if (bVar != null && bVar.f27761b.length() > 0) {
                    kVarP.L(-289940723);
                    boolean zK = kVarP.K(x2Var);
                    Object objG = kVarP.g();
                    j.a.C0321a c0321a = j.a.f31715a;
                    if (zK || objG == c0321a) {
                        objG = new m0.u2(x2Var);
                        kVarP.C(objG);
                    }
                    b3 b3Var = (b3) objG;
                    f3.d dVar = (f3.d) kVarP.f(j2.j2.f14779h);
                    y2.v vVar = x2Var.f17548b;
                    long j10 = x2Var.k().f33683b;
                    int i12 = t2.j0.f27838c;
                    int iB = vVar.b((int) (j10 >> 32));
                    i2 i2Var3 = x2Var.f17550d;
                    l4 l4VarD = i2Var3 != null ? i2Var3.d() : null;
                    kotlin.jvm.internal.r.b(l4VarD);
                    t2.h0 h0Var = l4VarD.f13418a;
                    float fN0 = (dVar.N0(f3.f13279a) / 2) + h0Var.c(jh.j.m(iB, 0, h0Var.f27819a.f27809a.f27761b.length())).f21131a;
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(r1.f21134d) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fN0) << 32);
                    boolean zJ = kVarP.j(jFloatToRawIntBits);
                    Object objG2 = kVarP.g();
                    if (zJ || objG2 == c0321a) {
                        objG2 = new a(jFloatToRawIntBits);
                        kVarP.C(objG2);
                    }
                    m0.w wVar = (m0.w) objG2;
                    boolean zL = kVarP.l(b3Var) | kVarP.l(x2Var);
                    Object objG3 = kVarP.g();
                    if (zL || objG3 == c0321a) {
                        objG3 = new b(b3Var, x2Var);
                        kVarP.C(objG3);
                    }
                    androidx.compose.ui.d dVarA = c2.s0.a(d.a.f1143b, b3Var, (PointerInputEventHandler) objG3);
                    boolean zJ2 = kVarP.j(jFloatToRawIntBits);
                    Object objG4 = kVarP.g();
                    if (zJ2 || objG4 == c0321a) {
                        objG4 = new c(jFloatToRawIntBits);
                        kVarP.C(objG4);
                    }
                    h.a(wVar, q2.q.a(dVarA, false, (eh.l) objG4), 0L, kVarP, 0);
                    kVarP.T(false);
                }
            }
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new d(x2Var, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(m0.x2 x2Var, boolean z10, x0.j jVar, int i10) {
        int i11;
        l4 l4VarD;
        x0.k kVarP = jVar.p(626339208);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(x2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.c(z10) ? 32 : 16;
        }
        if (!kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            kVarP.v();
        } else if (z10) {
            kVarP.L(-1290924834);
            i2 i2Var = x2Var.f17550d;
            t2.h0 h0Var = null;
            if (i2Var != null && (l4VarD = i2Var.d()) != null) {
                t2.h0 h0Var2 = l4VarD.f13418a;
                i2 i2Var2 = x2Var.f17550d;
                if (!(i2Var2 != null ? i2Var2.f13352p : true)) {
                    h0Var = h0Var2;
                }
            }
            if (h0Var == null) {
                kVarP.L(-1290601288);
            } else {
                kVarP.L(-1290601287);
                if (t2.j0.b(x2Var.k().f33683b)) {
                    kVarP.L(-1684179174);
                    kVarP.T(false);
                } else {
                    kVarP.L(-1685230508);
                    int iB = x2Var.f17548b.b((int) (x2Var.k().f33683b >> 32));
                    int iB2 = x2Var.f17548b.b((int) (x2Var.k().f33683b & BodyPartID.bodyIdMax));
                    e3.g gVarA = h0Var.a(iB);
                    e3.g gVarA2 = h0Var.a(Math.max(iB2 - 1, 0));
                    i2 i2Var3 = x2Var.f17550d;
                    if (i2Var3 == null || !((Boolean) i2Var3.f13349m.getValue()).booleanValue()) {
                        kVarP.L(-1684548198);
                        kVarP.T(false);
                    } else {
                        kVarP.L(-1684812473);
                        m0.d3.a(true, gVarA, x2Var, kVarP, ((i11 << 6) & 896) | 6);
                        kVarP.T(false);
                    }
                    i2 i2Var4 = x2Var.f17550d;
                    if (i2Var4 == null || !((Boolean) i2Var4.f13350n.getValue()).booleanValue()) {
                        kVarP.L(-1684200998);
                        kVarP.T(false);
                    } else {
                        kVarP.L(-1684464312);
                        m0.d3.a(false, gVarA2, x2Var, kVarP, ((i11 << 6) & 896) | 6);
                        kVarP.T(false);
                    }
                    kVarP.T(false);
                }
                i2 i2Var5 = x2Var.f17550d;
                if (i2Var5 != null) {
                    x0.x1 x1Var = i2Var5.f13348l;
                    if (!kotlin.jvm.internal.r.a(x2Var.f17567u.f33682a.f27761b, x2Var.k().f33682a.f27761b)) {
                        x1Var.setValue(Boolean.FALSE);
                    }
                    if (i2Var5.b()) {
                        if (((Boolean) x1Var.getValue()).booleanValue()) {
                            x2Var.p();
                        } else {
                            x2Var.l();
                        }
                    }
                    pg.f0 f0Var = pg.f0.f21461a;
                }
            }
            kVarP.T(false);
            kVarP.T(false);
        } else {
            kVarP.L(651160447);
            kVarP.T(false);
            x2Var.l();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p1(x2Var, z10, i10);
        }
    }

    public static final void e(i2 i2Var) {
        y2.n0 n0Var = i2Var.f13341e;
        if (n0Var != null) {
            i2Var.f13358v.invoke(y2.c0.b(i2Var.f13340d.f33734a, null, 0L, 3));
            y2.e0 e0Var = n0Var.f33750a;
            AtomicReference<y2.n0> atomicReference = e0Var.f33705b;
            while (true) {
                if (atomicReference.compareAndSet(n0Var, null)) {
                    e0Var.f33704a.c();
                    break;
                } else if (atomicReference.get() != n0Var) {
                    break;
                }
            }
        }
        i2Var.f13341e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Object, y2.n0] */
    public static final void f(y2.e0 e0Var, i2 i2Var, y2.c0 c0Var, y2.o oVar, y2.v vVar) {
        y2.j jVar = i2Var.f13340d;
        i2.b bVar = i2Var.f13358v;
        i2.a aVar = i2Var.f13359w;
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g3 g3Var = new g3(jVar, bVar, g0Var);
        y2.x xVar = e0Var.f33704a;
        xVar.e(c0Var, oVar, g3Var, aVar);
        ?? n0Var = new y2.n0(e0Var, xVar);
        e0Var.f33705b.set(n0Var);
        g0Var.f16327a = n0Var;
        i2Var.f13341e = n0Var;
        g(i2Var, c0Var, vVar);
    }

    public static final void g(i2 i2Var, y2.c0 c0Var, y2.v vVar) {
        h1.h hVarA = h.a.a();
        eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
        h1.h hVarB = h.a.b(hVarA);
        try {
            l4 l4VarD = i2Var.d();
            if (l4VarD == null) {
                return;
            }
            y2.n0 n0Var = i2Var.f13341e;
            if (n0Var == null) {
                return;
            }
            g2.v vVarC = i2Var.c();
            if (vVarC == null) {
                return;
            }
            i3.a(c0Var, i2Var.f13337a, l4VarD.f13418a, vVarC, n0Var, i2Var.b(), vVar);
            pg.f0 f0Var = pg.f0.f21461a;
        } finally {
            h.a.d(hVarA, hVarB, lVarE);
        }
    }
}
