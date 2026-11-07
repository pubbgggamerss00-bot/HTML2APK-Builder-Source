package r2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends v1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(v1.g gVar, int i6) {
        super(gVar);
        this.f14268d = i6;
    }

    @Override // v1.k
    public final String b() {
        switch (this.f14268d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // v1.b
    public final void d(a2.e eVar, Object obj) {
        switch (this.f14268d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f14266a;
                if (str == null) {
                    eVar.c(1);
                } else {
                    eVar.d(1, str);
                }
                String str2 = aVar.f14267b;
                if (str2 != null) {
                    eVar.d(2, str2);
                    break;
                } else {
                    eVar.c(2);
                    break;
                }
            case 1:
                h hVar = (h) obj;
                hVar.getClass();
                eVar.c(1);
                String str3 = hVar.f14275a;
                if (str3 != null) {
                    eVar.d(2, str3);
                    break;
                } else {
                    eVar.c(2);
                    break;
                }
            default:
                t tVar = (t) obj;
                String str4 = tVar.f14307a;
                if (str4 == null) {
                    eVar.c(1);
                } else {
                    eVar.d(1, str4);
                }
                String str5 = tVar.f14308b;
                if (str5 != null) {
                    eVar.d(2, str5);
                    break;
                } else {
                    eVar.c(2);
                    break;
                }
        }
    }
}
