package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.activity.a0;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s implements Spannable {
    public boolean s = false;

    /* renamed from: t, reason: collision with root package name */
    public Spannable f1048t;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof s0.b;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends a {
        @Override // androidx.emoji2.text.s.a
        public final boolean a(CharSequence charSequence) {
            return a0.f(charSequence) || (charSequence instanceof s0.b);
        }
    }

    public s(Spannable spannable) {
        this.f1048t = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1048t;
        if (!this.s) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f1048t = new SpannableString(spannable);
            }
        }
        this.s = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        return this.f1048t.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1048t.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1048t.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1048t.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1048t.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1048t.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i6, int i7, Class<T> cls) {
        return (T[]) this.f1048t.getSpans(i6, i7, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1048t.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i6, int i7, Class cls) {
        return this.f1048t.nextSpanTransition(i6, i7, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1048t.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        a();
        this.f1048t.setSpan(obj, i6, i7, i8);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i7) {
        return this.f1048t.subSequence(i6, i7);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1048t.toString();
    }
}
