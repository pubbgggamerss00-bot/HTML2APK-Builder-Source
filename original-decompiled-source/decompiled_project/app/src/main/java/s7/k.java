package s7;

import a9.k0;
import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import c9.u1;
import com.google.android.gms.common.api.internal.n1;
import e9.w0;
import f9.b0;
import f9.y8;
import g7.h0;
import g7.j;
import g7.t;
import hi.d0;
import hi.x;
import java.io.IOException;
import k7.a;
import k7.f;
import kotlin.jvm.internal.g0;
import l7.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.f0;
import s7.b;
import s7.o;

/* loaded from: classes.dex */
public final class k implements l7.k {

    /* renamed from: a, reason: collision with root package name */
    public final String f24538a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f24539b;

    /* renamed from: c, reason: collision with root package name */
    public final pg.j<i> f24540c;

    /* renamed from: d, reason: collision with root package name */
    public final pg.s f24541d;

    /* renamed from: e, reason: collision with root package name */
    public final pg.j<s7.b> f24542e;

    /* renamed from: f, reason: collision with root package name */
    public final s7.d f24543f;

    public static final class a implements k.a<h0> {

        /* renamed from: a, reason: collision with root package name */
        public final pg.s f24544a;

        /* renamed from: b, reason: collision with root package name */
        public final pg.s f24545b;

        /* renamed from: c, reason: collision with root package name */
        public final n1 f24546c;

        public a(k0 k0Var) {
            b0 b0Var = new b0(1);
            j jVar = j.f24537a;
            this.f24544a = w0.b(k0Var);
            this.f24545b = w0.b(b0Var);
            n1 n1Var = new n1();
            n1Var.f6025a = jVar;
            n1Var.f6026b = t7.b.f28073a;
            this.f24546c = n1Var;
        }

        @Override // l7.k.a
        public final l7.k a(Object obj, w7.m mVar, t tVar) {
            h0 h0Var = (h0) obj;
            if (!kotlin.jvm.internal.r.a(h0Var.f11506c, "http") && !kotlin.jvm.internal.r.a(h0Var.f11506c, "https")) {
                return null;
            }
            String str = h0Var.f11504a;
            pg.s sVar = this.f24544a;
            pg.s sVarB = w0.b(new y8(tVar, 2));
            pg.s sVar2 = this.f24545b;
            n1 n1Var = this.f24546c;
            Context context = mVar.f31401a;
            Object obj2 = n1Var.f6026b;
            t7.b bVar = t7.b.f28073a;
            if (obj2 == bVar) {
                synchronized (n1Var) {
                    obj2 = n1Var.f6026b;
                    if (obj2 == bVar) {
                        eh.l lVar = (eh.l) n1Var.f6025a;
                        kotlin.jvm.internal.r.b(lVar);
                        Object objInvoke = lVar.invoke(context);
                        n1Var.f6026b = objInvoke;
                        n1Var.f6025a = null;
                        obj2 = objInvoke;
                    }
                }
            }
            return new k(str, mVar, sVar, sVarB, sVar2, (s7.d) obj2);
        }
    }

