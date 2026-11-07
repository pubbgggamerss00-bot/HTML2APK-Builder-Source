package x4;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class m implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32075a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f32076b;

    public m(Spannable spannable) {
        this.f32076b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f32076b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f32076b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f32076b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f32076b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f32076b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f32076b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f32076b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f32076b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f32076b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f32076b;
        if (!this.f32075a && ((spannable instanceof PrecomputedText) || (spannable instanceof w3.a))) {
            this.f32076b = new SpannableString(spannable);
        }
        this.f32075a = true;
        this.f32076b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        Spannable spannable = this.f32076b;
        if (!this.f32075a && ((spannable instanceof PrecomputedText) || (spannable instanceof w3.a))) {
            this.f32076b = new SpannableString(spannable);
        }
        this.f32075a = true;
        this.f32076b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f32076b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f32076b.toString();
    }
}
