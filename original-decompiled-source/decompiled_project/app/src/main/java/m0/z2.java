package m0;

import com.yalantis.ucrop.view.CropImageView;
import j2.a5;
import org.bouncycastle.asn1.cmc.BodyPartID;

@vg.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", f = "TextFieldSelectionManager.kt", l = {781}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public b f17604a;

    /* renamed from: b, reason: collision with root package name */
    public c f17605b;

    /* renamed from: c, reason: collision with root package name */
    public int f17606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x2 f17607d;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2 f17608a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x2 x2Var) {
            super(0);
            this.f17608a = x2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [eh.a, kotlin.jvm.internal.s] */
        @Override // eh.a
        public final pg.f0 invoke() {
            ?? r02 = this.f17608a.f17553g;
            if (r02 != 0) {
                r02.invoke();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2 f17609a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x2 x2Var) {
            super(0);
            this.f17609a = x2Var;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            x2 x2Var = this.f17609a;
            ph.i0 i0Var = x2Var.f17555i;
            if (i0Var != null) {
                ph.h.c(i0Var, null, ph.k0.f21556d, new a3(x2Var, null), 1);
            }
            x2Var.l();
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2 f17610a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x2 x2Var) {
            super(0);
            this.f17610a = x2Var;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            x2 x2Var = this.f17610a;
            ph.i0 i0Var = x2Var.f17555i;
            if (i0Var != null) {
                ph.h.c(i0Var, null, ph.k0.f21556d, new b3(x2Var, null), 1);
            }
            x2Var.l();
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2 f17611a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x2 x2Var) {
            super(0);
            this.f17611a = x2Var;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            x2 x2Var = this.f17611a;
            ph.i0 i0Var = x2Var.f17555i;
            if (i0Var != null) {
                ph.h.c(i0Var, null, ph.k0.f21556d, new c3(x2Var, null), 1);
            }
            x2Var.l();
            return pg.f0.f21461a;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x2 f17612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x2 x2Var) {
            super(0);
            this.f17612a = x2Var;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            this.f17612a.n();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(x2 x2Var, tg.e<? super z2> eVar) {
        super(2, eVar);
        this.f17607d = x2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new z2(this.f17607d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4 A[PHI: r2 r7
      0x00a4: PHI (r2v13 m0.z2$b) = (r2v6 m0.z2$b), (r2v32 m0.z2$b) binds: [B:26:0x006e, B:40:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r7v9 m0.z2$c) = (r7v5 m0.z2$c), (r7v17 m0.z2$c) binds: [B:26:0x006e, B:40:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020f  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [long] */
    /* JADX WARN: Type inference failed for: r18v4 */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i0.i2 i2Var;
        b bVar;
        c cVar;
        Object objB;
        c cVar2;
        boolean z10;
        d dVar;
        a5 a5Var;
        a5 a5Var2;
        p1.e eVar;
        boolean z11;
        int i10;
        long jY;
        ?? r18;
        float fIntBitsToFloat;
        long j10;
        g2.v vVarC;
        g2.v vVarC2;
        g2.v vVarC3;
        g2.v vVarC4;
        ug.a aVar = ug.a.f29706a;
        int i11 = this.f17606c;
        x2 x2Var = this.f17607d;
        if (i11 == 0) {
            pg.q.b(obj);
            if (!x2Var.i() || ((i2Var = x2Var.f17550d) != null && !((Boolean) i2Var.f13353q.getValue()).booleanValue())) {
                return pg.f0.f21461a;
            }
            bVar = !t2.j0.b(x2Var.k().f33683b) ? new b(x2Var) : null;
            cVar = (t2.j0.b(x2Var.k().f33683b) || !x2Var.h()) ? null : new c(x2Var);
            if (x2Var.h()) {
                j2.f2 f2Var = x2Var.f17554h;
                if (f2Var != null) {
                    this.f17604a = bVar;
                    this.f17605b = cVar;
                    this.f17606c = 1;
                    objB = f2Var.b();
                    if (objB == aVar) {
                        return aVar;
                    }
                    cVar2 = cVar;
                }
                z10 = false;
                if (z10) {
                    dVar = new d(x2Var);
                }
                b bVar2 = bVar;
                c cVar3 = cVar;
                e eVar2 = t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length() ? new e(x2Var) : null;
                a aVar2 = (x2Var.h() || !t2.j0.b(x2Var.k().f33683b)) ? null : new a(x2Var);
                a5Var = x2Var.f17556j;
                if (a5Var != null) {
                    i0.i2 i2Var2 = x2Var.f17550d;
                    if (i2Var2 == null) {
                        a5Var2 = a5Var;
                        eVar = p1.e.f21130e;
                        a5Var2.c(eVar, bVar2, dVar, cVar3, eVar2, aVar2);
                    } else {
                        i0.i2 i2Var3 = i2Var2.f13352p ? null : i2Var2;
                        if (i2Var3 != null) {
                            int iB = x2Var.f17548b.b((int) (x2Var.k().f33683b >> 32));
                            a5Var2 = a5Var;
                            int iB2 = x2Var.f17548b.b((int) (x2Var.k().f33683b & BodyPartID.bodyIdMax));
                            i0.i2 i2Var4 = x2Var.f17550d;
                            long jY2 = (i2Var4 == null || (vVarC4 = i2Var4.c()) == null) ? 0L : vVarC4.Y(x2Var.j(true));
                            i0.i2 i2Var5 = x2Var.f17550d;
                            if (i2Var5 == null || (vVarC3 = i2Var5.c()) == null) {
                                z11 = 32;
                                i10 = iB2;
                                jY = 0;
                            } else {
                                z11 = 32;
                                i10 = iB2;
                                jY = vVarC3.Y(x2Var.j(false));
                            }
                            i0.i2 i2Var6 = x2Var.f17550d;
                            float fIntBitsToFloat2 = CropImageView.DEFAULT_ASPECT_RATIO;
                            if (i2Var6 == null || (vVarC2 = i2Var6.c()) == null) {
                                r18 = z11;
                                fIntBitsToFloat = 0.0f;
                            } else {
                                boolean z12 = z11;
                                fIntBitsToFloat = Float.intBitsToFloat((int) (vVarC2.Y((Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << (z12 ? 1L : 0L)) | (Float.floatToRawIntBits(i2Var3.d() != null ? r9.f13418a.c(iB).f21132b : 0.0f) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
                                r18 = z12;
                            }
                            i0.i2 i2Var7 = x2Var.f17550d;
                            if (i2Var7 == null || (vVarC = i2Var7.c()) == null) {
                                j10 = jY;
                            } else {
                                j10 = jY;
                                fIntBitsToFloat2 = Float.intBitsToFloat((int) (vVarC.Y((Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << r18) | (Float.floatToRawIntBits(i2Var3.d() != null ? r4.f13418a.c(i10).f21132b : 0.0f) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
                            }
                            int i12 = (int) (jY2 >> r18);
                            int i13 = (int) (j10 >> r18);
                            eVar = new p1.e(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), (i2Var3.f13337a.f13731g.getDensity() * 25) + Math.max(Float.intBitsToFloat((int) (jY2 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))));
                        }
                        a5Var2.c(eVar, bVar2, dVar, cVar3, eVar2, aVar2);
                    }
                }
                return pg.f0.f21461a;
            }
            dVar = null;
            b bVar22 = bVar;
            c cVar32 = cVar;
            if (t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) {
            }
            if (x2Var.h()) {
            }
            a5Var = x2Var.f17556j;
            if (a5Var != null) {
            }
            return pg.f0.f21461a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar2 = this.f17605b;
        bVar = this.f17604a;
        pg.q.b(obj);
        objB = obj;
        j2.e2 e2Var = (j2.e2) objB;
        if (e2Var != null && e2Var.f14713a.getDescription().hasMimeType("text/*")) {
            cVar = cVar2;
            z10 = true;
            if (z10) {
            }
            b bVar222 = bVar;
            c cVar322 = cVar;
            if (t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) {
            }
            if (x2Var.h()) {
            }
            a5Var = x2Var.f17556j;
            if (a5Var != null) {
            }
            return pg.f0.f21461a;
        }
        cVar = cVar2;
        z10 = false;
        if (z10) {
            dVar = null;
        }
        b bVar2222 = bVar;
        c cVar3222 = cVar;
        if (t2.j0.c(x2Var.k().f33683b) == x2Var.k().f33682a.f27761b.length()) {
        }
        if (x2Var.h()) {
        }
        a5Var = x2Var.f17556j;
        if (a5Var != null) {
        }
        return pg.f0.f21461a;
    }
}
