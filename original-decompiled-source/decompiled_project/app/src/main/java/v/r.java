package v;

import java.util.List;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {245, 251, 1061, 1101, 278, 1148, 1190, 1202}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f30037a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30038b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30039c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f30040d;

    /* renamed from: e, reason: collision with root package name */
    public g2 f30041e;

    /* renamed from: f, reason: collision with root package name */
    public c2.b0 f30042f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30043g;

    /* renamed from: h, reason: collision with root package name */
    public float f30044h;

    /* renamed from: j, reason: collision with root package name */
    public int f30045j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f30046k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ eh.a<Boolean> f30047l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f30048m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0 f30049n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f30050p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f30051q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f30052r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f30053s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(eh.a<Boolean> aVar, kotlin.jvm.internal.f0 f0Var, t0 t0Var, eh.q<? super c2.b0, ? super c2.b0, ? super p1.c, pg.f0> qVar, eh.p<? super c2.b0, ? super p1.c, pg.f0> pVar, eh.a<pg.f0> aVar2, eh.l<? super c2.b0, pg.f0> lVar, tg.e<? super r> eVar) {
        super(2, eVar);
        this.f30047l = aVar;
        this.f30048m = f0Var;
        this.f30049n = t0Var;
        this.f30050p = (kotlin.jvm.internal.s) qVar;
        this.f30051q = (kotlin.jvm.internal.s) pVar;
        this.f30052r = (kotlin.jvm.internal.s) aVar2;
        this.f30053s = (kotlin.jvm.internal.s) lVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [eh.q, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eh.p, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r6v0, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        r rVar = new r(this.f30047l, this.f30048m, this.f30049n, this.f30050p, this.f30051q, this.f30052r, this.f30053s, eVar);
        rVar.f30046k = obj;
        return rVar;
    }

    @Override // eh.p
    public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
        return ((r) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0415, code lost:
    
        if (r4.C1(r7, r24) == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x048a, code lost:
    
        if (r4 == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0509, code lost:
    
        if (r9 == com.yalantis.ucrop.view.CropImageView.DEFAULT_ASPECT_RATIO) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x017b, code lost:
    
        if (r5 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0183, code lost:
    
        if (r2 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02bf, code lost:
    
        if (r5 == r1) goto L168;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0360 A[PHI: r2 r3 r4 r5 r6 r7 r8 r9 r11 r16 r18
      0x0360: PHI (r2v38 float) = (r2v25 float), (r2v39 float) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r3v33 c2.b0) = (r3v23 c2.b0), (r3v35 c2.b0) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r4v27 c2.c) = (r4v21 c2.c), (r4v30 c2.c) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r5v36 c2.c) = (r5v20 c2.c), (r5v38 c2.c) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r6v25 kotlin.jvm.internal.f0) = (r6v14 kotlin.jvm.internal.f0), (r6v26 kotlin.jvm.internal.f0) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r7v6 v.t0) = (r7v0 v.t0), (r7v20 v.t0) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r8v36 v.g2) = (r8v18 v.g2), (r8v37 v.g2) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r9v21 java.lang.Object) = (r9v8 java.lang.Object), (r9v27 java.lang.Object) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r11v17 kotlin.jvm.internal.f0) = (r11v12 kotlin.jvm.internal.f0), (r11v18 kotlin.jvm.internal.f0) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r16v21 long) = (r16v15 long), (r16v22 long) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]
      0x0360: PHI (r18v21 long) = (r18v15 long), (r18v22 long) binds: [B:8:0x0064, B:113:0x035c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ca A[PHI: r2 r3 r4 r5 r6 r13 r14 r15 r16 r18
      0x01ca: PHI (r2v15 v.g2) = (r2v13 v.g2), (r2v16 v.g2) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r3v11 c2.c) = (r3v9 c2.c), (r3v13 c2.c) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r4v7 c2.c) = (r4v5 c2.c), (r4v10 c2.c) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r5v9 c2.b0) = (r5v7 c2.b0), (r5v10 c2.b0) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r6v4 float) = (r6v2 float), (r6v5 float) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r13v4 kotlin.jvm.internal.f0) = (r13v2 kotlin.jvm.internal.f0), (r13v5 kotlin.jvm.internal.f0) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r14v4 kotlin.jvm.internal.f0) = (r14v2 kotlin.jvm.internal.f0), (r14v5 kotlin.jvm.internal.f0) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r15v2 java.lang.Object) = (r15v1 java.lang.Object), (r15v11 java.lang.Object) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r16v7 long) = (r16v5 long), (r16v8 long) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r18v7 long) = (r18v5 long), (r18v8 long) binds: [B:11:0x00de, B:31:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028e  */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eh.l, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r1v3, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v33, types: [eh.p, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r6v21, types: [eh.q, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0324 -> B:155:0x0422). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x032c -> B:112:0x0342). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x03cb -> B:148:0x03f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x03f2 -> B:148:0x03f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0415 -> B:152:0x0419). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x042e -> B:80:0x028c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x048a -> B:169:0x048d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0191 -> B:28:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01fe -> B:28:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0245 -> B:73:0x0279). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x024b -> B:30:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x026e -> B:70:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x02e9 -> B:86:0x02a7). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j10;
        long j11;
        c2.c cVar;
        Object objB;
        c2.c cVar2;
        c2.b0 b0Var;
        boolean zBooleanValue;
        Object objC;
        c2.b0 b0Var2;
        float f10;
        g2 g2Var;
        kotlin.jvm.internal.f0 f0Var;
        kotlin.jvm.internal.f0 f0Var2;
        c2.b0 b0Var3;
        c2.c cVar3;
        c2.b0 b0Var4;
        Object obj2;
        int i10;
        int i11;
        List list;
        c2.b0 b0Var5;
        c2.b0 b0Var6;
        Object objC1;
        float f11;
        Object objC12;
        g2 g2Var2;
        kotlin.jvm.internal.f0 f0Var3;
        kotlin.jvm.internal.f0 f0Var4;
        c2.c cVar4;
        t0 t0Var;
        long j12;
        t0 t0Var2;
        c2.b0 b0Var7;
        int size;
        int i12;
        List list2;
        c2.b0 b0Var8;
        c2.b0 b0Var9;
        Object obj3;
        List list3;
        int i13;
        int i14;
        c2.c cVar5;
        eh.p pVar;
        c2.c cVar6;
        kotlin.jvm.internal.f0 f0Var5;
        c2.b0 b0Var10;
        Object objC13;
        eh.p pVar2;
        eh.p pVar3;
        c2.b0 b0Var11;
        Object obj4;
        ug.a aVar = ug.a.f29706a;
        int i15 = this.f30045j;
        t0 t0Var3 = this.f30049n;
        long j13 = 0;
        kotlin.jvm.internal.f0 f0Var6 = this.f30048m;
        switch (i15) {
            case 0:
                j10 = 9205357640488583168L;
                j11 = 9223372034707292159L;
                pg.q.b(obj);
                cVar = (c2.c) this.f30046k;
                c2.t tVar = c2.t.f4694a;
                this.f30046k = cVar;
                this.f30045j = 1;
                objB = t1.b(cVar, false, tVar, this);
                if (objB != aVar) {
                    cVar2 = cVar;
                    b0Var = (c2.b0) objB;
                    zBooleanValue = this.f30047l.invoke().booleanValue();
                    if (!zBooleanValue) {
                        b0Var.a();
                    }
                    this.f30046k = cVar2;
                    this.f30037a = b0Var;
                    this.f30043g = zBooleanValue;
                    this.f30045j = 2;
                    objC = t1.c(cVar2, this, 2);
                    break;
                }
                return aVar;
            case 1:
                j10 = 9205357640488583168L;
                j11 = 9223372034707292159L;
                cVar = (c2.c) this.f30046k;
                pg.q.b(obj);
                objB = obj;
                cVar2 = cVar;
                b0Var = (c2.b0) objB;
                zBooleanValue = this.f30047l.invoke().booleanValue();
                if (!zBooleanValue) {
                }
                this.f30046k = cVar2;
                this.f30037a = b0Var;
                this.f30043g = zBooleanValue;
                this.f30045j = 2;
                objC = t1.c(cVar2, this, 2);
                break;
            case 2:
                j10 = 9205357640488583168L;
                j11 = 9223372034707292159L;
                zBooleanValue = this.f30043g;
                b0Var = (c2.b0) this.f30037a;
                cVar2 = (c2.c) this.f30046k;
                pg.q.b(obj);
                objC = obj;
                b0Var2 = (c2.b0) objC;
                f0Var6.f16326a = 0L;
                break;
            case 3:
                j10 = 9205357640488583168L;
                j11 = 9223372034707292159L;
                float f12 = this.f30044h;
                g2 g2Var3 = this.f30041e;
                kotlin.jvm.internal.f0 f0Var7 = this.f30040d;
                kotlin.jvm.internal.f0 f0Var8 = (kotlin.jvm.internal.f0) this.f30039c;
                c2.c cVar7 = (c2.c) this.f30038b;
                c2.b0 b0Var12 = (c2.b0) this.f30037a;
                c2.c cVar8 = (c2.c) this.f30046k;
                pg.q.b(obj);
                f10 = f12;
                g2Var = g2Var3;
                c2.c cVar9 = cVar8;
                f0Var = f0Var8;
                b0Var2 = b0Var12;
                f0Var2 = f0Var7;
                cVar2 = cVar7;
                Object objC14 = obj;
                c2.r rVar = (c2.r) objC14;
                ?? r12 = rVar.f4687a;
                int size2 = r12.size();
                int i16 = 0;
                List list4 = r12;
                while (true) {
                    if (i16 >= size2) {
                        ?? r92 = list4.get(i16);
                        i10 = i16;
                        b0Var3 = r92;
                        i11 = size2;
                        list = list4;
                        if (!b0.a0.b(((c2.b0) r92).f4593a, f0Var2.f16326a)) {
                            i16 = i10 + 1;
                            list4 = list;
                            size2 = i11;
                        }
                    } else {
                        b0Var3 = null;
                    }
                }
                c2.b0 b0Var13 = b0Var3;
                if (b0Var13 != null && !b0Var13.b()) {
                    if (c2.s.c(b0Var13)) {
                        long jA = g2Var.a(b0Var13, f10);
                        if ((jA & j11) == j10) {
                            c2.t tVar2 = c2.t.f4696c;
                            this.f30046k = cVar9;
                            this.f30037a = b0Var2;
                            this.f30038b = cVar2;
                            this.f30039c = f0Var;
                            this.f30040d = f0Var2;
                            this.f30041e = g2Var;
                            this.f30042f = b0Var13;
                            this.f30044h = f10;
                            this.f30045j = 4;
                            if (cVar2.C1(tVar2, this) != aVar) {
                                cVar3 = cVar9;
                                b0Var4 = b0Var13;
                                if (!b0Var4.b()) {
                                    cVar2 = cVar3;
                                    b0Var13 = null;
                                    if (b0Var13 == null) {
                                    }
                                    b0Var = b0Var13;
                                    if (b0Var == null) {
                                    }
                                    t0 t0Var4 = t0Var3;
                                    if (b0Var != null) {
                                    }
                                    return pg.f0.f21461a;
                                }
                                cVar9 = cVar3;
                            }
                            return aVar;
                        }
                        b0Var13.a();
                        f0Var.f16326a = jA;
                        if (b0Var13.b()) {
                            cVar2 = cVar9;
                            if (b0Var13 == null && !b0Var13.b()) {
                                j13 = 0;
                                long j14 = b0Var2.f4593a;
                                int i17 = b0Var2.f4601i;
                                if (!u.e(cVar2.M(), j14)) {
                                    f10 = u.f(cVar2.getViewConfiguration(), i17);
                                    f0Var2 = new kotlin.jvm.internal.f0();
                                    f0Var2.f16326a = j14;
                                    g2Var = new g2(j13, t0Var3);
                                    cVar9 = cVar2;
                                    f0Var = f0Var6;
                                    this.f30046k = cVar9;
                                    this.f30037a = b0Var2;
                                    this.f30038b = cVar2;
                                    this.f30039c = f0Var;
                                    this.f30040d = f0Var2;
                                    this.f30041e = g2Var;
                                    this.f30042f = null;
                                    this.f30044h = f10;
                                    this.f30045j = 3;
                                    objC14 = cVar2.C1(c2.t.f4695b, this);
                                    if (objC14 != aVar) {
                                        c2.r rVar2 = (c2.r) objC14;
                                        ?? r122 = rVar2.f4687a;
                                        int size22 = r122.size();
                                        int i162 = 0;
                                        List list42 = r122;
                                        while (true) {
                                            if (i162 >= size22) {
                                            }
                                            i162 = i10 + 1;
                                            list42 = list;
                                            size22 = i11;
                                        }
                                        c2.b0 b0Var132 = b0Var3;
                                        if (b0Var132 != null) {
                                            if (c2.s.c(b0Var132)) {
                                            }
                                        }
                                    }
                                    return aVar;
                                }
                                b0Var132 = null;
                                if (b0Var132 == null) {
                                }
                                b0Var = b0Var132;
                                if (b0Var == null) {
                                }
                                t0 t0Var42 = t0Var3;
                                if (b0Var != null) {
                                }
                                return pg.f0.f21461a;
                            }
                            b0Var = b0Var132;
                            if (b0Var == null) {
                                ?? r22 = cVar2.M().f4687a;
                                int size3 = r22.size();
                                for (int i18 = 0; i18 < size3; i18++) {
                                    if (((c2.b0) r22.get(i18)).f4596d) {
                                        b0Var5 = b0Var;
                                        b0Var6 = b0Var2;
                                        c2.t tVar3 = c2.t.f4696c;
                                        this.f30046k = cVar2;
                                        this.f30037a = b0Var6;
                                        this.f30038b = b0Var5;
                                        this.f30039c = null;
                                        this.f30040d = null;
                                        this.f30041e = null;
                                        this.f30042f = null;
                                        this.f30045j = 5;
                                        objC1 = cVar2.C1(tVar3, this);
                                        break;
                                    }
                                }
                            }
                            t0 t0Var422 = t0Var3;
                            if (b0Var != null) {
                                this.f30050p.b(b0Var2, b0Var, new p1.c(f0Var6.f16326a));
                                p1.c cVar10 = new p1.c(f0Var6.f16326a);
                                ?? r52 = this.f30051q;
                                r52.invoke(b0Var, cVar10);
                                j12 = b0Var.f4593a;
                                if (!u.e(cVar2.M(), j12)) {
                                    t0Var2 = t0Var422;
                                    pVar2 = r52;
                                    kotlin.jvm.internal.f0 f0Var9 = new kotlin.jvm.internal.f0();
                                    f0Var9.f16326a = j12;
                                    cVar6 = cVar2;
                                    f0Var5 = f0Var9;
                                    cVar5 = cVar6;
                                    pVar = pVar2;
                                    this.f30046k = cVar5;
                                    this.f30037a = pVar;
                                    this.f30038b = t0Var2;
                                    this.f30039c = cVar6;
                                    this.f30040d = f0Var5;
                                    b0Var10 = null;
                                    this.f30041e = null;
                                    this.f30042f = null;
                                    this.f30045j = 8;
                                    objC13 = cVar6.C1(c2.t.f4695b, this);
                                    pVar3 = pVar;
                                    break;
                                } else {
                                    b0Var7 = null;
                                    if (b0Var7 != null) {
                                        this.f30052r.invoke();
                                    } else {
                                        this.f30053s.invoke(b0Var7);
                                    }
                                }
                            }
                            return pg.f0.f21461a;
                        }
                        g2Var.f29888b = 0L;
                    } else {
                        ?? r82 = rVar2.f4687a;
                        int size4 = r82.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size4) {
                                obj2 = r82.get(i19);
                                if (!((c2.b0) obj2).f4596d) {
                                    i19++;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        c2.b0 b0Var14 = (c2.b0) obj2;
                        if (b0Var14 != null) {
                            f0Var2.f16326a = b0Var14.f4593a;
                        }
                    }
                    this.f30046k = cVar9;
                    this.f30037a = b0Var2;
                    this.f30038b = cVar2;
                    this.f30039c = f0Var;
                    this.f30040d = f0Var2;
                    this.f30041e = g2Var;
                    this.f30042f = null;
                    this.f30044h = f10;
                    this.f30045j = 3;
                    objC14 = cVar2.C1(c2.t.f4695b, this);
                    if (objC14 != aVar) {
                    }
                    return aVar;
                }
                cVar2 = cVar9;
                b0Var132 = null;
                if (b0Var132 == null) {
                }
                b0Var = b0Var132;
                if (b0Var == null) {
                }
                t0 t0Var4222 = t0Var3;
                if (b0Var != null) {
                }
                return pg.f0.f21461a;
            case 4:
                j10 = 9205357640488583168L;
                j11 = 9223372034707292159L;
                float f13 = this.f30044h;
                b0Var4 = this.f30042f;
                g2 g2Var4 = this.f30041e;
                kotlin.jvm.internal.f0 f0Var10 = this.f30040d;
                kotlin.jvm.internal.f0 f0Var11 = (kotlin.jvm.internal.f0) this.f30039c;
                c2.c cVar11 = (c2.c) this.f30038b;
                c2.b0 b0Var15 = (c2.b0) this.f30037a;
                cVar3 = (c2.c) this.f30046k;
                pg.q.b(obj);
                f10 = f13;
                g2Var = g2Var4;
                cVar2 = cVar11;
                f0Var2 = f0Var10;
                b0Var2 = b0Var15;
                f0Var = f0Var11;
                if (!b0Var4.b()) {
                }
                break;
            case 5:
                j10 = 9205357640488583168L;
                j11 = 9223372034707292159L;
                b0Var5 = (c2.b0) this.f30038b;
                b0Var6 = (c2.b0) this.f30037a;
                cVar2 = (c2.c) this.f30046k;
                pg.q.b(obj);
                objC1 = obj;
                ?? r53 = ((c2.r) objC1).f4687a;
                int size5 = r53.size();
                int i20 = 0;
                while (true) {
                    if (i20 < size5) {
                        if (((c2.b0) r53.get(i20)).b()) {
                            int size6 = r53.size();
                            for (int i21 = 0; i21 < size6; i21++) {
                                if (((c2.b0) r53.get(i21)).f4596d) {
                                    break;
                                }
                            }
                        } else {
                            i20++;
                        }
                    }
                }
                int size7 = r53.size();
                for (int i22 = 0; i22 < size7; i22++) {
                    if (((c2.b0) r53.get(i22)).f4596d) {
                        c2.b0 b0Var16 = (c2.b0) qg.x.D(r53);
                        long jF = p1.c.f(b0Var16 != null ? b0Var16.f4595c : 0L, b0Var6.f4595c);
                        long j15 = b0Var6.f4593a;
                        int i23 = b0Var6.f4601i;
                        if (u.e(cVar2.M(), j15)) {
                            b0Var2 = b0Var6;
                            t0Var = t0Var3;
                            b0Var = null;
                            t0Var3 = t0Var;
                            if (b0Var == null) {
                            }
                            t0 t0Var42222 = t0Var3;
                            if (b0Var != null) {
                            }
                            return pg.f0.f21461a;
                        }
                        f11 = u.f(cVar2.getViewConfiguration(), i23);
                        f0Var3 = new kotlin.jvm.internal.f0();
                        f0Var3.f16326a = j15;
                        g2Var2 = new g2(jF, t0Var3);
                        cVar4 = cVar2;
                        f0Var4 = f0Var6;
                        this.f30046k = cVar4;
                        this.f30037a = b0Var6;
                        this.f30038b = cVar2;
                        this.f30039c = f0Var4;
                        this.f30040d = f0Var3;
                        this.f30041e = g2Var2;
                        this.f30042f = null;
                        this.f30044h = f11;
                        this.f30045j = 6;
                        objC12 = cVar2.C1(c2.t.f4695b, this);
                        if (objC12 != aVar) {
                            c2.r rVar3 = (c2.r) objC12;
                            ?? r123 = rVar3.f4687a;
                            size = r123.size();
                            i12 = 0;
                            list2 = r123;
                            while (true) {
                                if (i12 >= size) {
                                    ?? r15 = list2.get(i12);
                                    t0Var = t0Var3;
                                    list3 = list2;
                                    i13 = size;
                                    i14 = i12;
                                    if (b0.a0.b(((c2.b0) r15).f4593a, f0Var3.f16326a)) {
                                        b0Var8 = r15;
                                    } else {
                                        i12 = i14 + 1;
                                        size = i13;
                                        t0Var3 = t0Var;
                                        list2 = list3;
                                    }
                                } else {
                                    t0Var = t0Var3;
                                    b0Var8 = null;
                                }
                            }
                            b0Var9 = b0Var8;
                            if (b0Var9 != null && !b0Var9.b()) {
                                if (c2.s.c(b0Var9)) {
                                    ?? r72 = rVar3.f4687a;
                                    int size8 = r72.size();
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 < size8) {
                                            obj3 = r72.get(i24);
                                            if (!((c2.b0) obj3).f4596d) {
                                                i24++;
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    c2.b0 b0Var17 = (c2.b0) obj3;
                                    if (b0Var17 != null) {
                                        f0Var3.f16326a = b0Var17.f4593a;
                                    }
                                } else if ((g2Var2.a(b0Var9, f11) & j11) == j10) {
                                    c2.t tVar4 = c2.t.f4696c;
                                    this.f30046k = cVar4;
                                    this.f30037a = b0Var6;
                                    this.f30038b = cVar2;
                                    this.f30039c = f0Var4;
                                    this.f30040d = f0Var3;
                                    this.f30041e = g2Var2;
                                    this.f30042f = b0Var9;
                                    this.f30044h = f11;
                                    this.f30045j = 7;
                                    break;
                                } else {
                                    b0Var9.a();
                                    f0Var4.f16326a = c2.s.e(b0Var9, false);
                                    if (b0Var9.b()) {
                                        cVar2 = cVar4;
                                        b0Var2 = b0Var6;
                                        b0Var = b0Var9;
                                        t0Var3 = t0Var;
                                        if (b0Var == null) {
                                        }
                                        t0 t0Var422222 = t0Var3;
                                        if (b0Var != null) {
                                        }
                                        return pg.f0.f21461a;
                                    }
                                    g2Var2.f29888b = 0L;
                                }
                                t0Var3 = t0Var;
                                this.f30046k = cVar4;
                                this.f30037a = b0Var6;
                                this.f30038b = cVar2;
                                this.f30039c = f0Var4;
                                this.f30040d = f0Var3;
                                this.f30041e = g2Var2;
                                this.f30042f = null;
                                this.f30044h = f11;
                                this.f30045j = 6;
                                objC12 = cVar2.C1(c2.t.f4695b, this);
                                if (objC12 != aVar) {
                                }
                            }
                            cVar2 = cVar4;
                            b0Var2 = b0Var6;
                            b0Var = null;
                            t0Var3 = t0Var;
                            if (b0Var == null) {
                            }
                            t0 t0Var4222222 = t0Var3;
                            if (b0Var != null) {
                            }
                            return pg.f0.f21461a;
                        }
                        return aVar;
                    }
                }
                b0Var2 = b0Var6;
                b0Var = b0Var5;
                if (b0Var == null) {
                }
                t0 t0Var42222222 = t0Var3;
                if (b0Var != null) {
                }
                return pg.f0.f21461a;
            case 6:
                j10 = 9205357640488583168L;
                j11 = 9223372034707292159L;
                f11 = this.f30044h;
                g2 g2Var5 = this.f30041e;
                kotlin.jvm.internal.f0 f0Var12 = this.f30040d;
                kotlin.jvm.internal.f0 f0Var13 = (kotlin.jvm.internal.f0) this.f30039c;
                c2.c cVar12 = (c2.c) this.f30038b;
                c2.b0 b0Var18 = (c2.b0) this.f30037a;
                c2.c cVar13 = (c2.c) this.f30046k;
                pg.q.b(obj);
                objC12 = obj;
                g2Var2 = g2Var5;
                f0Var3 = f0Var12;
                cVar2 = cVar12;
                b0Var6 = b0Var18;
                f0Var4 = f0Var13;
                cVar4 = cVar13;
                c2.r rVar32 = (c2.r) objC12;
                ?? r1232 = rVar32.f4687a;
                size = r1232.size();
                i12 = 0;
                list2 = r1232;
                while (true) {
                    if (i12 >= size) {
                    }
                    i12 = i14 + 1;
                    size = i13;
                    t0Var3 = t0Var;
                    list2 = list3;
                }
                b0Var9 = b0Var8;
                if (b0Var9 != null) {
                    if (c2.s.c(b0Var9)) {
                    }
                    t0Var3 = t0Var;
                    this.f30046k = cVar4;
                    this.f30037a = b0Var6;
                    this.f30038b = cVar2;
                    this.f30039c = f0Var4;
                    this.f30040d = f0Var3;
                    this.f30041e = g2Var2;
                    this.f30042f = null;
                    this.f30044h = f11;
                    this.f30045j = 6;
                    objC12 = cVar2.C1(c2.t.f4695b, this);
                    if (objC12 != aVar) {
                    }
                    return aVar;
                }
                cVar2 = cVar4;
                b0Var2 = b0Var6;
                b0Var = null;
                t0Var3 = t0Var;
                if (b0Var == null) {
                }
                t0 t0Var422222222 = t0Var3;
                if (b0Var != null) {
                }
                return pg.f0.f21461a;
            case 7:
                f11 = this.f30044h;
                b0Var9 = this.f30042f;
                g2 g2Var6 = this.f30041e;
                j10 = 9205357640488583168L;
                kotlin.jvm.internal.f0 f0Var14 = this.f30040d;
                kotlin.jvm.internal.f0 f0Var15 = (kotlin.jvm.internal.f0) this.f30039c;
                j11 = 9223372034707292159L;
                c2.c cVar14 = (c2.c) this.f30038b;
                c2.b0 b0Var19 = (c2.b0) this.f30037a;
                c2.c cVar15 = (c2.c) this.f30046k;
                pg.q.b(obj);
                f0Var3 = f0Var14;
                b0Var6 = b0Var19;
                t0Var = t0Var3;
                f0Var4 = f0Var15;
                cVar2 = cVar14;
                cVar4 = cVar15;
                g2Var2 = g2Var6;
                if (b0Var9.b()) {
                    cVar2 = cVar4;
                    b0Var2 = b0Var6;
                    b0Var = null;
                    t0Var3 = t0Var;
                    if (b0Var == null) {
                    }
                    t0 t0Var4222222222 = t0Var3;
                    if (b0Var != null) {
                    }
                    return pg.f0.f21461a;
                }
                t0Var3 = t0Var;
                this.f30046k = cVar4;
                this.f30037a = b0Var6;
                this.f30038b = cVar2;
                this.f30039c = f0Var4;
                this.f30040d = f0Var3;
                this.f30041e = g2Var2;
                this.f30042f = null;
                this.f30044h = f11;
                this.f30045j = 6;
                objC12 = cVar2.C1(c2.t.f4695b, this);
                if (objC12 != aVar) {
                }
                return aVar;
            case 8:
                f0Var5 = this.f30040d;
                cVar6 = (c2.c) this.f30039c;
                t0 t0Var5 = (t0) this.f30038b;
                eh.p pVar4 = (eh.p) this.f30037a;
                cVar5 = (c2.c) this.f30046k;
                pg.q.b(obj);
                t0Var2 = t0Var5;
                b0Var10 = null;
                objC13 = obj;
                pVar3 = pVar4;
                c2.r rVar4 = (c2.r) objC13;
                ?? r83 = rVar4.f4687a;
                int size9 = r83.size();
                int i25 = 0;
                List list5 = r83;
                while (true) {
                    if (i25 < size9) {
                        b0Var11 = list5.get(i25);
                        List list6 = list5;
                        int i26 = size9;
                        if (!b0.a0.b(((c2.b0) b0Var11).f4593a, f0Var5.f16326a)) {
                            i25++;
                            size9 = i26;
                            list5 = list6;
                        }
                    } else {
                        b0Var11 = b0Var10;
                    }
                }
                c2.b0 b0Var20 = b0Var11;
                if (b0Var20 != null) {
                    if (!c2.s.c(b0Var20)) {
                        long jE = c2.s.e(b0Var20, true);
                        pVar = pVar3;
                        break;
                    } else {
                        ?? r42 = rVar4.f4687a;
                        int size10 = r42.size();
                        int i27 = 0;
                        while (true) {
                            if (i27 < size10) {
                                obj4 = r42.get(i27);
                                if (!((c2.b0) obj4).f4596d) {
                                    i27++;
                                }
                            } else {
                                obj4 = b0Var10;
                            }
                        }
                        c2.b0 b0Var21 = (c2.b0) obj4;
                        if (b0Var21 != null) {
                            f0Var5.f16326a = b0Var21.f4593a;
                            pVar = pVar3;
                        }
                    }
                    this.f30046k = cVar5;
                    this.f30037a = pVar;
                    this.f30038b = t0Var2;
                    this.f30039c = cVar6;
                    this.f30040d = f0Var5;
                    b0Var10 = null;
                    this.f30041e = null;
                    this.f30042f = null;
                    this.f30045j = 8;
                    objC13 = cVar6.C1(c2.t.f4695b, this);
                    pVar3 = pVar;
                    break;
                } else {
                    b0Var20 = b0Var10;
                }
                if (b0Var20 == null || b0Var20.b()) {
                    b0Var7 = b0Var10;
                } else if (c2.s.c(b0Var20)) {
                    b0Var7 = b0Var20;
                } else {
                    pVar3.invoke(b0Var20, new p1.c(c2.s.e(b0Var20, false)));
                    b0Var20.a();
                    cVar2 = cVar5;
                    j12 = b0Var20.f4593a;
                    pVar2 = pVar3;
                    kotlin.jvm.internal.f0 f0Var92 = new kotlin.jvm.internal.f0();
                    f0Var92.f16326a = j12;
                    cVar6 = cVar2;
                    f0Var5 = f0Var92;
                    cVar5 = cVar6;
                    pVar = pVar2;
                    this.f30046k = cVar5;
                    this.f30037a = pVar;
                    this.f30038b = t0Var2;
                    this.f30039c = cVar6;
                    this.f30040d = f0Var5;
                    b0Var10 = null;
                    this.f30041e = null;
                    this.f30042f = null;
                    this.f30045j = 8;
                    objC13 = cVar6.C1(c2.t.f4695b, this);
                    pVar3 = pVar;
                }
                if (b0Var7 != null) {
                }
                return pg.f0.f21461a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
