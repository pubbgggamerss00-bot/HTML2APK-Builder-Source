package u2;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f29218a = new i0();

    /* renamed from: b, reason: collision with root package name */
    public static final long f29219b;

    static {
        long j10 = 0;
        f29219b = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    public static final TextDirectionHeuristic a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
