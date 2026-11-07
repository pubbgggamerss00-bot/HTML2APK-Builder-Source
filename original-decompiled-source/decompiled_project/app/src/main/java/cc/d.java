package cc;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static v f5361b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5362a = 2;

    public static final double a(double d10, nh.e eVar, nh.e targetUnit) {
        kotlin.jvm.internal.r.e(targetUnit, "targetUnit");
        long jConvert = targetUnit.f18821a.convert(1L, eVar.f18821a);
        return jConvert > 0 ? d10 * jConvert : d10 / r8.convert(1L, r9);
    }

    public static final long b(long j10, nh.e sourceUnit, nh.e targetUnit) {
        kotlin.jvm.internal.r.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.r.e(targetUnit, "targetUnit");
        return targetUnit.f18821a.convert(j10, sourceUnit.f18821a);
    }

    public static final long c(long j10, nh.e sourceUnit, nh.e targetUnit) {
        kotlin.jvm.internal.r.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.r.e(targetUnit, "targetUnit");
        return targetUnit.f18821a.convert(j10, sourceUnit.f18821a);
    }

    public String toString() {
        switch (this.f5362a) {
            case 2:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
