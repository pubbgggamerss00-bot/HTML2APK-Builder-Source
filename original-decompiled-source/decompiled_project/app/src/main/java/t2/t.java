package t2;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final long f27884a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27885b = 0;

    static {
        f3.v[] vVarArr = f3.t.f8832b;
        f27884a = f3.t.f8833c;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final s a(s sVar, int i10, int i11, long j10, e3.n nVar, v vVar, e3.f fVar, int i12, int i13, e3.o oVar) {
        long j11;
        v vVar2;
        int i14 = i10;
        int i15 = i11;
        long j12 = j10;
        e3.n nVar2 = nVar;
        v vVar3 = vVar;
        e3.f fVar2 = fVar;
        int i16 = i12;
        int i17 = i13;
        e3.o oVar2 = oVar;
        if (i14 != Integer.MIN_VALUE) {
            j11 = 0;
            if (i14 == sVar.f27875a) {
            }
            f3.v[] vVarArr = f3.t.f8832b;
            if ((j12 & 1095216660480L) == j11) {
                j12 = sVar.f27877c;
            }
            if (nVar2 == null) {
                nVar2 = sVar.f27878d;
            }
            if (i14 == Integer.MIN_VALUE) {
                i14 = sVar.f27875a;
            }
            if (i15 == Integer.MIN_VALUE) {
                i15 = sVar.f27876b;
            }
            vVar2 = sVar.f27879e;
            if (vVar2 != null && vVar3 == null) {
                vVar3 = vVar2;
            }
            if (fVar2 == null) {
                fVar2 = sVar.f27880f;
            }
            if (i16 == 0) {
                i16 = sVar.f27881g;
            }
            if (i17 == Integer.MIN_VALUE) {
                i17 = sVar.f27882h;
            }
            if (oVar2 == null) {
                oVar2 = sVar.f27883i;
            }
            return new s(i14, i15, j12, nVar2, vVar3, fVar2, i16, i17, oVar2);
        }
        j11 = 0;
        f3.v[] vVarArr2 = f3.t.f8832b;
        if (((j12 & 1095216660480L) == j11 || f3.t.a(j12, sVar.f27877c)) && ((nVar2 == null || nVar2.equals(sVar.f27878d)) && ((i15 == Integer.MIN_VALUE || i15 == sVar.f27876b) && ((vVar3 == null || vVar3.equals(sVar.f27879e)) && ((fVar2 == null || fVar2.equals(sVar.f27880f)) && ((i16 == 0 || i16 == sVar.f27881g) && ((i17 == Integer.MIN_VALUE || i17 == sVar.f27882h) && (oVar2 == null || oVar2.equals(sVar.f27883i))))))))) {
            return sVar;
        }
        f3.v[] vVarArr3 = f3.t.f8832b;
        if ((j12 & 1095216660480L) == j11) {
        }
        if (nVar2 == null) {
        }
        if (i14 == Integer.MIN_VALUE) {
        }
        if (i15 == Integer.MIN_VALUE) {
        }
        vVar2 = sVar.f27879e;
        if (vVar2 != null) {
            vVar3 = vVar2;
        }
        if (fVar2 == null) {
        }
        if (i16 == 0) {
        }
        if (i17 == Integer.MIN_VALUE) {
        }
        if (oVar2 == null) {
        }
        return new s(i14, i15, j12, nVar2, vVar3, fVar2, i16, i17, oVar2);
    }
}
