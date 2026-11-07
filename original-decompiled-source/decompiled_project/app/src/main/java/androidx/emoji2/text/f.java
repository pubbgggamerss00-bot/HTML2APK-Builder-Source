package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.d;
import androidx.emoji2.text.h;
import java.util.Iterator;
import java.util.Set;
import x4.k;
import x4.l;
import x4.m;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d.j f2218a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2219b;

    /* renamed from: c, reason: collision with root package name */
    public final d.e f2220c;

    public static class a implements b<m> {

        /* renamed from: a, reason: collision with root package name */
        public m f2221a;

        /* renamed from: b, reason: collision with root package name */
        public final d.j f2222b;

        public a(m mVar, d.j jVar) {
            this.f2221a = mVar;
            this.f2222b = jVar;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i10, int i11, k kVar) {
            if ((kVar.f32073c & 4) > 0) {
                return true;
            }
            if (this.f2221a == null) {
                this.f2221a = new m(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((d.C0029d) this.f2222b).getClass();
            this.f2221a.setSpan(new l(kVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.f.b
        public final m b() {
            return this.f2221a;
        }
    }

    public interface b<T> {
        boolean a(CharSequence charSequence, int i10, int i11, k kVar);

        T b();
    }

    public static class c implements b<c> {

        /* renamed from: a, reason: collision with root package name */
        public final int f2223a;

        /* renamed from: b, reason: collision with root package name */
        public int f2224b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f2225c = -1;

        public c(int i10) {
            this.f2223a = i10;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i10, int i11, k kVar) {
            int i12 = this.f2223a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f2224b = i10;
            this.f2225c = i11;
            return false;
        }

        @Override // androidx.emoji2.text.f.b
        public final c b() {
            return this;
        }
    }

    public static class d implements b<d> {

        /* renamed from: a, reason: collision with root package name */
        public final String f2226a;

        public d(String str) {
            this.f2226a = str;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i10, int i11, k kVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f2226a)) {
                return true;
            }
            kVar.f32073c = (kVar.f32073c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.f.b
        public final d b() {
            return this;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f2227a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final h.a f2228b;

        /* renamed from: c, reason: collision with root package name */
        public h.a f2229c;

        /* renamed from: d, reason: collision with root package name */
        public h.a f2230d;

        /* renamed from: e, reason: collision with root package name */
        public int f2231e;

        /* renamed from: f, reason: collision with root package name */
        public int f2232f;

        public e(h.a aVar) {
            this.f2228b = aVar;
            this.f2229c = aVar;
        }

        public final void a() {
            this.f2227a = 1;
            this.f2229c = this.f2228b;
            this.f2232f = 0;
        }

        public final boolean b() {
            y4.a aVarB = this.f2229c.f2247b.b();
            int iA = aVarB.a(6);
            return !(iA == 0 || aVarB.f33936b.get(iA + aVarB.f33935a) == 0) || this.f2231e == 65039;
        }
    }

    public f(h hVar, d.C0029d c0029d, androidx.emoji2.text.b bVar, Set set) {
        this.f2218a = c0029d;
        this.f2219b = hVar;
        this.f2220c = bVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new d(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        x4.g[] gVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (gVarArr = (x4.g[]) editable.getSpans(selectionStart, selectionEnd, x4.g.class)) != null && gVarArr.length > 0) {
                for (x4.g gVar : gVarArr) {
                    int spanStart = editable.getSpanStart(gVar);
                    int spanEnd = editable.getSpanEnd(gVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, k kVar) {
        if ((kVar.f32073c & 3) == 0) {
            d.e eVar = this.f2220c;
            y4.a aVarB = kVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                aVarB.f33936b.getShort(iA + aVarB.f33935a);
            }
            androidx.emoji2.text.b bVar = (androidx.emoji2.text.b) eVar;
            bVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = androidx.emoji2.text.b.f2194b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            boolean zHasGlyph = bVar.f2195a.hasGlyph(sb.toString());
            int i12 = kVar.f32073c & 4;
            kVar.f32073c = zHasGlyph ? i12 | 2 : i12 | 1;
        }
        return (kVar.f32073c & 3) == 2;
    }

    public final <T> T c(CharSequence charSequence, int i10, int i11, int i12, boolean z10, b<T> bVar) {
        int i13;
        char c10;
        e eVar = new e(this.f2219b.f2244c);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zA = true;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (iCharCount < i11 && i14 < i12 && zA) {
                SparseArray<h.a> sparseArray = eVar.f2229c.f2246a;
                h.a aVar = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                if (eVar.f2227a == 2) {
                    if (aVar != null) {
                        eVar.f2229c = aVar;
                        eVar.f2232f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            eVar.a();
                        } else if (iCodePointAt != 65039) {
                            h.a aVar2 = eVar.f2229c;
                            if (aVar2.f2247b != null) {
                                if (eVar.f2232f != 1) {
                                    eVar.f2230d = aVar2;
                                    eVar.a();
                                } else if (eVar.b()) {
                                    eVar.f2230d = eVar.f2229c;
                                    eVar.a();
                                } else {
                                    eVar.a();
                                }
                                c10 = 3;
                            } else {
                                eVar.a();
                            }
                        }
                        c10 = 1;
                    }
                    c10 = 2;
                } else if (aVar == null) {
                    eVar.a();
                    c10 = 1;
                } else {
                    eVar.f2227a = 2;
                    eVar.f2229c = aVar;
                    eVar.f2232f = 1;
                    c10 = 2;
                }
                eVar.f2231e = iCodePointAt;
                if (c10 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c10 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c10 == 3) {
                    if (z10 || !b(charSequence, i13, iCharCount, eVar.f2230d.f2247b)) {
                        zA = bVar.a(charSequence, i13, iCharCount, eVar.f2230d.f2247b);
                        i14++;
                    }
                }
            }
            break loop0;
        }
        if (eVar.f2227a == 2 && eVar.f2229c.f2247b != null && ((eVar.f2232f > 1 || eVar.b()) && i14 < i12 && zA && (z10 || !b(charSequence, i13, iCharCount, eVar.f2229c.f2247b)))) {
            bVar.a(charSequence, i13, iCharCount, eVar.f2229c.f2247b);
        }
        return bVar.b();
    }
}
