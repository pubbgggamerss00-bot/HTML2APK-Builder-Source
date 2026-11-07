package r2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends v1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(v1.g gVar, int i6) {
        super(gVar);
        this.f14271d = i6;
    }

    @Override // v1.k
    public final String b() {
        switch (this.f14271d) {
            case 0:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    @Override // v1.b
    public final void d(a2.e eVar, Object obj) throws Throwable {
        switch (this.f14271d) {
            case 0:
                c cVar = (c) obj;
                String str = cVar.f14269a;
                if (str == null) {
                    eVar.c(1);
                } else {
                    eVar.d(1, str);
                }
                Long l4 = cVar.f14270b;
                if (l4 != null) {
                    eVar.b(2, l4.longValue());
                    break;
                } else {
                    eVar.c(2);
                    break;
                }
            default:
                i iVar = (i) obj;
                String str2 = iVar.f14276a;
                if (str2 == null) {
                    eVar.c(1);
                } else {
                    eVar.d(1, str2);
                }
                byte[] bArrC = androidx.work.f.c(iVar.f14277b);
                if (bArrC != null) {
                    eVar.a(2, bArrC);
                    break;
                } else {
                    eVar.c(2);
                    break;
                }
        }
    }
}
