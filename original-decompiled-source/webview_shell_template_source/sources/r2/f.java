package r2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends v1.b<e> {
    @Override // v1.k
    public final String b() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }

    @Override // v1.b
    public final void d(a2.e eVar, e eVar2) {
        String str = eVar2.f14272a;
        if (str == null) {
            eVar.c(1);
        } else {
            eVar.d(1, str);
        }
        eVar.b(2, r4.f14273b);
    }
}
