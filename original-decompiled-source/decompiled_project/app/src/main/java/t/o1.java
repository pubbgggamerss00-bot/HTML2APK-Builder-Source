package t;

import android.view.View;
import android.widget.Magnifier;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t.n1;

/* loaded from: classes.dex */
public final class o1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f25310a = new o1();

    public static final class a extends n1.a {
        @Override // t.n1.a, t.l1
        public final void b(long j10, long j11, float f10) {
            boolean zIsNaN = Float.isNaN(f10);
            Magnifier magnifier = this.f25306a;
            if (!zIsNaN) {
                magnifier.setZoom(f10);
            }
            if ((9223372034707292159L & j11) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
            }
        }
    }

    @Override // t.m1
    public final boolean a() {
        return true;
    }

    @Override // t.m1
    public final l1 b(View view, boolean z10, long j10, float f10, float f11, boolean z11, f3.d dVar, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long jE = dVar.E(j10);
        float fN0 = dVar.N0(f10);
        float fN02 = dVar.N0(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jE != 9205357640488583168L) {
            builder.setSize(gh.a.b(Float.intBitsToFloat((int) (jE >> 32))), gh.a.b(Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax))));
        }
        if (!Float.isNaN(fN0)) {
            builder.setCornerRadius(fN0);
        }
        if (!Float.isNaN(fN02)) {
            builder.setElevation(fN02);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
