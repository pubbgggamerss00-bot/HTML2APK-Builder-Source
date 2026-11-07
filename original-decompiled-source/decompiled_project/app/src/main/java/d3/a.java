package d3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.yalantis.ucrop.view.CropImageView;
import f3.d;
import f3.r;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import s1.h;

/* loaded from: classes.dex */
public final class a implements LeadingMarginSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f7337a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7338b;

    /* renamed from: c, reason: collision with root package name */
    public final d f7339c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7341e;

    /* renamed from: d3.a$a, reason: collision with other inner class name */
    public static final class C0079a extends s implements eh.a<f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7343b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0079a(long j10, int i10, Canvas canvas, Paint paint, int i11, float f10) {
            super(0);
            this.f7343b = i10;
        }

        @Override // eh.a
        public final f0 invoke() {
            a.this.getClass();
            int i10 = this.f7343b;
            r rVar = r.f8828a;
            throw null;
        }
    }

    public a(float f10, float f11, float f12, d dVar, float f13) {
        this.f7337a = f10;
        this.f7338b = f11;
        this.f7339c = dVar;
        int iB = gh.a.b(f10 + f12);
        this.f7340d = iB;
        this.f7341e = gh.a.b(f13) - iB;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (canvas == null) {
            return;
        }
        float f10 = (i12 + i14) / 2.0f;
        int i17 = i10 - this.f7340d;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = i17;
        kotlin.jvm.internal.r.c(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i15 || paint == null) {
            return;
        }
        paint.getStyle();
        if (kotlin.jvm.internal.r.a(null, h.f24186a)) {
            paint.setStyle(Paint.Style.FILL);
        }
        C0079a c0079a = new C0079a((Float.floatToRawIntBits(this.f7337a) << 32) | (Float.floatToRawIntBits(this.f7338b) & BodyPartID.bodyIdMax), i11, canvas, paint, i18, f10);
        if (!Float.isNaN(CropImageView.DEFAULT_ASPECT_RATIO)) {
            paint.getAlpha();
            paint.setAlpha((int) Math.rint(CropImageView.DEFAULT_ASPECT_RATIO));
        }
        c0079a.invoke();
        throw null;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        int i10 = this.f7341e;
        if (i10 >= 0) {
            return 0;
        }
        return Math.abs(i10);
    }
}