    @vg.e(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, 102}, m = "fetch")
    public static final class b extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public Object f24547a;

        /* renamed from: b, reason: collision with root package name */
        public g0 f24548b;

        /* renamed from: c, reason: collision with root package name */
        public g0 f24549c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f24550d;

        /* renamed from: f, reason: collision with root package name */
        public int f24552f;

        public b(vg.c cVar) {
            super(cVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f24550d = obj;
            this.f24552f |= PKIFailureInfo.systemUnavail;
            return k.this.a(this);
        }
    }

    @vg.e(c = "coil3.network.NetworkFetcher$fetch$2", f = "NetworkFetcher.kt", l = {HeaderItem.DATA_SIZE_OFFSET}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<r, tg.e<? super l7.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24553a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f24554b;

        public c(tg.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f24554b = obj;
            return cVar;
        }

        @Override // eh.p
        public final Object invoke(r rVar, tg.e<? super l7.p> eVar) {
            return ((c) create(rVar, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24553a;
            k kVar = k.this;
            if (i10 == 0) {
                pg.q.b(obj);
                r rVar2 = (r) this.f24554b;
                s sVar = rVar2.f24589e;
                if (sVar == null) {
                    throw new IllegalStateException("body == null");
                }
                this.f24554b = rVar2;
                this.f24553a = 1;
                Object objB = k.b(kVar, sVar, this);
                if (objB == aVar) {
                    return aVar;
                }
                rVar = rVar2;
                obj = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (r) this.f24554b;
                pg.q.b(obj);
            }
            return new l7.p((j7.q) obj, k.f(kVar.f24538a, rVar.f24588d.a()), j7.f.f15223d);
        }
    }

    @vg.e(c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", f = "NetworkFetcher.kt", l = {76, 87}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.p<r, tg.e<? super l7.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public g0 f24556a;

        /* renamed from: b, reason: collision with root package name */
        public int f24557b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f24558c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g0<a.c> f24559d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f24560e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g0<r> f24561f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p f24562g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g0<a.c> g0Var, k kVar, g0<r> g0Var2, p pVar, tg.e<? super d> eVar) {
            super(2, eVar);
            this.f24559d = g0Var;
            this.f24560e = kVar;
            this.f24561f = g0Var2;
            this.f24562g = pVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            d dVar = new d(this.f24559d, this.f24560e, this.f24561f, this.f24562g, eVar);
            dVar.f24558c = obj;
            return dVar;
        }

        @Override // eh.p
        public final Object invoke(r rVar, tg.e<? super l7.p> eVar) {
            return ((d) create(rVar, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c3 A[RETURN] */
        /* JADX WARN: Type inference failed for: r15v11, types: [T, s7.r] */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Exception {
            d dVar;
            g0<a.c> g0Var;
            r rVar;
            T t3;
            r rVar2;
            o oVar;
            Object obj2;
            hi.g gVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24557b;
            String strA = null;
            g0<r> g0Var2 = this.f24561f;
            g0<a.c> g0Var3 = this.f24559d;
            k kVar = this.f24560e;
            if (i10 == 0) {
                pg.q.b(obj);
                r rVar3 = (r) this.f24558c;
                a.c cVar = g0Var3.f16327a;
                r rVar4 = g0Var2.f16327a;
                this.f24558c = rVar3;
                this.f24556a = g0Var3;
                this.f24557b = 1;
                dVar = this;
                Object objC = k.c(this.f24560e, cVar, rVar4, this.f24562g, rVar3, dVar);
                if (objC != aVar) {
                    g0Var = g0Var3;
                    rVar = rVar3;
                    t3 = objC;
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar2 = (r) this.f24558c;
                pg.q.b(obj);
                obj2 = obj;
                gVar = (hi.g) obj2;
                if (gVar.f13061b <= 0) {
                    return new l7.p(j7.r.b(gVar, kVar.e()), k.f(kVar.f24538a, rVar2.f24588d.a()), j7.f.f15223d);
                }
                return null;
            }
            g0Var = this.f24556a;
            rVar = (r) this.f24558c;
            pg.q.b(obj);
            dVar = this;
            t3 = obj;
            g0Var.f16327a = t3;
            a.c cVar2 = g0Var3.f16327a;
            if (cVar2 != null) {
                g0Var2.f16327a = kVar.i(cVar2);
                a.c cVar3 = g0Var3.f16327a;
                kotlin.jvm.internal.r.b(cVar3);
                j7.p pVarH = kVar.h(cVar3);
                String str = kVar.f24538a;
                r rVar5 = g0Var2.f16327a;
                if (rVar5 != null && (oVar = rVar5.f24588d) != null) {
                    strA = oVar.a();
                }
                return new l7.p(pVarH, k.f(str, strA), j7.f.f15223d);
            }
            s sVar = rVar.f24589e;
            if (sVar == null) {
                throw new IllegalStateException("body == null");
            }
            dVar.f24558c = rVar;
            dVar.f24556a = null;
            dVar.f24557b = 2;
            Object objA = t7.d.a(sVar, this);
            if (objA != aVar) {
                rVar2 = rVar;
                obj2 = objA;
                gVar = (hi.g) obj2;
                if (gVar.f13061b <= 0) {
                }
            }
            return aVar;
        }
    }

    public k(String str, w7.m mVar, pg.s sVar, pg.s sVar2, pg.s sVar3, s7.d dVar) {
        this.f24538a = str;
        this.f24539b = mVar;
        this.f24540c = sVar;
        this.f24541d = sVar2;
        this.f24542e = sVar3;
        this.f24543f = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(k kVar, s sVar, vg.c cVar) {
        m mVar;
        hi.g gVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.f24570e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f24570e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(kVar, cVar);
            }
        }
        Object obj = mVar.f24568c;
        ug.a aVar = ug.a.f29706a;
        int i11 = mVar.f24570e;
        if (i11 == 0) {
            pg.q.b(obj);
            gVar = new hi.g();
            mVar.f24566a = kVar;
            mVar.f24567b = gVar;
            mVar.f24570e = 1;
            if (sVar.h(gVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hi.g gVar2 = mVar.f24567b;
            k kVar2 = mVar.f24566a;
            pg.q.b(obj);
            gVar = gVar2;
            kVar = kVar2;
        }
        return j7.r.b(gVar, kVar.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(k kVar, a.c cVar, r rVar, p pVar, r rVar2, vg.c cVar2) throws Exception {
        n nVar;
        f.a aVarA;
        a.b bVar;
        r rVar3;
        r rVar4;
        Throwable th2;
        s sVar;
        s sVar2;
        kVar.getClass();
        if (cVar2 instanceof n) {
            nVar = (n) cVar2;
            int i10 = nVar.f24576f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                nVar.f24576f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                nVar = new n(kVar, cVar2);
            }
        }
        Object objA = nVar.f24574d;
        Object obj = ug.a.f29706a;
        int i11 = nVar.f24576f;
        Throwable th3 = null;
        if (i11 == 0) {
            pg.q.b(objA);
            if (!kVar.f24539b.f31408h.f31324b) {
                if (cVar != null) {
                    try {
                        androidx.documentfile.provider.a.a(cVar);
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused) {
                    }
                    return null;
                }
                return null;
            }
            s7.b value = kVar.f24542e.getValue();
            nVar.f24571a = kVar;
            nVar.f24572b = cVar;
            nVar.f24573c = rVar2;
            nVar.f24576f = 1;
            objA = value.a(rVar, rVar2);
            if (objA == obj) {
                return obj;
            }
        } else if (i11 == 1) {
            rVar2 = (r) nVar.f24573c;
            cVar = (a.c) nVar.f24572b;
            kVar = (k) nVar.f24571a;
            pg.q.b(objA);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (a.b) nVar.f24573c;
            rVar3 = (r) nVar.f24572b;
            rVar4 = (r) nVar.f24571a;
            try {
                pg.q.b(objA);
                return bVar.a();
            } catch (Exception e11) {
                e = e11;
                try {
                    bVar.b();
                } catch (Exception unused2) {
                }
                sVar = rVar4.f24589e;
                if (sVar != null) {
                }
                sVar2 = rVar3.f24589e;
                if (sVar2 == null) {
                }
            }
        }
        r rVar5 = ((b.C0273b) objA).f24531a;
        if (rVar5 != null) {
            if (cVar != null) {
                aVarA = cVar.K();
            } else {
                k7.a aVar = (k7.a) kVar.f24541d.getValue();
                if (aVar != null) {
                    String str = kVar.f24539b.f31405e;
                    if (str == null) {
                        str = kVar.f24538a;
                    }
                    aVarA = aVar.a(str);
                } else {
                    aVarA = null;
                }
            }
            if (aVarA != null) {
                try {
                    try {
                        d0 d0VarA = x.a(kVar.e().f0(aVarA.f16053a.b(0), false));
                        try {
                            s7.a.b(rVar5, d0VarA);
                            f0 f0Var = f0.f21461a;
                            try {
                                d0VarA.close();
                                th2 = null;
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                        } catch (Throwable th5) {
                            try {
                                d0VarA.close();
                            } catch (Throwable th6) {
                                u1.b(th5, th6);
                            }
                            th2 = th5;
                        }
                        if (th2 != null) {
                            throw th2;
                        }
                        s sVar3 = rVar5.f24589e;
                        if (sVar3 != null) {
                            hi.n nVarE = kVar.e();
                            hi.b0 b0VarB = aVarA.f16053a.b(1);
                            nVar.f24571a = rVar2;
                            nVar.f24572b = rVar5;
                            nVar.f24573c = aVarA;
                            nVar.f24576f = 2;
                            try {
                                hi.i iVar = sVar3.f24591a;
                                d0 d0VarA2 = x.a(nVarE.f0(b0VarB, false));
                                try {
                                    i.a.b(iVar.m0(d0VarA2));
                                    try {
                                        d0VarA2.close();
                                    } catch (Throwable th7) {
                                        th3 = th7;
                                    }
                                } catch (Throwable th8) {
                                    th3 = th8;
                                    try {
                                        d0VarA2.close();
                                    } catch (Throwable th9) {
                                        u1.b(th3, th9);
                                    }
                                }
                                if (th3 != null) {
                                    throw th3;
                                }
                                if (f0.f21461a == obj) {
                                    return obj;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                e = e;
                                bVar = aVarA;
                                rVar3 = rVar5;
                                rVar4 = rVar2;
                                bVar.b();
                                sVar = rVar4.f24589e;
                                if (sVar != null) {
                                    try {
                                        androidx.documentfile.provider.a.a(sVar);
                                    } catch (RuntimeException e13) {
                                        throw e13;
                                    } catch (Exception unused3) {
                                    }
                                }
                                sVar2 = rVar3.f24589e;
                                if (sVar2 == null) {
                                    throw e;
                                }
                                try {
                                    androidx.documentfile.provider.a.a(sVar2);
                                    throw e;
                                } catch (RuntimeException e14) {
                                    throw e14;
                                } catch (Exception unused4) {
                                    throw e;
                                }
                            }
                        }
                        bVar = aVarA;
                        rVar3 = rVar5;
                        rVar4 = rVar2;
                        return bVar.a();
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Exception e16) {
                    e = e16;
                    bVar = aVarA;
                    rVar3 = rVar5;
                    rVar4 = rVar2;
                    bVar.b();
                    sVar = rVar4.f24589e;
                    if (sVar != null) {
                    }
                    sVar2 = rVar3.f24589e;
                    if (sVar2 == null) {
                    }
                }
            }
        }
        return null;
    }

    public static String f(String str, String str2) {
        String strA;
        if ((str2 == null || mh.t.p(str2, "text/plain", false)) && (strA = b8.n.a(str)) != null) {
            return strA;
        }
        if (str2 != null) {
            return mh.x.U(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #3 {Exception -> 0x004d, blocks: (B:21:0x0048, B:68:0x0142, B:70:0x0146), top: B:91:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, s7.r] */
    @Override // l7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(tg.e<? super l7.j> eVar) throws Exception {
        b bVar;
        T tB;
        g0 g0Var;
        g0 g0Var2;
        k kVar;
        g0 g0Var3;
        g0 g0Var4;
        k kVar2;
        k7.a aVar;
        Exception exc;
        g0 g0Var5;
        k kVar3;
        l7.p pVar;
        a.c cVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f24552f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f24552f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b((vg.c) eVar);
            }
        }
        Object objD = bVar.f24550d;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = bVar.f24552f;
        if (i11 == 0) {
            pg.q.b(objD);
            g0 g0Var6 = new g0();
            w7.m mVar = this.f24539b;
            boolean z10 = mVar.f31408h.f31323a;
            String str = this.f24538a;
            if (!z10 || (aVar = (k7.a) this.f24541d.getValue()) == null) {
                tB = 0;
            } else {
                String str2 = mVar.f31405e;
                if (str2 == null) {
                    str2 = str;
                }
                tB = aVar.b(str2);
            }
            g0Var6.f16327a = tB;
            try {
                g0Var2 = new g0();
                try {
                    if (g0Var6.f16327a != 0) {
                        Long l10 = e().Z(((a.c) g0Var6.f16327a).c()).f13089d;
                        if (l10 != null && l10.longValue() == 0) {
                            return new l7.p(h((a.c) g0Var6.f16327a), f(str, null), j7.f.f15222c);
                        }
                        ?? I = i((a.c) g0Var6.f16327a);
                        g0Var2.f16327a = I;
                        if (I != 0) {
                            s7.b value = this.f24542e.getValue();
                            r rVar = (r) g0Var2.f16327a;
                            g();
                            bVar.f24547a = this;
                            bVar.f24548b = g0Var6;
                            bVar.f24549c = g0Var2;
                            bVar.f24552f = 1;
                            b.a aVarB = value.b(rVar);
                            if (aVarB != aVar2) {
                                g0Var4 = g0Var6;
                                objD = aVarB;
                                kVar2 = this;
                            }
                            return aVar2;
                        }
                    }
                    p pVarG = kVar.g();
                    d dVar = new d(g0Var3, kVar, g0Var, pVarG, null);
                    bVar.f24547a = kVar;
                    bVar.f24548b = g0Var3;
                    bVar.f24549c = null;
                    bVar.f24552f = 2;
                    objD = kVar.d(pVarG, dVar, bVar);
                    if (objD != aVar2) {
                        g0Var5 = g0Var3;
                        kVar3 = kVar;
                        pVar = (l7.p) objD;
                        if (pVar == null) {
                        }
                    }
                    return aVar2;
                } catch (Exception e10) {
                    exc = e10;
                    g0Var = g0Var3;
                    cVar = (a.c) g0Var.f16327a;
                    if (cVar == null) {
                        throw exc;
                    }
                    try {
                        androidx.documentfile.provider.a.a(cVar);
                        throw exc;
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused) {
                        throw exc;
                    }
                }
                kVar = this;
                g0Var3 = g0Var6;
                g0 g0Var7 = g0Var2;
            } catch (Exception e12) {
                e = e12;
                g0Var = g0Var6;
                exc = e;
                cVar = (a.c) g0Var.f16327a;
                if (cVar == null) {
                }
            }
        } else if (i11 == 1) {
            g0Var2 = bVar.f24549c;
            g0Var4 = bVar.f24548b;
            kVar2 = (k) bVar.f24547a;
            try {
                pg.q.b(objD);
            } catch (Exception e13) {
                exc = e13;
                g0Var = g0Var4;
                cVar = (a.c) g0Var.f16327a;
                if (cVar == null) {
                }
            }
        } else if (i11 == 2) {
            g0Var5 = bVar.f24548b;
            kVar3 = (k) bVar.f24547a;
            try {
                pg.q.b(objD);
                pVar = (l7.p) objD;
                if (pVar == null) {
                    return pVar;
                }
                p pVarG2 = kVar3.g();
                c cVar2 = kVar3.new c(null);
                bVar.f24547a = g0Var5;
                bVar.f24548b = null;
                bVar.f24552f = 3;
                objD = kVar3.d(pVarG2, cVar2, bVar);
                if (objD != aVar2) {
                    g0Var = g0Var5;
                    return (l7.p) objD;
                }
                return aVar2;
            } catch (Exception e14) {
                exc = e14;
                g0Var = g0Var5;
                cVar = (a.c) g0Var.f16327a;
                if (cVar == null) {
                }
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = (g0) bVar.f24547a;
            try {
                pg.q.b(objD);
                return (l7.p) objD;
            } catch (Exception e15) {
                e = e15;
                exc = e;
                cVar = (a.c) g0Var.f16327a;
                if (cVar == null) {
                }
            }
        }
        b.a aVar3 = (b.a) objD;
        if (aVar3.f24530a != null) {
            return new l7.p(kVar2.h((a.c) g0Var4.f16327a), f(kVar2.f24538a, aVar3.f24530a.f24588d.a()), j7.f.f15222c);
        }
        g0Var3 = g0Var4;
        kVar = kVar2;
        g0 g0Var72 = g0Var2;
        p pVarG3 = kVar.g();
        d dVar2 = new d(g0Var3, kVar, g0Var72, pVarG3, null);
        bVar.f24547a = kVar;
        bVar.f24548b = g0Var3;
        bVar.f24549c = null;
        bVar.f24552f = 2;
        objD = kVar.d(pVarG3, dVar2, bVar);
        if (objD != aVar2) {
        }
        return aVar2;
    }

    public final Object d(p pVar, eh.p pVar2, b bVar) {
        if (this.f24539b.f31409i.f31323a && kotlin.jvm.internal.r.a(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        return this.f24540c.getValue().a(pVar, new l(pVar2, null), bVar);
    }

    public final hi.n e() {
        hi.n fileSystem;
        k7.a aVar = (k7.a) this.f24541d.getValue();
        return (aVar == null || (fileSystem = aVar.getFileSystem()) == null) ? this.f24539b.f31406f : fileSystem;
    }

    public final p g() {
        j.b<o> bVar = h.f24535b;
        w7.m mVar = this.f24539b;
        o oVar = (o) g7.k.b(mVar, bVar);
        oVar.getClass();
        o.a aVar = new o.a(oVar);
        w7.c cVar = mVar.f31408h;
        boolean z10 = cVar.f31323a;
        boolean z11 = mVar.f31409i.f31323a && this.f24543f.a();
        if (!z11 && z10) {
            aVar.b("only-if-cached, max-stale=2147483647");
        } else if (!z11 || z10) {
            if (!z11 && !z10) {
                aVar.b("no-cache, only-if-cached");
            }
        } else if (cVar.f31324b) {
            aVar.b("no-cache");
        } else {
            aVar.b("no-cache, no-store");
        }
        return new p(this.f24538a, (String) g7.k.b(mVar, h.f24534a), new o(qg.k0.j(aVar.f24579a)), (q) g7.k.b(mVar, h.f24536c), mVar.f31410j);
    }

    public final j7.p h(a.c cVar) {
        hi.b0 data = cVar.getData();
        hi.n nVarE = e();
        String str = this.f24539b.f31405e;
        if (str == null) {
            str = this.f24538a;
        }
        return j7.r.a(data, nVarE, str, cVar, 16);
    }

    public final r i(a.c cVar) throws Throwable {
        Throwable th2;
        r rVarA;
        try {
            hi.f0 f0VarB = x.b(e().g0(cVar.c()));
            try {
                rVarA = s7.a.a(f0VarB);
                try {
                    f0VarB.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    f0VarB.close();
                } catch (Throwable th5) {
                    u1.b(th4, th5);
                }
                th2 = th4;
                rVarA = null;
            }
            if (th2 == null) {
                return rVarA;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }
}
