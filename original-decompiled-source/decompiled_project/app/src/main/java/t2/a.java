package t2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import b3.b;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.e2;
import q1.u0;
import q1.w0;
import q1.x1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b3.c f27744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27745b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27746c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.j0 f27747d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f27748e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f27749f;

    /* renamed from: t2.a$a, reason: collision with other inner class name */
    public static final class C0287a extends kotlin.jvm.internal.s implements eh.p<RectF, RectF, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f0 f27750a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0287a(f0 f0Var) {
            super(2);
            this.f27750a = f0Var;
        }

        @Override // eh.p
        public final Boolean invoke(RectF rectF, RectF rectF2) {
            return Boolean.valueOf(this.f27750a.a(x1.e(rectF), x1.e(rectF2)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(b3.c cVar, int i10, int i11, long j10) {
        int i12;
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        int i16;
        b0 b0Var;
        int i17;
        int i18;
        int i19;
        char c10;
        b0 b0Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        u2.j0 j0VarA;
        int i20;
        a aVar;
        int i21;
        int i22;
        int i23;
        Layout layout;
        d3.c[] cVarArr;
        CharSequence charSequence2;
        Object obj;
        p1.e eVar;
        float fE;
        this.f27744a = cVar;
        this.f27745b = i10;
        this.f27746c = j10;
        if (f3.b.j(j10) != 0 || f3.b.k(j10) != 0) {
            z2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 < 1) {
            z2.a.a("maxLines should be greater than 0");
        }
        l0 l0Var = cVar.f3537b;
        CharSequence charSequence3 = cVar.f3543h;
        if (i11 == 2) {
            i12 = 0;
            charSequence = charSequence3;
            if (!f3.t.a(l0Var.f27852a.f27782h, f3.u.c(0))) {
                charSequence = charSequence3;
                if (!f3.t.a(l0Var.f27852a.f27782h, f3.t.f8833c)) {
                    int i24 = l0Var.f27853b.f27875a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i24 != Integer.MIN_VALUE && i24 != 5 && i24 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean zA = p5.o.a(spannableString, w2.c.class);
                            charSequence = spannableString;
                            if (!zA) {
                                spannableString.setSpan(new w2.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i12 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.f27748e = charSequence4;
        s sVar = l0Var.f27853b;
        b0 b0Var3 = l0Var.f27852a;
        int i25 = sVar.f27875a;
        int i26 = 3;
        int i27 = i25 == 1 ? 3 : i25 == 2 ? 4 : i25 == 3 ? 2 : (i25 != 5 && i25 == 6) ? 1 : i12;
        int i28 = i25 == 4 ? 1 : i12;
        int i29 = sVar.f27882h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i12;
        int i30 = sVar.f27881g;
        int i31 = i30 & 255;
        if (i31 != 1) {
            if (i31 == 2) {
                i13 = i30;
                i14 = i28;
                i15 = 1;
            } else if (i31 == 3) {
                i13 = i30;
                i14 = i28;
                i15 = 2;
            } else {
                i13 = i30;
                i14 = i28;
                i15 = i12;
            }
        }
        int i32 = (i13 >> 8) & 255;
        if (i32 != 1) {
            if (i32 == 2) {
                i26 = 1;
            } else if (i32 == 3) {
                i26 = 2;
            } else if (i32 != 4) {
                i26 = i12;
            }
        }
        int i33 = (i13 >> 16) & 255;
        if (i33 != 1) {
            i16 = 2;
            if (i33 == 2) {
                b0Var = b0Var3;
                i17 = i27;
                i18 = 1;
            }
            if (i11 != i16) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else if (i11 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                if (i11 != 4) {
                    i19 = i29;
                    c10 = ' ';
                    b0Var2 = b0Var;
                    truncateAt = null;
                    j0VarA = a(i17, i14, truncateAt, i10, i19, i15, i26, i18, charSequence4);
                    Layout layout2 = j0VarA.f29206f;
                    i20 = i17;
                    if (Build.VERSION.SDK_INT >= 35 || cVar.f3542g.getLetterSpacing() == CropImageView.DEFAULT_ASPECT_RATIO || (!(i11 == 4 || i11 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        aVar = this;
                        i21 = i10;
                        i22 = i20;
                        i23 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i23 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        aVar = this;
                        i21 = i10;
                        i22 = i20;
                        j0VarA = aVar.a(i22, i14, truncateAt, i21, i19, i15, i26, i18, TextUtils.concat(charSequenceArr));
                    }
                    int i34 = j0VarA.f29207g;
                    if (i11 != i23 || j0VarA.a() <= f3.b.h(j10) || i21 <= 1) {
                        aVar.f27747d = j0VarA;
                    } else {
                        int iH = f3.b.h(j10);
                        int i35 = 0;
                        while (true) {
                            if (i35 >= i34) {
                                i35 = i34;
                                break;
                            } else if (j0VarA.e(i35) > iH) {
                                break;
                            } else {
                                i35++;
                            }
                        }
                        if (i35 >= 0 && i35 != aVar.f27745b) {
                            j0VarA = aVar.a(i22, i14, truncateAt, i35 < 1 ? 1 : i35, i19, i15, i26, i18, aVar.f27748e);
                        }
                        aVar.f27747d = j0VarA;
                    }
                    aVar.f27744a.f3542g.c(b0Var2.f27775a.l(), (Float.floatToRawIntBits(aVar.d()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(aVar.i()) << c10), b0Var2.f27775a.i());
                    layout = aVar.f27747d.f29206f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        kotlin.jvm.internal.r.c(text, "null cannot be cast to non-null type android.text.Spanned");
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), d3.c.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            kotlin.jvm.internal.r.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                            cVarArr = (d3.c[]) ((Spanned) text2).getSpans(0, layout.getText().length(), d3.c.class);
                        }
                    } else {
                        cVarArr = null;
                    }
                    if (cVarArr != null) {
                        kotlin.jvm.internal.b bVarE = f3.f.e(cVarArr);
                        while (bVarE.hasNext()) {
                            ((d3.c) bVarE.next()).f7347c.setValue(new p1.h((Float.floatToRawIntBits(aVar.d()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(aVar.i()) << c10)));
                        }
                    }
                    charSequence2 = aVar.f27748e;
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), w2.i.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            w2.i iVar = (w2.i) obj2;
                            int spanStart = spanned2.getSpanStart(iVar);
                            int spanEnd = spanned2.getSpanEnd(iVar);
                            int lineForOffset = aVar.f27747d.f29206f.getLineForOffset(spanStart);
                            boolean z10 = lineForOffset >= aVar.f27745b;
                            boolean z11 = aVar.f27747d.f29206f.getEllipsisCount(lineForOffset) > 0 && spanEnd > aVar.f27747d.f29206f.getEllipsisStart(lineForOffset);
                            boolean z12 = spanEnd > aVar.f27747d.f(lineForOffset);
                            if (z11 || z12 || z10) {
                                eVar = null;
                            } else {
                                int iOrdinal = aVar.b(spanStart).ordinal();
                                if (iOrdinal == 0) {
                                    fE = aVar.e(spanStart, true);
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new pg.l();
                                    }
                                    float fE2 = aVar.e(spanStart, true);
                                    if (!iVar.f31254d) {
                                        z2.a.b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fE = fE2 - iVar.f31252b;
                                }
                                if (!iVar.f31254d) {
                                    z2.a.b("PlaceholderSpan is not laid out yet.");
                                }
                                float fD = aVar.f27747d.d(lineForOffset) - iVar.b();
                                eVar = new p1.e(fE, fD, iVar.f31252b + fE, iVar.b() + fD);
                            }
                            arrayList.add(eVar);
                        }
                        obj = arrayList;
                    } else {
                        obj = qg.z.f22752a;
                    }
                    aVar.f27749f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i19 = i29;
            c10 = ' ';
            b0Var2 = b0Var;
            truncateAt = truncateAt2;
            j0VarA = a(i17, i14, truncateAt, i10, i19, i15, i26, i18, charSequence4);
            Layout layout22 = j0VarA.f29206f;
            i20 = i17;
            if (Build.VERSION.SDK_INT >= 35) {
                aVar = this;
                i21 = i10;
                i22 = i20;
                i23 = 2;
            }
            int i342 = j0VarA.f29207g;
            if (i11 != i23) {
                aVar.f27747d = j0VarA;
            }
            aVar.f27744a.f3542g.c(b0Var2.f27775a.l(), (Float.floatToRawIntBits(aVar.d()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(aVar.i()) << c10), b0Var2.f27775a.i());
            layout = aVar.f27747d.f29206f;
            if (layout.getText() instanceof Spanned) {
            }
            if (cVarArr != null) {
            }
            charSequence2 = aVar.f27748e;
            if (charSequence2 instanceof Spanned) {
            }
            aVar.f27749f = obj;
        }
        i16 = 2;
        b0Var = b0Var3;
        i17 = i27;
        i18 = i12;
        if (i11 != i16) {
        }
        i19 = i29;
        c10 = ' ';
        b0Var2 = b0Var;
        truncateAt = truncateAt2;
        j0VarA = a(i17, i14, truncateAt, i10, i19, i15, i26, i18, charSequence4);
        Layout layout222 = j0VarA.f29206f;
        i20 = i17;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i3422 = j0VarA.f29207g;
        if (i11 != i23) {
        }
        aVar.f27744a.f3542g.c(b0Var2.f27775a.l(), (Float.floatToRawIntBits(aVar.d()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(aVar.i()) << c10), b0Var2.f27775a.i());
        layout = aVar.f27747d.f29206f;
        if (layout.getText() instanceof Spanned) {
        }
        if (cVarArr != null) {
        }
        charSequence2 = aVar.f27748e;
        if (charSequence2 instanceof Spanned) {
        }
        aVar.f27749f = obj;
    }

    public final u2.j0 a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        v vVar;
        float fI = i();
        b3.c cVar = this.f27744a;
        b3.d dVar = cVar.f3542g;
        int i17 = cVar.f3547l;
        u2.v vVar2 = cVar.f3544i;
        l0 l0Var = cVar.f3537b;
        b.a aVar = b3.b.f3535a;
        x xVar = l0Var.f27854c;
        return new u2.j0(charSequence, fI, dVar, i10, truncateAt, i17, (xVar == null || (vVar = xVar.f27890b) == null) ? false : vVar.f27887a, i12, i14, i15, i16, i13, i11, vVar2);
    }

    public final e3.g b(int i10) {
        return this.f27747d.f29206f.isRtlCharAt(i10) ? e3.g.f8361b : e3.g.f8360a;
    }

    public final float c() {
        return this.f27747d.d(0);
    }

    public final float d() {
        return this.f27747d.a();
    }

    public final float e(int i10, boolean z10) {
        u2.j0 j0Var = this.f27747d;
        return z10 ? j0Var.h(i10, false) : j0Var.i(i10, false);
    }

    public final float f() {
        return this.f27747d.d(r0.f29207g - 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<p1.e>] */
    public final List<p1.e> g() {
        return this.f27749f;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Type inference failed for: r13v26, types: [u2.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(p1.e eVar, int i10, f0 f0Var) {
        v2.f dVar;
        int i11;
        int[] rangeForRect;
        SegmentFinder segmentFinderA;
        RectF rectFC = x1.c(eVar);
        boolean z10 = i10 != 0 && i10 == 1;
        final C0287a c0287a = new C0287a(f0Var);
        u2.j0 j0Var = this.f27747d;
        TextPaint textPaint = j0Var.f29201a;
        Layout layout = j0Var.f29206f;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (z10) {
                segmentFinderA = new v2.a(new com.google.android.gms.common.api.internal.y(layout.getText(), j0Var.j()));
            } else {
                k0.n.a();
                segmentFinderA = k0.q.a(u2.a.a(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFC, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: u2.b
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) c0287a.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            u2.t tVarC = j0Var.c();
            if (z10) {
                dVar = new com.google.android.gms.common.api.internal.y(layout.getText(), j0Var.j());
            } else {
                CharSequence text = layout.getText();
                dVar = i12 >= 29 ? new v2.d(text, textPaint) : new v2.e(text);
            }
            v2.f fVar = dVar;
            int lineForVertical = layout.getLineForVertical((int) rectFC.top);
            if (rectFC.top <= j0Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < j0Var.f29207g) {
                int i13 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFC.bottom);
                if (lineForVertical2 != 0 || rectFC.bottom >= j0Var.g(0)) {
                    int iB = u2.k0.b(j0Var, layout, tVarC, i13, rectFC, fVar, c0287a, true);
                    while (true) {
                        i11 = i13;
                        if (iB != -1 || i11 >= lineForVertical2) {
                            break;
                        }
                        i13 = i11 + 1;
                        iB = u2.k0.b(j0Var, layout, tVarC, i13, rectFC, fVar, c0287a, true);
                    }
                    if (iB == -1) {
                        rangeForRect = null;
                    } else {
                        int i14 = lineForVertical2;
                        int iB2 = u2.k0.b(j0Var, layout, tVarC, i14, rectFC, fVar, c0287a, false);
                        while (iB2 == -1 && i11 < i14) {
                            i14--;
                            iB2 = u2.k0.b(j0Var, layout, tVarC, i14, rectFC, fVar, c0287a, false);
                        }
                        if (iB2 != -1) {
                            rangeForRect = new int[]{fVar.E(iB + 1), fVar.F(iB2 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? j0.f27837b : k0.a(rangeForRect[0], rangeForRect[1]);
    }

    public final float i() {
        return f3.b.i(this.f27746c);
    }

    public final void j(w0 w0Var) {
        Canvas canvasA = q1.c0.a(w0Var);
        u2.j0 j0Var = this.f27747d;
        if (j0Var.f29204d) {
            canvasA.save();
            canvasA.clipRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i(), d());
        }
        int i10 = j0Var.f29208h;
        if (canvasA.getClipBounds(j0Var.f29216p)) {
            if (i10 != 0) {
                canvasA.translate(CropImageView.DEFAULT_ASPECT_RATIO, i10);
            }
            u2.i0 i0Var = u2.l0.f29218a;
            i0Var.f29200a = canvasA;
            j0Var.f29206f.draw(i0Var);
            if (i10 != 0) {
                canvasA.translate(CropImageView.DEFAULT_ASPECT_RATIO, (-1) * i10);
            }
        }
        if (j0Var.f29204d) {
            canvasA.restore();
        }
    }

    public final void k(w0 w0Var, long j10, e2 e2Var, e3.i iVar, s1.f fVar) {
        b3.d dVar = this.f27744a.f3542g;
        int i10 = dVar.f3551c;
        dVar.d(j10);
        dVar.f(e2Var);
        dVar.g(iVar);
        dVar.e(fVar);
        dVar.b(3);
        j(w0Var);
        dVar.b(i10);
    }

    public final void l(w0 w0Var, u0 u0Var, float f10, e2 e2Var, e3.i iVar, s1.f fVar) {
        b3.d dVar = this.f27744a.f3542g;
        int i10 = dVar.f3551c;
        float fI = i();
        float fD = d();
        dVar.c(u0Var, (Float.floatToRawIntBits(fD) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fI) << 32), f10);
        dVar.f(e2Var);
        dVar.g(iVar);
        dVar.e(fVar);
        dVar.b(3);
        j(w0Var);
        dVar.b(i10);
    }
}
