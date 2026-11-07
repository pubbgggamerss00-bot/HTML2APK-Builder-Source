package t0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class uc {

    /* renamed from: a, reason: collision with root package name */
    public final yh.c f27164a = new yh.c();

    /* renamed from: b, reason: collision with root package name */
    public final x0.x1 f27165b = bg.b.h(null);

    public static final class a implements ic {

        /* renamed from: a, reason: collision with root package name */
        public final kd f27166a;

        /* renamed from: b, reason: collision with root package name */
        public final ph.m f27167b;

        public a(kd kdVar, ph.m mVar) {
            this.f27166a = kdVar;
            this.f27167b = mVar;
        }

        @Override // t0.ic
        public final void a() {
            ph.m mVar = this.f27167b;
            if (mVar.u()) {
                mVar.resumeWith(jd.f26174b);
            }
        }

        @Override // t0.ic
        public final kd b() {
            return this.f27166a;
        }

        @Override // t0.ic
        public final void dismiss() {
            ph.m mVar = this.f27167b;
            if (mVar.u()) {
                mVar.resumeWith(jd.f26173a);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.r.a(this.f27166a, aVar.f27166a) && this.f27167b.equals(aVar.f27167b);
        }

        public final int hashCode() {
            return this.f27167b.hashCode() + (this.f27166a.hashCode() * 31);
        }
    }

    public static final class b implements kd {

        /* renamed from: a, reason: collision with root package name */
        public final String f27168a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27169b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27170c;

        /* renamed from: d, reason: collision with root package name */
        public final jc f27171d;

        public b(String str, String str2, boolean z10, jc jcVar) {
            this.f27168a = str;
            this.f27169b = str2;
            this.f27170c = z10;
            this.f27171d = jcVar;
        }

        @Override // t0.kd
        public final String a() {
            return this.f27168a;
        }

        @Override // t0.kd
        public final String b() {
            return this.f27169b;
        }

        @Override // t0.kd
        public final boolean c() {
            return this.f27170c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.r.a(this.f27168a, bVar.f27168a) && kotlin.jvm.internal.r.a(this.f27169b, bVar.f27169b) && this.f27170c == bVar.f27170c && this.f27171d == bVar.f27171d;
        }

        @Override // t0.kd
        public final jc getDuration() {
            return this.f27171d;
        }

        public final int hashCode() {
            int iHashCode = this.f27168a.hashCode() * 31;
            String str = this.f27169b;
            return this.f27171d.hashCode() + r.o2.a((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f27170c);
        }
    }

    public static Object b(uc ucVar, String str, String str2, vg.i iVar, int i10) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        boolean z10 = (i10 & 4) == 0;
        jc jcVar = str2 == null ? jc.f26170a : jc.f26171b;
        ucVar.getClass();
        return ucVar.a(new b(str, str2, z10, jcVar), iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [t0.kd, t0.uc$b, yh.a] */
    /* JADX WARN: Type inference failed for: r8v8, types: [yh.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, vg.c cVar) {
        vc vcVar;
        yh.c cVar2;
        uc ucVar;
        kd kdVar;
        Throwable th2;
        uc ucVar2;
        yh.a aVar;
        if (cVar instanceof vc) {
            vcVar = (vc) cVar;
            int i10 = vcVar.f27254f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                vcVar.f27254f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                vcVar = new vc(this, cVar);
            }
        }
        Object obj = vcVar.f27252d;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = vcVar.f27254f;
        try {
            try {
                if (i11 == 0) {
                    pg.q.b(obj);
                    vcVar.f27249a = this;
                    vcVar.f27250b = bVar;
                    cVar2 = this.f27164a;
                    vcVar.f27251c = cVar2;
                    vcVar.f27254f = 1;
                    if (cVar2.h(vcVar) != aVar2) {
                        ucVar = this;
                        kdVar = bVar;
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = vcVar.f27251c;
                    ucVar2 = vcVar.f27249a;
                    try {
                        pg.q.b(obj);
                        ucVar2.f27165b.setValue(null);
                        aVar.l(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ucVar2.f27165b.setValue(null);
                        throw th2;
                    }
                }
                ?? r82 = vcVar.f27251c;
                kd kdVar2 = vcVar.f27250b;
                ucVar = vcVar.f27249a;
                pg.q.b(obj);
                cVar2 = r82;
                kdVar = kdVar2;
                vcVar.f27249a = ucVar;
                vcVar.f27250b = kdVar;
                vcVar.f27251c = cVar2;
                vcVar.f27254f = 2;
                ph.m mVar = new ph.m(1, ah.p.c(vcVar));
                mVar.p();
                ucVar.f27165b.setValue(new a(kdVar, mVar));
                Object objO = mVar.o();
                if (objO != aVar2) {
                    yh.c cVar3 = cVar2;
                    obj = objO;
                    aVar = cVar3;
                    ucVar2 = ucVar;
                    ucVar2.f27165b.setValue(null);
                    aVar.l(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th4) {
                th2 = th4;
                ucVar2 = ucVar;
                ucVar2.f27165b.setValue(null);
                throw th2;
            }
        } catch (Throwable th5) {
            bVar.l(null);
            throw th5;
        }
    }
}
