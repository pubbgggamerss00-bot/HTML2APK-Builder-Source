package t;

import android.view.View;
import android.widget.Magnifier;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class n1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f25305a = new n1();

    public static class a implements l1 {

        /* renamed from: a, reason: collision with root package name */
        public final Magnifier f25306a;

        public a(Magnifier magnifier) {
            this.f25306a = magnifier;
        }

        @Override // t.l1
        public final long a() {
            Magnifier magnifier = this.f25306a;
            return (magnifier.getWidth() << 32) | (magnifier.getHeight() & BodyPartID.bodyIdMax);
        }

        @Override // t.l1
        public void b(long j10, long j11, float f10) {
            this.f25306a.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        }

        @Override // t.l1
        public final void c() {
            this.f25306a.update();
        }

        @Override // t.l1
        public final void dismiss() {
            this.f25306a.dismiss();
        }
    }

    @Override // t.m1
    public final boolean a() {
        return false;
    }

    @Override // t.m1
    public final l1 b(View view, boolean z10, long j10, float f10, float f11, boolean z11, f3.d dVar, float f12) {
        return new a(new Magnifier(view));
    }
}
