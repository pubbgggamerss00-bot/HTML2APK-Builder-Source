package sh;

import java.io.Serializable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class q implements f<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f25066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u6.a0 f25067b;

    @vg.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f25068a;

        /* renamed from: b, reason: collision with root package name */
        public int f25069b;

        /* renamed from: d, reason: collision with root package name */
        public q f25071d;

        /* renamed from: e, reason: collision with root package name */
        public g f25072e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f25073f;

        /* renamed from: g, reason: collision with root package name */
        public long f25074g;

        public a(tg.e eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25068a = obj;
            this.f25069b |= PKIFailureInfo.systemUnavail;
            return q.this.b(null, this);
        }
    }

    public q(f fVar, u6.a0 a0Var) {
        this.f25066a = fVar;
        this.f25067b = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:27:0x0080). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008f -> B:30:0x008c). Please report as a decompilation issue!!! */
    @Override // sh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g<? super Object> gVar, tg.e<? super pg.f0> eVar) throws Throwable {
        a aVar;
        long j10;
        q qVar;
        q qVar2;
        g<? super Object> gVar2;
        Throwable th2;
        Serializable serializableC;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25069b;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25069b = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object objF = aVar.f25068a;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25069b;
        if (i11 == 0) {
            pg.q.b(objF);
            j10 = 0;
            qVar = this;
            f fVar = qVar.f25066a;
            aVar.f25071d = qVar;
            aVar.f25072e = gVar;
            aVar.f25073f = null;
            aVar.f25074g = j10;
            aVar.f25069b = 1;
            serializableC = gg.a.c(fVar, gVar, aVar);
            if (serializableC != aVar2) {
            }
            return aVar2;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = aVar.f25074g;
            th2 = aVar.f25073f;
            gVar2 = aVar.f25072e;
            qVar2 = aVar.f25071d;
            pg.q.b(objF);
            if (!((Boolean) objF).booleanValue()) {
                throw th2;
            }
            j10++;
            boolean z10 = true;
            qVar = qVar2;
            if (z10) {
                return pg.f0.f21461a;
            }
            gVar = gVar2;
            f fVar2 = qVar.f25066a;
            aVar.f25071d = qVar;
            aVar.f25072e = gVar;
            aVar.f25073f = null;
            aVar.f25074g = j10;
            aVar.f25069b = 1;
            serializableC = gg.a.c(fVar2, gVar, aVar);
            if (serializableC != aVar2) {
                qVar2 = qVar;
                objF = serializableC;
                gVar2 = gVar;
                th2 = (Throwable) objF;
                if (th2 == null) {
                    u6.a0 a0Var = qVar2.f25067b;
                    Long l10 = new Long(j10);
                    aVar.f25071d = qVar2;
                    aVar.f25072e = gVar2;
                    aVar.f25073f = th2;
                    aVar.f25074g = j10;
                    aVar.f25069b = 2;
                    objF = a0Var.f(gVar2, th2, l10, aVar);
                } else {
                    z10 = false;
                    qVar = qVar2;
                    if (z10) {
                    }
                }
            }
            return aVar2;
        }
        j10 = aVar.f25074g;
        gVar = aVar.f25072e;
        q qVar3 = aVar.f25071d;
        pg.q.b(objF);
        qVar2 = qVar3;
        gVar2 = gVar;
        th2 = (Throwable) objF;
        if (th2 == null) {
        }
    }
}
