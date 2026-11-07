package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p extends SpannableStringBuilder {
    public final Class<?> s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1041t;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements TextWatcher, SpanWatcher {
        public final Object s;

        /* renamed from: t, reason: collision with root package name */
        public final AtomicInteger f1042t = new AtomicInteger(0);

        public a(Object obj) {
            this.s = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.s).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            ((TextWatcher) this.s).beforeTextChanged(charSequence, i6, i7, i8);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i6, int i7) {
            if (this.f1042t.get() <= 0 || !(obj instanceof m)) {
                ((SpanWatcher) this.s).onSpanAdded(spannable, obj, i6, i7);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
          0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onSpanChanged(Spannable spannable, Object obj, int i6, int i7, int i8, int i9) {
            int i10;
            int i11;
            if (this.f1042t.get() <= 0 || !(obj instanceof m)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i10 = i6;
                    i11 = i8;
                } else {
                    if (i6 > i7) {
                        i6 = 0;
                    }
                    if (i8 > i9) {
                        i10 = i6;
                        i11 = 0;
                    }
                }
                ((SpanWatcher) this.s).onSpanChanged(spannable, obj, i10, i7, i11, i9);
            }
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i6, int i7) {
            if (this.f1042t.get() <= 0 || !(obj instanceof m)) {
                ((SpanWatcher) this.s).onSpanRemoved(spannable, obj, i6, i7);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            ((TextWatcher) this.s).onTextChanged(charSequence, i6, i7, i8);
        }
    }

    public p(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f1041t = new ArrayList();
        androidx.work.j.e("watcherClass cannot be null", cls);
        this.s = cls;
    }

    public final void a() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1041t;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i6)).f1042t.incrementAndGet();
            i6++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1041t;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i6)).onTextChanged(this, 0, length(), length());
            i6++;
        }
    }

    public final a c(Object obj) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1041t;
            if (i6 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i6);
            if (aVar.s == obj) {
                return aVar;
            }
            i6++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.s == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i6, int i7) {
        super.delete(i6, i7);
        return this;
    }

    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f1041t;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i6)).f1042t.decrementAndGet();
            i6++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        a aVarC;
        if (d(obj) && (aVarC = c(obj)) != null) {
            obj = aVarC;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i6, int i7, Class<T> cls) {
        if (this.s != cls) {
            return (T[]) super.getSpans(i6, i7, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i6, i7, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i8 = 0; i8 < aVarArr.length; i8++) {
            tArr[i8] = aVarArr[i8].s;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i6, int i7, Class cls) {
        if (cls == null || this.s == cls) {
            cls = a.class;
        }
        return super.nextSpanTransition(i6, i7, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        a aVarC;
        if (d(obj)) {
            aVarC = c(obj);
            if (aVarC != null) {
                obj = aVarC;
            }
        } else {
            aVarC = null;
        }
        super.removeSpan(obj);
        if (aVarC != null) {
            this.f1041t.remove(aVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i7, CharSequence charSequence) {
        replace(i6, i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i6, int i7, int i8) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f1041t.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i6, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i6, int i7) {
        return new p(this.s, this, i6, i7);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i6, int i7) {
        super.delete(i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i7, CharSequence charSequence, int i8, int i9) {
        replace(i6, i7, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i6, CharSequence charSequence, int i7, int i8) {
        super.insert(i6, charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i6, int i7, CharSequence charSequence) {
        a();
        super.replace(i6, i7, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence, int i7, int i8) {
        super.insert(i6, charSequence, i7, i8);
        return this;
    }

    public p(Class cls, p pVar, int i6, int i7) {
        super(pVar, i6, i7);
        this.f1041t = new ArrayList();
        androidx.work.j.e("watcherClass cannot be null", cls);
        this.s = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i6, int i7, CharSequence charSequence, int i8, int i9) {
        a();
        super.replace(i6, i7, charSequence, i8, i9);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i6, int i7) {
        super.append(charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i6) {
        super.append(charSequence, obj, i6);
        return this;
    }
}
