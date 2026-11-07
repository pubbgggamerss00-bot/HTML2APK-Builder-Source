package k0;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import i0.i2;
import j2.k5;
import j2.s3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k0.b;
import k0.n1;
import m0.x2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.ItemType;

/* loaded from: classes.dex */
public final class p1 implements s3 {

    /* renamed from: a, reason: collision with root package name */
    public final View f15886a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f15887b;

    /* renamed from: e, reason: collision with root package name */
    public i2 f15890e;

    /* renamed from: f, reason: collision with root package name */
    public x2 f15891f;

    /* renamed from: g, reason: collision with root package name */
    public k5 f15892g;

    /* renamed from: l, reason: collision with root package name */
    public Rect f15897l;

    /* renamed from: m, reason: collision with root package name */
    public final l1 f15898m;

    /* renamed from: c, reason: collision with root package name */
    public eh.l<? super List<? extends y2.i>, pg.f0> f15888c = q1.f15900a;

    /* renamed from: d, reason: collision with root package name */
    public eh.l<? super y2.n, pg.f0> f15889d = r1.f15901a;

    /* renamed from: h, reason: collision with root package name */
    public y2.c0 f15893h = new y2.c0("", t2.j0.f27837b, 4);

    /* renamed from: i, reason: collision with root package name */
    public y2.o f15894i = y2.o.f33752g;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f15895j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Object f15896k = e9.w0.a(pg.k.f21467b, new o1(this, 0));

    public static final class a {
        public a() {
        }
    }

    public p1(View view, b.a.C0157b c0157b, h1 h1Var) {
        this.f15886a = view;
        this.f15887b = h1Var;
        this.f15898m = new l1(c0157b, h1Var);
    }

    @Override // j2.s3
    public final s1 a(EditorInfo editorInfo) {
        int i10;
        int i11;
        y2.c0 c0Var = this.f15893h;
        String str = c0Var.f33682a.f27761b;
        long j10 = c0Var.f33683b;
        y2.o oVar = this.f15894i;
        int i12 = oVar.f33757e;
        int i13 = oVar.f33756d;
        boolean z10 = oVar.f33753a;
        if (i12 == 1) {
            i10 = z10 ? 6 : 0;
        } else if (i12 == 0) {
            i10 = 1;
        } else if (i12 == 2) {
            i10 = 2;
        } else if (i12 == 6) {
            i10 = 5;
        } else if (i12 == 5) {
            i10 = 7;
        } else if (i12 == 3) {
            i10 = 3;
        } else if (i12 == 4) {
            i10 = 4;
        } else {
            if (i12 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i10;
        a3.c cVar = oVar.f33758f;
        if (kotlin.jvm.internal.r.a(cVar, a3.c.f24c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(qg.p.h(cVar, 10));
            Iterator<a3.b> it = cVar.f25a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f23a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i13 == 1) {
            i11 = 1;
        } else if (i13 == 2) {
            editorInfo.imeOptions |= PKIFailureInfo.systemUnavail;
            i11 = 1;
        } else if (i13 == 3) {
            i11 = 2;
        } else if (i13 == 4) {
            i11 = 3;
        } else if (i13 == 5) {
            i11 = 17;
        } else if (i13 == 6) {
            i11 = 33;
        } else if (i13 == 7) {
            i11 = 129;
        } else if (i13 == 8) {
            i11 = 18;
        } else {
            if (i13 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i11 = ItemType.STRING_DATA_ITEM;
        }
        editorInfo.inputType = i11;
        if (!z10 && (i11 & 1) == 1) {
            editorInfo.inputType = 131072 | i11;
            if (oVar.f33757e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i14 = editorInfo.inputType;
        if ((i14 & 1) == 1) {
            int i15 = oVar.f33754b;
            if (i15 == 1) {
                editorInfo.inputType = i14 | 4096;
            } else if (i15 == 2) {
                editorInfo.inputType = i14 | 8192;
            } else if (i15 == 3) {
                editorInfo.inputType = i14 | 16384;
            }
            if (oVar.f33755c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i16 = t2.j0.f27838c;
        editorInfo.initialSelStart = (int) (j10 >> 32);
        editorInfo.initialSelEnd = (int) (j10 & BodyPartID.bodyIdMax);
        a4.a.a(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!j0.b.f14595a || i13 == 7 || i13 == 8) {
            a4.a.b(editorInfo, false);
        } else {
            a4.a.b(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(qg.p.j(q.b(), u.a(), r.a(), s.a(), v.a(), w.a(), x.a()));
            editorInfo.setSupportedHandwritingGesturePreviews(qg.o.C(new Class[]{q.b(), u.a(), r.a(), s.a()}));
        }
        n1.a aVar = n1.f15874a;
        if (androidx.emoji2.text.d.d()) {
            androidx.emoji2.text.d.a().i(editorInfo);
        }
        s1 s1Var = new s1(this.f15893h, new a(), this.f15894i.f33755c, this.f15890e, this.f15891f, this.f15892g);
        this.f15895j.add(new WeakReference(s1Var));
        return s1Var;
    }
}
