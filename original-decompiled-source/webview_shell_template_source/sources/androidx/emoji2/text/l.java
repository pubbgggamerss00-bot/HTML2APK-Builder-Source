package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.g;
import androidx.emoji2.text.o;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final g.j f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final o f1013b;

    /* renamed from: c, reason: collision with root package name */
    public final g.e f1014c;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements b<s> {

        /* renamed from: a, reason: collision with root package name */
        public s f1015a;

        /* renamed from: b, reason: collision with root package name */
        public final g.j f1016b;

        public a(s sVar, g.j jVar) {
            this.f1015a = sVar;
            this.f1016b = jVar;
        }

        @Override // androidx.emoji2.text.l.b
        public final s a() {
            return this.f1015a;
        }

        @Override // androidx.emoji2.text.l.b
        public final boolean b(CharSequence charSequence, int i6, int i7, q qVar) {
            if ((qVar.f1046c & 4) > 0) {
                return true;
            }
            if (this.f1015a == null) {
                this.f1015a = new s(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((g.d) this.f1016b).getClass();
            this.f1015a.setSpan(new r(qVar), i6, i7, 33);
            return true;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface b<T> {
        T a();

        boolean b(CharSequence charSequence, int i6, int i7, q qVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public int f1018a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final o.a f1019b;

        /* renamed from: c, reason: collision with root package name */
        public o.a f1020c;

        /* renamed from: d, reason: collision with root package name */
        public o.a f1021d;

        /* renamed from: e, reason: collision with root package name */
        public int f1022e;

        /* renamed from: f, reason: collision with root package name */
        public int f1023f;

        public d(o.a aVar) {
            this.f1019b = aVar;
            this.f1020c = aVar;
        }

        public final void a() {
            this.f1018a = 1;
            this.f1020c = this.f1019b;
            this.f1023f = 0;
        }

        public final boolean b() {
            e1.a aVarB = this.f1020c.f1040b.b();
            int iA = aVarB.a(6);
            return !(iA == 0 || ((ByteBuffer) aVarB.f12778d).get(iA + aVarB.f12775a) == 0) || this.f1022e == 65039;
        }
    }

    public l(o oVar, g.d dVar, e eVar, Set set) {
        this.f1012a = dVar;
        this.f1013b = oVar;
        this.f1014c = eVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new c(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z6) {
        m[] mVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (mVarArr = (m[]) editable.getSpans(selectionStart, selectionEnd, m.class)) != null && mVarArr.length > 0) {
                for (m mVar : mVarArr) {
                    int spanStart = editable.getSpanStart(mVar);
                    int spanEnd = editable.getSpanEnd(mVar);
                    if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i6, int i7, q qVar) {
        if ((qVar.f1046c & 3) == 0) {
            g.e eVar = this.f1014c;
            e1.a aVarB = qVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f12778d).getShort(iA + aVarB.f12775a);
            }
            e eVar2 = (e) eVar;
            eVar2.getClass();
            ThreadLocal<StringBuilder> threadLocal = e.f987b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i6 < i7) {
                sb.append(charSequence.charAt(i6));
                i6++;
            }
            TextPaint textPaint = eVar2.f988a;
            String string = sb.toString();
            int i8 = m0.c.f13858a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i9 = qVar.f1046c & 4;
            qVar.f1046c = zHasGlyph ? i9 | 2 : i9 | 1;
        }
        return (qVar.f1046c & 3) == 2;
    }

    public final <T> T c(CharSequence charSequence, int i6, int i7, int i8, boolean z6, b<T> bVar) {
        int i9;
        char c7;
        d dVar = new d(this.f1013b.f1037c);
        int iCodePointAt = Character.codePointAt(charSequence, i6);
        int i10 = 0;
        boolean zB = true;
        int iCharCount = i6;
        loop0: while (true) {
            i9 = iCharCount;
            while (iCharCount < i7 && i10 < i8 && zB) {
                SparseArray<o.a> sparseArray = dVar.f1020c.f1039a;
                o.a aVar = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                if (dVar.f1018a == 2) {
                    if (aVar != null) {
                        dVar.f1020c = aVar;
                        dVar.f1023f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            dVar.a();
                        } else if (iCodePointAt != 65039) {
                            o.a aVar2 = dVar.f1020c;
                            if (aVar2.f1040b != null) {
                                if (dVar.f1023f != 1) {
                                    dVar.f1021d = aVar2;
                                    dVar.a();
                                } else if (dVar.b()) {
                                    dVar.f1021d = dVar.f1020c;
                                    dVar.a();
                                } else {
                                    dVar.a();
                                }
                                c7 = 3;
                            } else {
                                dVar.a();
                            }
                        }
                        c7 = 1;
                    }
                    c7 = 2;
                } else if (aVar == null) {
                    dVar.a();
                    c7 = 1;
                } else {
                    dVar.f1018a = 2;
                    dVar.f1020c = aVar;
                    dVar.f1023f = 1;
                    c7 = 2;
                }
                dVar.f1022e = iCodePointAt;
                if (c7 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i9)) + i9;
                    if (iCharCount < i7) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c7 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i7) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c7 == 3) {
                    if (z6 || !b(charSequence, i9, iCharCount, dVar.f1021d.f1040b)) {
                        zB = bVar.b(charSequence, i9, iCharCount, dVar.f1021d.f1040b);
                        i10++;
                    }
                }
            }
            break loop0;
        }
        if (dVar.f1018a == 2 && dVar.f1020c.f1040b != null && ((dVar.f1023f > 1 || dVar.b()) && i10 < i8 && zB && (z6 || !b(charSequence, i9, iCharCount, dVar.f1020c.f1040b)))) {
            bVar.b(charSequence, i9, iCharCount, dVar.f1020c.f1040b);
        }
        return bVar.a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c implements b<c> {

        /* renamed from: a, reason: collision with root package name */
        public final String f1017a;

        public c(String str) {
            this.f1017a = str;
        }

        @Override // androidx.emoji2.text.l.b
        public final boolean b(CharSequence charSequence, int i6, int i7, q qVar) {
            if (!TextUtils.equals(charSequence.subSequence(i6, i7), this.f1017a)) {
                return true;
            }
            qVar.f1046c = (qVar.f1046c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.l.b
        public final c a() {
            return this;
        }
    }
}
