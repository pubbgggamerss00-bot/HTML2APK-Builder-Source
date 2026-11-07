package u2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f29201a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f29202b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29203c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29204d;

    /* renamed from: e, reason: collision with root package name */
    public v2.g f29205e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f29206f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29207g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29208h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29209i;

    /* renamed from: j, reason: collision with root package name */
    public final float f29210j;

    /* renamed from: k, reason: collision with root package name */
    public final float f29211k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f29212l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f29213m;

    /* renamed from: n, reason: collision with root package name */
    public final int f29214n;

    /* renamed from: o, reason: collision with root package name */
    public final w2.h[] f29215o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f29216p = new Rect();

    /* renamed from: q, reason: collision with root package name */
    public t f29217q;

    /* JADX WARN: Removed duplicated region for block: B:84:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, boolean z10, int i12, int i13, int i14, int i15, int i16, int i17, v vVar) {
        int i18;
        TextDirectionHeuristic textDirectionHeuristic;
        int i19;
        Layout layoutA;
        long j10;
        w2.h[] hVarArr;
        char c10;
        int i20;
        boolean zIsFallbackLineSpacingEnabled;
        this.f29201a = textPaint;
        this.f29202b = truncateAt;
        this.f29203c = z10;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = l0.a(i11);
        Layout.Alignment alignment = h0.f29198a;
        Layout.Alignment alignment2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : h0.f29199b : h0.f29198a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z11 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, w2.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = vVar.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsA == null || vVar.c() > f10 || z11) {
                this.f29212l = false;
                i18 = i12;
                textDirectionHeuristic = textDirectionHeuristicA;
                i19 = 33;
                layoutA = g0.a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i18, truncateAt, (int) Math.ceil(d10), i17, z10, i13, i14, i15, i16);
            } else {
                this.f29212l = true;
                if (iCeil < 0) {
                    z2.a.a("negative width");
                }
                if (iCeil < 0) {
                    z2.a.a("negative ellipsized width");
                }
                layoutA = Build.VERSION.SDK_INT >= 33 ? e.a(charSequence, textPaint, iCeil, alignment2, metricsA, z10, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, metricsA, z10, truncateAt, iCeil);
                i18 = i12;
                textDirectionHeuristic = textDirectionHeuristicA;
                i19 = 33;
            }
            this.f29206f = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i18);
            this.f29207g = iMin;
            int i21 = iMin - 1;
            this.f29204d = iMin >= i18 && (layoutA.getEllipsisCount(i21) > 0 || layoutA.getLineEnd(i21) != charSequence.length());
            long j11 = l0.f29219b;
            char c11 = ' ';
            if (z10) {
                j10 = j11;
            } else {
                if (this.f29212l) {
                    zIsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= i19 ? ((BoringLayout) layoutA).isFallbackLineSpacingEnabled() : false;
                } else {
                    zIsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= i19 ? ((StaticLayout) layoutA).isFallbackLineSpacingEnabled() : true;
                }
                if (!zIsFallbackLineSpacingEnabled) {
                    TextPaint paint = layoutA.getPaint();
                    CharSequence text = layoutA.getText();
                    Rect rectA = x.a(paint, text, layoutA.getLineStart(0), layoutA.getLineEnd(0));
                    int lineAscent = layoutA.getLineAscent(0);
                    int i22 = rectA.top;
                    int topPadding = i22 < lineAscent ? lineAscent - i22 : layoutA.getTopPadding();
                    rectA = iMin != 1 ? x.a(paint, text, layoutA.getLineStart(i21), layoutA.getLineEnd(i21)) : rectA;
                    int lineDescent = layoutA.getLineDescent(i21);
                    int i23 = rectA.bottom;
                    int bottomPadding = i23 > lineDescent ? i23 - lineDescent : layoutA.getBottomPadding();
                    if (topPadding != 0 || bottomPadding != 0) {
                        j10 = (topPadding << 32) | (bottomPadding & BodyPartID.bodyIdMax);
                    }
                }
            }
            Paint.FontMetricsInt fontMetricsInt = null;
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text2 = layoutA.getText();
                kotlin.jvm.internal.r.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                if (p5.o.a((Spanned) text2, w2.h.class) || layoutA.getText().length() <= 0) {
                    CharSequence text3 = layoutA.getText();
                    kotlin.jvm.internal.r.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                    hVarArr = (w2.h[]) ((Spanned) text3).getSpans(0, layoutA.getText().length(), w2.h.class);
                }
            } else {
                hVarArr = null;
            }
            this.f29215o = hVarArr;
            if (hVarArr != null) {
                int length2 = hVarArr.length;
                int iMax = 0;
                int iMax2 = 0;
                int i24 = 0;
                while (i24 < length2) {
                    w2.h hVar = hVarArr[i24];
                    char c12 = c11;
                    int i25 = hVar.f31249l;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = hVar.f31250m;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                    i24++;
                    c11 = c12;
                }
                c10 = c11;
                j11 = (iMax == 0 && iMax2 == 0) ? l0.f29219b : (iMax << c10) | (iMax2 & BodyPartID.bodyIdMax);
            } else {
                c10 = ' ';
            }
            this.f29208h = Math.max((int) (j10 >> c10), (int) (j11 >> c10));
            this.f29209i = Math.max((int) (j10 & BodyPartID.bodyIdMax), (int) (j11 & BodyPartID.bodyIdMax));
            TextPaint textPaint2 = this.f29201a;
            w2.h[] hVarArr2 = this.f29215o;
            int i27 = this.f29207g - 1;
            Layout layout = this.f29206f;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || hVarArr2 == null || hVarArr2.length == 0) {
                i20 = 0;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                w2.h hVar2 = (w2.h) qg.o.t(hVarArr2);
                spannableString.setSpan(new w2.h(hVar2.f31239a, spannableString.length(), (i27 == 0 || !hVar2.f31242d) ? hVar2.f31242d : false, hVar2.f31242d, hVar2.f31243e, hVar2.f31244f), 0, spannableString.length(), i19);
                StaticLayout staticLayoutA = g0.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, s.f29226a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f29203c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                i20 = 0;
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
                fontMetricsInt.top = staticLayoutA.getLineTop(0);
                fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
            }
            this.f29214n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i21) - g(i21))) : i20;
            this.f29213m = fontMetricsInt;
            Layout layout2 = this.f29206f;
            this.f29210j = w2.d.a(layout2, i21, layout2.getPaint());
            Layout layout3 = this.f29206f;
            this.f29211k = w2.d.b(layout3, i21, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        boolean z10 = this.f29204d;
        Layout layout = this.f29206f;
        return (z10 ? layout.getLineBottom(this.f29207g - 1) : layout.getHeight()) + this.f29208h + this.f29209i + this.f29214n;
    }

    public final float b(int i10) {
        return i10 == this.f29207g + (-1) ? this.f29210j + this.f29211k : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final t c() {
        t tVar = this.f29217q;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.f29206f);
        this.f29217q = tVar2;
        return tVar2;
    }

    public final float d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f29208h + ((i10 != this.f29207g + (-1) || (fontMetricsInt = this.f29213m) == null) ? this.f29206f.getLineBaseline(i10) : g(i10) - fontMetricsInt.ascent);
    }

    public final float e(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f29207g;
        int i12 = i11 - 1;
        Layout layout = this.f29206f;
        if (i10 != i12 || (fontMetricsInt = this.f29213m) == null) {
            return this.f29208h + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f29209i : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i10) {
        i0 i0Var = l0.f29218a;
        Layout layout = this.f29206f;
        return (layout.getEllipsisCount(i10) <= 0 || this.f29202b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final float g(int i10) {
        return this.f29206f.getLineTop(i10) + (i10 == 0 ? 0 : this.f29208h);
    }

    public final float h(int i10, boolean z10) {
        return b(this.f29206f.getLineForOffset(i10)) + c().c(i10, true, z10);
    }

    public final float i(int i10, boolean z10) {
        return b(this.f29206f.getLineForOffset(i10)) + c().c(i10, false, z10);
    }

    public final v2.g j() {
        v2.g gVar = this.f29205e;
        if (gVar != null) {
            return gVar;
        }
        Layout layout = this.f29206f;
        v2.g gVar2 = new v2.g(layout.getText(), layout.getText().length(), this.f29201a.getTextLocale());
        this.f29205e = gVar2;
        return gVar2;
    }
}
