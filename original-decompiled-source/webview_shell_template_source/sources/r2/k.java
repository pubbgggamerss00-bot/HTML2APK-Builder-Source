package r2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends v1.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(v1.g gVar, int i6) {
        super(gVar);
        this.f14279d = i6;
    }

    @Override // v1.k
    public final String b() {
        switch (this.f14279d) {
            case 0:
                return "DELETE FROM WorkProgress";
            default:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }
}
