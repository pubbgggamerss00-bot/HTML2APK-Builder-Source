package sh;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class p<T> implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g<T> f25053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<Throwable> f25054b;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public p f25055a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f25056b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<T> f25057c;

        /* renamed from: d, reason: collision with root package name */
        public int f25058d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super T> pVar, tg.e<? super a> eVar) {
            super(eVar);
            this.f25057c = pVar;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25056b = obj;
            this.f25058d |= PKIFailureInfo.systemUnavail;
            return this.f25057c.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(g<? super T> gVar, kotlin.jvm.internal.g0<Throwable> g0Var) {
        this.f25053a = gVar;
        this.f25054b = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sh.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(T t3, tg.e<? super pg.f0> eVar) throws Throwable {
        a aVar;
        p<T> pVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25058d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25058d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        }
        Object obj = aVar.f25056b;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25058d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = aVar.f25055a;
            try {
                pg.q.b(obj);
                return pg.f0.f21461a;
            } catch (Throwable 
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                this = this;
                boolean r0 = r6 instanceof sh.p.a
                if (r0 == 0) goto L13
                r0 = r6
                sh.p$a r0 = (sh.p.a) r0
                int r1 = r0.f25058d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25058d = r1
                goto L18
            L13:
                sh.p$a r0 = new sh.p$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f25056b
                ug.a r1 = ug.a.f29706a
                int r2 = r0.f25058d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                sh.p r5 = r0.f25055a
                pg.q.b(r6)     // Catch: java.lang.Throwable -> L29
                goto L43
            L29:
                r6 = move-exception
                goto L48
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                pg.q.b(r6)
                sh.g<T> r6 = r4.f25053a     // Catch: java.lang.Throwable -> L46
                r0.f25055a = r4     // Catch: java.lang.Throwable -> L46
                r0.f25058d = r3     // Catch: java.lang.Throwable -> L46
                java.lang.Object r5 = r6.c(r5, r0)     // Catch: java.lang.Throwable -> L46
                if (r5 != r1) goto L43
                return r1
            L43:
                pg.f0 r5 = pg.f0.f21461a
                return r5
            L46:
                r6 = move-exception
                r5 = r4
            L48:
                kotlin.jvm.internal.g0<java.lang.Throwable> r5 = r5.f25054b
                r5.f16327a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sh.p.c(java.lang.Object, tg.e):java.lang.Object");
        }
    }
