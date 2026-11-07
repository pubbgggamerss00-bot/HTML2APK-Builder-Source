package b2;

import f3.w;
import i2.p2;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import ph.i0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public e f3507a;

    /* renamed from: b, reason: collision with root package name */
    public e f3508b;

    /* renamed from: c, reason: collision with root package name */
    public s f3509c = new a();

    /* renamed from: d, reason: collision with root package name */
    public i0 f3510d;

    public static final class a extends s implements eh.a<i0> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final i0 invoke() {
            return b.this.f3510d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j10, long j11, vg.c cVar) {
        c cVar2;
        long j12;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f3514c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f3514c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(this, cVar);
            }
        }
        c cVar3 = cVar2;
        Object objX1 = cVar3.f3512a;
        ug.a aVar = ug.a.f29706a;
        int i11 = cVar3.f3514c;
        if (i11 == 0) {
            q.b(objX1);
            e eVar = this.f3507a;
            e eVar2 = null;
            j12 = 0;
            if (((eVar == null || !eVar.f1157p) ? null : (e) p2.a(eVar)) == null) {
                e eVar3 = this.f3508b;
                if (eVar3 != null) {
                    cVar3.f3514c = 1;
                    objX1 = eVar3.x1(j10, j11, cVar3);
                }
            } else {
                e eVar4 = this.f3507a;
                if (eVar4 != null && eVar4.f1157p) {
                    eVar2 = (e) p2.a(eVar4);
                }
                if (eVar2 != null) {
                    cVar3.f3514c = 2;
                    objX1 = eVar2.x1(j10, j11, cVar3);
                } else {
                    j12 = 0;
                }
            }
        } else if (i11 == 1) {
            q.b(objX1);
            j12 = ((w) objX1).f8837a;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(objX1);
            j12 = ((w) objX1).f8837a;
        }
        return new w(j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j10, vg.c cVar) {
        d dVar;
        long j11;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f3517c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f3517c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(this, cVar);
            }
        }
        Object objE0 = dVar.f3515a;
        ug.a aVar = ug.a.f29706a;
        int i11 = dVar.f3517c;
        if (i11 == 0) {
            q.b(objE0);
            e eVar = this.f3507a;
            e eVar2 = null;
            if (eVar != null && eVar.f1157p) {
                eVar2 = (e) p2.a(eVar);
            }
            if (eVar2 == null) {
                j11 = 0;
                return new w(j11);
            }
            dVar.f3517c = 1;
            objE0 = eVar2.e0(j10, dVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(objE0);
        }
        j11 = ((w) objE0).f8837a;
        return new w(j11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.a, kotlin.jvm.internal.s] */
    public final i0 c() {
        i0 i0Var = (i0) this.f3509c.invoke();
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
